// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentTimelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentTimelinesResponseBody</p>
 */
public class ListIncidentTimelinesResponseBody extends TeaModel {
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

    private ListIncidentTimelinesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentTimelinesResponseBody create() {
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
         * data.
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ??????
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIncidentTimelinesResponseBody build() {
            return new ListIncidentTimelinesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("action")
        private String action;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("description")
        private Long description;

        @NameInMap("incidentId")
        private Long incidentId;

        @NameInMap("incidentNumber")
        private String incidentNumber;

        @NameInMap("incidentTitle")
        private String incidentTitle;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("remark")
        private String remark;

        @NameInMap("snapshotData")
        private String snapshotData;

        @NameInMap("title")
        private String title;

        private Data(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.incidentId = builder.incidentId;
            this.incidentNumber = builder.incidentNumber;
            this.incidentTitle = builder.incidentTitle;
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
        public Long getDescription() {
            return this.description;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return incidentTitle
         */
        public String getIncidentTitle() {
            return this.incidentTitle;
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
            private Long description; 
            private Long incidentId; 
            private String incidentNumber; 
            private String incidentTitle; 
            private String relatedServiceName; 
            private String remark; 
            private String snapshotData; 
            private String title; 

            /**
             * ????????????  ???????????? INCIDENT_ADD ?????? INCIDENT_RESPONSE ?????? INCIDENT_DELIVER ?????? INCIDENT_UPDATE ???????????? INCIDENT_ADD_SUBTOTAL ?????? INCIDENT_FINISH ?????? INCIDENT_ASSIGN ?????? INCIDENT_UPGRAD
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ????????????
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ??????
             */
            public Builder description(Long description) {
                this.description = description;
                return this;
            }

            /**
             * ??????Id
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * ????????????
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * ????????????
             */
            public Builder incidentTitle(String incidentTitle) {
                this.incidentTitle = incidentTitle;
                return this;
            }

            /**
             * ????????????
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * ??????
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder snapshotData(String snapshotData) {
                this.snapshotData = snapshotData;
                return this;
            }

            /**
             * ??????
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
