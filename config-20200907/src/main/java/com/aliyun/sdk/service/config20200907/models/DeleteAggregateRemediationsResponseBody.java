// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAggregateRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAggregateRemediationsResponseBody</p>
 */
public class DeleteAggregateRemediationsResponseBody extends TeaModel {
    @NameInMap("RemediationDeleteResults")
    private java.util.List < RemediationDeleteResults> remediationDeleteResults;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteAggregateRemediationsResponseBody(Builder builder) {
        this.remediationDeleteResults = builder.remediationDeleteResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateRemediationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediationDeleteResults
     */
    public java.util.List < RemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RemediationDeleteResults> remediationDeleteResults; 
        private String requestId; 

        /**
         * The results of the delete operation.
         */
        public Builder remediationDeleteResults(java.util.List < RemediationDeleteResults> remediationDeleteResults) {
            this.remediationDeleteResults = remediationDeleteResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAggregateRemediationsResponseBody build() {
            return new DeleteAggregateRemediationsResponseBody(this);
        } 

    } 

    public static class RemediationDeleteResults extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("RemediationId")
        private String remediationId;

        @NameInMap("Success")
        private Boolean success;

        private RemediationDeleteResults(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.remediationId = builder.remediationId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemediationDeleteResults create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return remediationId
         */
        public String getRemediationId() {
            return this.remediationId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorMessage; 
            private String remediationId; 
            private Boolean success; 

            /**
             * The error code returned.
             * <p>
             * 
             * *   If the remediation template is deleted, no error code is returned.
             * *   If the remediation template fails to be deleted, an error code is returned. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the remediation template.
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * Indicates whether the request was successful. Valid values:
             * <p>
             * 
             * *   true: The request was successful.
             * *   false: The request failed.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public RemediationDeleteResults build() {
                return new RemediationDeleteResults(this);
            } 

        } 

    }
}
