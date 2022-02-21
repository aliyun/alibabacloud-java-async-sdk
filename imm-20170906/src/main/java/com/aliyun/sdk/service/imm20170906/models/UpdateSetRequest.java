// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSetRequest} extends {@link RequestModel}
 *
 * <p>UpdateSetRequest</p>
 */
public class UpdateSetRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("SetName")
    private String setName;

    private UpdateSetRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.setId = builder.setId;
        this.setName = builder.setName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return setName
     */
    public String getSetName() {
        return this.setName;
    }

    public static final class Builder extends Request.Builder<UpdateSetRequest, Builder> {
        private String project; 
        private String regionId; 
        private String setId; 
        private String setName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSetRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.setId = response.setId;
            this.setName = response.setName;
        } 

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        /**
         * SetName.
         */
        public Builder setName(String setName) {
            this.putQueryParameter("SetName", setName);
            this.setName = setName;
            return this;
        }

        @Override
        public UpdateSetRequest build() {
            return new UpdateSetRequest(this);
        } 

    } 

}
