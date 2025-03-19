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
 * {@link UndeployHttpApiRequest} extends {@link RequestModel}
 *
 * <p>UndeployHttpApiRequest</p>
 */
public class UndeployHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private UndeployHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.environmentId = builder.environmentId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UndeployHttpApiRequest create() {
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
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<UndeployHttpApiRequest, Builder> {
        private String httpApiId; 
        private String environmentId; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(UndeployHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.environmentId = request.environmentId;
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
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.putBodyParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public UndeployHttpApiRequest build() {
            return new UndeployHttpApiRequest(this);
        } 

    } 

}
