// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDetailResponseBody</p>
 */
public class GetClusterDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private GetClusterDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetClusterDetailResponseBody build() {
            return new GetClusterDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AutoRenew")
        private Boolean autoRenew;

        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterStatus")
        private String clusterStatus;

        @NameInMap("ClusterStatusValue")
        private Integer clusterStatusValue;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ControlCenterUrl")
        private String controlCenterUrl;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("InstanceConf")
        private java.util.Map < String, ? > instanceConf;

        @NameInMap("NoticeConfirmed")
        private Boolean noticeConfirmed;

        @NameInMap("OrderBizId")
        private String orderBizId;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningTime")
        private Long runningTime;

        @NameInMap("Version")
        private String version;

        @NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.beginTime = builder.beginTime;
            this.clusterBizId = builder.clusterBizId;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterStatus = builder.clusterStatus;
            this.clusterStatusValue = builder.clusterStatusValue;
            this.clusterType = builder.clusterType;
            this.controlCenterUrl = builder.controlCenterUrl;
            this.deployMode = builder.deployMode;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceConf = builder.instanceConf;
            this.noticeConfirmed = builder.noticeConfirmed;
            this.orderBizId = builder.orderBizId;
            this.packageType = builder.packageType;
            this.pricingCycle = builder.pricingCycle;
            this.regionId = builder.regionId;
            this.runningTime = builder.runningTime;
            this.version = builder.version;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return clusterStatusValue
         */
        public Integer getClusterStatusValue() {
            return this.clusterStatusValue;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return controlCenterUrl
         */
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceConf
         */
        public java.util.Map < String, ? > getInstanceConf() {
            return this.instanceConf;
        }

        /**
         * @return noticeConfirmed
         */
        public Boolean getNoticeConfirmed() {
            return this.noticeConfirmed;
        }

        /**
         * @return orderBizId
         */
        public String getOrderBizId() {
            return this.orderBizId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long beginTime; 
            private String clusterBizId; 
            private String clusterId; 
            private String clusterName; 
            private String clusterStatus; 
            private Integer clusterStatusValue; 
            private String clusterType; 
            private String controlCenterUrl; 
            private String deployMode; 
            private Integer duration; 
            private Long expireTime; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private java.util.Map < String, ? > instanceConf; 
            private Boolean noticeConfirmed; 
            private String orderBizId; 
            private String packageType; 
            private String pricingCycle; 
            private String regionId; 
            private Long runningTime; 
            private String version; 
            private String zoneId; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * ClusterStatusValue.
             */
            public Builder clusterStatusValue(Integer clusterStatusValue) {
                this.clusterStatusValue = clusterStatusValue;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * ControlCenterUrl.
             */
            public Builder controlCenterUrl(String controlCenterUrl) {
                this.controlCenterUrl = controlCenterUrl;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceConf.
             */
            public Builder instanceConf(java.util.Map < String, ? > instanceConf) {
                this.instanceConf = instanceConf;
                return this;
            }

            /**
             * NoticeConfirmed.
             */
            public Builder noticeConfirmed(Boolean noticeConfirmed) {
                this.noticeConfirmed = noticeConfirmed;
                return this;
            }

            /**
             * OrderBizId.
             */
            public Builder orderBizId(String orderBizId) {
                this.orderBizId = orderBizId;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
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
             * RunningTime.
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
