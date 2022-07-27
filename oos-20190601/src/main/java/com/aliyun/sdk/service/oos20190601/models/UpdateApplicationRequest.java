// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    private UpdateApplicationRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationRequest, Builder> {
        private String description; 
        private String name; 
        private String regionId; 
        private java.util.Map < String, ? > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateApplicationRequest build() {
            return new UpdateApplicationRequest(this);
        } 

    } 

}
