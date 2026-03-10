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
 * {@link CreateMemoryStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryStoreRequest</p>
 */
public class CreateMemoryStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

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
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shortTermTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shortTermTtl;

    private CreateMemoryStoreRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.customExtractionStrategies = builder.customExtractionStrategies;
        this.description = builder.description;
        this.extractionStrategies = builder.extractionStrategies;
        this.memoryStoreName = builder.memoryStoreName;
        this.shortTermTtl = builder.shortTermTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryStoreRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return shortTermTtl
     */
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    public static final class Builder extends Request.Builder<CreateMemoryStoreRequest, Builder> {
        private String workspace; 
        private java.util.List<CustomExtractionStrategy> customExtractionStrategies; 
        private String description; 
        private java.util.List<String> extractionStrategies; 
        private String memoryStoreName; 
        private Integer shortTermTtl; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryStoreRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.customExtractionStrategies = request.customExtractionStrategies;
            this.description = request.description;
            this.extractionStrategies = request.extractionStrategies;
            this.memoryStoreName = request.memoryStoreName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory-store</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putBodyParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder shortTermTtl(Integer shortTermTtl) {
            this.putBodyParameter("shortTermTtl", shortTermTtl);
            this.shortTermTtl = shortTermTtl;
            return this;
        }

        @Override
        public CreateMemoryStoreRequest build() {
            return new CreateMemoryStoreRequest(this);
        } 

    } 

}
