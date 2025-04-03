// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteAggregateRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAggregateRemediationsResponseBody</p>
 */
public class DeleteAggregateRemediationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationDeleteResults")
    private java.util.List<RemediationDeleteResults> remediationDeleteResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remediationDeleteResults
     */
    public java.util.List<RemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RemediationDeleteResults> remediationDeleteResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAggregateRemediationsResponseBody model) {
            this.remediationDeleteResults = model.remediationDeleteResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The results of the delete operation.</p>
         */
        public Builder remediationDeleteResults(java.util.List<RemediationDeleteResults> remediationDeleteResults) {
            this.remediationDeleteResults = remediationDeleteResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4BE28FB1-616A-5586-82E4-F34FB2AF7441</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAggregateRemediationsResponseBody build() {
            return new DeleteAggregateRemediationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAggregateRemediationsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAggregateRemediationsResponseBody</p>
     */
    public static class RemediationDeleteResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("RemediationId")
        private String remediationId;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(RemediationDeleteResults model) {
                this.errorMessage = model.errorMessage;
                this.remediationId = model.remediationId;
                this.success = model.success;
            } 

            /**
             * <p>The error code returned.</p>
             * <ul>
             * <li>If the remediation template is deleted, no error code is returned.</li>
             * <li>If the remediation template fails to be deleted, an error code is returned. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RemediationConfigNotExist</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-909ba2d4716700eb****</p>
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>true: The request was successful.</li>
             * <li>false: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
