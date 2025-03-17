// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link UpdateVirtualDatasourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirtualDatasourceInstanceRequest</p>
 */
public class UpdateVirtualDatasourceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vdbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vdbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private UpdateVirtualDatasourceInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.type = builder.type;
        this.vdbId = builder.vdbId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualDatasourceInstanceRequest create() {
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return vdbId
     */
    public String getVdbId() {
        return this.vdbId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateVirtualDatasourceInstanceRequest, Builder> {
        private String regionId; 
        private String description; 
        private String name; 
        private Integer type; 
        private String vdbId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirtualDatasourceInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.type = request.type;
            this.vdbId = request.vdbId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vdb-E0F693C8-9F72-5830-B81A-696C9D8EBBD1</p>
         */
        public Builder vdbId(String vdbId) {
            this.putBodyParameter("vdbId", vdbId);
            this.vdbId = vdbId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateVirtualDatasourceInstanceRequest build() {
            return new UpdateVirtualDatasourceInstanceRequest(this);
        } 

    } 

}
