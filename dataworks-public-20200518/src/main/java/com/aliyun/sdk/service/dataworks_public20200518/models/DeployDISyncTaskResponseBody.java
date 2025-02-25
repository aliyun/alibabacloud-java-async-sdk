// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DeployDISyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeployDISyncTaskResponseBody</p>
 */
public class DeployDISyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeployDISyncTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployDISyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates whether the real-time synchronization node or data synchronization solution is deployed. Valid values:</p>
         * <ul>
         * <li>success: The real-time synchronization node or data synchronization solution is deployed.</li>
         * <li>fail: The real-time synchronization node or data synchronization solution fails to be deployed.</li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937635973****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeployDISyncTaskResponseBody build() {
            return new DeployDISyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeployDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DeployDISyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String status; 

            /**
             * <p>The reason for the failure to publish a data integration synchronization task.</p>
             * <p>If the data integration synchronization task is published successfully, the return value of this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>submit and deploy fail.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The cause of the failure to deploy the real-time synchronization node or data synchronization solution.</p>
             * <p>If the real-time synchronization node or data synchronization solution is deployed, the value null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
