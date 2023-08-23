// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaScheduleRequest</p>
 */
public class UpdateQuotaScheduleRequest extends Request {
    @Path
    @NameInMap("nickname")
    @Validation(required = true)
    private String nickname;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("tenantId")
    private String tenantId;

    private UpdateQuotaScheduleRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.body = builder.body;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaScheduleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateQuotaScheduleRequest, Builder> {
        private String nickname; 
        private String body; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaScheduleRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.body = request.body;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * The name of the quota.
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * The request body parameters.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateQuotaScheduleRequest build() {
            return new UpdateQuotaScheduleRequest(this);
        } 

    } 

}
