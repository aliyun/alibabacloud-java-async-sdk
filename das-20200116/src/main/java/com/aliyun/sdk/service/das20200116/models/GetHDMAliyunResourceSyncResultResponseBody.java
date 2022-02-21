// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHDMAliyunResourceSyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetHDMAliyunResourceSyncResultResponseBody</p>
 */
public class GetHDMAliyunResourceSyncResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Synchro")
    private String synchro;

    private GetHDMAliyunResourceSyncResultResponseBody(Builder builder) {
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

    public static GetHDMAliyunResourceSyncResultResponseBody create() {
        return builder().build();
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

        public GetHDMAliyunResourceSyncResultResponseBody build() {
            return new GetHDMAliyunResourceSyncResultResponseBody(this);
        } 

    } 

    public static class ResourceSyncSubResult extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("SyncCount")
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
    public static class SubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        private java.util.List < ResourceSyncSubResult> resourceSyncSubResult;

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
        public java.util.List < ResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

        public static final class Builder {
            private java.util.List < ResourceSyncSubResult> resourceSyncSubResult; 

            /**
             * ResourceSyncSubResult.
             */
            public Builder resourceSyncSubResult(java.util.List < ResourceSyncSubResult> resourceSyncSubResult) {
                this.resourceSyncSubResult = resourceSyncSubResult;
                return this;
            }

            public SubResults build() {
                return new SubResults(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("Results")
        private String results;

        @NameInMap("SubResults")
        private SubResults subResults;

        @NameInMap("SyncStatus")
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
