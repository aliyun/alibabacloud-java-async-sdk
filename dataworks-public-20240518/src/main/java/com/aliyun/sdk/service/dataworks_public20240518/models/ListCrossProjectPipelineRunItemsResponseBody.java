// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrossProjectPipelineRunItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrossProjectPipelineRunItemsResponseBody</p>
 */
public class ListCrossProjectPipelineRunItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrossProjectPipelineRunItemsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossProjectPipelineRunItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCrossProjectPipelineRunItemsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;PipelineRunItems&quot;:[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;IsRoot&quot;:true,&quot;Status&quot;:&quot;Ready&quot;}]}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCrossProjectPipelineRunItemsResponseBody build() {
            return new ListCrossProjectPipelineRunItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCrossProjectPipelineRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectPipelineRunItemsResponseBody</p>
     */
    public static class PipelineRunItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("IsRoot")
        private Boolean isRoot;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ObjectVersion")
        private String objectVersion;

        @com.aliyun.core.annotation.NameInMap("ParentObjectId")
        private String parentObjectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PipelineRunItems(Builder builder) {
            this.changeType = builder.changeType;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.isRoot = builder.isRoot;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.objectVersion = builder.objectVersion;
            this.parentObjectId = builder.parentObjectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRunItems create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return isRoot
         */
        public Boolean getIsRoot() {
            return this.isRoot;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectVersion
         */
        public String getObjectVersion() {
            return this.objectVersion;
        }

        /**
         * @return parentObjectId
         */
        public String getParentObjectId() {
            return this.parentObjectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String changeType; 
            private String errorCode; 
            private String errorMessage; 
            private Boolean isRoot; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectVersion; 
            private String parentObjectId; 
            private String status; 

            private Builder() {
            } 

            private Builder(PipelineRunItems model) {
                this.changeType = model.changeType;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.isRoot = model.isRoot;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectVersion = model.objectVersion;
                this.parentObjectId = model.parentObjectId;
                this.status = model.status;
            } 

            /**
             * <p>The change type.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DeploymentItemFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployment failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the object is a root object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRoot(Boolean isRoot) {
                this.isRoot = isRoot;
                return this;
            }

            /**
             * <p>The ID of the publish object.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The name of the publish object.</p>
             * 
             * <strong>example:</strong>
             * <p>object-1</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The object type of the publish object.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The version of the publish object.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            /**
             * <p>The ID of the parent object.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parentObjectId(String parentObjectId) {
                this.parentObjectId = parentObjectId;
                return this;
            }

            /**
             * <p>The status of the publish item.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PipelineRunItems build() {
                return new PipelineRunItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrossProjectPipelineRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectPipelineRunItemsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PipelineRunItems")
        private java.util.List<PipelineRunItems> pipelineRunItems;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.pipelineRunItems = builder.pipelineRunItems;
            this.requestId = builder.requestId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return pipelineRunItems
         */
        public java.util.List<PipelineRunItems> getPipelineRunItems() {
            return this.pipelineRunItems;
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<PipelineRunItems> pipelineRunItems; 
            private String requestId; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.pipelineRunItems = model.pipelineRunItems;
                this.requestId = model.requestId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of publish items for the root objects and their child objects that are included in the cross-workspace publish pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;IsRoot&quot;:true,&quot;Status&quot;:&quot;Ready&quot;}]</p>
             */
            public Builder pipelineRunItems(java.util.List<PipelineRunItems> pipelineRunItems) {
                this.pipelineRunItems = pipelineRunItems;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
