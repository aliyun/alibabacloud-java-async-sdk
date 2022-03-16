// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHBaseSlbServerRequest} extends {@link RequestModel}
 *
 * <p>CreateHBaseSlbServerRequest</p>
 */
public class CreateHBaseSlbServerRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("SlbServer")
    @Validation(required = true)
    private String slbServer;

    private CreateHBaseSlbServerRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.slbServer = builder.slbServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHBaseSlbServerRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return slbServer
     */
    public String getSlbServer() {
        return this.slbServer;
    }

    public static final class Builder extends Request.Builder<CreateHBaseSlbServerRequest, Builder> {
        private String clientToken; 
        private String clusterId; 
        private String slbServer; 

        private Builder() {
            super();
        } 

        private Builder(CreateHBaseSlbServerRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.slbServer = request.slbServer;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * SlbServer.
         */
        public Builder slbServer(String slbServer) {
            this.putQueryParameter("SlbServer", slbServer);
            this.slbServer = slbServer;
            return this;
        }

        @Override
        public CreateHBaseSlbServerRequest build() {
            return new CreateHBaseSlbServerRequest(this);
        } 

    } 

}
