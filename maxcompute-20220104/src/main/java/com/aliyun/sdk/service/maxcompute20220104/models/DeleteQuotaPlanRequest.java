// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteQuotaPlanRequest</p>
 */
public class DeleteQuotaPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private DeleteQuotaPlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.planName = builder.planName;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQuotaPlanRequest create() {
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
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
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

    public static final class Builder extends Request.Builder<DeleteQuotaPlanRequest, Builder> {
        private String nickname; 
        private String planName; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQuotaPlanRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.planName = request.planName;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * QuotaNickName
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * The name of the quota plan.
         */
        public Builder planName(String planName) {
            this.putPathParameter("planName", planName);
            this.planName = planName;
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
        public DeleteQuotaPlanRequest build() {
            return new DeleteQuotaPlanRequest(this);
        } 

    } 

}
