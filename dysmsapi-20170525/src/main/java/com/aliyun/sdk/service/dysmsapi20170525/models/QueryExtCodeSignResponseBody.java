// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QueryExtCodeSignResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExtCodeSignResponseBody</p>
 */
public class QueryExtCodeSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private QueryExtCodeSignResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExtCodeSignResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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

        public QueryExtCodeSignResponseBody build() {
            return new QueryExtCodeSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryExtCodeSignResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExtCodeSignResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("ExtCode")
        private String extCode;

        @com.aliyun.core.annotation.NameInMap("SendCount")
        private Long sendCount;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private List(Builder builder) {
            this.active = builder.active;
            this.extCode = builder.extCode;
            this.sendCount = builder.sendCount;
            this.signName = builder.signName;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return extCode
         */
        public String getExtCode() {
            return this.extCode;
        }

        /**
         * @return sendCount
         */
        public Long getSendCount() {
            return this.sendCount;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Long active; 
            private String extCode; 
            private Long sendCount; 
            private String signName; 
            private String source; 

            /**
             * <p>是否可回收</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>扩展码A3</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder extCode(String extCode) {
                this.extCode = extCode;
                return this;
            }

            /**
             * <p>近1个月发送成功条数（只读）</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder sendCount(Long sendCount) {
                this.sendCount = sendCount;
                return this;
            }

            /**
             * <p>签名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * <p>来源</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryExtCodeSignResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExtCodeSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
