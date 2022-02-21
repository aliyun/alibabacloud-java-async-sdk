// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListEscalationPlansResponseBody</p>
 */
public class ListEscalationPlansResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListEscalationPlansResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总条数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEscalationPlansResponseBody build() {
            return new ListEscalationPlansResponseBody(this);
        } 

    } 

    public static class EscalationPlanScopeObjects extends TeaModel {
        @NameInMap("scope")
        private String scope;

        @NameInMap("scopeObjectId")
        private Long scopeObjectId;

        @NameInMap("scopeObjectName")
        private String scopeObjectName;

        private EscalationPlanScopeObjects(Builder builder) {
            this.scope = builder.scope;
            this.scopeObjectId = builder.scopeObjectId;
            this.scopeObjectName = builder.scopeObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlanScopeObjects create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        /**
         * @return scopeObjectName
         */
        public String getScopeObjectName() {
            return this.scopeObjectName;
        }

        public static final class Builder {
            private String scope; 
            private Long scopeObjectId; 
            private String scopeObjectName; 

            /**
             * 范围对象类型
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 范围对象id（服务id）
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            /**
             * 范围对象名称
             */
            public Builder scopeObjectName(String scopeObjectName) {
                this.scopeObjectName = scopeObjectName;
                return this;
            }

            public EscalationPlanScopeObjects build() {
                return new EscalationPlanScopeObjects(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @NameInMap("escalationPlanName")
        private String escalationPlanName;

        @NameInMap("escalationPlanScopeObjects")
        private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects;

        @NameInMap("modifyTime")
        private String modifyTime;

        @NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
            this.escalationPlanScopeObjects = builder.escalationPlanScopeObjects;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return escalationPlanId
         */
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        /**
         * @return escalationPlanName
         */
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        /**
         * @return escalationPlanScopeObjects
         */
        public java.util.List < EscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects; 
            private String modifyTime; 
            private String status; 

            /**
             * 升级计划id
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * 升级计划名称
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * 升级计划范围对象
             */
            public Builder escalationPlanScopeObjects(java.util.List < EscalationPlanScopeObjects> escalationPlanScopeObjects) {
                this.escalationPlanScopeObjects = escalationPlanScopeObjects;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 启用ENABLE 禁用DISABLE
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
