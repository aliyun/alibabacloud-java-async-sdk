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

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String reports; 
        private String schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnDeliverTaskRequest response) {
            super(response);
            this.deliver = response.deliver;
            this.deliverId = response.deliverId;
            this.domainName = response.domainName;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.reports = response.reports;
            this.schedule = response.schedule;
        } 

        /**
         * Deliver.
         */
        public Builder deliver(String deliver) {
            this.putBodyParameter("Deliver", deliver);
            this.deliver = deliver;
            return this;
        }

        /**
         * DeliverId.
         */
        public Builder deliverId(Long deliverId) {
            this.putBodyParameter("DeliverId", deliverId);
            this.deliverId = deliverId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Reports.
         */
        public Builder reports(String reports) {
            this.putBodyParameter("Reports", reports);
            this.reports = reports;
            return this;
        }

        /**
         * Schedule.
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
