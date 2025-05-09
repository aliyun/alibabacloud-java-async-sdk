// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetHDMLastAliyunResourceSyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetHDMLastAliyunResourceSyncResultResponseBody</p>
 */
public class GetHDMLastAliyunResourceSyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private String synchro;

    private GetHDMLastAliyunResourceSyncResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHDMLastAliyunResourceSyncResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public String getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 
        private String synchro; 

        private Builder() {
        } 

        private Builder(GetHDMLastAliyunResourceSyncResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.synchro = model.synchro;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(String synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBody build() {
            return new GetHDMLastAliyunResourceSyncResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHDMLastAliyunResourceSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetHDMLastAliyunResourceSyncResultResponseBody</p>
     */
    public static class ResourceSyncSubResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("SyncCount")
        private Integer syncCount;

        private ResourceSyncSubResult(Builder builder) {
            this.errMsg = builder.errMsg;
            this.resourceType = builder.resourceType;
            this.success = builder.success;
            this.syncCount = builder.syncCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSyncSubResult create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return syncCount
         */
        public Integer getSyncCount() {
            return this.syncCount;
        }

        public static final class Builder {
            private String errMsg; 
            private String resourceType; 
            private Boolean success; 
            private Integer syncCount; 

            private Builder() {
            } 

            private Builder(ResourceSyncSubResult model) {
                this.errMsg = model.errMsg;
                this.resourceType = model.resourceType;
                this.success = model.success;
                this.syncCount = model.syncCount;
            } 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * SyncCount.
             */
            public Builder syncCount(Integer syncCount) {
                this.syncCount = syncCount;
                return this;
            }

            public ResourceSyncSubResult build() {
                return new ResourceSyncSubResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHDMLastAliyunResourceSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetHDMLastAliyunResourceSyncResultResponseBody</p>
     */
    public static class SubResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceSyncSubResult")
        private java.util.List<ResourceSyncSubResult> resourceSyncSubResult;

        private SubResults(Builder builder) {
            this.resourceSyncSubResult = builder.resourceSyncSubResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubResults create() {
            return builder().build();
        }

        /**
         * @return resourceSyncSubResult
         */
        public java.util.List<ResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

        public static final class Builder {
            private java.util.List<ResourceSyncSubResult> resourceSyncSubResult; 

            private Builder() {
            } 

            private Builder(SubResults model) {
                this.resourceSyncSubResult = model.resourceSyncSubResult;
            } 

            /**
             * ResourceSyncSubResult.
             */
            public Builder resourceSyncSubResult(java.util.List<ResourceSyncSubResult> resourceSyncSubResult) {
                this.resourceSyncSubResult = resourceSyncSubResult;
                return this;
            }

            public SubResults build() {
                return new SubResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHDMLastAliyunResourceSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetHDMLastAliyunResourceSyncResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Results")
        private String results;

        @com.aliyun.core.annotation.NameInMap("SubResults")
        private SubResults subResults;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private String syncStatus;

        private Data(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.results = builder.results;
            this.subResults = builder.subResults;
            this.syncStatus = builder.syncStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return results
         */
        public String getResults() {
            return this.results;
        }

        /**
         * @return subResults
         */
        public SubResults getSubResults() {
            return this.subResults;
        }

        /**
         * @return syncStatus
         */
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public static final class Builder {
            private String errorMsg; 
            private String results; 
            private SubResults subResults; 
            private String syncStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMsg = model.errorMsg;
                this.results = model.results;
                this.subResults = model.subResults;
                this.syncStatus = model.syncStatus;
            } 

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(String results) {
                this.results = results;
                return this;
            }

            /**
             * SubResults.
             */
            public Builder subResults(SubResults subResults) {
                this.subResults = subResults;
                return this;
            }

            /**
             * SyncStatus.
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
