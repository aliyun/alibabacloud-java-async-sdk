// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOpenAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteOpenAccountRequest</p>
 */
public class DeleteOpenAccountRequest extends Request {
    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteOpenAccountRequest(Builder builder) {
        super(builder);
        this.identityId = builder.identityId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOpenAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteOpenAccountRequest, Builder> {
        private String identityId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOpenAccountRequest response) {
            super(response);
            this.identityId = response.identityId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * IdentityId.
         */
        public Builder identityId(String identityId) {
            this.putQueryParameter("IdentityId", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public DeleteOpenAccountRequest build() {
            return new DeleteOpenAccountRequest(this);
        } 

    } 

}
