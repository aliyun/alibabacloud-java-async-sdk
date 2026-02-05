// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

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
 * {@link ListYunQiTaskByUidResponseBody} extends {@link TeaModel}
 *
 * <p>ListYunQiTaskByUidResponseBody</p>
 */
public class ListYunQiTaskByUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListYunQiTaskByUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYunQiTaskByUidResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListYunQiTaskByUidResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListYunQiTaskByUidResponseBody build() {
            return new ListYunQiTaskByUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListYunQiTaskByUidResponseBody} extends {@link TeaModel}
     *
     * <p>ListYunQiTaskByUidResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("evaluationStar")
        private Integer evaluationStar;

        @com.aliyun.core.annotation.NameInMap("important")
        private String important;

        @com.aliyun.core.annotation.NameInMap("mainDingDepartmentId")
        private String mainDingDepartmentId;

        @com.aliyun.core.annotation.NameInMap("mainDingGroupId")
        private String mainDingGroupId;

        @com.aliyun.core.annotation.NameInMap("mainDingGroupName")
        private String mainDingGroupName;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("recordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subDingDepartmentId")
        private String subDingDepartmentId;

        @com.aliyun.core.annotation.NameInMap("subDingGroupId")
        private String subDingGroupId;

        @com.aliyun.core.annotation.NameInMap("subDingGroupName")
        private String subDingGroupName;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private List(Builder builder) {
            this.chatId = builder.chatId;
            this.createTime = builder.createTime;
            this.creatorName = builder.creatorName;
            this.endTime = builder.endTime;
            this.evaluationStar = builder.evaluationStar;
            this.important = builder.important;
            this.mainDingDepartmentId = builder.mainDingDepartmentId;
            this.mainDingGroupId = builder.mainDingGroupId;
            this.mainDingGroupName = builder.mainDingGroupName;
            this.productName = builder.productName;
            this.recordId = builder.recordId;
            this.status = builder.status;
            this.subDingDepartmentId = builder.subDingDepartmentId;
            this.subDingGroupId = builder.subDingGroupId;
            this.subDingGroupName = builder.subDingGroupName;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluationStar
         */
        public Integer getEvaluationStar() {
            return this.evaluationStar;
        }

        /**
         * @return important
         */
        public String getImportant() {
            return this.important;
        }

        /**
         * @return mainDingDepartmentId
         */
        public String getMainDingDepartmentId() {
            return this.mainDingDepartmentId;
        }

        /**
         * @return mainDingGroupId
         */
        public String getMainDingGroupId() {
            return this.mainDingGroupId;
        }

        /**
         * @return mainDingGroupName
         */
        public String getMainDingGroupName() {
            return this.mainDingGroupName;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subDingDepartmentId
         */
        public String getSubDingDepartmentId() {
            return this.subDingDepartmentId;
        }

        /**
         * @return subDingGroupId
         */
        public String getSubDingGroupId() {
            return this.subDingGroupId;
        }

        /**
         * @return subDingGroupName
         */
        public String getSubDingGroupName() {
            return this.subDingGroupName;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String chatId; 
            private Long createTime; 
            private String creatorName; 
            private Long endTime; 
            private Integer evaluationStar; 
            private String important; 
            private String mainDingDepartmentId; 
            private String mainDingGroupId; 
            private String mainDingGroupName; 
            private String productName; 
            private String recordId; 
            private String status; 
            private String subDingDepartmentId; 
            private String subDingGroupId; 
            private String subDingGroupName; 
            private String title; 

            private Builder() {
            } 

            private Builder(List model) {
                this.chatId = model.chatId;
                this.createTime = model.createTime;
                this.creatorName = model.creatorName;
                this.endTime = model.endTime;
                this.evaluationStar = model.evaluationStar;
                this.important = model.important;
                this.mainDingDepartmentId = model.mainDingDepartmentId;
                this.mainDingGroupId = model.mainDingGroupId;
                this.mainDingGroupName = model.mainDingGroupName;
                this.productName = model.productName;
                this.recordId = model.recordId;
                this.status = model.status;
                this.subDingDepartmentId = model.subDingDepartmentId;
                this.subDingGroupId = model.subDingGroupId;
                this.subDingGroupName = model.subDingGroupName;
                this.title = model.title;
            } 

            /**
             * chatId.
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * evaluationStar.
             */
            public Builder evaluationStar(Integer evaluationStar) {
                this.evaluationStar = evaluationStar;
                return this;
            }

            /**
             * important.
             */
            public Builder important(String important) {
                this.important = important;
                return this;
            }

            /**
             * mainDingDepartmentId.
             */
            public Builder mainDingDepartmentId(String mainDingDepartmentId) {
                this.mainDingDepartmentId = mainDingDepartmentId;
                return this;
            }

            /**
             * mainDingGroupId.
             */
            public Builder mainDingGroupId(String mainDingGroupId) {
                this.mainDingGroupId = mainDingGroupId;
                return this;
            }

            /**
             * mainDingGroupName.
             */
            public Builder mainDingGroupName(String mainDingGroupName) {
                this.mainDingGroupName = mainDingGroupName;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * recordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subDingDepartmentId.
             */
            public Builder subDingDepartmentId(String subDingDepartmentId) {
                this.subDingDepartmentId = subDingDepartmentId;
                return this;
            }

            /**
             * subDingGroupId.
             */
            public Builder subDingGroupId(String subDingGroupId) {
                this.subDingGroupId = subDingGroupId;
                return this;
            }

            /**
             * subDingGroupName.
             */
            public Builder subDingGroupName(String subDingGroupName) {
                this.subDingGroupName = subDingGroupName;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListYunQiTaskByUidResponseBody} extends {@link TeaModel}
     *
     * <p>ListYunQiTaskByUidResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extend")
        private Object extend;

        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.extend = builder.extend;
            this.list = builder.list;
            this.pageNum = builder.pageNum;
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
         * @return extend
         */
        public Object getExtend() {
            return this.extend;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Object extend; 
            private java.util.List<List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.extend = model.extend;
                this.list = model.list;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * extend.
             */
            public Builder extend(Object extend) {
                this.extend = extend;
                return this;
            }

            /**
             * list.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
