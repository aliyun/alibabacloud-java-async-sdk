// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceResponseBody</p>
 */
public class UpdateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdateInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li>active: normal</li>
         * <li>activating: taking effect</li>
         * <li>inactive: frozen</li>
         * <li>invalid: invalid</li>
         * </ul>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateInstanceResponseBody build() {
            return new UpdateInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateInstanceResponseBody</p>
     */
    public static class KibanaConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private KibanaConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The configuration of dedicated master nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The storage type of the node. This parameter can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public KibanaConfiguration build() {
                return new KibanaConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateInstanceResponseBody</p>
     */
    public static class MasterConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private MasterConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The configuration of dedicated master nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The storage type of the node. Only cloud_ssd(SSD cloud disk) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public MasterConfiguration build() {
                return new MasterConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateInstanceResponseBody</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The configuration of Kibana nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.xlarge</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("esVersion")
        private String esVersion;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @com.aliyun.core.annotation.NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @com.aliyun.core.annotation.NameInMap("nodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.domain = builder.domain;
            this.esVersion = builder.esVersion;
            this.instanceId = builder.instanceId;
            this.kibanaConfiguration = builder.kibanaConfiguration;
            this.masterConfiguration = builder.masterConfiguration;
            this.nodeAmount = builder.nodeAmount;
            this.nodeSpec = builder.nodeSpec;
            this.paymentType = builder.paymentType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return esVersion
         */
        public String getEsVersion() {
            return this.esVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return kibanaConfiguration
         */
        public KibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        /**
         * @return masterConfiguration
         */
        public MasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeSpec
         */
        public NodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String domain; 
            private String esVersion; 
            private String instanceId; 
            private KibanaConfiguration kibanaConfiguration; 
            private MasterConfiguration masterConfiguration; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String status; 

            /**
             * <p>The private domain name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-13T03:58:07.253Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The configuration of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-abc.elasticsearch.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>5.5.3_with_X-Pack</p>
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * <p>The storage space of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-abc</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The size of the node storage space.</p>
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * <p>The storage space of the node. Unit: GB.</p>
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li>prepaid: subscription</li>
             * <li>postpaid: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The storage type of the node. Valid values:</p>
             * <ul>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_efficiency: ultra disk</li>
             * </ul>
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * <p>The edition of the dedicated KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>postpaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
