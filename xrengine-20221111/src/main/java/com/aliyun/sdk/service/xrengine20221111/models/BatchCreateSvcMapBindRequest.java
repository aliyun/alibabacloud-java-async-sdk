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
 * {@link BatchCreateSvcMapBindRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateSvcMapBindRequest</p>
 */
public class BatchCreateSvcMapBindRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MapIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> mapIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SvcId")
    private Long svcId;

    private BatchCreateSvcMapBindRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.mapIds = builder.mapIds;
        this.svcId = builder.svcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateSvcMapBindRequest create() {
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
     * @return mapIds
     */
    public java.util.List<Long> getMapIds() {
        return this.mapIds;
    }

    /**
     * @return svcId
     */
    public Long getSvcId() {
        return this.svcId;
    }

    public static final class Builder extends Request.Builder<BatchCreateSvcMapBindRequest, Builder> {
        private String jwtToken; 
        private java.util.List<Long> mapIds; 
        private Long svcId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateSvcMapBindRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.mapIds = request.mapIds;
            this.svcId = request.svcId;
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
         * <p>This parameter is required.</p>
         */
        public Builder mapIds(java.util.List<Long> mapIds) {
            String mapIdsShrink = shrink(mapIds, "MapIds", "json");
            this.putBodyParameter("MapIds", mapIdsShrink);
            this.mapIds = mapIds;
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
        public BatchCreateSvcMapBindRequest build() {
            return new BatchCreateSvcMapBindRequest(this);
        } 

    } 

}
