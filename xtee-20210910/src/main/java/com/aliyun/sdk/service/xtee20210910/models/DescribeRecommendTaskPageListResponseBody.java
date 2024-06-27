// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < ResultObject> resultObject;

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
    public java.util.List < ResultObject> getResultObject() {
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
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRecommendTaskPageListResponseBody build() {
            return new DescribeRecommendTaskPageListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectVelocities")
        private java.util.List < String > expectVelocities;

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
        public java.util.List < String > getExpectVelocities() {
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
            private java.util.List < String > expectVelocities; 
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

            /**
             * expectVelocities.
             */
            public Builder expectVelocities(java.util.List < String > expectVelocities) {
                this.expectVelocities = expectVelocities;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * normalCount.
             */
            public Builder normalCount(Long normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * normalSize.
             */
            public Builder normalSize(Long normalSize) {
                this.normalSize = normalSize;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * riskSize.
             */
            public Builder riskSize(Long riskSize) {
                this.riskSize = riskSize;
                return this;
            }

            /**
             * sampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * sampleScene.
             */
            public Builder sampleScene(String sampleScene) {
                this.sampleScene = sampleScene;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * taskStatus.
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
