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
 * {@link RefreshLivyComputeTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshLivyComputeTokenRequest</p>
 */
public class RefreshLivyComputeTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("livyComputeId")
    private String livyComputeId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tokenId")
    private String tokenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoExpireConfiguration")
    private AutoExpireConfiguration autoExpireConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private RefreshLivyComputeTokenRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.livyComputeId = builder.livyComputeId;
        this.tokenId = builder.tokenId;
        this.autoExpireConfiguration = builder.autoExpireConfiguration;
        this.name = builder.name;
        this.token = builder.token;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshLivyComputeTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    /**
     * @return livyComputeId
     */
    public String getLivyComputeId() {
        return this.livyComputeId;
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

    public static final class Builder extends Request.Builder<RefreshLivyComputeTokenRequest, Builder> {
        private String workspaceBizId; 
        private String livyComputeId; 
        private String tokenId; 
        private AutoExpireConfiguration autoExpireConfiguration; 
        private String name; 
        private String token; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshLivyComputeTokenRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.livyComputeId = request.livyComputeId;
            this.tokenId = request.tokenId;
            this.autoExpireConfiguration = request.autoExpireConfiguration;
            this.name = request.name;
            this.token = request.token;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-8adde60aa809701f</p>
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * <p>The ID of the Livy Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-i8xogcdfa4fk3yn1</p>
         */
        public Builder livyComputeId(String livyComputeId) {
            this.putPathParameter("livyComputeId", livyComputeId);
            this.livyComputeId = livyComputeId;
            return this;
        }

        /**
         * <p>The token ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxx</p>
         */
        public Builder tokenId(String tokenId) {
            this.putPathParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        /**
         * <p>The information about token expiration.</p>
         */
        public Builder autoExpireConfiguration(AutoExpireConfiguration autoExpireConfiguration) {
            this.putBodyParameter("autoExpireConfiguration", autoExpireConfiguration);
            this.autoExpireConfiguration = autoExpireConfiguration;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token must be 16 or more characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>fe86812667f04v343</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RefreshLivyComputeTokenRequest build() {
            return new RefreshLivyComputeTokenRequest(this);
        } 

    } 

    /**
     * 
     * {@link RefreshLivyComputeTokenRequest} extends {@link TeaModel}
     *
     * <p>RefreshLivyComputeTokenRequest</p>
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
             * <p>Specifies whether the token automatically expires.</p>
             * <ul>
             * <li><p>true: The token automatically expires.</p>
             * </li>
             * <li><p>false: The token does not automatically expire.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The expiration period in days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
