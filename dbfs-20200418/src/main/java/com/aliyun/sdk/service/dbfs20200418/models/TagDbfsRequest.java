// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagDbfsRequest} extends {@link RequestModel}
 *
 * <p>TagDbfsRequest</p>
 */
public class TagDbfsRequest extends Request {
    @Query
    @NameInMap("DbfsId")
    @Validation(required = true)
    private String dbfsId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private TagDbfsRequest(Builder builder) {
        super(builder);
        this.dbfsId = builder.dbfsId;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbfsId
     */
    public String getDbfsId() {
        return this.dbfsId;
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
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagDbfsRequest, Builder> {
        private String dbfsId; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(TagDbfsRequest request) {
            super(request);
            this.dbfsId = request.dbfsId;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * DbfsId.
         */
        public Builder dbfsId(String dbfsId) {
            this.putQueryParameter("DbfsId", dbfsId);
            this.dbfsId = dbfsId;
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

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagDbfsRequest build() {
            return new TagDbfsRequest(this);
        } 

    } 

}
