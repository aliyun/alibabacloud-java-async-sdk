// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @Path
    @NameInMap("nickname")
    @Validation(required = true)
    private String nickname;

    @Query
    @NameInMap("AkProven")
    private String akProven;

    @Query
    @NameInMap("mock")
    private Boolean mock;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("tenantId")
    private String tenantId;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.akProven = builder.akProven;
        this.mock = builder.mock;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
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
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
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

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String nickname; 
        private String akProven; 
        private Boolean mock; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.akProven = request.akProven;
            this.mock = request.mock;
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
            this.putQueryParameter("AkProven", akProven);
            this.akProven = akProven;
            return this;
        }

        /**
         * mock.
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("mock", mock);
            this.mock = mock;
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
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
