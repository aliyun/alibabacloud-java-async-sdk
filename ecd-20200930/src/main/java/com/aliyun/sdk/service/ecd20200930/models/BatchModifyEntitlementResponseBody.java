// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link BatchModifyEntitlementResponseBody} extends {@link TeaModel}
 *
 * <p>BatchModifyEntitlementResponseBody</p>
 */
public class BatchModifyEntitlementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entitlements")
    private Entitlements entitlements;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchModifyEntitlementResponseBody(Builder builder) {
        this.entitlements = builder.entitlements;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyEntitlementResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entitlements
     */
    public Entitlements getEntitlements() {
        return this.entitlements;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Entitlements entitlements; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchModifyEntitlementResponseBody model) {
            this.entitlements = model.entitlements;
            this.requestId = model.requestId;
        } 

        /**
         * Entitlements.
         */
        public Builder entitlements(Entitlements entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchModifyEntitlementResponseBody build() {
            return new BatchModifyEntitlementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchModifyEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>BatchModifyEntitlementResponseBody</p>
     */
    public static class AssignModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("InnerStatus")
        private String innerStatus;

        private AssignModels(Builder builder) {
            this.desktopId = builder.desktopId;
            this.endUserIds = builder.endUserIds;
            this.innerStatus = builder.innerStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignModels create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return innerStatus
         */
        public String getInnerStatus() {
            return this.innerStatus;
        }

        public static final class Builder {
            private String desktopId; 
            private java.util.List<String> endUserIds; 
            private String innerStatus; 

            private Builder() {
            } 

            private Builder(AssignModels model) {
                this.desktopId = model.desktopId;
                this.endUserIds = model.endUserIds;
                this.innerStatus = model.innerStatus;
            } 

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-e94kzikmpljjx99pl</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The authorized user IDs for the cloud computer.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The assign result for each cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>FAILED</li>
             * <li>NOT_STARTED</li>
             * <li>STARTED</li>
             * <li>PROCESSING</li>
             * <li>FINISHED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder innerStatus(String innerStatus) {
                this.innerStatus = innerStatus;
                return this;
            }

            public AssignModels build() {
                return new AssignModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchModifyEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>BatchModifyEntitlementResponseBody</p>
     */
    public static class Entitlements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignModels")
        private java.util.List<AssignModels> assignModels;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Entitlements(Builder builder) {
            this.assignModels = builder.assignModels;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entitlements create() {
            return builder().build();
        }

        /**
         * @return assignModels
         */
        public java.util.List<AssignModels> getAssignModels() {
            return this.assignModels;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List<AssignModels> assignModels; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Entitlements model) {
                this.assignModels = model.assignModels;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * AssignModels.
             */
            public Builder assignModels(java.util.List<AssignModels> assignModels) {
                this.assignModels = assignModels;
                return this;
            }

            /**
             * <p>The result.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>FAILED</li>
             * <li>NOT_STARTED</li>
             * <li>STARTED</li>
             * <li>PROCESSING</li>
             * <li>FINISHED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>B2F4F018-0EDF-159C-B285-117B5F1C****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Entitlements build() {
                return new Entitlements(this);
            } 

        } 

    }
}
