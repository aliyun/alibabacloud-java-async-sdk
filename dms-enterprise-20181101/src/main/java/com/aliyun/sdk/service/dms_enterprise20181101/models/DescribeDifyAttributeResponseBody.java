// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DescribeDifyAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDifyAttributeResponseBody</p>
 */
public class DescribeDifyAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private DescribeDifyAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDifyAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String code; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Root root; 
        private Boolean success; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(DescribeDifyAttributeResponseBody model) {
            this.code = model.code;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
            this.tags = model.tags;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public DescribeDifyAttributeResponseBody build() {
            return new DescribeDifyAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDifyAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDifyAttributeResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("AppUuid")
        private String appUuid;

        @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
        private String billingInstanceId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DifyInstanceId")
        private String difyInstanceId;

        @com.aliyun.core.annotation.NameInMap("DifyInstanceName")
        private String difyInstanceName;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private String replicas;

        @com.aliyun.core.annotation.NameInMap("ResourceQuota")
        private String resourceQuota;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Root(Builder builder) {
            this.appType = builder.appType;
            this.appUuid = builder.appUuid;
            this.billingInstanceId = builder.billingInstanceId;
            this.chargeType = builder.chargeType;
            this.difyInstanceId = builder.difyInstanceId;
            this.difyInstanceName = builder.difyInstanceName;
            this.expireTime = builder.expireTime;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
            this.resourceQuota = builder.resourceQuota;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.workspaceId = builder.workspaceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return appUuid
         */
        public String getAppUuid() {
            return this.appUuid;
        }

        /**
         * @return billingInstanceId
         */
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return difyInstanceId
         */
        public String getDifyInstanceId() {
            return this.difyInstanceId;
        }

        /**
         * @return difyInstanceName
         */
        public String getDifyInstanceName() {
            return this.difyInstanceName;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicas
         */
        public String getReplicas() {
            return this.replicas;
        }

        /**
         * @return resourceQuota
         */
        public String getResourceQuota() {
            return this.resourceQuota;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String appType; 
            private String appUuid; 
            private String billingInstanceId; 
            private String chargeType; 
            private String difyInstanceId; 
            private String difyInstanceName; 
            private Long expireTime; 
            private String regionId; 
            private String replicas; 
            private String resourceQuota; 
            private String securityGroupId; 
            private String status; 
            private String storageType; 
            private String vSwitchId; 
            private String vpcId; 
            private String workspaceId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.appType = model.appType;
                this.appUuid = model.appUuid;
                this.billingInstanceId = model.billingInstanceId;
                this.chargeType = model.chargeType;
                this.difyInstanceId = model.difyInstanceId;
                this.difyInstanceName = model.difyInstanceName;
                this.expireTime = model.expireTime;
                this.regionId = model.regionId;
                this.replicas = model.replicas;
                this.resourceQuota = model.resourceQuota;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.storageType = model.storageType;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.workspaceId = model.workspaceId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * AppUuid.
             */
            public Builder appUuid(String appUuid) {
                this.appUuid = appUuid;
                return this;
            }

            /**
             * BillingInstanceId.
             */
            public Builder billingInstanceId(String billingInstanceId) {
                this.billingInstanceId = billingInstanceId;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * DifyInstanceId.
             */
            public Builder difyInstanceId(String difyInstanceId) {
                this.difyInstanceId = difyInstanceId;
                return this;
            }

            /**
             * DifyInstanceName.
             */
            public Builder difyInstanceName(String difyInstanceName) {
                this.difyInstanceName = difyInstanceName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * ResourceQuota.
             */
            public Builder resourceQuota(String resourceQuota) {
                this.resourceQuota = resourceQuota;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDifyAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDifyAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
