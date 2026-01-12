// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link DeployLocationTreeRequest} extends {@link RequestModel}
 *
 * <p>DeployLocationTreeRequest</p>
 */
public class DeployLocationTreeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceUpdate")
    private Boolean forceUpdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SvcId")
    private Long svcId;

    private DeployLocationTreeRequest(Builder builder) {
        super(builder);
        this.forceUpdate = builder.forceUpdate;
        this.jwtToken = builder.jwtToken;
        this.svcId = builder.svcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployLocationTreeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceUpdate
     */
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return svcId
     */
    public Long getSvcId() {
        return this.svcId;
    }

    public static final class Builder extends Request.Builder<DeployLocationTreeRequest, Builder> {
        private Boolean forceUpdate; 
        private String jwtToken; 
        private Long svcId; 

        private Builder() {
            super();
        } 

        private Builder(DeployLocationTreeRequest request) {
            super(request);
            this.forceUpdate = request.forceUpdate;
            this.jwtToken = request.jwtToken;
            this.svcId = request.svcId;
        } 

        /**
         * ForceUpdate.
         */
        public Builder forceUpdate(Boolean forceUpdate) {
            this.putBodyParameter("ForceUpdate", forceUpdate);
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * SvcId.
         */
        public Builder svcId(Long svcId) {
            this.putBodyParameter("SvcId", svcId);
            this.svcId = svcId;
            return this;
        }

        @Override
        public DeployLocationTreeRequest build() {
            return new DeployLocationTreeRequest(this);
        } 

    } 

}
