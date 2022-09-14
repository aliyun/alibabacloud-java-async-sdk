// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomImagesRequest</p>
 */
public class ListCustomImagesRequest extends Request {
    @Query
    @NameInMap("BaseOsTag")
    private String baseOsTag;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListCustomImagesRequest(Builder builder) {
        super(builder);
        this.baseOsTag = builder.baseOsTag;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseOsTag
     */
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListCustomImagesRequest, Builder> {
        private String baseOsTag; 
        private String imageOwnerAlias; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomImagesRequest request) {
            super(request);
            this.baseOsTag = request.baseOsTag;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.regionId = request.regionId;
        } 

        /**
         * BaseOsTag.
         */
        public Builder baseOsTag(String baseOsTag) {
            this.putQueryParameter("BaseOsTag", baseOsTag);
            this.baseOsTag = baseOsTag;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
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
        public ListCustomImagesRequest build() {
            return new ListCustomImagesRequest(this);
        } 

    } 

}
