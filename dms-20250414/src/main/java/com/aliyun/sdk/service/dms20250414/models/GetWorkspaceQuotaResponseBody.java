// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetWorkspaceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspaceQuotaResponseBody</p>
 */
public class GetWorkspaceQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkspaceQuotaResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String accessDeniedDetail; 
        private Data data; 
        private String errorCode; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetWorkspaceQuotaResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkspaceQuotaResponseBody build() {
            return new GetWorkspaceQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspaceQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspaceQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CuQuota")
        private Long cuQuota;

        @com.aliyun.core.annotation.NameInMap("CuQuotaUsage")
        private Long cuQuotaUsage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NotebookFreeQuotaAvailable")
        private Long notebookFreeQuotaAvailable;

        @com.aliyun.core.annotation.NameInMap("NotebookFreeQuotaTotal")
        private Long notebookFreeQuotaTotal;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.cuQuota = builder.cuQuota;
            this.cuQuotaUsage = builder.cuQuotaUsage;
            this.instanceId = builder.instanceId;
            this.notebookFreeQuotaAvailable = builder.notebookFreeQuotaAvailable;
            this.notebookFreeQuotaTotal = builder.notebookFreeQuotaTotal;
            this.status = builder.status;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cuQuota
         */
        public Long getCuQuota() {
            return this.cuQuota;
        }

        /**
         * @return cuQuotaUsage
         */
        public Long getCuQuotaUsage() {
            return this.cuQuotaUsage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return notebookFreeQuotaAvailable
         */
        public Long getNotebookFreeQuotaAvailable() {
            return this.notebookFreeQuotaAvailable;
        }

        /**
         * @return notebookFreeQuotaTotal
         */
        public Long getNotebookFreeQuotaTotal() {
            return this.notebookFreeQuotaTotal;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long cuQuota; 
            private Long cuQuotaUsage; 
            private String instanceId; 
            private Long notebookFreeQuotaAvailable; 
            private Long notebookFreeQuotaTotal; 
            private String status; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cuQuota = model.cuQuota;
                this.cuQuotaUsage = model.cuQuotaUsage;
                this.instanceId = model.instanceId;
                this.notebookFreeQuotaAvailable = model.notebookFreeQuotaAvailable;
                this.notebookFreeQuotaTotal = model.notebookFreeQuotaTotal;
                this.status = model.status;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * CuQuota.
             */
            public Builder cuQuota(Long cuQuota) {
                this.cuQuota = cuQuota;
                return this;
            }

            /**
             * CuQuotaUsage.
             */
            public Builder cuQuotaUsage(Long cuQuotaUsage) {
                this.cuQuotaUsage = cuQuotaUsage;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NotebookFreeQuotaAvailable.
             */
            public Builder notebookFreeQuotaAvailable(Long notebookFreeQuotaAvailable) {
                this.notebookFreeQuotaAvailable = notebookFreeQuotaAvailable;
                return this;
            }

            /**
             * NotebookFreeQuotaTotal.
             */
            public Builder notebookFreeQuotaTotal(Long notebookFreeQuotaTotal) {
                this.notebookFreeQuotaTotal = notebookFreeQuotaTotal;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
