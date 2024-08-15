// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailTimelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentDetailTimelinesResponseBody</p>
 */
public class ListIncidentDetailTimelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListIncidentDetailTimelinesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentDetailTimelinesResponseBody create() {
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
         * Id of the request
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

        public ListIncidentDetailTimelinesResponseBody build() {
            return new ListIncidentDetailTimelinesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("incidentId")
        private Long incidentId;

        @com.aliyun.core.annotation.NameInMap("relRouteRuleDeleteType")
        private Integer relRouteRuleDeleteType;

        @com.aliyun.core.annotation.NameInMap("relatedServiceName")
        private String relatedServiceName;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("snapshotData")
        private String snapshotData;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Data(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.incidentId = builder.incidentId;
            this.relRouteRuleDeleteType = builder.relRouteRuleDeleteType;
            this.relatedServiceName = builder.relatedServiceName;
            this.remark = builder.remark;
            this.snapshotData = builder.snapshotData;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return relRouteRuleDeleteType
         */
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        /**
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return snapshotData
         */
        public String getSnapshotData() {
            return this.snapshotData;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String action; 
            private String createTime; 
            private String description; 
            private Long incidentId; 
            private Integer relRouteRuleDeleteType; 
            private String relatedServiceName; 
            private String remark; 
            private String snapshotData; 
            private String title; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
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
             * relatedServiceName.
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * snapshotData.
             */
            public Builder snapshotData(String snapshotData) {
                this.snapshotData = snapshotData;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
