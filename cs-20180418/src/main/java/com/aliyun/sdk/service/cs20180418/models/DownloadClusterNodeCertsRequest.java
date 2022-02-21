// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadClusterNodeCertsRequest} extends {@link RequestModel}
 *
 * <p>DownloadClusterNodeCertsRequest</p>
 */
public class DownloadClusterNodeCertsRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Path
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    private DownloadClusterNodeCertsRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadClusterNodeCertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DownloadClusterNodeCertsRequest, Builder> {
        private String token; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadClusterNodeCertsRequest response) {
            super(response);
            this.token = response.token;
            this.nodeId = response.nodeId;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putPathParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public DownloadClusterNodeCertsRequest build() {
            return new DownloadClusterNodeCertsRequest(this);
        } 

    } 

}
