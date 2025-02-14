// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckRuleInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckRuleInstanceResponseBody</p>
 */
public class ListCheckRuleInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("AssetSubType")
    private String assetSubType;

    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.NameInMap("CheckRuleInstances")
    private java.util.List<CheckRuleInstances> checkRuleInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private ListCheckRuleInstanceResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.assetSubType = builder.assetSubType;
        this.assetType = builder.assetType;
        this.checkId = builder.checkId;
        this.checkRuleInstances = builder.checkRuleInstances;
        this.requestId = builder.requestId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckRuleInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return assetSubType
     */
    public String getAssetSubType() {
        return this.assetSubType;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkRuleInstances
     */
    public java.util.List<CheckRuleInstances> getCheckRuleInstances() {
        return this.checkRuleInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String aliUid; 
        private String assetSubType; 
        private String assetType; 
        private String checkId; 
        private java.util.List<CheckRuleInstances> checkRuleInstances; 
        private String requestId; 
        private String vendor; 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AssetSubType.
         */
        public Builder assetSubType(String assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }

        /**
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.assetType = assetType;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * CheckRuleInstances.
         */
        public Builder checkRuleInstances(java.util.List<CheckRuleInstances> checkRuleInstances) {
            this.checkRuleInstances = checkRuleInstances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public ListCheckRuleInstanceResponseBody build() {
            return new ListCheckRuleInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckRuleInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckRuleInstanceResponseBody</p>
     */
    public static class CheckRuleInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private CheckRuleInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRuleInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public CheckRuleInstances build() {
                return new CheckRuleInstances(this);
            } 

        } 

    }
}
