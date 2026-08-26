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
 * {@link CreateKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseRequest</p>
 */
public class CreateKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseType")
    private String knowledgeBaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    private CreateKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.searchMode = builder.searchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseRequest create() {
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
     * @return knowledgeBaseType
     */
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    /**
     * @return knowledgeSpaceId
     */
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
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
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseRequest, Builder> {
        private String description; 
        private String knowledgeBaseType; 
        private String knowledgeSpaceId; 
        private String name; 
        private String regionId; 
        private String searchMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseRequest request) {
            super(request);
            this.description = request.description;
            this.knowledgeBaseType = request.knowledgeBaseType;
            this.knowledgeSpaceId = request.knowledgeSpaceId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.searchMode = request.searchMode;
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
         * KnowledgeBaseType.
         */
        public Builder knowledgeBaseType(String knowledgeBaseType) {
            this.putQueryParameter("KnowledgeBaseType", knowledgeBaseType);
            this.knowledgeBaseType = knowledgeBaseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-xxxxxx</p>
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.putQueryParameter("KnowledgeSpaceId", knowledgeSpaceId);
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testkb</p>
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
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchMode.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        @Override
        public CreateKnowledgeBaseRequest build() {
            return new CreateKnowledgeBaseRequest(this);
        } 

    } 

}
