// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAddRegionToExpressConnectRouterRequest} extends {@link RequestModel}
 *
 * <p>CheckAddRegionToExpressConnectRouterRequest</p>
 */
public class CheckAddRegionToExpressConnectRouterRequest extends Request {
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
    @NameInMap("FreshRegionId")
    @Validation(required = true)
    private String freshRegionId;

    private CheckAddRegionToExpressConnectRouterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.freshRegionId = builder.freshRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAddRegionToExpressConnectRouterRequest create() {
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
     * @return freshRegionId
     */
    public String getFreshRegionId() {
        return this.freshRegionId;
    }

    public static final class Builder extends Request.Builder<CheckAddRegionToExpressConnectRouterRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private String freshRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckAddRegionToExpressConnectRouterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.freshRegionId = request.freshRegionId;
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
         * FreshRegionId.
         */
        public Builder freshRegionId(String freshRegionId) {
            this.putBodyParameter("FreshRegionId", freshRegionId);
            this.freshRegionId = freshRegionId;
            return this;
        }

        @Override
        public CheckAddRegionToExpressConnectRouterRequest build() {
            return new CheckAddRegionToExpressConnectRouterRequest(this);
        } 

    } 

}
