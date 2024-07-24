// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAndroidInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAndroidInstancesResponseBody</p>
 */
public class DescribeAndroidInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceModel")
    private java.util.List < InstanceModel> instanceModel;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAndroidInstancesResponseBody(Builder builder) {
        this.instanceModel = builder.instanceModel;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAndroidInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceModel
     */
    public java.util.List < InstanceModel> getInstanceModel() {
        return this.instanceModel;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < InstanceModel> instanceModel; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceModel.
         */
        public Builder instanceModel(java.util.List < InstanceModel> instanceModel) {
            this.instanceModel = instanceModel;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAndroidInstancesResponseBody build() {
            return new DescribeAndroidInstancesResponseBody(this);
        } 

    } 

    public static class InstanceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceGroupId")
        private String androidInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
        private String androidInstanceName;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceStatus")
        private String androidInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private String authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("BindUserId")
        private String bindUserId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("PersistentAppInstanceId")
        private String persistentAppInstanceId;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RenderingType")
        private String renderingType;

        private InstanceModel(Builder builder) {
            this.androidInstanceGroupId = builder.androidInstanceGroupId;
            this.androidInstanceId = builder.androidInstanceId;
            this.androidInstanceName = builder.androidInstanceName;
            this.androidInstanceStatus = builder.androidInstanceStatus;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.authorizedUserId = builder.authorizedUserId;
            this.bindUserId = builder.bindUserId;
            this.errorCode = builder.errorCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.keyPairId = builder.keyPairId;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.persistentAppInstanceId = builder.persistentAppInstanceId;
            this.rate = builder.rate;
            this.regionId = builder.regionId;
            this.renderingType = builder.renderingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModel create() {
            return builder().build();
        }

        /**
         * @return androidInstanceGroupId
         */
        public String getAndroidInstanceGroupId() {
            return this.androidInstanceGroupId;
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return androidInstanceName
         */
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        /**
         * @return androidInstanceStatus
         */
        public String getAndroidInstanceStatus() {
            return this.androidInstanceStatus;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return authorizedUserId
         */
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return bindUserId
         */
        public String getBindUserId() {
            return this.bindUserId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return keyPairId
         */
        public String getKeyPairId() {
            return this.keyPairId;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return persistentAppInstanceId
         */
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return renderingType
         */
        public String getRenderingType() {
            return this.renderingType;
        }

        public static final class Builder {
            private String androidInstanceGroupId; 
            private String androidInstanceId; 
            private String androidInstanceName; 
            private String androidInstanceStatus; 
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String authorizedUserId; 
            private String bindUserId; 
            private String errorCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private String keyPairId; 
            private String networkInterfaceIp; 
            private String persistentAppInstanceId; 
            private Integer rate; 
            private String regionId; 
            private String renderingType; 

            /**
             * AndroidInstanceGroupId.
             */
            public Builder androidInstanceGroupId(String androidInstanceGroupId) {
                this.androidInstanceGroupId = androidInstanceGroupId;
                return this;
            }

            /**
             * AndroidInstanceId.
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * AndroidInstanceName.
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * AndroidInstanceStatus.
             */
            public Builder androidInstanceStatus(String androidInstanceStatus) {
                this.androidInstanceStatus = androidInstanceStatus;
                return this;
            }

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * AuthorizedUserId.
             */
            public Builder authorizedUserId(String authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * BindUserId.
             */
            public Builder bindUserId(String bindUserId) {
                this.bindUserId = bindUserId;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * KeyPairId.
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * NetworkInterfaceIp.
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * PersistentAppInstanceId.
             */
            public Builder persistentAppInstanceId(String persistentAppInstanceId) {
                this.persistentAppInstanceId = persistentAppInstanceId;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
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
             * RenderingType.
             */
            public Builder renderingType(String renderingType) {
                this.renderingType = renderingType;
                return this;
            }

            public InstanceModel build() {
                return new InstanceModel(this);
            } 

        } 

    }
}
