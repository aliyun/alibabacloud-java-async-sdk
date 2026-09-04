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
 * {@link ReadRevisionHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>ReadRevisionHistoryListResponseBody</p>
 */
public class ReadRevisionHistoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadRevisionHistoryListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadRevisionHistoryListResponseBody create() {
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Integer httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadRevisionHistoryListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
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
         * HttpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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

        public ReadRevisionHistoryListResponseBody build() {
            return new ReadRevisionHistoryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadRevisionHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadRevisionHistoryListResponseBody</p>
     */
    public static class PageSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private PageSpec(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageSpec create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(PageSpec model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
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

            public PageSpec build() {
                return new PageSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadRevisionHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadRevisionHistoryListResponseBody</p>
     */
    public static class Rows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CategoryCode")
        private String categoryCode;

        @com.aliyun.core.annotation.NameInMap("ChannelGroupCode")
        private String channelGroupCode;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OperationItemCode")
        private String operationItemCode;

        @com.aliyun.core.annotation.NameInMap("OperationItemName")
        private String operationItemName;

        @com.aliyun.core.annotation.NameInMap("OperationTimestamp")
        private Long operationTimestamp;

        @com.aliyun.core.annotation.NameInMap("OperatorIp")
        private String operatorIp;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorUid")
        private Long operatorUid;

        @com.aliyun.core.annotation.NameInMap("OriginalValue")
        private String originalValue;

        @com.aliyun.core.annotation.NameInMap("PageSpec")
        private PageSpec pageSpec;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        private Rows(Builder builder) {
            this.aliUid = builder.aliUid;
            this.categoryCode = builder.categoryCode;
            this.channelGroupCode = builder.channelGroupCode;
            this.newValue = builder.newValue;
            this.operationItemCode = builder.operationItemCode;
            this.operationItemName = builder.operationItemName;
            this.operationTimestamp = builder.operationTimestamp;
            this.operatorIp = builder.operatorIp;
            this.operatorName = builder.operatorName;
            this.operatorUid = builder.operatorUid;
            this.originalValue = builder.originalValue;
            this.pageSpec = builder.pageSpec;
            this.remarks = builder.remarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return channelGroupCode
         */
        public String getChannelGroupCode() {
            return this.channelGroupCode;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return operationItemCode
         */
        public String getOperationItemCode() {
            return this.operationItemCode;
        }

        /**
         * @return operationItemName
         */
        public String getOperationItemName() {
            return this.operationItemName;
        }

        /**
         * @return operationTimestamp
         */
        public Long getOperationTimestamp() {
            return this.operationTimestamp;
        }

        /**
         * @return operatorIp
         */
        public String getOperatorIp() {
            return this.operatorIp;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorUid
         */
        public Long getOperatorUid() {
            return this.operatorUid;
        }

        /**
         * @return originalValue
         */
        public String getOriginalValue() {
            return this.originalValue;
        }

        /**
         * @return pageSpec
         */
        public PageSpec getPageSpec() {
            return this.pageSpec;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        public static final class Builder {
            private Long aliUid; 
            private String categoryCode; 
            private String channelGroupCode; 
            private String newValue; 
            private String operationItemCode; 
            private String operationItemName; 
            private Long operationTimestamp; 
            private String operatorIp; 
            private String operatorName; 
            private Long operatorUid; 
            private String originalValue; 
            private PageSpec pageSpec; 
            private String remarks; 

            private Builder() {
            } 

            private Builder(Rows model) {
                this.aliUid = model.aliUid;
                this.categoryCode = model.categoryCode;
                this.channelGroupCode = model.channelGroupCode;
                this.newValue = model.newValue;
                this.operationItemCode = model.operationItemCode;
                this.operationItemName = model.operationItemName;
                this.operationTimestamp = model.operationTimestamp;
                this.operatorIp = model.operatorIp;
                this.operatorName = model.operatorName;
                this.operatorUid = model.operatorUid;
                this.originalValue = model.originalValue;
                this.pageSpec = model.pageSpec;
                this.remarks = model.remarks;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CategoryCode.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * ChannelGroupCode.
             */
            public Builder channelGroupCode(String channelGroupCode) {
                this.channelGroupCode = channelGroupCode;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OperationItemCode.
             */
            public Builder operationItemCode(String operationItemCode) {
                this.operationItemCode = operationItemCode;
                return this;
            }

            /**
             * OperationItemName.
             */
            public Builder operationItemName(String operationItemName) {
                this.operationItemName = operationItemName;
                return this;
            }

            /**
             * OperationTimestamp.
             */
            public Builder operationTimestamp(Long operationTimestamp) {
                this.operationTimestamp = operationTimestamp;
                return this;
            }

            /**
             * OperatorIp.
             */
            public Builder operatorIp(String operatorIp) {
                this.operatorIp = operatorIp;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * OperatorUid.
             */
            public Builder operatorUid(Long operatorUid) {
                this.operatorUid = operatorUid;
                return this;
            }

            /**
             * OriginalValue.
             */
            public Builder originalValue(String originalValue) {
                this.originalValue = originalValue;
                return this;
            }

            /**
             * PageSpec.
             */
            public Builder pageSpec(PageSpec pageSpec) {
                this.pageSpec = pageSpec;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadRevisionHistoryListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadRevisionHistoryListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<Rows> rows;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.rows = builder.rows;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return rows
         */
        public java.util.List<Rows> getRows() {
            return this.rows;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<Rows> rows; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.rows = model.rows;
                this.totalCount = model.totalCount;
            } 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
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
             * Rows.
             */
            public Builder rows(java.util.List<Rows> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
