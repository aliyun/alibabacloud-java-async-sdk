// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCdnDeliverTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnDeliverTaskRequest</p>
 */
public class CreateCdnDeliverTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Deliver")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reports")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reports;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schedule")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;email&quot;:{&quot;subject&quot;:&quot;the email subject&quot;,&quot;to&quot;:[&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;<a href="mailto:username@example.org">username@example.org</a>&quot;]}}</p>
         */
        public Builder deliver(String deliver) {
            this.putBodyParameter("Deliver", deliver);
            this.deliver = deliver;
            return this;
        }

        /**
         * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
         * <blockquote>
         * <p>If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example1.com,www.example2.com">www.example1.com,www.example2.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The name of the tracking task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Domain name report</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The operations reports that are tracked by the task. The data must be escaped in JSON.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;reportId\&quot;:1,\&quot;conditions\&quot;:[{\&quot;field\&quot;:\&quot;prov\&quot;,\&quot;op\&quot;:\&quot;in\&quot;,\&quot;value\&quot;:[\&quot;Heilongjiang\&quot;,\&quot;Beijing\&quot;]}]}]</p>
         */
        public Builder reports(String reports) {
            this.putBodyParameter("Reports", reports);
            this.reports = reports;
            return this;
        }

        /**
         * <p>The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;schedName\&quot;:\&quot;The name of the tracking task\&quot;,\&quot;description\&quot;:\&quot;The description\&quot;,\&quot;crontab\&quot;:\&quot;000**?\&quot;,\&quot;frequency\&quot;:\&quot;d\&quot;,\&quot;status\&quot;:\&quot;enable\&quot;,\&quot;effectiveFrom\&quot;:\&quot;2020-09-17T00:00:00Z\&quot;,\&quot;effectiveEnd\&quot;:\&quot;2020-11-17T00:00:00Z\&quot;}&quot;</p>
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
