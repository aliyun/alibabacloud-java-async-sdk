// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateKyuubiTokenRequest} extends {@link RequestModel}
 *
 * <p>UpdateKyuubiTokenRequest</p>
 */
public class UpdateKyuubiTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
    private String kyuubiServiceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tokenId")
    private String tokenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoExpireConfiguration")
    private AutoExpireConfiguration autoExpireConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberArns")
    private java.util.List<String> memberArns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private UpdateKyuubiTokenRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kyuubiServiceId = builder.kyuubiServiceId;
        this.tokenId = builder.tokenId;
        this.autoExpireConfiguration = builder.autoExpireConfiguration;
        this.memberArns = builder.memberArns;
        this.name = builder.name;
        this.token = builder.token;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKyuubiTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return kyuubiServiceId
     */
    public String getKyuubiServiceId() {
        return this.kyuubiServiceId;
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * @return autoExpireConfiguration
     */
    public AutoExpireConfiguration getAutoExpireConfiguration() {
        return this.autoExpireConfiguration;
    }

    /**
     * @return memberArns
     */
    public java.util.List<String> getMemberArns() {
        return this.memberArns;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateKyuubiTokenRequest, Builder> {
        private String workspaceId; 
        private String kyuubiServiceId; 
        private String tokenId; 
        private AutoExpireConfiguration autoExpireConfiguration; 
        private java.util.List<String> memberArns; 
        private String name; 
        private String token; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKyuubiTokenRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kyuubiServiceId = request.kyuubiServiceId;
            this.tokenId = request.tokenId;
            this.autoExpireConfiguration = request.autoExpireConfiguration;
            this.memberArns = request.memberArns;
            this.name = request.name;
            this.token = request.token;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * kyuubiServiceId.
         */
        public Builder kyuubiServiceId(String kyuubiServiceId) {
            this.putPathParameter("kyuubiServiceId", kyuubiServiceId);
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }

        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>tk-zpi0*****hdv4y</p>
         */
        public Builder tokenId(String tokenId) {
            this.putPathParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        /**
         * autoExpireConfiguration.
         */
        public Builder autoExpireConfiguration(AutoExpireConfiguration autoExpireConfiguration) {
            this.putBodyParameter("autoExpireConfiguration", autoExpireConfiguration);
            this.autoExpireConfiguration = autoExpireConfiguration;
            return this;
        }

        /**
         * memberArns.
         */
        public Builder memberArns(java.util.List<String> memberArns) {
            this.putBodyParameter("memberArns", memberArns);
            this.memberArns = memberArns;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putBodyParameter("token", token);
            this.token = token;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateKyuubiTokenRequest build() {
            return new UpdateKyuubiTokenRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKyuubiTokenRequest} extends {@link TeaModel}
     *
     * <p>UpdateKyuubiTokenRequest</p>
     */
    public static class AutoExpireConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("expireDays")
        private Integer expireDays;

        private AutoExpireConfiguration(Builder builder) {
            this.enable = builder.enable;
            this.expireDays = builder.expireDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoExpireConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return expireDays
         */
        public Integer getExpireDays() {
            return this.expireDays;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer expireDays; 

            private Builder() {
            } 

            private Builder(AutoExpireConfiguration model) {
                this.enable = model.enable;
                this.expireDays = model.expireDays;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * expireDays.
             */
            public Builder expireDays(Integer expireDays) {
                this.expireDays = expireDays;
                return this;
            }

            public AutoExpireConfiguration build() {
                return new AutoExpireConfiguration(this);
            } 

        } 

    }
}
