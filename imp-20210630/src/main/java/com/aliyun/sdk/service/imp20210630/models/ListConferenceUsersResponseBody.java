// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConferenceUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListConferenceUsersResponseBody</p>
 */
public class ListConferenceUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListConferenceUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConferenceUsersResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListConferenceUsersResponseBody build() {
            return new ListConferenceUsersResponseBody(this);
        } 

    } 

    public static class ConferenceUserList extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        private ConferenceUserList(Builder builder) {
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConferenceUserList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String status; 
            private String userId; 

            /**
             * 用户状态。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 用户ID。
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ConferenceUserList build() {
                return new ConferenceUserList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ConferenceUserList")
        private java.util.List < ConferenceUserList> conferenceUserList;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.conferenceUserList = builder.conferenceUserList;
            this.hasMore = builder.hasMore;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return conferenceUserList
         */
        public java.util.List < ConferenceUserList> getConferenceUserList() {
            return this.conferenceUserList;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < ConferenceUserList> conferenceUserList; 
            private Boolean hasMore; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * 会议用户列表。
             */
            public Builder conferenceUserList(java.util.List < ConferenceUserList> conferenceUserList) {
                this.conferenceUserList = conferenceUserList;
                return this;
            }

            /**
             * 是否还有数据
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 总页数
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 总条目数
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
