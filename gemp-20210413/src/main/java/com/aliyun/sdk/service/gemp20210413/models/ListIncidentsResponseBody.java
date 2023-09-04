// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentsResponseBody</p>
 */
public class ListIncidentsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Integer pageNumber;

    @NameInMap("pageSize")
    private Integer pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListIncidentsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIncidentsResponseBody build() {
            return new ListIncidentsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("assignToWhoIsValid")
        private Long assignToWhoIsValid;

        @NameInMap("assignUserId")
        private Long assignUserId;

        @NameInMap("assignUserName")
        private String assignUserName;

        @NameInMap("assignUserPhone")
        private String assignUserPhone;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("effect")
        private String effect;

        @NameInMap("incidentId")
        private Long incidentId;

        @NameInMap("incidentLevel")
        private String incidentLevel;

        @NameInMap("incidentNumber")
        private String incidentNumber;

        @NameInMap("incidentStatus")
        private String incidentStatus;

        @NameInMap("incidentTitle")
        private String incidentTitle;

        @NameInMap("isManual")
        private Boolean isManual;

        @NameInMap("relRouteRuleDeleteType")
        private Integer relRouteRuleDeleteType;

        @NameInMap("relServiceDeleteType")
        private Integer relServiceDeleteType;

        @NameInMap("relatedServiceId")
        private Long relatedServiceId;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("routeRuleId")
        private Long routeRuleId;

        @NameInMap("routeRuleName")
        private String routeRuleName;

        private Data(Builder builder) {
            this.assignToWhoIsValid = builder.assignToWhoIsValid;
            this.assignUserId = builder.assignUserId;
            this.assignUserName = builder.assignUserName;
            this.assignUserPhone = builder.assignUserPhone;
            this.createTime = builder.createTime;
            this.effect = builder.effect;
            this.incidentId = builder.incidentId;
            this.incidentLevel = builder.incidentLevel;
            this.incidentNumber = builder.incidentNumber;
            this.incidentStatus = builder.incidentStatus;
            this.incidentTitle = builder.incidentTitle;
            this.isManual = builder.isManual;
            this.relRouteRuleDeleteType = builder.relRouteRuleDeleteType;
            this.relServiceDeleteType = builder.relServiceDeleteType;
            this.relatedServiceId = builder.relatedServiceId;
            this.relatedServiceName = builder.relatedServiceName;
            this.routeRuleId = builder.routeRuleId;
            this.routeRuleName = builder.routeRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assignToWhoIsValid
         */
        public Long getAssignToWhoIsValid() {
            return this.assignToWhoIsValid;
        }

        /**
         * @return assignUserId
         */
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        /**
         * @return assignUserName
         */
        public String getAssignUserName() {
            return this.assignUserName;
        }

        /**
         * @return assignUserPhone
         */
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentLevel
         */
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return incidentStatus
         */
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        /**
         * @return incidentTitle
         */
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        /**
         * @return isManual
         */
        public Boolean getIsManual() {
            return this.isManual;
        }

        /**
         * @return relRouteRuleDeleteType
         */
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        /**
         * @return relServiceDeleteType
         */
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        /**
         * @return relatedServiceId
         */
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        /**
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        /**
         * @return routeRuleId
         */
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        /**
         * @return routeRuleName
         */
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

        public static final class Builder {
            private Long assignToWhoIsValid; 
            private Long assignUserId; 
            private String assignUserName; 
            private String assignUserPhone; 
            private String createTime; 
            private String effect; 
            private Long incidentId; 
            private String incidentLevel; 
            private String incidentNumber; 
            private String incidentStatus; 
            private String incidentTitle; 
            private Boolean isManual; 
            private Integer relRouteRuleDeleteType; 
            private Integer relServiceDeleteType; 
            private Long relatedServiceId; 
            private String relatedServiceName; 
            private Long routeRuleId; 
            private String routeRuleName; 

            /**
             * assignToWhoIsValid.
             */
            public Builder assignToWhoIsValid(Long assignToWhoIsValid) {
                this.assignToWhoIsValid = assignToWhoIsValid;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder assignUserId(Long assignUserId) {
                this.assignUserId = assignUserId;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder assignUserName(String assignUserName) {
                this.assignUserName = assignUserName;
                return this;
            }

            /**
             * assignUserPhone.
             */
            public Builder assignUserPhone(String assignUserPhone) {
                this.assignUserPhone = assignUserPhone;
                return this;
            }

            /**
             * 事件级别
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 时间指派人ID
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * 影响程度
             */
            public Builder incidentLevel(String incidentLevel) {
                this.incidentLevel = incidentLevel;
                return this;
            }

            /**
             * incidentNumber.
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * 关联流转规则ID
             */
            public Builder incidentStatus(String incidentStatus) {
                this.incidentStatus = incidentStatus;
                return this;
            }

            /**
             * 事件内容
             */
            public Builder incidentTitle(String incidentTitle) {
                this.incidentTitle = incidentTitle;
                return this;
            }

            /**
             * isManual.
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * relRouteRuleDeleteType.
             */
            public Builder relRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
                this.relRouteRuleDeleteType = relRouteRuleDeleteType;
                return this;
            }

            /**
             * relServiceDeleteType.
             */
            public Builder relServiceDeleteType(Integer relServiceDeleteType) {
                this.relServiceDeleteType = relServiceDeleteType;
                return this;
            }

            /**
             * 事件状态
             */
            public Builder relatedServiceId(Long relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * relatedServiceName.
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * 关联的服务ID
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            /**
             * routeRuleName.
             */
            public Builder routeRuleName(String routeRuleName) {
                this.routeRuleName = routeRuleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
