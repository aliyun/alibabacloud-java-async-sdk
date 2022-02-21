// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>CreateSavedQueryRequest</p>
 */
public class CreateSavedQueryRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SavedQueryId")
    private String savedQueryId;

    @Body
    @NameInMap("Sql")
    private String sql;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateSavedQueryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.savedQueryId = builder.savedQueryId;
        this.sql = builder.sql;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavedQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return savedQueryId
     */
    public String getSavedQueryId() {
        return this.savedQueryId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateSavedQueryRequest, Builder> {
        private String description; 
        private String name; 
        private String regionId; 
        private String savedQueryId; 
        private String sql; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSavedQueryRequest response) {
            super(response);
            this.description = response.description;
            this.name = response.name;
            this.regionId = response.regionId;
            this.savedQueryId = response.savedQueryId;
            this.sql = response.sql;
            this.workspaceId = response.workspaceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SavedQueryId.
         */
        public Builder savedQueryId(String savedQueryId) {
            this.putBodyParameter("SavedQueryId", savedQueryId);
            this.savedQueryId = savedQueryId;
            return this;
        }

        /**
         * Sql.
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateSavedQueryRequest build() {
            return new CreateSavedQueryRequest(this);
        } 

    } 

}
