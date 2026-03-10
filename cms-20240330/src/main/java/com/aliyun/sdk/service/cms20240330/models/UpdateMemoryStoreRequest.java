// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateMemoryStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryStoreRequest</p>
 */
public class UpdateMemoryStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customExtractionStrategies")
    private java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extractionStrategies")
    private java.util.List<String> extractionStrategies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shortTermTtl")
    private Integer shortTermTtl;

    private UpdateMemoryStoreRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.memoryStoreName = builder.memoryStoreName;
        this.customExtractionStrategies = builder.customExtractionStrategies;
        this.description = builder.description;
        this.extractionStrategies = builder.extractionStrategies;
        this.shortTermTtl = builder.shortTermTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return customExtractionStrategies
     */
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extractionStrategies
     */
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    /**
     * @return shortTermTtl
     */
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryStoreRequest, Builder> {
        private String workspace; 
        private String memoryStoreName; 
        private java.util.List<CustomExtractionStrategy> customExtractionStrategies; 
        private String description; 
        private java.util.List<String> extractionStrategies; 
        private Integer shortTermTtl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryStoreRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.memoryStoreName = request.memoryStoreName;
            this.customExtractionStrategies = request.customExtractionStrategies;
            this.description = request.description;
            this.extractionStrategies = request.extractionStrategies;
            this.shortTermTtl = request.shortTermTtl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qianyi_test_3</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * customExtractionStrategies.
         */
        public Builder customExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
            this.putBodyParameter("customExtractionStrategies", customExtractionStrategies);
            this.customExtractionStrategies = customExtractionStrategies;
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
         * extractionStrategies.
         */
        public Builder extractionStrategies(java.util.List<String> extractionStrategies) {
            this.putBodyParameter("extractionStrategies", extractionStrategies);
            this.extractionStrategies = extractionStrategies;
            return this;
        }

        /**
         * shortTermTtl.
         */
        public Builder shortTermTtl(Integer shortTermTtl) {
            this.putBodyParameter("shortTermTtl", shortTermTtl);
            this.shortTermTtl = shortTermTtl;
            return this;
        }

        @Override
        public UpdateMemoryStoreRequest build() {
            return new UpdateMemoryStoreRequest(this);
        } 

    } 

}
