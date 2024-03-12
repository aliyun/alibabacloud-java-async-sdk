// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachExpressConnectRouterChildInstanceRequest} extends {@link RequestModel}
 *
 * <p>DetachExpressConnectRouterChildInstanceRequest</p>
 */
public class DetachExpressConnectRouterChildInstanceRequest extends Request {
    @Body
    @NameInMap("ChildInstanceId")
    @Validation(required = true)
    private String childInstanceId;

    @Body
    @NameInMap("ChildInstanceType")
    @Validation(required = true)
    private String childInstanceType;

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

    private DetachExpressConnectRouterChildInstanceRequest(Builder builder) {
        super(builder);
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceType = builder.childInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachExpressConnectRouterChildInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
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

    public static final class Builder extends Request.Builder<DetachExpressConnectRouterChildInstanceRequest, Builder> {
        private String childInstanceId; 
        private String childInstanceType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 

        private Builder() {
            super();
        } 

        private Builder(DetachExpressConnectRouterChildInstanceRequest request) {
            super(request);
            this.childInstanceId = request.childInstanceId;
            this.childInstanceType = request.childInstanceType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
        } 

        /**
         * ChildInstanceId.
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putBodyParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * ChildInstanceType.
         */
        public Builder childInstanceType(String childInstanceType) {
            this.putBodyParameter("ChildInstanceType", childInstanceType);
            this.childInstanceType = childInstanceType;
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

        @Override
        public DetachExpressConnectRouterChildInstanceRequest build() {
            return new DetachExpressConnectRouterChildInstanceRequest(this);
        } 

    } 

}
