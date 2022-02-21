// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAntChainUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>ResetAntChainUserCertificateRequest</p>
 */
public class ResetAntChainUserCertificateRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private ResetAntChainUserCertificateRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAntChainUserCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ResetAntChainUserCertificateRequest, Builder> {
        private String antChainId; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ResetAntChainUserCertificateRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.regionId = response.regionId;
            this.username = response.username;
        } 

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
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
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ResetAntChainUserCertificateRequest build() {
            return new ResetAntChainUserCertificateRequest(this);
        } 

    } 

}
