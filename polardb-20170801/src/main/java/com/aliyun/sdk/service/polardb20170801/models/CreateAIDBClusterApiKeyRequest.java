// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateAIDBClusterApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateAIDBClusterApiKeyRequest</p>
 */
public class CreateAIDBClusterApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSpaceName")
    private String modelSpaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateAIDBClusterApiKeyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.modelSpaceName = builder.modelSpaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIDBClusterApiKeyRequest create() {
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
     * @return modelSpaceName
     */
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAIDBClusterApiKeyRequest, Builder> {
        private String description; 
        private String modelSpaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIDBClusterApiKeyRequest request) {
            super(request);
            this.description = request.description;
            this.modelSpaceName = request.modelSpaceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The model space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pms-xxx</p>
         */
        public Builder modelSpaceName(String modelSpaceName) {
            this.putQueryParameter("ModelSpaceName", modelSpaceName);
            this.modelSpaceName = modelSpaceName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the region information of all clusters under the specified account.</li>
         * <li>If this parameter is left empty, scheduled tasks in all regions under the current account are queried by default.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAIDBClusterApiKeyRequest build() {
            return new CreateAIDBClusterApiKeyRequest(this);
        } 

    } 

}
