// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListOutboundCallRestrictionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOutboundCallRestrictionsResponseBody</p>
 */
public class ListOutboundCallRestrictionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOutboundCallRestrictionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutboundCallRestrictionsResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOutboundCallRestrictionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Instance does not exist. Instance=392db13c-8901-4a25-b566-91d0d8114cec</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOutboundCallRestrictionsResponseBody build() {
            return new ListOutboundCallRestrictionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOutboundCallRestrictionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutboundCallRestrictionsResponseBody</p>
     */
    public static class OutboundCallRestrictions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private Integer policy;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RestrictionId")
        private String restrictionId;

        private OutboundCallRestrictions(Builder builder) {
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.number = builder.number;
            this.policy = builder.policy;
            this.remark = builder.remark;
            this.restrictionId = builder.restrictionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundCallRestrictions create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return policy
         */
        public Integer getPolicy() {
            return this.policy;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return restrictionId
         */
        public String getRestrictionId() {
            return this.restrictionId;
        }

        public static final class Builder {
            private Long createdTime; 
            private String creator; 
            private String number; 
            private Integer policy; 
            private String remark; 
            private String restrictionId; 

            private Builder() {
            } 

            private Builder(OutboundCallRestrictions model) {
                this.createdTime = model.createdTime;
                this.creator = model.creator;
                this.number = model.number;
                this.policy = model.policy;
                this.remark = model.remark;
                this.restrictionId = model.restrictionId;
            } 

            /**
             * <p>创建时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>创建者</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>电话号码</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>策略</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder policy(Integer policy) {
                this.policy = policy;
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

            /**
             * <p>外呼限制ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder restrictionId(String restrictionId) {
                this.restrictionId = restrictionId;
                return this;
            }

            public OutboundCallRestrictions build() {
                return new OutboundCallRestrictions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutboundCallRestrictionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutboundCallRestrictionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutboundCallRestrictions")
        private java.util.List<OutboundCallRestrictions> outboundCallRestrictions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.outboundCallRestrictions = builder.outboundCallRestrictions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return outboundCallRestrictions
         */
        public java.util.List<OutboundCallRestrictions> getOutboundCallRestrictions() {
            return this.outboundCallRestrictions;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<OutboundCallRestrictions> outboundCallRestrictions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.outboundCallRestrictions = model.outboundCallRestrictions;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>数据列表</p>
             */
            public Builder outboundCallRestrictions(java.util.List<OutboundCallRestrictions> outboundCallRestrictions) {
                this.outboundCallRestrictions = outboundCallRestrictions;
                return this;
            }

            /**
             * <p>页码，从1开始</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>每页记录数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>符合条件的记录总数</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
