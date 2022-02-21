// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserTagsRequest} extends {@link RequestModel}
 *
 * <p>CheckUserTagsRequest</p>
 */
public class CheckUserTagsRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private java.util.List < String > tags;

    private CheckUserTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CheckUserTagsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserTagsRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.tags = response.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CheckUserTagsRequest build() {
            return new CheckUserTagsRequest(this);
        } 

    } 

}
