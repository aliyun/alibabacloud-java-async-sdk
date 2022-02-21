// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationGroupRequest</p>
 */
public class UpdateApplicationGroupRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NewName")
    private String newName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateApplicationGroupRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.name = builder.name;
        this.newName = builder.newName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationGroupRequest, Builder> {
        private String applicationName; 
        private String name; 
        private String newName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationGroupRequest response) {
            super(response);
            this.applicationName = response.applicationName;
            this.name = response.name;
            this.newName = response.newName;
            this.regionId = response.regionId;
        } 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
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
         * NewName.
         */
        public Builder newName(String newName) {
            this.putQueryParameter("NewName", newName);
            this.newName = newName;
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
        public UpdateApplicationGroupRequest build() {
            return new UpdateApplicationGroupRequest(this);
        } 

    } 

}
