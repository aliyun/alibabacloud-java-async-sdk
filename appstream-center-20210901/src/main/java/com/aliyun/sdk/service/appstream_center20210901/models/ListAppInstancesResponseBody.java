// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAppInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInstancesResponseBody</p>
 */
public class ListAppInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceModels")
    private java.util.List<AppInstanceModels> appInstanceModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppInstancesResponseBody(Builder builder) {
        this.appInstanceModels = builder.appInstanceModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceModels
     */
    public java.util.List<AppInstanceModels> getAppInstanceModels() {
        return this.appInstanceModels;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List<AppInstanceModels> appInstanceModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAppInstancesResponseBody model) {
            this.appInstanceModels = model.appInstanceModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The app instances.</p>
         */
        public Builder appInstanceModels(java.util.List<AppInstanceModels> appInstanceModels) {
            this.appInstanceModels = appInstanceModels;
            return this;
        }

        /**
         * <p>The page number of the returned page. We recommend that you configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. The value cannot be greater than <code>100</code>. We recommend that you configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppInstancesResponseBody build() {
            return new ListAppInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstancesResponseBody</p>
     */
    public static class BindInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("UsageDuration")
        private Long usageDuration;

        private BindInfo(Builder builder) {
            this.endUserId = builder.endUserId;
            this.usageDuration = builder.usageDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindInfo create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return usageDuration
         */
        public Long getUsageDuration() {
            return this.usageDuration;
        }

        public static final class Builder {
            private String endUserId; 
            private Long usageDuration; 

            private Builder() {
            } 

            private Builder(BindInfo model) {
                this.endUserId = model.endUserId;
                this.usageDuration = model.usageDuration;
            } 

            /**
             * <p>The ID of the end user that is bound to the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>app.test</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The use duration of the application instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder usageDuration(Long usageDuration) {
                this.usageDuration = usageDuration;
                return this;
            }

            public BindInfo build() {
                return new BindInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstancesResponseBody</p>
     */
    public static class AppInstanceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("BindInfo")
        private BindInfo bindInfo;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MainEthPublicIp")
        private String mainEthPublicIp;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AppInstanceModels(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.bindInfo = builder.bindInfo;
            this.chargeType = builder.chargeType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mainEthPublicIp = builder.mainEthPublicIp;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.nodeId = builder.nodeId;
            this.sessionStatus = builder.sessionStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceModels create() {
            return builder().build();
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
         * @return bindInfo
         */
        public BindInfo getBindInfo() {
            return this.bindInfo;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return mainEthPublicIp
         */
        public String getMainEthPublicIp() {
            return this.mainEthPublicIp;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private BindInfo bindInfo; 
            private String chargeType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String mainEthPublicIp; 
            private String networkInterfaceIp; 
            private String nodeId; 
            private String sessionStatus; 
            private String status; 

            private Builder() {
            } 

            private Builder(AppInstanceModels model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceId = model.appInstanceId;
                this.bindInfo = model.bindInfo;
                this.chargeType = model.chargeType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.mainEthPublicIp = model.mainEthPublicIp;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.nodeId = model.nodeId;
                this.sessionStatus = model.sessionStatus;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-dk8p95irqfst9****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The ID of the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-8dl7dzchklmka****</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * <p>The information about the binding between the application instance and end users.</p>
             */
            public Builder bindInfo(BindInfo bindInfo) {
                this.bindInfo = bindInfo;
                return this;
            }

            /**
             * <p>The billing method of the app instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the app instance belongs is set to Node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the application instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-07T20:29:19.000+08:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the application instance was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-07T20:29:19.000+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The public IP address associated with the primary NIC. This value is returned only if <code>StrategyType</code> is set to <code>Mixed</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>10.13.13.211</p>
             */
            public Builder mainEthPublicIp(String mainEthPublicIp) {
                this.mainEthPublicIp = mainEthPublicIp;
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
             * <p>The ID of the node on which the app instance runs.</p>
             * <blockquote>
             * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the app instance belongs is set to Node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bp13********</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The session status. This parameter is returned only if the application instance is in the <code>RUNNING</code> state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>disconnect: disconnected</li>
             * <li>connect: connected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>connect</p>
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * <p>The status of the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>BOUND</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppInstanceModels build() {
                return new AppInstanceModels(this);
            } 

        } 

    }
}
