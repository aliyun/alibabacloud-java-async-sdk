// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateMaterialDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateMaterialDirectoryRequest</p>
 */
public class CreateMaterialDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentDirectoryId;

    private CreateMaterialDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaterialDirectoryRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public static final class Builder extends Request.Builder<CreateMaterialDirectoryRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String name; 
        private String parentDirectoryId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMaterialDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.name = request.name;
            this.parentDirectoryId = request.parentDirectoryId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20260206134746000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putQueryParameter("ParentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        @Override
        public CreateMaterialDirectoryRequest build() {
            return new CreateMaterialDirectoryRequest(this);
        } 

    } 

}
