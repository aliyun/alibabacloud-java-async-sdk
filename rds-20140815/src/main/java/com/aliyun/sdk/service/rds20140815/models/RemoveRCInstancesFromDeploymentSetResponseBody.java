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
 * {@link RemoveRCInstancesFromDeploymentSetResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveRCInstancesFromDeploymentSetResponseBody</p>
 */
public class RemoveRCInstancesFromDeploymentSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private RemoveRCInstancesFromDeploymentSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRCInstancesFromDeploymentSetResponseBody create() {
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

        private Builder(RemoveRCInstancesFromDeploymentSetResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The call results of the operation.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public RemoveRCInstancesFromDeploymentSetResponseBody build() {
            return new RemoveRCInstancesFromDeploymentSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveRCInstancesFromDeploymentSetResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveRCInstancesFromDeploymentSetResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RCInstanceId")
        private String RCInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Results(Builder builder) {
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
            private String RCInstanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.RCInstanceId = model.RCInstanceId;
                this.status = model.status;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-w9htiydssds</p>
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
