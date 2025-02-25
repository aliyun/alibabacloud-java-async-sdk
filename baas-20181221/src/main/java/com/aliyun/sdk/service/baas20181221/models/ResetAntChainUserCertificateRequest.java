// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAntChainUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>ResetAntChainUserCertificateRequest</p>
 */
public class ResetAntChainUserCertificateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private ResetAntChainUserCertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ResetAntChainUserCertificateRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ResetAntChainUserCertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.username = request.username;
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
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
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
