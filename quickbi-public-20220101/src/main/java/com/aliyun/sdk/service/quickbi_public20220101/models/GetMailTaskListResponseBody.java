// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetMailTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetMailTaskListResponseBody</p>
 */
public class GetMailTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMailTaskListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMailTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMailTaskListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0c52************8e1952a3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The paging information for the tracking tasks.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMailTaskListResponseBody build() {
            return new GetMailTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMailTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetMailTaskListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizOwnerName")
        private String bizOwnerName;

        @com.aliyun.core.annotation.NameInMap("BizOwnerUserId")
        private String bizOwnerUserId;

        @com.aliyun.core.annotation.NameInMap("MailId")
        private String mailId;

        @com.aliyun.core.annotation.NameInMap("Paused")
        private Boolean paused;

        @com.aliyun.core.annotation.NameInMap("SubscribeName")
        private String subscribeName;

        private Data(Builder builder) {
            this.bizOwnerName = builder.bizOwnerName;
            this.bizOwnerUserId = builder.bizOwnerUserId;
            this.mailId = builder.mailId;
            this.paused = builder.paused;
            this.subscribeName = builder.subscribeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizOwnerName
         */
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        /**
         * @return bizOwnerUserId
         */
        public String getBizOwnerUserId() {
            return this.bizOwnerUserId;
        }

        /**
         * @return mailId
         */
        public String getMailId() {
            return this.mailId;
        }

        /**
         * @return paused
         */
        public Boolean getPaused() {
            return this.paused;
        }

        /**
         * @return subscribeName
         */
        public String getSubscribeName() {
            return this.subscribeName;
        }

        public static final class Builder {
            private String bizOwnerName; 
            private String bizOwnerUserId; 
            private String mailId; 
            private Boolean paused; 
            private String subscribeName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizOwnerName = model.bizOwnerName;
                this.bizOwnerUserId = model.bizOwnerUserId;
                this.mailId = model.mailId;
                this.paused = model.paused;
                this.subscribeName = model.subscribeName;
            } 

            /**
             * <p>The nickname of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bizOwnerName(String bizOwnerName) {
                this.bizOwnerName = bizOwnerName;
                return this;
            }

            /**
             * <p>The user ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>asag****2423</p>
             */
            public Builder bizOwnerUserId(String bizOwnerUserId) {
                this.bizOwnerUserId = bizOwnerUserId;
                return this;
            }

            /**
             * <p>The mail ID of the tracking task.</p>
             * 
             * <strong>example:</strong>
             * <p>2342526</p>
             */
            public Builder mailId(String mailId) {
                this.mailId = mailId;
                return this;
            }

            /**
             * <p>Indicates whether the task is paused.</p>
             * <ul>
             * <li><p>true: The task is paused.</p>
             * </li>
             * <li><p>false: The task is not paused.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder paused(Boolean paused) {
                this.paused = paused;
                return this;
            }

            /**
             * <p>The name of the tracking task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder subscribeName(String subscribeName) {
                this.subscribeName = subscribeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMailTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetMailTaskListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Integer next;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Pre")
        private Integer pre;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.next = builder.next;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pre = builder.pre;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Integer getNext() {
            return this.next;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pre
         */
        public Integer getPre() {
            return this.pre;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer next; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer pre; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.next = model.next;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pre = model.pre;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>An array of tracking task models.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The next page number. A value of null or 0 indicates that there is no next page.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder next(Integer next) {
                this.next = next;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page that was set for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The previous page number. A value of null or 0 indicates that there is no previous page.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder pre(Integer pre) {
                this.pre = pre;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
