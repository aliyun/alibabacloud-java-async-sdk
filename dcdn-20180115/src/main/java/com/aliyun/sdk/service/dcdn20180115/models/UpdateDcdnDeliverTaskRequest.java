// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnDeliverTaskRequest</p>
 */
public class UpdateDcdnDeliverTaskRequest extends Request {
    @Body
    @NameInMap("Deliver")
    private String deliver;

    @Body
    @NameInMap("DeliverId")
    @Validation(required = true)
    private Long deliverId;

    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Reports")
    private String reports;

    @Body
    @NameInMap("Schedule")
    private String schedule;

    private UpdateDcdnDeliverTaskRequest(Builder builder) {
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

    public static UpdateDcdnDeliverTaskRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDcdnDeliverTaskRequest, Builder> {
        private String deliver; 
        private Long deliverId; 
        private String domainName; 
        private String name; 
        private String reports; 
        private String schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnDeliverTaskRequest request) {
            super(request);
            this.deliver = request.deliver;
            this.deliverId = request.deliverId;
            this.domainName = request.domainName;
            this.name = request.name;
            this.reports = request.reports;
            this.schedule = request.schedule;
        } 

        /**
         * The method that is used to send operations reports. Operations reports are sent to you only by email. The settings need to be escaped in JSON.
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
         * The domain names from which the tracking task collects data. Separate domain names with commas (,). If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.
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
         * The operations reports that are tracked by the task. The data needs to be escaped in JSON.
         */
        public Builder reports(String reports) {
            this.putBodyParameter("Reports", reports);
            this.reports = reports;
            return this;
        }

        /**
         * The parameters that specify the time interval at which the tracking task sends operations reports. The settings need to be escaped in JSON.
         */
        public Builder schedule(String schedule) {
            this.putBodyParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public UpdateDcdnDeliverTaskRequest build() {
            return new UpdateDcdnDeliverTaskRequest(this);
        } 

    } 

}
