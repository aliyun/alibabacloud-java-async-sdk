// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLogstashRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogstashRequest</p>
 */
public class UpdateLogstashRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("nodeAmount")
    @Validation(maximum = 20, minimum = 1)
    private Integer nodeAmount;

    @Body
    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @Query
    @NameInMap("clientToken")
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 实例节点数量。
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

    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        @Validation(maximum = 2048, minimum = 20)
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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
             * 实例磁盘大小。单位GB。步长为20，最大值受磁盘规格影响
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * 磁盘存储类型
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * 实例规格
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
