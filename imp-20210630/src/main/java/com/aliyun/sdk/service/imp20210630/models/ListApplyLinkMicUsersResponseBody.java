// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplyLinkMicUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplyLinkMicUsersResponseBody</p>
 */
public class ListApplyLinkMicUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListApplyLinkMicUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplyLinkMicUsersResponseBody create() {
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

        public ListApplyLinkMicUsersResponseBody build() {
            return new ListApplyLinkMicUsersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ApplyLinkMicUserList")
        private java.util.List < String > applyLinkMicUserList;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.applyLinkMicUserList = builder.applyLinkMicUserList;
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
         * @return applyLinkMicUserList
         */
        public java.util.List < String > getApplyLinkMicUserList() {
            return this.applyLinkMicUserList;
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
            private java.util.List < String > applyLinkMicUserList; 
            private Boolean hasMore; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * 会议申请连麦用户列表。
             */
            public Builder applyLinkMicUserList(java.util.List < String > applyLinkMicUserList) {
                this.applyLinkMicUserList = applyLinkMicUserList;
                return this;
            }

            /**
             * 是否还有下一页成员列表。
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * 改会议的申请连麦成员总页数。
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 该会议的申请连麦成员总数。
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
