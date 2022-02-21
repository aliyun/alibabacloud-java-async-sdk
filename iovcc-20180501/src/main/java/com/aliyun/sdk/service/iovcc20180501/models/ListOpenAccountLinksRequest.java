// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenAccountLinksRequest} extends {@link RequestModel}
 *
 * <p>ListOpenAccountLinksRequest</p>
 */
public class ListOpenAccountLinksRequest extends Request {
    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("Idp")
    private String idp;

    @Query
    @NameInMap("OpenId")
    private String openId;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListOpenAccountLinksRequest(Builder builder) {
        super(builder);
        this.identityId = builder.identityId;
        this.idp = builder.idp;
        this.openId = builder.openId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenAccountLinksRequest create() {
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
     * @return idp
     */
    public String getIdp() {
        return this.idp;
    }

    /**
     * @return openId
     */
    public String getOpenId() {
        return this.openId;
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

    public static final class Builder extends Request.Builder<ListOpenAccountLinksRequest, Builder> {
        private String identityId; 
        private String idp; 
        private String openId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListOpenAccountLinksRequest response) {
            super(response);
            this.identityId = response.identityId;
            this.idp = response.idp;
            this.openId = response.openId;
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
         * Idp.
         */
        public Builder idp(String idp) {
            this.putQueryParameter("Idp", idp);
            this.idp = idp;
            return this;
        }

        /**
         * OpenId.
         */
        public Builder openId(String openId) {
            this.putQueryParameter("OpenId", openId);
            this.openId = openId;
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
        public ListOpenAccountLinksRequest build() {
            return new ListOpenAccountLinksRequest(this);
        } 

    } 

}
