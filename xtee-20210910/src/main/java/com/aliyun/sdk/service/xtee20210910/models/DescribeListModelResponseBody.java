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
 * {@link DescribeListModelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListModelResponseBody</p>
 */
public class DescribeListModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private String totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private String totalPage;

    private DescribeListModelResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public String getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public String getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String currentPage; 
        private String pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private String totalItem; 
        private String totalPage; 

        private Builder() {
        } 

        private Builder(DescribeListModelResponseBody model) {
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItem(String totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeListModelResponseBody build() {
            return new DescribeListModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeListModelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeListModelResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucId")
        private String bucId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("modelCode")
        private String modelCode;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelScene")
        private String modelScene;

        @com.aliyun.core.annotation.NameInMap("modelStatus")
        private String modelStatus;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userLocalFileName")
        private String userLocalFileName;

        private ResultObject(Builder builder) {
            this.bucId = builder.bucId;
            this.createTime = builder.createTime;
            this.modelCode = builder.modelCode;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelScene = builder.modelScene;
            this.modelStatus = builder.modelStatus;
            this.taskId = builder.taskId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.userLocalFileName = builder.userLocalFileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bucId
         */
        public String getBucId() {
            return this.bucId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modelCode
         */
        public String getModelCode() {
            return this.modelCode;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelScene
         */
        public String getModelScene() {
            return this.modelScene;
        }

        /**
         * @return modelStatus
         */
        public String getModelStatus() {
            return this.modelStatus;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userLocalFileName
         */
        public String getUserLocalFileName() {
            return this.userLocalFileName;
        }

        public static final class Builder {
            private String bucId; 
            private String createTime; 
            private String modelCode; 
            private String modelId; 
            private String modelName; 
            private String modelScene; 
            private String modelStatus; 
            private String taskId; 
            private String updateTime; 
            private String userId; 
            private String userLocalFileName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bucId = model.bucId;
                this.createTime = model.createTime;
                this.modelCode = model.modelCode;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.modelScene = model.modelScene;
                this.modelStatus = model.modelStatus;
                this.taskId = model.taskId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.userLocalFileName = model.userLocalFileName;
            } 

            /**
             * <p>Uploader ID.</p>
             * 
             * <strong>example:</strong>
             * <p>011786</p>
             */
            public Builder bucId(String bucId) {
                this.bucId = bucId;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-07T02:26:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Model code.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
             */
            public Builder modelCode(String modelCode) {
                this.modelCode = modelCode;
                return this;
            }

            /**
             * <p>Unique identifier of the model in use.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>Model name.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_model</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Model scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_scene</p>
             */
            public Builder modelScene(String modelScene) {
                this.modelScene = modelScene;
                return this;
            }

            /**
             * <p>Model status, values: -<strong>ENABLED</strong>: Enabled-<strong>DISABLED</strong>: Disabled</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder modelStatus(String modelStatus) {
                this.modelStatus = modelStatus;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0c8a3799-5ac8-434b-b255-e06edb35c05f</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Last update time of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-18T02:07:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1806507582222226</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>File name.</p>
             * 
             * <strong>example:</strong>
             * <p>saf-ai-1662519103706.csv</p>
             */
            public Builder userLocalFileName(String userLocalFileName) {
                this.userLocalFileName = userLocalFileName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
