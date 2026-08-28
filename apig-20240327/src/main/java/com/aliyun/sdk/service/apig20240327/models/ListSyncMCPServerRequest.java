// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListSyncMCPServerRequest} extends {@link RequestModel}
 *
 * <p>ListSyncMCPServerRequest</p>
 */
public class ListSyncMCPServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    private ListSyncMCPServerRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.namespace = builder.namespace;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSyncMCPServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<ListSyncMCPServerRequest, Builder> {
        private String gatewayId; 
        private String namespace; 
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSyncMCPServerRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.namespace = request.namespace;
            this.sourceId = request.sourceId;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * sourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public ListSyncMCPServerRequest build() {
            return new ListSyncMCPServerRequest(this);
        } 

    } 

}
