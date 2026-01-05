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
 * {@link RenameNodeRequest} extends {@link RequestModel}
 *
 * <p>RenameNodeRequest</p>
 */
public class RenameNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private RenameNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameNodeRequest create() {
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

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<RenameNodeRequest, Builder> {
        private String regionId; 
        private String id; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(RenameNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.name = request.name;
            this.projectId = request.projectId;
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
         * <p>The unique identifier of the Data Studio node.</p>
         * <blockquote>
         * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>652567824470354XXXX</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The new name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public RenameNodeRequest build() {
            return new RenameNodeRequest(this);
        } 

    } 

}
