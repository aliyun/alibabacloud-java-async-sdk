// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileRequest</p>
 */
public class DeleteFileRequest extends Request {
    @Query
    @NameInMap("ParamFile")
    private String paramFile;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubSceneUuid")
    private String subSceneUuid;

    private DeleteFileRequest(Builder builder) {
        super(builder);
        this.paramFile = builder.paramFile;
        this.regionId = builder.regionId;
        this.subSceneUuid = builder.subSceneUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramFile
     */
    public String getParamFile() {
        return this.paramFile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subSceneUuid
     */
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    public static final class Builder extends Request.Builder<DeleteFileRequest, Builder> {
        private String paramFile; 
        private String regionId; 
        private String subSceneUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileRequest response) {
            super(response);
            this.paramFile = response.paramFile;
            this.regionId = response.regionId;
            this.subSceneUuid = response.subSceneUuid;
        } 

        /**
         * ParamFile.
         */
        public Builder paramFile(String paramFile) {
            this.putQueryParameter("ParamFile", paramFile);
            this.paramFile = paramFile;
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
         * SubSceneUuid.
         */
        public Builder subSceneUuid(String subSceneUuid) {
            this.putQueryParameter("SubSceneUuid", subSceneUuid);
            this.subSceneUuid = subSceneUuid;
            return this;
        }

        @Override
        public DeleteFileRequest build() {
            return new DeleteFileRequest(this);
        } 

    } 

}
