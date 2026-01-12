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
 * {@link GetArEditUgcMaterialRequest} extends {@link RequestModel}
 *
 * <p>GetArEditUgcMaterialRequest</p>
 */
public class GetArEditUgcMaterialRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MapId")
    private Long mapId;

    private GetArEditUgcMaterialRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.mapId = builder.mapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArEditUgcMaterialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return mapId
     */
    public Long getMapId() {
        return this.mapId;
    }

    public static final class Builder extends Request.Builder<GetArEditUgcMaterialRequest, Builder> {
        private String jwtToken; 
        private Long mapId; 

        private Builder() {
            super();
        } 

        private Builder(GetArEditUgcMaterialRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.mapId = request.mapId;
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
         * MapId.
         */
        public Builder mapId(Long mapId) {
            this.putBodyParameter("MapId", mapId);
            this.mapId = mapId;
            return this;
        }

        @Override
        public GetArEditUgcMaterialRequest build() {
            return new GetArEditUgcMaterialRequest(this);
        } 

    } 

}
