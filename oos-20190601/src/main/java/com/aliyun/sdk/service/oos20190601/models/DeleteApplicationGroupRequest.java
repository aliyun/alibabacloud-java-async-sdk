// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApplication</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The name of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApplicationGroup</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to retain resources created by application manager when deleting the application. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
