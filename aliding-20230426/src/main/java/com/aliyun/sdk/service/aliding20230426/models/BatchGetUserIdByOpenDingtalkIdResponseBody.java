// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link BatchGetUserIdByOpenDingtalkIdResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetUserIdByOpenDingtalkIdResponseBody</p>
 */
public class BatchGetUserIdByOpenDingtalkIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private BatchGetUserIdByOpenDingtalkIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetUserIdByOpenDingtalkIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(BatchGetUserIdByOpenDingtalkIdResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public BatchGetUserIdByOpenDingtalkIdResponseBody build() {
            return new BatchGetUserIdByOpenDingtalkIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetUserIdByOpenDingtalkIdResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetUserIdByOpenDingtalkIdResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("OpenDingtalkId")
        private String openDingtalkId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Results(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.openDingtalkId = builder.openDingtalkId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return openDingtalkId
         */
        public String getOpenDingtalkId() {
            return this.openDingtalkId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String errorMessage; 
            private String openDingtalkId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.errorMessage = model.errorMessage;
                this.openDingtalkId = model.openDingtalkId;
                this.userId = model.userId;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * OpenDingtalkId.
             */
            public Builder openDingtalkId(String openDingtalkId) {
                this.openDingtalkId = openDingtalkId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
