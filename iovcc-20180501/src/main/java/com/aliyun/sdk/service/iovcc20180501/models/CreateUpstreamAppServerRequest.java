// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppServerRequest} extends {@link RequestModel}
 *
 * <p>CreateUpstreamAppServerRequest</p>
 */
public class CreateUpstreamAppServerRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private CreateUpstreamAppServerRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUpstreamAppServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<CreateUpstreamAppServerRequest, Builder> {
        private String name; 
        private String projectId; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateUpstreamAppServerRequest response) {
            super(response);
            this.name = response.name;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.tags = response.tags;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateUpstreamAppServerRequest build() {
            return new CreateUpstreamAppServerRequest(this);
        } 

    } 

}
