// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProblemOperationsResponseBody</p>
 */
public class ListProblemOperationsResponseBody extends TeaModel {
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

    private ListProblemOperationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemOperationsResponseBody create() {
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

        public ListProblemOperationsResponseBody build() {
            return new ListProblemOperationsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("problemId")
        private Long problemId;

        @com.aliyun.core.annotation.NameInMap("problemName")
        private String problemName;

        @com.aliyun.core.annotation.NameInMap("problemNumber")
        private String problemNumber;

        @com.aliyun.core.annotation.NameInMap("relatedServiceName")
        private String relatedServiceName;

        @com.aliyun.core.annotation.NameInMap("snapshotData")
        private String snapshotData;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Data(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.problemId = builder.problemId;
            this.problemName = builder.problemName;
            this.problemNumber = builder.problemNumber;
            this.relatedServiceName = builder.relatedServiceName;
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
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemName
         */
        public String getProblemName() {
            return this.problemName;
        }

        /**
         * @return problemNumber
         */
        public String getProblemNumber() {
            return this.problemNumber;
        }

        /**
         * @return relatedServiceName
         */
        public String getRelatedServiceName() {
            return this.relatedServiceName;
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
            private Long problemId; 
            private String problemName; 
            private String problemNumber; 
            private String relatedServiceName; 
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
             * problemId.
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemName.
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * problemNumber.
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
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
