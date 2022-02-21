// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubscriptionsResponseBody</p>
 */
public class ListSubscriptionsResponseBody extends TeaModel {
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

    private ListSubscriptionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionsResponseBody create() {
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
         * data.
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
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSubscriptionsResponseBody build() {
            return new ListSubscriptionsResponseBody(this);
        } 

    } 

    public static class NotifyObjectList extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("notifyObjectId")
        private Long notifyObjectId;

        @NameInMap("notifyObjectType")
        private Long notifyObjectType;

        private NotifyObjectList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.notifyObjectId = builder.notifyObjectId;
            this.notifyObjectType = builder.notifyObjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyObjectList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyObjectId
         */
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        /**
         * @return notifyObjectType
         */
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private Long notifyObjectId; 
            private Long notifyObjectType; 

            /**
             * id主键
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 通知对象名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 关联主键id
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * 通知对象类型0服务组 1个人
             */
            public Builder notifyObjectType(Long notifyObjectType) {
                this.notifyObjectType = notifyObjectType;
                return this;
            }

            public NotifyObjectList build() {
                return new NotifyObjectList(this);
            } 

        } 

    }
    public static class ScopeObjectList extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("scope")
        private Long scope;

        @NameInMap("scopeObject")
        private String scopeObject;

        @NameInMap("scopeObjectId")
        private Long scopeObjectId;

        private ScopeObjectList(Builder builder) {
            this.id = builder.id;
            this.scope = builder.scope;
            this.scopeObject = builder.scopeObject;
            this.scopeObjectId = builder.scopeObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeObjectList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return scope
         */
        public Long getScope() {
            return this.scope;
        }

        /**
         * @return scopeObject
         */
        public String getScopeObject() {
            return this.scopeObject;
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public static final class Builder {
            private Long id; 
            private Long scope; 
            private String scopeObject; 
            private Long scopeObjectId; 

            /**
             * id主键
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 订阅范围类型 ALL全部 SERVICE服务 ROUTETULE流转规则
             */
            public Builder scope(Long scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 订阅范围对象名称
             */
            public Builder scopeObject(String scopeObject) {
                this.scopeObject = scopeObject;
                return this;
            }

            /**
             * 订阅范围对象关联表主键id
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            public ScopeObjectList build() {
                return new ScopeObjectList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("endTime")
        private String endTime;

        @NameInMap("expiredType")
        private String expiredType;

        @NameInMap("notifyObjectList")
        private java.util.List < NotifyObjectList> notifyObjectList;

        @NameInMap("notifyObjectType")
        private Long notifyObjectType;

        @NameInMap("scope")
        private Long scope;

        @NameInMap("scopeObjectList")
        private java.util.List < ScopeObjectList> scopeObjectList;

        @NameInMap("startTime")
        private String startTime;

        @NameInMap("status")
        private String status;

        @NameInMap("subscriptionId")
        private Long subscriptionId;

        @NameInMap("subscriptionTitle")
        private String subscriptionTitle;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.expiredType = builder.expiredType;
            this.notifyObjectList = builder.notifyObjectList;
            this.notifyObjectType = builder.notifyObjectType;
            this.scope = builder.scope;
            this.scopeObjectList = builder.scopeObjectList;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subscriptionId = builder.subscriptionId;
            this.subscriptionTitle = builder.subscriptionTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return expiredType
         */
        public String getExpiredType() {
            return this.expiredType;
        }

        /**
         * @return notifyObjectList
         */
        public java.util.List < NotifyObjectList> getNotifyObjectList() {
            return this.notifyObjectList;
        }

        /**
         * @return notifyObjectType
         */
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        /**
         * @return scope
         */
        public Long getScope() {
            return this.scope;
        }

        /**
         * @return scopeObjectList
         */
        public java.util.List < ScopeObjectList> getScopeObjectList() {
            return this.scopeObjectList;
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
         * @return subscriptionId
         */
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return subscriptionTitle
         */
        public String getSubscriptionTitle() {
            return this.subscriptionTitle;
        }

        public static final class Builder {
            private String endTime; 
            private String expiredType; 
            private java.util.List < NotifyObjectList> notifyObjectList; 
            private Long notifyObjectType; 
            private Long scope; 
            private java.util.List < ScopeObjectList> scopeObjectList; 
            private String startTime; 
            private String status; 
            private Long subscriptionId; 
            private String subscriptionTitle; 

            /**
             * 时效结束时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 有效期类型 0 长期 1短期
             */
            public Builder expiredType(String expiredType) {
                this.expiredType = expiredType;
                return this;
            }

            /**
             * 通知对象列表
             */
            public Builder notifyObjectList(java.util.List < NotifyObjectList> notifyObjectList) {
                this.notifyObjectList = notifyObjectList;
                return this;
            }

            /**
             * 0服务组 1个人
             */
            public Builder notifyObjectType(Long notifyObjectType) {
                this.notifyObjectType = notifyObjectType;
                return this;
            }

            /**
             * 0 全部 1服务 2 流转规则
             */
            public Builder scope(Long scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 订阅范围列表
             */
            public Builder scopeObjectList(java.util.List < ScopeObjectList> scopeObjectList) {
                this.scopeObjectList = scopeObjectList;
                return this;
            }

            /**
             * 时效开始时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * ENABLE 启用 DISABLE禁用
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 订阅id
             */
            public Builder subscriptionId(Long subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * 通知订阅名称
             */
            public Builder subscriptionTitle(String subscriptionTitle) {
                this.subscriptionTitle = subscriptionTitle;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
