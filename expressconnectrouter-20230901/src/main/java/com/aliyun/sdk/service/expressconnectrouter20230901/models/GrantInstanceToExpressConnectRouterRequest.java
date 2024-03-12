// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantInstanceToExpressConnectRouterRequest} extends {@link RequestModel}
 *
 * <p>GrantInstanceToExpressConnectRouterRequest</p>
 */
public class GrantInstanceToExpressConnectRouterRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EcrId")
    @Validation(required = true)
    private String ecrId;

    @Body
    @NameInMap("EcrOwnerAliUid")
    @Validation(required = true)
    private Long ecrOwnerAliUid;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("InstanceRegionId")
    @Validation(required = true)
    private String instanceRegionId;

    @Body
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    private GrantInstanceToExpressConnectRouterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.ecrOwnerAliUid = builder.ecrOwnerAliUid;
        this.instanceId = builder.instanceId;
        this.instanceRegionId = builder.instanceRegionId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantInstanceToExpressConnectRouterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return ecrOwnerAliUid
     */
    public Long getEcrOwnerAliUid() {
        return this.ecrOwnerAliUid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<GrantInstanceToExpressConnectRouterRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private Long ecrOwnerAliUid; 
        private String instanceId; 
        private String instanceRegionId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(GrantInstanceToExpressConnectRouterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.ecrOwnerAliUid = request.ecrOwnerAliUid;
            this.instanceId = request.instanceId;
            this.instanceRegionId = request.instanceRegionId;
            this.instanceType = request.instanceType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EcrId.
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * EcrOwnerAliUid.
         */
        public Builder ecrOwnerAliUid(Long ecrOwnerAliUid) {
            this.putBodyParameter("EcrOwnerAliUid", ecrOwnerAliUid);
            this.ecrOwnerAliUid = ecrOwnerAliUid;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceRegionId.
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putBodyParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public GrantInstanceToExpressConnectRouterRequest build() {
            return new GrantInstanceToExpressConnectRouterRequest(this);
        } 

    } 

}
