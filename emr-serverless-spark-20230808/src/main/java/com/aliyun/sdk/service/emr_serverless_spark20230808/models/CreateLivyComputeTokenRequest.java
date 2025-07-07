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
 * {@link CreateLivyComputeTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateLivyComputeTokenRequest</p>
 */
public class CreateLivyComputeTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("livyComputeId")
    private String livyComputeId;

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

    private CreateLivyComputeTokenRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.livyComputeId = builder.livyComputeId;
        this.autoExpireConfiguration = builder.autoExpireConfiguration;
        this.name = builder.name;
        this.token = builder.token;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivyComputeTokenRequest create() {
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

    public static final class Builder extends Request.Builder<CreateLivyComputeTokenRequest, Builder> {
        private String workspaceBizId; 
        private String livyComputeId; 
        private AutoExpireConfiguration autoExpireConfiguration; 
        private String name; 
        private String token; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLivyComputeTokenRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.livyComputeId = request.livyComputeId;
            this.autoExpireConfiguration = request.autoExpireConfiguration;
            this.name = request.name;
            this.token = request.token;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceBizId.
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * livyComputeId.
         */
        public Builder livyComputeId(String livyComputeId) {
            this.putPathParameter("livyComputeId", livyComputeId);
            this.livyComputeId = livyComputeId;
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
        public CreateLivyComputeTokenRequest build() {
            return new CreateLivyComputeTokenRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLivyComputeTokenRequest} extends {@link TeaModel}
     *
     * <p>CreateLivyComputeTokenRequest</p>
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
