// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshOfficePreviewTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshOfficePreviewTokenRequest</p>
 */
public class RefreshOfficePreviewTokenRequest extends Request {
    @Query
    @NameInMap("AccessToken")
    @Validation(required = true)
    private String accessToken;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("RefreshToken")
    private String refreshToken;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RefreshOfficePreviewTokenRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.project = builder.project;
        this.refreshToken = builder.refreshToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshOfficePreviewTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RefreshOfficePreviewTokenRequest, Builder> {
        private String accessToken; 
        private String project; 
        private String refreshToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshOfficePreviewTokenRequest response) {
            super(response);
            this.accessToken = response.accessToken;
            this.project = response.project;
            this.refreshToken = response.refreshToken;
            this.regionId = response.regionId;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * RefreshToken.
         */
        public Builder refreshToken(String refreshToken) {
            this.putQueryParameter("RefreshToken", refreshToken);
            this.refreshToken = refreshToken;
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

        @Override
        public RefreshOfficePreviewTokenRequest build() {
            return new RefreshOfficePreviewTokenRequest(this);
        } 

    } 

}
