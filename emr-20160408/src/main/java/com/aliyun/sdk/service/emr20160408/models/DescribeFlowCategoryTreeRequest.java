// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowCategoryTreeRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowCategoryTreeRequest</p>
 */
public class DescribeFlowCategoryTreeRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    private String categoryId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeFlowCategoryTreeRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.keyword = builder.keyword;
        this.mode = builder.mode;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowCategoryTreeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeFlowCategoryTreeRequest, Builder> {
        private String categoryId; 
        private String keyword; 
        private String mode; 
        private String projectId; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowCategoryTreeRequest response) {
            super(response);
            this.categoryId = response.categoryId;
            this.keyword = response.keyword;
            this.mode = response.mode;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.type = response.type;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeFlowCategoryTreeRequest build() {
            return new DescribeFlowCategoryTreeRequest(this);
        } 

    } 

}
