// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CreateTableLevelRequest} extends {@link RequestModel}
 *
 * <p>CreateTableLevelRequest</p>
 */
public class CreateTableLevelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10, minimum = 1)
    private Integer levelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    private CreateTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.levelType = builder.levelType;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableLevelRequest create() {
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
     * @return levelType
     */
    public Integer getLevelType() {
        return this.levelType;
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

    public static final class Builder extends Request.Builder<CreateTableLevelRequest, Builder> {
        private String regionId; 
        private String description; 
        private Integer levelType; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.levelType = request.levelType;
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
         * <p>The description of the table level.</p>
         * 
         * <strong>example:</strong>
         * <p>The HTTP status code returned.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the table level. Valid values: 1 and 2. The value 1 indicates the logical level. The value 2 indicates the physical level.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
            return this;
        }

        /**
         * <p>The name of the table level.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the table level.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateTableLevelRequest build() {
            return new CreateTableLevelRequest(this);
        } 

    } 

}
