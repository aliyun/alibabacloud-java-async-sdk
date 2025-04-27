// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateLogstashRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogstashRequest</p>
 */
public class UpdateLogstashRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
    private Integer nodeAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateLogstashRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogstashRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateLogstashRequest, Builder> {
        private String instanceId; 
        private Integer nodeAmount; 
        private NodeSpec nodeSpec; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogstashRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeAmount = request.nodeAmount;
            this.nodeSpec = request.nodeSpec;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-n6w1o5jq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * nodeAmount.
         */
        public Builder nodeAmount(Integer nodeAmount) {
            this.putBodyParameter("nodeAmount", nodeAmount);
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * nodeSpec.
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.putBodyParameter("nodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateLogstashRequest build() {
            return new UpdateLogstashRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLogstashRequest} extends {@link TeaModel}
     *
     * <p>UpdateLogstashRequest</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        @com.aliyun.core.annotation.Validation(maximum = 2048, minimum = 20)
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

            private Builder() {
            } 

            private Builder(NodeSpec model) {
                this.disk = model.disk;
                this.diskType = model.diskType;
                this.spec = model.spec;
            } 

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
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
}
