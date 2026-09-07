// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateBackendReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackendReportResponseBody</p>
 */
public class CreateBackendReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("ObjectCount")
    private Integer objectCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TargetCount")
    private Integer targetCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private CreateBackendReportResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.items = builder.items;
        this.objectCount = builder.objectCount;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.targetCount = builder.targetCount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return objectCount
     */
    public Integer getObjectCount() {
        return this.objectCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return targetCount
     */
    public Integer getTargetCount() {
        return this.targetCount;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer failedCount; 
        private java.util.List<Items> items; 
        private Integer objectCount; 
        private String requestId; 
        private Integer successCount; 
        private Integer targetCount; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(CreateBackendReportResponseBody model) {
            this.failedCount = model.failedCount;
            this.items = model.items;
            this.objectCount = model.objectCount;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
            this.targetCount = model.targetCount;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of user-object combinations that failed to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The processing results for each user-object combination. If some combinations fail, the operation still returns results for all combinations.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of deduplicated filing objects.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder objectCount(Integer objectCount) {
            this.objectCount = objectCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of user-object combinations that are created.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The number of deduplicated filing users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }

        /**
         * <p>The total number of expanded user-object combinations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CreateBackendReportResponseBody build() {
            return new CreateBackendReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBackendReportResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBackendReportResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Target(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.userId = model.userId;
            } 

            /**
             * <p>The SASE user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_1b91e674235a25e4117faf5c36a8ad4e69a14303247fb7d9f2046ce8b372****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBackendReportResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBackendReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private String effectStatus;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ReportObject")
        private Object reportObject;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        private Items(Builder builder) {
            this.approvalId = builder.approvalId;
            this.code = builder.code;
            this.effectStatus = builder.effectStatus;
            this.message = builder.message;
            this.reportObject = builder.reportObject;
            this.reportType = builder.reportType;
            this.status = builder.status;
            this.success = builder.success;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return effectStatus
         */
        public String getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reportObject
         */
        public Object getReportObject() {
            return this.reportObject;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String approvalId; 
            private String code; 
            private String effectStatus; 
            private String message; 
            private Object reportObject; 
            private String reportType; 
            private String status; 
            private Boolean success; 
            private Target target; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.approvalId = model.approvalId;
                this.code = model.code;
                this.effectStatus = model.effectStatus;
                this.message = model.message;
                this.reportObject = model.reportObject;
                this.reportType = model.reportType;
                this.status = model.status;
                this.success = model.success;
                this.target = model.target;
            } 

            /**
             * <p>The approval instance ID generated after a successful creation. This parameter is not returned if the creation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-6b5188a28634****</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The error code returned when the current combination fails to be created. This parameter is not returned if the creation succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>TargetNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The filing effective status. Enabled is returned when the creation succeeds, which indicates that the filing is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder effectStatus(String effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * <p>The error message returned when the current combination fails to be created. This parameter is not returned if the creation succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>target user is not found</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The filing object corresponding to the current combination. The fields vary based on the PolicyType value.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ApplicationId&quot;:&quot;pa-application-92b60359213a****&quot;}]</p>
             */
            public Builder reportObject(Object reportObject) {
                this.reportObject = reportObject;
                return this;
            }

            /**
             * <p>The filing type. BackendReport is always returned when the creation succeeds, which indicates a backend filing.</p>
             * 
             * <strong>example:</strong>
             * <p>BackendReport</p>
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * <p>The approval status. Approved is returned when the creation succeeds, which indicates that the filing is approved.</p>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the current combination is created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The filing user corresponding to the current combination.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
