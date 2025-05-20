// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetChatSessionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatSessionListResponseBody</p>
 */
public class GetChatSessionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetChatSessionListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatSessionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatSessionListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatSessionListResponseBody build() {
            return new GetChatSessionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatSessionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatSessionListResponseBody</p>
     */
    public static class SessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("folderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private SessionList(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.name = builder.name;
            this.sessionId = builder.sessionId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createTime; 
            private String folderId; 
            private String name; 
            private String sessionId; 
            private Long updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SessionList model) {
                this.createTime = model.createTime;
                this.folderId = model.folderId;
                this.name = model.name;
                this.sessionId = model.sessionId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * <p>Report creation timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T14:45:17Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Folder ID, used to specify the scope of documents to be queried.</p>
             * 
             * <strong>example:</strong>
             * <p>3493370b-4884-47dd-95ed-49038769af53</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>Session name</p>
             * 
             * <strong>example:</strong>
             * <p>student_app_spelling</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Q&amp;A session ID, used to record multiple Q&amp;As of the same user.</p>
             * 
             * <strong>example:</strong>
             * <p>5c748ef9-3f23-4b5a-916f-966c0d2c6dcd</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>Modification time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-30T02:05:03Z</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>User ID of the current session.</p>
             * 
             * <strong>example:</strong>
             * <p>12222</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SessionList build() {
                return new SessionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChatSessionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatSessionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("sessionList")
        private java.util.List<SessionList> sessionList;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("totalPage")
        private Long totalPage;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.sessionList = builder.sessionList;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return sessionList
         */
        public java.util.List<SessionList> getSessionList() {
            return this.sessionList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List<SessionList> sessionList; 
            private Long total; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.sessionList = model.sessionList;
                this.total = model.total;
                this.totalPage = model.totalPage;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>分页大小。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Session list.</p>
             */
            public Builder sessionList(java.util.List<SessionList> sessionList) {
                this.sessionList = sessionList;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Total number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
