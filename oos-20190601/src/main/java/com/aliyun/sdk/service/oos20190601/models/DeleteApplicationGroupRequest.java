// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationGroupRequest</p>
 */
public class DeleteApplicationGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainResource")
    private Boolean retainResource;

    private DeleteApplicationGroupRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.retainResource = builder.retainResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationGroupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainResource
     */
    public Boolean getRetainResource() {
        return this.retainResource;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationGroupRequest, Builder> {
        private String applicationName; 
        private String name; 
        private String regionId; 
        private Boolean retainResource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationGroupRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.name = request.name;
            this.regionId = request.regionId;
            this.retainResource = request.retainResource;
        } 

        /**
         * The name of the application.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The name of the application group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region. Set the value to cn-hangzhou.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to retain resources created by application manager when deleting the application. Valid values:
         * <p>
         * - true
         * - false
         */
        public Builder retainResource(Boolean retainResource) {
            this.putQueryParameter("RetainResource", retainResource);
            this.retainResource = retainResource;
            return this;
        }

        @Override
        public DeleteApplicationGroupRequest build() {
            return new DeleteApplicationGroupRequest(this);
        } 

    } 

}
