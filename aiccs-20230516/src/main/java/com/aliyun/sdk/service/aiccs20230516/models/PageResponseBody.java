// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link PageResponseBody} extends {@link TeaModel}
 *
 * <p>PageResponseBody</p>
 */
public class PageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private PageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(PageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public PageResponseBody build() {
            return new PageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageResponseBody} extends {@link TeaModel}
     *
     * <p>PageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMD5")
        private String numberMD5;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.expirationTime = builder.expirationTime;
            this.number = builder.number;
            this.numberMD5 = builder.numberMD5;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberMD5
         */
        public String getNumberMD5() {
            return this.numberMD5;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String createTime; 
            private String expirationTime; 
            private String number; 
            private String numberMD5; 
            private String remark; 

            private Builder() {
            } 

            private Builder(List model) {
                this.createTime = model.createTime;
                this.expirationTime = model.expirationTime;
                this.number = model.number;
                this.numberMD5 = model.numberMD5;
                this.remark = model.remark;
            } 

            /**
             * <p>添加时间</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-06 10:10:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>过期时间</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>手机号码</p>
             * 
             * <strong>example:</strong>
             * <p>13314206082</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>手机号MD5</p>
             * 
             * <strong>example:</strong>
             * <p>e10adc3949ba59abbe56e057f20f883e</p>
             */
            public Builder numberMD5(String numberMD5) {
                this.numberMD5 = numberMD5;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageResponseBody} extends {@link TeaModel}
     *
     * <p>PageResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Model(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
