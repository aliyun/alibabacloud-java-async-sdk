// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaCollectionRequest</p>
 */
public class UpdateMetaCollectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Administrators")
    private java.util.List<String> administrators;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.administrators = builder.administrators;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaCollectionRequest create() {
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
     * @return administrators
     */
    public java.util.List<String> getAdministrators() {
        return this.administrators;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateMetaCollectionRequest, Builder> {
        private String regionId; 
        private java.util.List<String> administrators; 
        private String description; 
        private String id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.administrators = request.administrators;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
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
         * Administrators.
         */
        public Builder administrators(java.util.List<String> administrators) {
            String administratorsShrink = shrink(administrators, "Administrators", "simple");
            this.putQueryParameter("Administrators", administratorsShrink);
            this.administrators = administrators;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>category.123</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public UpdateMetaCollectionRequest build() {
            return new UpdateMetaCollectionRequest(this);
        } 

    } 

}
