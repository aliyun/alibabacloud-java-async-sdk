// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ResetDisksResponseBody} extends {@link TeaModel}
 *
 * <p>ResetDisksResponseBody</p>
 */
public class ResetDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationProgressSet")
    private OperationProgressSet operationProgressSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetDisksResponseBody(Builder builder) {
        this.operationProgressSet = builder.operationProgressSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDisksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationProgressSet
     */
    public OperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperationProgressSet operationProgressSet; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResetDisksResponseBody model) {
            this.operationProgressSet = model.operationProgressSet;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the rollback operation.</p>
         */
        public Builder operationProgressSet(OperationProgressSet operationProgressSet) {
            this.operationProgressSet = operationProgressSet;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D66C85C-AA97-4A00-B0ED-2D9A80FE782C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetDisksResponseBody build() {
            return new ResetDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetDisksResponseBody} extends {@link TeaModel}
     *
     * <p>ResetDisksResponseBody</p>
     */
    public static class RelatedItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RelatedItem(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(RelatedItem model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>SnapshotId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-j6cdofbycydvg7ey****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RelatedItem build() {
                return new RelatedItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResetDisksResponseBody} extends {@link TeaModel}
     *
     * <p>ResetDisksResponseBody</p>
     */
    public static class RelatedItemSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedItem")
        private java.util.List<RelatedItem> relatedItem;

        private RelatedItemSet(Builder builder) {
            this.relatedItem = builder.relatedItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItemSet create() {
            return builder().build();
        }

        /**
         * @return relatedItem
         */
        public java.util.List<RelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

        public static final class Builder {
            private java.util.List<RelatedItem> relatedItem; 

            private Builder() {
            } 

            private Builder(RelatedItemSet model) {
                this.relatedItem = model.relatedItem;
            } 

            /**
             * RelatedItem.
             */
            public Builder relatedItem(java.util.List<RelatedItem> relatedItem) {
                this.relatedItem = relatedItem;
                return this;
            }

            public RelatedItemSet build() {
                return new RelatedItemSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResetDisksResponseBody} extends {@link TeaModel}
     *
     * <p>ResetDisksResponseBody</p>
     */
    public static class OperationProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("RelatedItemSet")
        private RelatedItemSet relatedItemSet;

        private OperationProgress(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.operationStatus = builder.operationStatus;
            this.relatedItemSet = builder.relatedItemSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgress create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return relatedItemSet
         */
        public RelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String operationStatus; 
            private RelatedItemSet relatedItemSet; 

            private Builder() {
            } 

            private Builder(OperationProgress model) {
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.operationStatus = model.operationStatus;
                this.relatedItemSet = model.relatedItemSet;
            } 

            /**
             * <p>The error code that is returned if the request failed. This parameter is empty if the request is successful.</p>
             * <p>For information about error codes and error messages, see <a href="https://error-center.alibabacloud.com/status/product/Ecs">Service error codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is returned if the request failed. This parameter is empty if the request is successful.</p>
             * <p>For information about error codes and error messages, see <a href="https://error-center.alibabacloud.com/status/product/Ecs">Service error codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>testErrorMsg</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Indicates whether the request is successful. If the request is successful, Success is returned. If the request failed, an error code and an error message are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>Details about the resources.</p>
             */
            public Builder relatedItemSet(RelatedItemSet relatedItemSet) {
                this.relatedItemSet = relatedItemSet;
                return this;
            }

            public OperationProgress build() {
                return new OperationProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResetDisksResponseBody} extends {@link TeaModel}
     *
     * <p>ResetDisksResponseBody</p>
     */
    public static class OperationProgressSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationProgress")
        private java.util.List<OperationProgress> operationProgress;

        private OperationProgressSet(Builder builder) {
            this.operationProgress = builder.operationProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgressSet create() {
            return builder().build();
        }

        /**
         * @return operationProgress
         */
        public java.util.List<OperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

        public static final class Builder {
            private java.util.List<OperationProgress> operationProgress; 

            private Builder() {
            } 

            private Builder(OperationProgressSet model) {
                this.operationProgress = model.operationProgress;
            } 

            /**
             * OperationProgress.
             */
            public Builder operationProgress(java.util.List<OperationProgress> operationProgress) {
                this.operationProgress = operationProgress;
                return this;
            }

            public OperationProgressSet build() {
                return new OperationProgressSet(this);
            } 

        } 

    }
}
