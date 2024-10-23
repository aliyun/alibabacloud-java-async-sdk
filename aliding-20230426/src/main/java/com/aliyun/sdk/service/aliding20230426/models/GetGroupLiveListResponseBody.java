// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetGroupLiveListResponseBody} extends {@link TeaModel}
 *
 * <p>GetGroupLiveListResponseBody</p>
 */
public class GetGroupLiveListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetGroupLiveListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupLiveListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetGroupLiveListResponseBody build() {
            return new GetGroupLiveListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGroupLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetGroupLiveListResponseBody</p>
     */
    public static class GroupLiveList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorNickname")
        private String anchorNickname;

        @com.aliyun.core.annotation.NameInMap("AnchorUnionId")
        private String anchorUnionId;

        @com.aliyun.core.annotation.NameInMap("LiveEndTime")
        private Long liveEndTime;

        @com.aliyun.core.annotation.NameInMap("LiveStartTime")
        private Long liveStartTime;

        @com.aliyun.core.annotation.NameInMap("LiveUuid")
        private String liveUuid;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private GroupLiveList(Builder builder) {
            this.anchorNickname = builder.anchorNickname;
            this.anchorUnionId = builder.anchorUnionId;
            this.liveEndTime = builder.liveEndTime;
            this.liveStartTime = builder.liveStartTime;
            this.liveUuid = builder.liveUuid;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupLiveList create() {
            return builder().build();
        }

        /**
         * @return anchorNickname
         */
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        /**
         * @return anchorUnionId
         */
        public String getAnchorUnionId() {
            return this.anchorUnionId;
        }

        /**
         * @return liveEndTime
         */
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        /**
         * @return liveStartTime
         */
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        /**
         * @return liveUuid
         */
        public String getLiveUuid() {
            return this.liveUuid;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String anchorNickname; 
            private String anchorUnionId; 
            private Long liveEndTime; 
            private Long liveStartTime; 
            private String liveUuid; 
            private String title; 

            /**
             * AnchorNickname.
             */
            public Builder anchorNickname(String anchorNickname) {
                this.anchorNickname = anchorNickname;
                return this;
            }

            /**
             * AnchorUnionId.
             */
            public Builder anchorUnionId(String anchorUnionId) {
                this.anchorUnionId = anchorUnionId;
                return this;
            }

            /**
             * LiveEndTime.
             */
            public Builder liveEndTime(Long liveEndTime) {
                this.liveEndTime = liveEndTime;
                return this;
            }

            /**
             * LiveStartTime.
             */
            public Builder liveStartTime(Long liveStartTime) {
                this.liveStartTime = liveStartTime;
                return this;
            }

            /**
             * LiveUuid.
             */
            public Builder liveUuid(String liveUuid) {
                this.liveUuid = liveUuid;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public GroupLiveList build() {
                return new GroupLiveList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGroupLiveListResponseBody} extends {@link TeaModel}
     *
     * <p>GetGroupLiveListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupLiveList")
        private java.util.List < GroupLiveList> groupLiveList;

        private Result(Builder builder) {
            this.groupLiveList = builder.groupLiveList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return groupLiveList
         */
        public java.util.List < GroupLiveList> getGroupLiveList() {
            return this.groupLiveList;
        }

        public static final class Builder {
            private java.util.List < GroupLiveList> groupLiveList; 

            /**
             * GroupLiveList.
             */
            public Builder groupLiveList(java.util.List < GroupLiveList> groupLiveList) {
                this.groupLiveList = groupLiveList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
