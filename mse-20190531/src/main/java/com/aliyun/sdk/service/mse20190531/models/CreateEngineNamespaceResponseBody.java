// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateEngineNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEngineNamespaceResponseBody</p>
 */
public class CreateEngineNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEngineNamespaceResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEngineNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private String clusterId; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-892k****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F6092602-C357-4750-89D9-E572FBEA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEngineNamespaceResponseBody build() {
            return new CreateEngineNamespaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEngineNamespaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEngineNamespaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigCount")
        private Integer configCount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NamespaceDesc")
        private String namespaceDesc;

        @com.aliyun.core.annotation.NameInMap("NamespaceShowName")
        private String namespaceShowName;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        @com.aliyun.core.annotation.NameInMap("ServiceCount")
        private Integer serviceCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.configCount = builder.configCount;
            this.namespace = builder.namespace;
            this.namespaceDesc = builder.namespaceDesc;
            this.namespaceShowName = builder.namespaceShowName;
            this.quota = builder.quota;
            this.serviceCount = builder.serviceCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configCount
         */
        public Integer getConfigCount() {
            return this.configCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return namespaceDesc
         */
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        /**
         * @return namespaceShowName
         */
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        /**
         * @return serviceCount
         */
        public Integer getServiceCount() {
            return this.serviceCount;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer configCount; 
            private String namespace; 
            private String namespaceDesc; 
            private String namespaceShowName; 
            private Integer quota; 
            private Integer serviceCount; 
            private Integer type; 

            /**
             * <p>The number of configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configCount(Integer configCount) {
                this.configCount = configCount;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>f4fa5b81-2f26-4900-833a-7516b315ebb2</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>mytest</p>
             */
            public Builder namespaceDesc(String namespaceDesc) {
                this.namespaceDesc = namespaceDesc;
                return this;
            }

            /**
             * <p>The display name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder namespaceShowName(String namespaceShowName) {
                this.namespaceShowName = namespaceShowName;
                return this;
            }

            /**
             * <p>The quota of configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The number of active services.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder serviceCount(Integer serviceCount) {
                this.serviceCount = serviceCount;
                return this;
            }

            /**
             * <p>The type of the namespace. Valid values:</p>
             * <ul>
             * <li><code>0</code>: global configuration</li>
             * <li><code>1</code>: default namespace</li>
             * <li><code>2</code>: custom namespace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
