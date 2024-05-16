// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateCdnDeliverTaskRequest</p>
 */
public class UpdateCdnDeliverTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Deliver")
    private String deliver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deliverId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reports")
    private String reports;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schedule")
    private String schedule;

    private UpdateCdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliver = builder.deliver;
        this.deliverId = builder.deliverId;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.reports = builder.reports;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCdnDeliverTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliver
     */
    public String getDeliver() {
        return this.deliver;
    }

    /**
     * @return deliverId
     */
    public Long getDeliverId() {
        return this.deliverId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reports
     */
    public String getReports() {
        return this.reports;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    public static final class Builder extends Request.Builder<UpdateCdnDeliverTaskRequest, Builder> {
        private String deliver; 
        private Long deliverId; 
        private String domainName; 
        private String name; 
        private String reports; 
        private String schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCdnDeliverTaskRequest request) {
            super(request);
            this.deliver = request.deliver;
            this.deliverId = request.deliverId;
            this.domainName = request.domainName;
            this.name = request.name;
            this.reports = request.reports;
            this.schedule = request.schedule;
        } 

        /**
         * The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.
         */
        public Builder deliver(String deliver) {
            this.putBodyParameter("Deliver", deliver);
            this.deliver = deliver;
            return this;
        }

        /**
         * The ID of the tracking task that you want to update.
         */
        public Builder deliverId(Long deliverId) {
            this.putBodyParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        /**
         * The domain name that you want to track. You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,). If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The name of the tracking task.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The operations reports that are tracked by the task. The data must be escaped in JSON.
         */
        public Builder reports(String reports) {
            this.putBodyParameter("Reports", reports);
            this.reports = reports;
            return this;
        }

        /**
         * The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
         */
        public Builder schedule(String schedule) {
            this.putBodyParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public UpdateCdnDeliverTaskRequest build() {
            return new UpdateCdnDeliverTaskRequest(this);
        } 

    } 

}
