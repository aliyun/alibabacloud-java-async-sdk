// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link IntrospectAppInstanceTicketForPreviewRequest} extends {@link RequestModel}
 *
 * <p>IntrospectAppInstanceTicketForPreviewRequest</p>
 */
public class IntrospectAppInstanceTicketForPreviewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private IntrospectAppInstanceTicketForPreviewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntrospectAppInstanceTicketForPreviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<IntrospectAppInstanceTicketForPreviewRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(IntrospectAppInstanceTicketForPreviewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.token = request.token;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public IntrospectAppInstanceTicketForPreviewRequest build() {
            return new IntrospectAppInstanceTicketForPreviewRequest(this);
        } 

    } 

}
