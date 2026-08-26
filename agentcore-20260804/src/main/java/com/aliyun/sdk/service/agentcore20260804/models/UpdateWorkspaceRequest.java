// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceRequest</p>
 */
public class UpdateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateWorkspaceRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public UpdateWorkspaceRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceRequest, Builder> {
        private String workspaceId; 
        private UpdateWorkspaceRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateWorkspaceRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
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
        public UpdateWorkspaceRequest build() {
            return new UpdateWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRequest</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Vpc(Builder builder) {
            this.enabled = builder.enabled;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Vpc model) {
                this.enabled = model.enabled;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * vSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRequest</p>
     */
    public static class NetworkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vpc")
        @com.aliyun.core.annotation.Validation(required = true)
        private Vpc vpc;

        private NetworkConfiguration(Builder builder) {
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfiguration create() {
            return builder().build();
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private Vpc vpc; 

            private Builder() {
            } 

            private Builder(NetworkConfiguration model) {
                this.vpc = model.vpc;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public NetworkConfiguration build() {
                return new NetworkConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRequest</p>
     */
    public static class UpdateWorkspaceRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        private UpdateWorkspaceRequestBody(Builder builder) {
            this.name = builder.name;
            this.networkConfiguration = builder.networkConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateWorkspaceRequestBody create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkConfiguration
         */
        public NetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public static final class Builder {
            private String name; 
            private NetworkConfiguration networkConfiguration; 

            private Builder() {
            } 

            private Builder(UpdateWorkspaceRequestBody model) {
                this.name = model.name;
                this.networkConfiguration = model.networkConfiguration;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkConfiguration.
             */
            public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
                this.networkConfiguration = networkConfiguration;
                return this;
            }

            public UpdateWorkspaceRequestBody build() {
                return new UpdateWorkspaceRequestBody(this);
            } 

        } 

    }
}
