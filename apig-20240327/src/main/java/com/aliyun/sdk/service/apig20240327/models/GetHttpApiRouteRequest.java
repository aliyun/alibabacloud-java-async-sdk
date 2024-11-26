// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHttpApiRouteRequest} extends {@link RequestModel}
 *
 * <p>GetHttpApiRouteRequest</p>
 */
public class GetHttpApiRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private GetHttpApiRouteRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpApiRouteRequest create() {
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

    public static final class Builder extends Request.Builder<GetHttpApiRouteRequest, Builder> {
        private String httpApiId; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(GetHttpApiRouteRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.routeId = request.routeId;
        } 

        /**
         * <p>HTTP API ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-cqu95allhtgii6***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.putPathParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public GetHttpApiRouteRequest build() {
            return new GetHttpApiRouteRequest(this);
        } 

    } 

}
