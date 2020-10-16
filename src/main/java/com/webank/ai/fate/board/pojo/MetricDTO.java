package com.webank.ai.fate.board.pojo;

import javax.validation.constraints.NotNull;

public class MetricDTO {
    @NotNull(message = "Job id can't be null!")
    private String job_id;
    @NotNull(message = "Role cant't be null!")
    private String role;
    @NotNull(message = "Party id can't be null!")
    private String party_id;
    @NotNull(message = "Component name cant't be null!")
    private String component_name;
    @NotNull(message = "Metric namespace can't be null!")
    private String metric_namespace;
    @NotNull(message = "Metric name can't be null!")
    private String metric_name;

    public MetricDTO() {
    }

    public MetricDTO(@NotNull(message = "Job id can't be null!") String job_id, @NotNull(message = "Role cant't be null!") String role, @NotNull(message = "Party id can't be null!") String party_id, @NotNull(message = "Component name cant't be null!") String component_name, @NotNull(message = "Metric namespace can't be null!") String metric_namespace, @NotNull(message = "Metric name can't be null!") String metric_name) {
        this.job_id = job_id;
        this.role = role;
        this.party_id = party_id;
        this.component_name = component_name;
        this.metric_namespace = metric_namespace;
        this.metric_name = metric_name;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getParty_id() {
        return party_id;
    }

    public void setParty_id(String party_id) {
        this.party_id = party_id;
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) {
        this.component_name = component_name;
    }

    public String getMetric_namespace() {
        return metric_namespace;
    }

    public void setMetric_namespace(String metric_namespace) {
        this.metric_namespace = metric_namespace;
    }

    public String getMetric_name() {
        return metric_name;
    }

    public void setMetric_name(String metric_name) {
        this.metric_name = metric_name;
    }
}
