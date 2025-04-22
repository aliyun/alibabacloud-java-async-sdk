// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

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
 * {@link GetInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceListResponseBody</p>
 */
public class GetInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private InstanceList instanceList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceList = builder.instanceList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceList
     */
    public InstanceList getInstanceList() {
        return this.instanceList;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceList instanceList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceListResponseBody model) {
            this.code = model.code;
            this.instanceList = model.instanceList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceListResponseBody build() {
            return new GetInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class UpgradeServiceDetailInfoVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current2OpenSourceVersion")
        private String current2OpenSourceVersion;

        private UpgradeServiceDetailInfoVO(Builder builder) {
            this.current2OpenSourceVersion = builder.current2OpenSourceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeServiceDetailInfoVO create() {
            return builder().build();
        }

        /**
         * @return current2OpenSourceVersion
         */
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

        public static final class Builder {
            private String current2OpenSourceVersion; 

            private Builder() {
            } 

            private Builder(UpgradeServiceDetailInfoVO model) {
                this.current2OpenSourceVersion = model.current2OpenSourceVersion;
            } 

            /**
             * Current2OpenSourceVersion.
             */
            public Builder current2OpenSourceVersion(String current2OpenSourceVersion) {
                this.current2OpenSourceVersion = current2OpenSourceVersion;
                return this;
            }

            public UpgradeServiceDetailInfoVO build() {
                return new UpgradeServiceDetailInfoVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class UpgradeServiceDetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpgradeServiceDetailInfoVO")
        private java.util.List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfoVO;

        private UpgradeServiceDetailInfo(Builder builder) {
            this.upgradeServiceDetailInfoVO = builder.upgradeServiceDetailInfoVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeServiceDetailInfo create() {
            return builder().build();
        }

        /**
         * @return upgradeServiceDetailInfoVO
         */
        public java.util.List<UpgradeServiceDetailInfoVO> getUpgradeServiceDetailInfoVO() {
            return this.upgradeServiceDetailInfoVO;
        }

        public static final class Builder {
            private java.util.List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfoVO; 

            private Builder() {
            } 

            private Builder(UpgradeServiceDetailInfo model) {
                this.upgradeServiceDetailInfoVO = model.upgradeServiceDetailInfoVO;
            } 

            /**
             * UpgradeServiceDetailInfoVO.
             */
            public Builder upgradeServiceDetailInfoVO(java.util.List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfoVO) {
                this.upgradeServiceDetailInfoVO = upgradeServiceDetailInfoVO;
                return this;
            }

            public UpgradeServiceDetailInfo build() {
                return new UpgradeServiceDetailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class InstanceVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private Integer deployType;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @com.aliyun.core.annotation.NameInMap("SslEndPoint")
        private String sslEndPoint;

        @com.aliyun.core.annotation.NameInMap("UpgradeServiceDetailInfo")
        private UpgradeServiceDetailInfo upgradeServiceDetailInfo;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private InstanceVO(Builder builder) {
            this.createTime = builder.createTime;
            this.deployType = builder.deployType;
            this.endPoint = builder.endPoint;
            this.expiredTime = builder.expiredTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.serviceStatus = builder.serviceStatus;
            this.sslEndPoint = builder.sslEndPoint;
            this.upgradeServiceDetailInfo = builder.upgradeServiceDetailInfo;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceVO create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployType
         */
        public Integer getDeployType() {
            return this.deployType;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return sslEndPoint
         */
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        /**
         * @return upgradeServiceDetailInfo
         */
        public UpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
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

        public static final class Builder {
            private Long createTime; 
            private Integer deployType; 
            private String endPoint; 
            private Long expiredTime; 
            private String instanceId; 
            private String name; 
            private String regionId; 
            private Integer serviceStatus; 
            private String sslEndPoint; 
            private UpgradeServiceDetailInfo upgradeServiceDetailInfo; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(InstanceVO model) {
                this.createTime = model.createTime;
                this.deployType = model.deployType;
                this.endPoint = model.endPoint;
                this.expiredTime = model.expiredTime;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.regionId = model.regionId;
                this.serviceStatus = model.serviceStatus;
                this.sslEndPoint = model.sslEndPoint;
                this.upgradeServiceDetailInfo = model.upgradeServiceDetailInfo;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * ServiceStatus.
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * SslEndPoint.
             */
            public Builder sslEndPoint(String sslEndPoint) {
                this.sslEndPoint = sslEndPoint;
                return this;
            }

            /**
             * UpgradeServiceDetailInfo.
             */
            public Builder upgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
                this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
                return this;
            }

            /**
             * <p>VSwitch ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp13rg6bcpkxofr78****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1l6hrlykj3405r7****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public InstanceVO build() {
                return new InstanceVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceVO")
        private java.util.List<InstanceVO> instanceVO;

        private InstanceList(Builder builder) {
            this.instanceVO = builder.instanceVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceVO
         */
        public java.util.List<InstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

        public static final class Builder {
            private java.util.List<InstanceVO> instanceVO; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.instanceVO = model.instanceVO;
            } 

            /**
             * InstanceVO.
             */
            public Builder instanceVO(java.util.List<InstanceVO> instanceVO) {
                this.instanceVO = instanceVO;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
