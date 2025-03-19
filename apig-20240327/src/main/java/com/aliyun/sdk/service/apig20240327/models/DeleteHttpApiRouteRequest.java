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
 * {@link DeleteHttpApiRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteHttpApiRouteRequest</p>
 */
public class DeleteHttpApiRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private DeleteHttpApiRouteRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHttpApiRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<DeleteHttpApiRouteRequest, Builder> {
        private String httpApiId; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHttpApiRouteRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.routeId = request.routeId;
        } 

        /**
         * <p>The ID of the HTTP API to which the route belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>api-cqoub6tlhtgv***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgr***</p>
         */
        public Builder routeId(String routeId) {
            this.putPathParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public DeleteHttpApiRouteRequest build() {
            return new DeleteHttpApiRouteRequest(this);
        } 

    } 

}
