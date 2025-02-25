// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRealTimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>CreateRealTimeLogDeliveryRequest</p>
 */
public class CreateRealTimeLogDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private CreateRealTimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRealTimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateRealTimeLogDeliveryRequest, Builder> {
        private String domain; 
        private String logstore; 
        private String project; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateRealTimeLogDeliveryRequest request) {
            super(request);
            this.domain = request.domain;
            this.logstore = request.logstore;
            this.project = request.project;
            this.region = request.region;
        } 

        /**
         * <p>The accelerated domain name for which you want to configure real-time log delivery.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The name of the Logstore where log entries are stored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LogstoreName</p>
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("Logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectName</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The ID of the region where the Log Service project is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/144883.html">Regions that support real-time log delivery</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateRealTimeLogDeliveryRequest build() {
            return new CreateRealTimeLogDeliveryRequest(this);
        } 

    } 

}
