// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIdpMetadataRequest} extends {@link RequestModel}
 *
 * <p>SetIdpMetadataRequest</p>
 */
public class SetIdpMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpMetadata")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SetIdpMetadataRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.idpMetadata = builder.idpMetadata;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIdpMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return idpMetadata
     */
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetIdpMetadataRequest, Builder> {
        private String directoryId; 
        private String idpMetadata; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetIdpMetadataRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.idpMetadata = request.idpMetadata;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * The workspace ID. This parameter is the same as `OfficeSiteId`. We recommend that you use `OfficeSiteId` to replace `DirectoryId`. You can specify only `DirectoryId` or `OfficeSiteId`.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The metadata of the IdP.
         */
        public Builder idpMetadata(String idpMetadata) {
            this.putQueryParameter("IdpMetadata", idpMetadata);
            this.idpMetadata = idpMetadata;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetIdpMetadataRequest build() {
            return new SetIdpMetadataRequest(this);
        } 

    } 

}
