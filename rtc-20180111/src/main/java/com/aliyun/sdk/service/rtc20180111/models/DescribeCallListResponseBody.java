// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCallListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallListResponseBody</p>
 */
public class DescribeCallListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallList")
    private java.util.List < CallList> callList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Integer totalCnt;

    private DescribeCallListResponseBody(Builder builder) {
        this.callList = builder.callList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallListResponseBody create() {
        return builder().build();
    }

    /**
     * @return callList
     */
    public java.util.List < CallList> getCallList() {
        return this.callList;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return totalCnt
     */
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private java.util.List < CallList> callList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 

        /**
         * CallList.
         */
        public Builder callList(java.util.List < CallList> callList) {
            this.callList = callList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCnt.
         */
        public Builder totalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeCallListResponseBody build() {
            return new DescribeCallListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCallListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallListResponseBody</p>
     */
    public static class CallList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("BadExpUserCnt")
        private Integer badExpUserCnt;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("UserCnt")
        private Integer userCnt;

        private CallList(Builder builder) {
            this.appId = builder.appId;
            this.badExpUserCnt = builder.badExpUserCnt;
            this.callStatus = builder.callStatus;
            this.channelId = builder.channelId;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
            this.userCnt = builder.userCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return badExpUserCnt
         */
        public Integer getBadExpUserCnt() {
            return this.badExpUserCnt;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return userCnt
         */
        public Integer getUserCnt() {
            return this.userCnt;
        }

        public static final class Builder {
            private String appId; 
            private Integer badExpUserCnt; 
            private String callStatus; 
            private String channelId; 
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 
            private Integer userCnt; 

            /**
             * <p>App ID。</p>
             * 
             * <strong>example:</strong>
             * <p>9qb1****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * BadExpUserCnt.
             */
            public Builder badExpUserCnt(Integer badExpUserCnt) {
                this.badExpUserCnt = badExpUserCnt;
                return this;
            }

            /**
             * CallStatus.
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * UserCnt.
             */
            public Builder userCnt(Integer userCnt) {
                this.userCnt = userCnt;
                return this;
            }

            public CallList build() {
                return new CallList(this);
            } 

        } 

    }
}
