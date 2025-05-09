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
 * {@link CloneDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CloneDataSourceRequest</p>
 */
public class CloneDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloneDataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloneDataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private CloneDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloneDataSourceName = builder.cloneDataSourceName;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDataSourceRequest create() {
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
     * @return cloneDataSourceName
     */
    public String getCloneDataSourceName() {
        return this.cloneDataSourceName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<CloneDataSourceRequest, Builder> {
        private String regionId; 
        private String cloneDataSourceName; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(CloneDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloneDataSourceName = request.cloneDataSourceName;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the destination data source The name can contain letters, digits, and underscores (_), and must start with a letter. It cannot exceed 60 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_holo_datasource</p>
         */
        public Builder cloneDataSourceName(String cloneDataSourceName) {
            this.putQueryParameter("CloneDataSourceName", cloneDataSourceName);
            this.cloneDataSourceName = cloneDataSourceName;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16036</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public CloneDataSourceRequest build() {
            return new CloneDataSourceRequest(this);
        } 

    } 

}
