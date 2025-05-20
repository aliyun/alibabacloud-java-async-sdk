// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadMessageListResponseBody} extends {@link TeaModel}
 *
 * <p>ReadMessageListResponseBody</p>
 */
public class ReadMessageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadMessageListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMessageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadMessageListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public ReadMessageListResponseBody build() {
            return new ReadMessageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadMessageListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageListResponseBody</p>
     */
    public static class Rows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("ClassId")
        private Long classId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Long gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtUpdate")
        private Long gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("MassId")
        private Long massId;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private Long msgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Rows(Builder builder) {
            this.categoryName = builder.categoryName;
            this._class = builder._class;
            this.classId = builder.classId;
            this.content = builder.content;
            this.deleted = builder.deleted;
            this.gmtCreated = builder.gmtCreated;
            this.gmtUpdate = builder.gmtUpdate;
            this.massId = builder.massId;
            this.memo = builder.memo;
            this.msgId = builder.msgId;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return classId
         */
        public Long getClassId() {
            return this.classId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtUpdate
         */
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return massId
         */
        public Long getMassId() {
            return this.massId;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return msgId
         */
        public Long getMsgId() {
            return this.msgId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryName; 
            private String _class; 
            private Long classId; 
            private String content; 
            private Integer deleted; 
            private Long gmtCreated; 
            private Long gmtUpdate; 
            private Long massId; 
            private String memo; 
            private Long msgId; 
            private Long status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Rows model) {
                this.categoryName = model.categoryName;
                this._class = model._class;
                this.classId = model.classId;
                this.content = model.content;
                this.deleted = model.deleted;
                this.gmtCreated = model.gmtCreated;
                this.gmtUpdate = model.gmtUpdate;
                this.massId = model.massId;
                this.memo = model.memo;
                this.msgId = model.msgId;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * ClassId.
             */
            public Builder classId(Long classId) {
                this.classId = classId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtUpdate.
             */
            public Builder gmtUpdate(Long gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * MassId.
             */
            public Builder massId(Long massId) {
                this.massId = massId;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * MsgId.
             */
            public Builder msgId(Long msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadMessageListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Long maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<Rows> rows;

        private Data(Builder builder) {
            this.count = builder.count;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.rows = builder.rows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return maxResults
         */
        public Long getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return rows
         */
        public java.util.List<Rows> getRows() {
            return this.rows;
        }

        public static final class Builder {
            private Long count; 
            private Long maxResults; 
            private String nextToken; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<Rows> rows; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.rows = model.rows;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Long maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * Rows.
             */
            public Builder rows(java.util.List<Rows> rows) {
                this.rows = rows;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
