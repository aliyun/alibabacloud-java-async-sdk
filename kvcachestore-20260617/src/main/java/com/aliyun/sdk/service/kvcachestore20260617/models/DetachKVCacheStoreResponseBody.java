// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link DetachKVCacheStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DetachKVCacheStoreResponseBody</p>
 */
public class DetachKVCacheStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetachResults")
    private java.util.List<DetachResults> detachResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachKVCacheStoreResponseBody(Builder builder) {
        this.detachResults = builder.detachResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachKVCacheStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detachResults
     */
    public java.util.List<DetachResults> getDetachResults() {
        return this.detachResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DetachResults> detachResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetachKVCacheStoreResponseBody model) {
            this.detachResults = model.detachResults;
            this.requestId = model.requestId;
        } 

        /**
         * DetachResults.
         */
        public Builder detachResults(java.util.List<DetachResults> detachResults) {
            this.detachResults = detachResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachKVCacheStoreResponseBody build() {
            return new DetachKVCacheStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachKVCacheStoreResponseBody} extends {@link TeaModel}
     *
     * <p>DetachKVCacheStoreResponseBody</p>
     */
    public static class DetachResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("KvcsId")
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        private DetachResults(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.kvcsId = builder.kvcsId;
            this.status = builder.status;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachResults create() {
            return builder().build();
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
         * @return kvcsId
         */
        public String getKvcsId() {
            return this.kvcsId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String kvcsId; 
            private String status; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(DetachResults model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.kvcsId = model.kvcsId;
                this.status = model.status;
                this.vscId = model.vscId;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>KVCacheStore KvcsId</p>
             * 
             * <strong>example:</strong>
             * <p>kvcs-xxxxx</p>
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
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
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public DetachResults build() {
                return new DetachResults(this);
            } 

        } 

    }
}
