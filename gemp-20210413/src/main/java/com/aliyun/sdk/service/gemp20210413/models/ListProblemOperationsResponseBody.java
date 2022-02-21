// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProblemOperationsResponseBody</p>
 */
public class ListProblemOperationsResponseBody extends TeaModel {
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
         * 页
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 行
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
         * 总数
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
        @NameInMap("action")
        private String action;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("description")
        private String description;

        @NameInMap("problemId")
        private Long problemId;

        @NameInMap("problemName")
        private String problemName;

        @NameInMap("problemNumber")
        private String problemNumber;

        @NameInMap("relatedServiceName")
        private String relatedServiceName;

        @NameInMap("snapshotData")
        private String snapshotData;

        @NameInMap("title")
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
             * 升级    PROBLEM_UPGRADE      撤销     PROBLEM_REVOKE      恢复     PROBLEM_RESTORE       复盘     PROBLEM_IN_REVIEW       完结     PROBLEM_REOPENED       取消     PROBLEM_CANCEL       更新故障通告     PROBLEM_UPDATE_NOTIFY       添加故障小计     PROBLEM_ADD_SUBTOTAL       更新故障     PROBLEM_UPDATE
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 故障Id
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * 故障名称
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * 故障编号
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
                return this;
            }

            /**
             * 服务名称
             */
            public Builder relatedServiceName(String relatedServiceName) {
                this.relatedServiceName = relatedServiceName;
                return this;
            }

            /**
             * 快照数据
             */
            public Builder snapshotData(String snapshotData) {
                this.snapshotData = snapshotData;
                return this;
            }

            /**
             * 动态标题
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
