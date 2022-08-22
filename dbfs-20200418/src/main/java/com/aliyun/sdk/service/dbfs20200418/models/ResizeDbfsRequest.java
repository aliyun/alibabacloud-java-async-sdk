// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDbfsRequest} extends {@link RequestModel}
 *
 * <p>ResizeDbfsRequest</p>
 */
public class ResizeDbfsRequest extends Request {
    @Query
    @NameInMap("FsId")
    @Validation(required = true)
    private String fsId;

    @Query
    @NameInMap("NewSizeG")
    @Validation(required = true, minimum = 20)
    private Integer newSizeG;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ResizeDbfsRequest(Builder builder) {
        super(builder);
        this.fsId = builder.fsId;
        this.newSizeG = builder.newSizeG;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDbfsRequest create() {
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
     * @return newSizeG
     */
    public Integer getNewSizeG() {
        return this.newSizeG;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResizeDbfsRequest, Builder> {
        private String fsId; 
        private Integer newSizeG; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResizeDbfsRequest request) {
            super(request);
            this.fsId = request.fsId;
            this.newSizeG = request.newSizeG;
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
         * NewSizeG.
         */
        public Builder newSizeG(Integer newSizeG) {
            this.putQueryParameter("NewSizeG", newSizeG);
            this.newSizeG = newSizeG;
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
        public ResizeDbfsRequest build() {
            return new ResizeDbfsRequest(this);
        } 

    } 

}
