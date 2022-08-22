// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDbfsRequest} extends {@link RequestModel}
 *
 * <p>RenameDbfsRequest</p>
 */
public class RenameDbfsRequest extends Request {
    @Query
    @NameInMap("FsId")
    @Validation(required = true)
    private String fsId;

    @Query
    @NameInMap("FsName")
    @Validation(required = true)
    private String fsName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RenameDbfsRequest(Builder builder) {
        super(builder);
        this.fsId = builder.fsId;
        this.fsName = builder.fsName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return fsName
     */
    public String getFsName() {
        return this.fsName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RenameDbfsRequest, Builder> {
        private String fsId; 
        private String fsName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenameDbfsRequest request) {
            super(request);
            this.fsId = request.fsId;
            this.fsName = request.fsName;
            this.regionId = request.regionId;
        } 

        /**
         * FsId.
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
            return this;
        }

        /**
         * FsName.
         */
        public Builder fsName(String fsName) {
            this.putQueryParameter("FsName", fsName);
            this.fsName = fsName;
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
        public RenameDbfsRequest build() {
            return new RenameDbfsRequest(this);
        } 

    } 

}
