// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserDefineRegionRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserDefineRegionRequest</p>
 */
public class DeleteUserDefineRegionRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("RegionTag")
    private String regionTag;

    private DeleteUserDefineRegionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regionTag = builder.regionTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDefineRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    public static final class Builder extends Request.Builder<DeleteUserDefineRegionRequest, Builder> {
        private Long id; 
        private String regionTag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserDefineRegionRequest request) {
            super(request);
            this.id = request.id;
            this.regionTag = request.regionTag;
        } 

        /**
         * The unique ID of the custom namespace. You can call the ListUserDefineRegion operation to query the ID. For more information, see [ListUserDefineRegion](~~149377~~).
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The tag of the custom namespace.
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        @Override
        public DeleteUserDefineRegionRequest build() {
            return new DeleteUserDefineRegionRequest(this);
        } 

    } 

}
