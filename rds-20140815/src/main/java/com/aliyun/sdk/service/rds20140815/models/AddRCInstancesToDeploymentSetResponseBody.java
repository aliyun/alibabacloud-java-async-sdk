// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link AddRCInstancesToDeploymentSetResponseBody} extends {@link TeaModel}
 *
 * <p>AddRCInstancesToDeploymentSetResponseBody</p>
 */
public class AddRCInstancesToDeploymentSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private AddRCInstancesToDeploymentSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRCInstancesToDeploymentSetResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(AddRCInstancesToDeploymentSetResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The inspection results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public AddRCInstancesToDeploymentSetResponseBody build() {
            return new AddRCInstancesToDeploymentSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddRCInstancesToDeploymentSetResponseBody} extends {@link TeaModel}
     *
     * <p>AddRCInstancesToDeploymentSetResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("RCInstanceId")
        private String RCInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Results(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.RCInstanceId = builder.RCInstanceId;
            this.status = builder.status;
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
         * @return RCInstanceId
         */
        public String getRCInstanceId() {
            return this.RCInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String RCInstanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.errorMessage = model.errorMessage;
                this.RCInstanceId = model.RCInstanceId;
                this.status = model.status;
            } 

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>activation</strong>: Running.</li>
             * <li><strong>creating</strong>: Being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-aaaa</p>
             */
            public Builder RCInstanceId(String RCInstanceId) {
                this.RCInstanceId = RCInstanceId;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: Succeeded.</li>
             * <li><strong>Failed</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
