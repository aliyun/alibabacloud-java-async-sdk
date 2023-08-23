// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaRequest</p>
 */
public class UpdateQuotaRequest extends Request {
    @Path
    @NameInMap("nickname")
    @Validation(required = true)
    private String nickname;

    @Header
    @NameInMap("AkProven")
    private String akProven;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("tenantId")
    private String tenantId;

    private UpdateQuotaRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.akProven = builder.akProven;
        this.body = builder.body;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return akProven
     */
    public String getAkProven() {
        return this.akProven;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaRequest, Builder> {
        private String nickname; 
        private String akProven; 
        private String body; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.akProven = request.akProven;
            this.body = request.body;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * nickname.
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * AkProven.
         */
        public Builder akProven(String akProven) {
            this.putHeaderParameter("AkProven", akProven);
            this.akProven = akProven;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateQuotaRequest build() {
            return new UpdateQuotaRequest(this);
        } 

    } 

}
