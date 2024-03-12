// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectRouterAllowedPrefixHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterAllowedPrefixHistoryRequest</p>
 */
public class DescribeExpressConnectRouterAllowedPrefixHistoryRequest extends Request {
    @Body
    @NameInMap("AssociatonId")
    private String associatonId;

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
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("InstanceType")
    private String instanceType;

    private DescribeExpressConnectRouterAllowedPrefixHistoryRequest(Builder builder) {
        super(builder);
        this.associatonId = builder.associatonId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterAllowedPrefixHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatonId
     */
    public String getAssociatonId() {
        return this.associatonId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeExpressConnectRouterAllowedPrefixHistoryRequest, Builder> {
        private String associatonId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private String instanceId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request) {
            super(request);
            this.associatonId = request.associatonId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
        } 

        /**
         * AssociatonId.
         */
        public Builder associatonId(String associatonId) {
            this.putBodyParameter("AssociatonId", associatonId);
            this.associatonId = associatonId;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public DescribeExpressConnectRouterAllowedPrefixHistoryRequest build() {
            return new DescribeExpressConnectRouterAllowedPrefixHistoryRequest(this);
        } 

    } 

}
