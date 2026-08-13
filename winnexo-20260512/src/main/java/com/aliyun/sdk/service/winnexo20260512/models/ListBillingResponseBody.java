// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListBillingResponseBody} extends {@link TeaModel}
 *
 * <p>ListBillingResponseBody</p>
 */
public class ListBillingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListBillingResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBillingResponseBody create() {
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
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<List> list; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListBillingResponseBody model) {
            this.code = model.code;
            this.list = model.list;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListBillingResponseBody build() {
            return new ListBillingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBillingResponseBody} extends {@link TeaModel}
     *
     * <p>ListBillingResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingId")
        private String billingId;

        @com.aliyun.core.annotation.NameInMap("bizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("bizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("costSource")
        private java.util.List<String> costSource;

        @com.aliyun.core.annotation.NameInMap("costSourceDisplayName")
        private java.util.List<String> costSourceDisplayName;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("entryObjectId")
        private String entryObjectId;

        @com.aliyun.core.annotation.NameInMap("entryObjectType")
        private String entryObjectType;

        @com.aliyun.core.annotation.NameInMap("isShadow")
        private Boolean isShadow;

        @com.aliyun.core.annotation.NameInMap("operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("operationDisplayName")
        private String operationDisplayName;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusDisplayName")
        private String statusDisplayName;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("totalCreditCost")
        private String totalCreditCost;

        @com.aliyun.core.annotation.NameInMap("wnUserId")
        private String wnUserId;

        private List(Builder builder) {
            this.billingId = builder.billingId;
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.costSource = builder.costSource;
            this.costSourceDisplayName = builder.costSourceDisplayName;
            this.endTime = builder.endTime;
            this.entryObjectId = builder.entryObjectId;
            this.entryObjectType = builder.entryObjectType;
            this.isShadow = builder.isShadow;
            this.operation = builder.operation;
            this.operationDisplayName = builder.operationDisplayName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDisplayName = builder.statusDisplayName;
            this.tenantId = builder.tenantId;
            this.totalCreditCost = builder.totalCreditCost;
            this.wnUserId = builder.wnUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return billingId
         */
        public String getBillingId() {
            return this.billingId;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return costSource
         */
        public java.util.List<String> getCostSource() {
            return this.costSource;
        }

        /**
         * @return costSourceDisplayName
         */
        public java.util.List<String> getCostSourceDisplayName() {
            return this.costSourceDisplayName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entryObjectId
         */
        public String getEntryObjectId() {
            return this.entryObjectId;
        }

        /**
         * @return entryObjectType
         */
        public String getEntryObjectType() {
            return this.entryObjectType;
        }

        /**
         * @return isShadow
         */
        public Boolean getIsShadow() {
            return this.isShadow;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return operationDisplayName
         */
        public String getOperationDisplayName() {
            return this.operationDisplayName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDisplayName
         */
        public String getStatusDisplayName() {
            return this.statusDisplayName;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalCreditCost
         */
        public String getTotalCreditCost() {
            return this.totalCreditCost;
        }

        /**
         * @return wnUserId
         */
        public String getWnUserId() {
            return this.wnUserId;
        }

        public static final class Builder {
            private String billingId; 
            private String bizId; 
            private String bizType; 
            private java.util.List<String> costSource; 
            private java.util.List<String> costSourceDisplayName; 
            private String endTime; 
            private String entryObjectId; 
            private String entryObjectType; 
            private Boolean isShadow; 
            private String operation; 
            private String operationDisplayName; 
            private String startTime; 
            private String status; 
            private String statusDisplayName; 
            private Long tenantId; 
            private String totalCreditCost; 
            private String wnUserId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.billingId = model.billingId;
                this.bizId = model.bizId;
                this.bizType = model.bizType;
                this.costSource = model.costSource;
                this.costSourceDisplayName = model.costSourceDisplayName;
                this.endTime = model.endTime;
                this.entryObjectId = model.entryObjectId;
                this.entryObjectType = model.entryObjectType;
                this.isShadow = model.isShadow;
                this.operation = model.operation;
                this.operationDisplayName = model.operationDisplayName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDisplayName = model.statusDisplayName;
                this.tenantId = model.tenantId;
                this.totalCreditCost = model.totalCreditCost;
                this.wnUserId = model.wnUserId;
            } 

            /**
             * <p>账单业务ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBillingId</p>
             */
            public Builder billingId(String billingId) {
                this.billingId = billingId;
                return this;
            }

            /**
             * <p>业务来源ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBizId</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>业务来源类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>costSource</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder costSource(java.util.List<String> costSource) {
                this.costSource = costSource;
                return this;
            }

            /**
             * <p>costSourceDisplayName</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder costSourceDisplayName(java.util.List<String> costSourceDisplayName) {
                this.costSourceDisplayName = costSourceDisplayName;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>入口对象ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleEntryObjectId</p>
             */
            public Builder entryObjectId(String entryObjectId) {
                this.entryObjectId = entryObjectId;
                return this;
            }

            /**
             * <p>入口对象类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder entryObjectType(String entryObjectType) {
                this.entryObjectType = entryObjectType;
                return this;
            }

            /**
             * <p>是否影子账单</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShadow(Boolean isShadow) {
                this.isShadow = isShadow;
                return this;
            }

            /**
             * <p>操作类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>操作类型展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operationDisplayName(String operationDisplayName) {
                this.operationDisplayName = operationDisplayName;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>状态</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>状态展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder statusDisplayName(String statusDisplayName) {
                this.statusDisplayName = statusDisplayName;
                return this;
            }

            /**
             * <p>租户ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>汇总 credit 消耗</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder totalCreditCost(String totalCreditCost) {
                this.totalCreditCost = totalCreditCost;
                return this;
            }

            /**
             * <p>WINNEXO 平台用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder wnUserId(String wnUserId) {
                this.wnUserId = wnUserId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
