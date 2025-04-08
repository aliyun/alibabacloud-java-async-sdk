// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
    private String autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenewPeriodUnit")
    private String autoRenewPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoStartSessionCluster")
    private Boolean autoStartSessionCluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dlfCatalogId")
    private String dlfCatalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dlfType")
    private String dlfType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("duration")
    private String duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseType")
    private String releaseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoRenewPeriodUnit = builder.autoRenewPeriodUnit;
        this.autoStartSessionCluster = builder.autoStartSessionCluster;
        this.clientToken = builder.clientToken;
        this.dlfCatalogId = builder.dlfCatalogId;
        this.dlfType = builder.dlfType;
        this.duration = builder.duration;
        this.ossBucket = builder.ossBucket;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.ramRoleName = builder.ramRoleName;
        this.releaseType = builder.releaseType;
        this.resourceSpec = builder.resourceSpec;
        this.tag = builder.tag;
        this.workspaceName = builder.workspaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoRenewPeriodUnit
     */
    public String getAutoRenewPeriodUnit() {
        return this.autoRenewPeriodUnit;
    }

    /**
     * @return autoStartSessionCluster
     */
    public Boolean getAutoStartSessionCluster() {
        return this.autoStartSessionCluster;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dlfCatalogId
     */
    public String getDlfCatalogId() {
        return this.dlfCatalogId;
    }

    /**
     * @return dlfType
     */
    public String getDlfType() {
        return this.dlfType;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return releaseType
     */
    public String getReleaseType() {
        return this.releaseType;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private String autoRenew; 
        private String autoRenewPeriod; 
        private String autoRenewPeriodUnit; 
        private Boolean autoStartSessionCluster; 
        private String clientToken; 
        private String dlfCatalogId; 
        private String dlfType; 
        private String duration; 
        private String ossBucket; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String ramRoleName; 
        private String releaseType; 
        private ResourceSpec resourceSpec; 
        private java.util.List<Tag> tag; 
        private String workspaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoRenewPeriodUnit = request.autoRenewPeriodUnit;
            this.autoStartSessionCluster = request.autoStartSessionCluster;
            this.clientToken = request.clientToken;
            this.dlfCatalogId = request.dlfCatalogId;
            this.dlfType = request.dlfType;
            this.duration = request.duration;
            this.ossBucket = request.ossBucket;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.paymentType = request.paymentType;
            this.ramRoleName = request.ramRoleName;
            this.releaseType = request.releaseType;
            this.resourceSpec = request.resourceSpec;
            this.tag = request.tag;
            this.workspaceName = request.workspaceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putBodyParameter("autoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The unit of the auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder autoRenewPeriodUnit(String autoRenewPeriodUnit) {
            this.putBodyParameter("autoRenewPeriodUnit", autoRenewPeriodUnit);
            this.autoRenewPeriodUnit = autoRenewPeriodUnit;
            return this;
        }

        /**
         * <p>Specifies whether to automatically start a session.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStartSessionCluster(Boolean autoStartSessionCluster) {
            this.putBodyParameter("autoStartSessionCluster", autoStartSessionCluster);
            this.autoStartSessionCluster = autoStartSessionCluster;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8e6aae2810c8f67229ca70bb31cd****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The information of the Data Lake Formation (DLF) catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxx</p>
         */
        public Builder dlfCatalogId(String dlfCatalogId) {
            this.putBodyParameter("dlfCatalogId", dlfCatalogId);
            this.dlfCatalogId = dlfCatalogId;
            return this;
        }

        /**
         * <p>The version of DLF.</p>
         * 
         * <strong>example:</strong>
         * <p>dlf1.0</p>
         */
        public Builder dlfType(String dlfType) {
            this.putBodyParameter("dlfType", dlfType);
            this.dlfType = dlfType;
            return this;
        }

        /**
         * <p>The subscription period. This parameter is required only if the paymentType parameter is set to Pre.</p>
         * 
         * <strong>example:</strong>
         * <p>12452</p>
         */
        public Builder duration(String duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putBodyParameter("ossBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>The unit of the subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putBodyParameter("paymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo</li>
         * <li>Pre</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The name of the role used to run Spark jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEMRSparkJobRunDefaultRole</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putBodyParameter("ramRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The type of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        public Builder releaseType(String releaseType) {
            this.putBodyParameter("releaseType", releaseType);
            this.releaseType = releaseType;
            return this;
        }

        /**
         * <p>The resource specifications.</p>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            this.putBodyParameter("resourceSpec", resourceSpec);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putBodyParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private String cu;

        private ResourceSpec(Builder builder) {
            this.cu = builder.cu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        public static final class Builder {
            private String cu; 

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cu = model.cu;
            } 

            /**
             * <p>The maximum resource quota for a workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
