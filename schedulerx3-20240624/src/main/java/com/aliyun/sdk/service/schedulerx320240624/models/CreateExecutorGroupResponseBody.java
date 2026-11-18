// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link CreateExecutorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExecutorGroupResponseBody</p>
 */
public class CreateExecutorGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateExecutorGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExecutorGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateExecutorGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter format error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateExecutorGroupResponseBody build() {
            return new CreateExecutorGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateExecutorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateExecutorGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FailedService")
        private String failedService;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("WorkerId")
        private Long workerId;

        @com.aliyun.core.annotation.NameInMap("WorkerType")
        private String workerType;

        @com.aliyun.core.annotation.NameInMap("Workers")
        private String workers;

        private Data(Builder builder) {
            this.authType = builder.authType;
            this.description = builder.description;
            this.failedService = builder.failedService;
            this.name = builder.name;
            this.network = builder.network;
            this.protocol = builder.protocol;
            this.workerId = builder.workerId;
            this.workerType = builder.workerType;
            this.workers = builder.workers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return failedService
         */
        public String getFailedService() {
            return this.failedService;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return workerId
         */
        public Long getWorkerId() {
            return this.workerId;
        }

        /**
         * @return workerType
         */
        public String getWorkerType() {
            return this.workerType;
        }

        /**
         * @return workers
         */
        public String getWorkers() {
            return this.workers;
        }

        public static final class Builder {
            private String authType; 
            private String description; 
            private String failedService; 
            private String name; 
            private String network; 
            private String protocol; 
            private Long workerId; 
            private String workerType; 
            private String workers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authType = model.authType;
                this.description = model.description;
                this.failedService = model.failedService;
                this.name = model.name;
                this.network = model.network;
                this.protocol = model.protocol;
                this.workerId = model.workerId;
                this.workerType = model.workerType;
                this.workers = model.workers;
            } 

            /**
             * <p>The authentication method used by devices under the product to connect to the IoT platform. Valid values:</p>
             * <ul>
             * <li><strong>secret</strong>: Uses the device secret for device identity authentication.</li>
             * <li><strong>id2</strong>: Uses IoT Internet Device ID (ID²).</li>
             * <li><strong>x509</strong>: Uses the device X.509 certificate for device identity authentication.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>md5_spell</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The workflow description.</p>
             * 
             * <strong>example:</strong>
             * <p>my first workflow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Kubernetes services that failed to be imported.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
             */
            public Builder failedService(String failedService) {
                this.failedService = failedService;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>myWorkflow</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The domain name rule.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The protocol types supported by the domain name. Valid values: HTTP (supports only the HTTP protocol), HTTPS (supports only the HTTPS protocol), and HTTP,HTTPS (supports both HTTP and HTTPS protocols).</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The worker ID of the deployment task. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder workerId(Long workerId) {
                this.workerId = workerId;
                return this;
            }

            /**
             * <p>The executor type.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s_service</p>
             */
            public Builder workerType(String workerType) {
                this.workerType = workerType;
                return this;
            }

            /**
             * <p>The list of specified machines in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
             */
            public Builder workers(String workers) {
                this.workers = workers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
