// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnDeliverTaskRequest</p>
 */
public class CreateCdnDeliverTaskRequest extends Request {
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

    @Body
    @NameInMap("Reports")
    @Validation(required = true)
    private String reports;

    @Body
    @NameInMap("Schedule")
    @Validation(required = true)
    private String schedule;

    private CreateCdnDeliverTaskRequest(Builder builder) {
        super(builder);
        this.deliver = builder.deliver;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.reports = builder.reports;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnDeliverTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCdnDeliverTaskRequest, Builder> {
        private String deliver; 
        private String domainName; 
        private String name; 
        private String reports; 
        private String schedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdnDeliverTaskRequest request) {
            super(request);
            this.deliver = request.deliver;
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
         * The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).
         * <p>
         * 
         * > If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.
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
        public CreateCdnDeliverTaskRequest build() {
            return new CreateCdnDeliverTaskRequest(this);
        } 

    } 

}
