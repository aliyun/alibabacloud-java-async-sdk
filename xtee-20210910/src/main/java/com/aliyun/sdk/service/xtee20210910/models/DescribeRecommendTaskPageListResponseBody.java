// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRecommendTaskPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendTaskPageListResponseBody</p>
 */
public class DescribeRecommendTaskPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeRecommendTaskPageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendTaskPageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeRecommendTaskPageListResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, with a default value of 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRecommendTaskPageListResponseBody build() {
            return new DescribeRecommendTaskPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecommendTaskPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendTaskPageListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectVelocities")
        private java.util.List<String> expectVelocities;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("normalCount")
        private Long normalCount;

        @com.aliyun.core.annotation.NameInMap("normalSize")
        private Long normalSize;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("riskSize")
        private Long riskSize;

        @com.aliyun.core.annotation.NameInMap("sampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("sampleScene")
        private String sampleScene;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private ResultObject(Builder builder) {
            this.expectVelocities = builder.expectVelocities;
            this.gmtCreate = builder.gmtCreate;
            this.normalCount = builder.normalCount;
            this.normalSize = builder.normalSize;
            this.riskCount = builder.riskCount;
            this.riskSize = builder.riskSize;
            this.sampleName = builder.sampleName;
            this.sampleScene = builder.sampleScene;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return expectVelocities
         */
        public java.util.List<String> getExpectVelocities() {
            return this.expectVelocities;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return normalCount
         */
        public Long getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return normalSize
         */
        public Long getNormalSize() {
            return this.normalSize;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskSize
         */
        public Long getRiskSize() {
            return this.riskSize;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return sampleScene
         */
        public String getSampleScene() {
            return this.sampleScene;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private java.util.List<String> expectVelocities; 
            private Long gmtCreate; 
            private Long normalCount; 
            private Long normalSize; 
            private Long riskCount; 
            private Long riskSize; 
            private String sampleName; 
            private String sampleScene; 
            private Long taskId; 
            private String taskName; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.expectVelocities = model.expectVelocities;
                this.gmtCreate = model.gmtCreate;
                this.normalCount = model.normalCount;
                this.normalSize = model.normalSize;
                this.riskCount = model.riskCount;
                this.riskSize = model.riskSize;
                this.sampleName = model.sampleName;
                this.sampleScene = model.sampleScene;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>Impact indicators</p>
             */
            public Builder expectVelocities(java.util.List<String> expectVelocities) {
                this.expectVelocities = expectVelocities;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Number of samples</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder normalCount(Long normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * <p>Number of normal samples</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder normalSize(Long normalSize) {
                this.normalSize = normalSize;
                return this;
            }

            /**
             * <p>Number of records displayed on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>Number of risk samples</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder riskSize(Long riskSize) {
                this.riskSize = riskSize;
                return this;
            }

            /**
             * <p>Sample name</p>
             * 
             * <strong>example:</strong>
             * <p>白样本</p>
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * <p>Sample scenario</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse_detection</p>
             */
            public Builder sampleScene(String sampleScene) {
                this.sampleScene = sampleScene;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>240c93ddffa74e38be3a00375eb3041d</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task name.</p>
             * 
             * <strong>example:</strong>
             * <p>策略推荐任务</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>Task status.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
