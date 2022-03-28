// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnDeliverTaskRequest</p>
 */
public class CreateDcdnDeliverTaskRequest extends Request {
    @Body
    @NameInMap("Deliver")
    @Validation(required = true)
    private String deliver;

    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("Reports")
    @Validation(required = true)
    private String reports;

    @Body
    @NameInMap("Schedule")
    @Validation(required = true)
    private String schedule;

    private CreateDcdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliver = builder.deliver;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.reports = builder.reports;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnDeliverTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDcdnDeliverTaskRequest, Builder> {
        private String deliver; 
        private String domainName; 
        private String name; 
        private Long ownerId; 
        private String reports; 
        private String schedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnDeliverTaskRequest request) {
            super(request);
            this.deliver = request.deliver;
            this.domainName = request.domainName;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.reports = request.reports;
            this.schedule = request.schedule;
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
        public CreateDcdnDeliverTaskRequest build() {
            return new CreateDcdnDeliverTaskRequest(this);
        } 

    } 

}
