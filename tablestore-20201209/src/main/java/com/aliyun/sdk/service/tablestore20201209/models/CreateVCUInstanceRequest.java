// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link CreateVCUInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateVCUInstanceRequest</p>
 */
public class CreateVCUInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriodInMonth")
    @com.aliyun.core.annotation.Validation(maximum = 24, minimum = 1)
    private Long autoRenewPeriodInMonth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAutoRenew")
    private Boolean enableAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableElasticVCU")
    private Boolean enableElasticVCU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodInMonth")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 24, minimum = 1)
    private Long periodInMonth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VCU")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2000)
    private Long VCU;

    private CreateVCUInstanceRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.autoRenewPeriodInMonth = builder.autoRenewPeriodInMonth;
        this.clusterType = builder.clusterType;
        this.dryRun = builder.dryRun;
        this.enableAutoRenew = builder.enableAutoRenew;
        this.enableElasticVCU = builder.enableElasticVCU;
        this.instanceDescription = builder.instanceDescription;
        this.periodInMonth = builder.periodInMonth;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.VCU = builder.VCU;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVCUInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return autoRenewPeriodInMonth
     */
    public Long getAutoRenewPeriodInMonth() {
        return this.autoRenewPeriodInMonth;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableAutoRenew
     */
    public Boolean getEnableAutoRenew() {
        return this.enableAutoRenew;
    }

    /**
     * @return enableElasticVCU
     */
    public Boolean getEnableElasticVCU() {
        return this.enableElasticVCU;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return periodInMonth
     */
    public Long getPeriodInMonth() {
        return this.periodInMonth;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return VCU
     */
    public Long getVCU() {
        return this.VCU;
    }

    public static final class Builder extends Request.Builder<CreateVCUInstanceRequest, Builder> {
        private String aliasName; 
        private Long autoRenewPeriodInMonth; 
        private String clusterType; 
        private Boolean dryRun; 
        private Boolean enableAutoRenew; 
        private Boolean enableElasticVCU; 
        private String instanceDescription; 
        private Long periodInMonth; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private Long VCU; 

        private Builder() {
            super();
        } 

        private Builder(CreateVCUInstanceRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.autoRenewPeriodInMonth = request.autoRenewPeriodInMonth;
            this.clusterType = request.clusterType;
            this.dryRun = request.dryRun;
            this.enableAutoRenew = request.enableAutoRenew;
            this.enableElasticVCU = request.enableElasticVCU;
            this.instanceDescription = request.instanceDescription;
            this.periodInMonth = request.periodInMonth;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.VCU = request.VCU;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * AutoRenewPeriodInMonth.
         */
        public Builder autoRenewPeriodInMonth(Long autoRenewPeriodInMonth) {
            this.putBodyParameter("AutoRenewPeriodInMonth", autoRenewPeriodInMonth);
            this.autoRenewPeriodInMonth = autoRenewPeriodInMonth;
            return this;
        }

        /**
         * <p>cluster type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SSD vs HYBRID</p>
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EnableAutoRenew.
         */
        public Builder enableAutoRenew(Boolean enableAutoRenew) {
            this.putBodyParameter("EnableAutoRenew", enableAutoRenew);
            this.enableAutoRenew = enableAutoRenew;
            return this;
        }

        /**
         * EnableElasticVCU.
         */
        public Builder enableElasticVCU(Boolean enableElasticVCU) {
            this.putBodyParameter("EnableElasticVCU", enableElasticVCU);
            this.enableElasticVCU = enableElasticVCU;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putBodyParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder periodInMonth(Long periodInMonth) {
            this.putBodyParameter("PeriodInMonth", periodInMonth);
            this.periodInMonth = periodInMonth;
            return this;
        }

        /**
         * <p>resource group id</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jnbcd</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>tag</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder VCU(Long VCU) {
            this.putBodyParameter("VCU", VCU);
            this.VCU = VCU;
            return this;
        }

        @Override
        public CreateVCUInstanceRequest build() {
            return new CreateVCUInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVCUInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateVCUInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0woauavextilfqr61</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
