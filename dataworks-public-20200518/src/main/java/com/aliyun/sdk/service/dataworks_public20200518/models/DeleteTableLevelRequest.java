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
 * {@link DeleteTableLevelRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableLevelRequest</p>
 */
public class DeleteTableLevelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long levelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    private DeleteTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.levelId = builder.levelId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableLevelRequest create() {
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
     * @return levelId
     */
    public Long getLevelId() {
        return this.levelId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DeleteTableLevelRequest, Builder> {
        private String regionId; 
        private Long levelId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.levelId = request.levelId;
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
         * <p>The ID of the table level that you want to delete. You can call the ListTableLevel operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder levelId(Long levelId) {
            this.putQueryParameter("LevelId", levelId);
            this.levelId = levelId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
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
        public DeleteTableLevelRequest build() {
            return new DeleteTableLevelRequest(this);
        } 

    } 

}
