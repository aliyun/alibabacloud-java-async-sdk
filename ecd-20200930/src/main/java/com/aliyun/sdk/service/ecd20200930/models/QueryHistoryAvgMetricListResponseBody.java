// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryAvgMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoryAvgMetricListResponseBody</p>
 */
public class QueryHistoryAvgMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvgMetricList")
    private java.util.List<AvgMetricList> avgMetricList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryHistoryAvgMetricListResponseBody(Builder builder) {
        this.avgMetricList = builder.avgMetricList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryAvgMetricListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avgMetricList
     */
    public java.util.List<AvgMetricList> getAvgMetricList() {
        return this.avgMetricList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AvgMetricList> avgMetricList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryHistoryAvgMetricListResponseBody model) {
            this.avgMetricList = model.avgMetricList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of average values of monitoring metrics.</p>
         */
        public Builder avgMetricList(java.util.List<AvgMetricList> avgMetricList) {
            this.avgMetricList = avgMetricList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryHistoryAvgMetricListResponseBody build() {
            return new QueryHistoryAvgMetricListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryAvgMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryAvgMetricListResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EstablishmentTime")
        private String establishmentTime;

        @com.aliyun.core.annotation.NameInMap("ExternalUserName")
        private String externalUserName;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private Sessions(Builder builder) {
            this.endUserId = builder.endUserId;
            this.establishmentTime = builder.establishmentTime;
            this.externalUserName = builder.externalUserName;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return establishmentTime
         */
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        /**
         * @return externalUserName
         */
        public String getExternalUserName() {
            return this.externalUserName;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String endUserId; 
            private String establishmentTime; 
            private String externalUserName; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.endUserId = model.endUserId;
                this.establishmentTime = model.establishmentTime;
                this.externalUserName = model.externalUserName;
                this.nickName = model.nickName;
            } 

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the session was created. The time is in the ISO 8601 standard in UTC: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-17T14:51:53Z</p>
             */
            public Builder establishmentTime(String establishmentTime) {
                this.establishmentTime = establishmentTime;
                return this;
            }

            /**
             * <p>The external username.</p>
             * 
             * <strong>example:</strong>
             * <p>testUserName</p>
             */
            public Builder externalUserName(String externalUserName) {
                this.externalUserName = externalUserName;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>sz-sygc-07-03</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHistoryAvgMetricListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryAvgMetricListResponseBody</p>
     */
    public static class AvgMetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgValue")
        private Float avgValue;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private String managementFlag;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("MultiResource")
        private Boolean multiResource;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        private AvgMetricList(Builder builder) {
            this.avgValue = builder.avgValue;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopType = builder.desktopType;
            this.endUserIds = builder.endUserIds;
            this.gpuSpec = builder.gpuSpec;
            this.managementFlag = builder.managementFlag;
            this.memory = builder.memory;
            this.multiResource = builder.multiResource;
            this.platform = builder.platform;
            this.regionId = builder.regionId;
            this.sessions = builder.sessions;
            this.subPayType = builder.subPayType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgMetricList create() {
            return builder().build();
        }

        /**
         * @return avgValue
         */
        public Float getAvgValue() {
            return this.avgValue;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return multiResource
         */
        public Boolean getMultiResource() {
            return this.multiResource;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        public static final class Builder {
            private Float avgValue; 
            private String chargeType; 
            private Integer cpu; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String desktopType; 
            private java.util.List<String> endUserIds; 
            private String gpuSpec; 
            private String managementFlag; 
            private Long memory; 
            private Boolean multiResource; 
            private String platform; 
            private String regionId; 
            private java.util.List<Sessions> sessions; 
            private String subPayType; 

            private Builder() {
            } 

            private Builder(AvgMetricList model) {
                this.avgValue = model.avgValue;
                this.chargeType = model.chargeType;
                this.cpu = model.cpu;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.desktopType = model.desktopType;
                this.endUserIds = model.endUserIds;
                this.gpuSpec = model.gpuSpec;
                this.managementFlag = model.managementFlag;
                this.memory = model.memory;
                this.multiResource = model.multiResource;
                this.platform = model.platform;
                this.regionId = model.regionId;
                this.sessions = model.sessions;
                this.subPayType = model.subPayType;
            } 

            /**
             * <p>The aggregated metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder avgValue(Float avgValue) {
                this.avgValue = avgValue;
                return this;
            }

            /**
             * <p>The billing method of the cloud desktop. Valid values:</p>
             * <ul>
             * <li>PostPaid: Pay-as-you-go.</li>
             * <li>PrePaid: Subscription.</li>
             * </ul>
             * <p>Default value: PostPaid.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The cloud desktop pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-bogo95eob5avnis9k</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-bx9i0nsjd3zmibnzq</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>C-051</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The cloud desktop status. Valid values:</p>
             * <ul>
             * <li>Stopped: Stopped.</li>
             * <li>Starting: Starting.</li>
             * <li>Rebuilding: Rebuilding.</li>
             * <li>Running: Running.</li>
             * <li>Stopping: Stopping.</li>
             * <li>Expired: Expired.</li>
             * <li>Deleted: Deleted.</li>
             * <li>Pending: Pending.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The desktop specification.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.8c16g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The list of authorized users.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The GPU memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The management flag.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Indicates whether the cloud desktop is a multi-resource shared type.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multiResource(Boolean multiResource) {
                this.multiResource = multiResource;
                return this;
            }

            /**
             * <p>The system image type.</p>
             * 
             * <strong>example:</strong>
             * <p>Winserver2025</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of session information.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The payment type.</p>
             * 
             * <strong>example:</strong>
             * <p>monthPackage</p>
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            public AvgMetricList build() {
                return new AvgMetricList(this);
            } 

        } 

    }
}
