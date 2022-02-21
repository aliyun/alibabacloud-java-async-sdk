// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAckOperatorRequest} extends {@link RequestModel}
 *
 * <p>InstallAckOperatorRequest</p>
 */
public class InstallAckOperatorRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private InstallAckOperatorRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAckOperatorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<InstallAckOperatorRequest, Builder> {
        private String clusterId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(InstallAckOperatorRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.clientToken = response.clientToken;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public InstallAckOperatorRequest build() {
            return new InstallAckOperatorRequest(this);
        } 

    } 

}
