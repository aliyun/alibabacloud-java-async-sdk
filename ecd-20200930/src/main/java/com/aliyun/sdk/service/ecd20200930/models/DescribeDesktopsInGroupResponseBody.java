// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopsInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsInGroupResponseBody</p>
 */
public class DescribeDesktopsInGroupResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PaidDesktops")
    private java.util.List < PaidDesktops> paidDesktops;

    @NameInMap("PaidDesktopsCount")
    private Integer paidDesktopsCount;

    @NameInMap("PostPaidDesktops")
    private java.util.List < PostPaidDesktops> postPaidDesktops;

    @NameInMap("PostPaidDesktopsCount")
    private Integer postPaidDesktopsCount;

    @NameInMap("PostPaidDesktopsTotalAmount")
    private Integer postPaidDesktopsTotalAmount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopsInGroupResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.paidDesktops = builder.paidDesktops;
        this.paidDesktopsCount = builder.paidDesktopsCount;
        this.postPaidDesktops = builder.postPaidDesktops;
        this.postPaidDesktopsCount = builder.postPaidDesktopsCount;
        this.postPaidDesktopsTotalAmount = builder.postPaidDesktopsTotalAmount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsInGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return paidDesktops
     */
    public java.util.List < PaidDesktops> getPaidDesktops() {
        return this.paidDesktops;
    }

    /**
     * @return paidDesktopsCount
     */
    public Integer getPaidDesktopsCount() {
        return this.paidDesktopsCount;
    }

    /**
     * @return postPaidDesktops
     */
    public java.util.List < PostPaidDesktops> getPostPaidDesktops() {
        return this.postPaidDesktops;
    }

    /**
     * @return postPaidDesktopsCount
     */
    public Integer getPostPaidDesktopsCount() {
        return this.postPaidDesktopsCount;
    }

    /**
     * @return postPaidDesktopsTotalAmount
     */
    public Integer getPostPaidDesktopsTotalAmount() {
        return this.postPaidDesktopsTotalAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < PaidDesktops> paidDesktops; 
        private Integer paidDesktopsCount; 
        private java.util.List < PostPaidDesktops> postPaidDesktops; 
        private Integer postPaidDesktopsCount; 
        private Integer postPaidDesktopsTotalAmount; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PaidDesktops.
         */
        public Builder paidDesktops(java.util.List < PaidDesktops> paidDesktops) {
            this.paidDesktops = paidDesktops;
            return this;
        }

        /**
         * PaidDesktopsCount.
         */
        public Builder paidDesktopsCount(Integer paidDesktopsCount) {
            this.paidDesktopsCount = paidDesktopsCount;
            return this;
        }

        /**
         * PostPaidDesktops.
         */
        public Builder postPaidDesktops(java.util.List < PostPaidDesktops> postPaidDesktops) {
            this.postPaidDesktops = postPaidDesktops;
            return this;
        }

        /**
         * PostPaidDesktopsCount.
         */
        public Builder postPaidDesktopsCount(Integer postPaidDesktopsCount) {
            this.postPaidDesktopsCount = postPaidDesktopsCount;
            return this;
        }

        /**
         * PostPaidDesktopsTotalAmount.
         */
        public Builder postPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
            this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopsInGroupResponseBody build() {
            return new DescribeDesktopsInGroupResponseBody(this);
        } 

    } 

    public static class PaidDesktops extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        private PaidDesktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.managementFlag = builder.managementFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaidDesktops create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
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
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String endUserId; 
            private String endUserName; 
            private String managementFlag; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DesktopStatus.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * ManagementFlag.
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            public PaidDesktops build() {
                return new PaidDesktops(this);
            } 

        } 

    }
    public static class PostPaidDesktops extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("CreateDuration")
        private String createDuration;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("ReleaseTime")
        private String releaseTime;

        private PostPaidDesktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.createDuration = builder.createDuration;
            this.createTime = builder.createTime;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.managementFlag = builder.managementFlag;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostPaidDesktops create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return createDuration
         */
        public String getCreateDuration() {
            return this.createDuration;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String createDuration; 
            private String createTime; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String endUserId; 
            private String endUserName; 
            private String managementFlag; 
            private String releaseTime; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * CreateDuration.
             */
            public Builder createDuration(String createDuration) {
                this.createDuration = createDuration;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DesktopStatus.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * ManagementFlag.
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public PostPaidDesktops build() {
                return new PostPaidDesktops(this);
            } 

        } 

    }
}
