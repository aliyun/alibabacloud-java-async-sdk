// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSystemRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateSystemRuleRequest</p>
 */
public class CreateSystemRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private Integer metricType;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    private CreateSystemRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.metricType = builder.metricType;
        this.namespace = builder.namespace;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSystemRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return metricType
     */
    public Integer getMetricType() {
        return this.metricType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<CreateSystemRuleRequest, Builder> {
        private String ahasRegionId; 
        private String appName; 
        private Boolean enable; 
        private Integer metricType; 
        private String namespace; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateSystemRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appName = response.appName;
            this.enable = response.enable;
            this.metricType = response.metricType;
            this.namespace = response.namespace;
            this.threshold = response.threshold;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(Integer metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public CreateSystemRuleRequest build() {
            return new CreateSystemRuleRequest(this);
        } 

    } 

}
