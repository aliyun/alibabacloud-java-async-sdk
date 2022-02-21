// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySsoStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDirectorySsoStatusRequest</p>
 */
public class GetDirectorySsoStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    @Validation(required = true)
    private String directoryId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDirectorySsoStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectorySsoStatusRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDirectorySsoStatusRequest, Builder> {
        private String directoryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDirectorySsoStatusRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.regionId = response.regionId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDirectorySsoStatusRequest build() {
            return new GetDirectorySsoStatusRequest(this);
        } 

    } 

}
