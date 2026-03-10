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
 * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryStoreResponseBody</p>
 */
public class GetMemoryStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("customExtractionStrategies")
    private java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extractionStrategies")
    private java.util.List<String> extractionStrategies;

    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    private String memoryStoreName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shortTermTtl")
    private Integer shortTermTtl;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetMemoryStoreResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.customExtractionStrategies = builder.customExtractionStrategies;
        this.description = builder.description;
        this.extractionStrategies = builder.extractionStrategies;
        this.memoryStoreName = builder.memoryStoreName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.shortTermTtl = builder.shortTermTtl;
        this.updateTime = builder.updateTime;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortTermTtl
     */
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private java.util.List<CustomExtractionStrategy> customExtractionStrategies; 
        private String description; 
        private java.util.List<String> extractionStrategies; 
        private String memoryStoreName; 
        private String regionId; 
        private String requestId; 
        private Integer shortTermTtl; 
        private String updateTime; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetMemoryStoreResponseBody model) {
            this.createTime = model.createTime;
            this.customExtractionStrategies = model.customExtractionStrategies;
            this.description = model.description;
            this.extractionStrategies = model.extractionStrategies;
            this.memoryStoreName = model.memoryStoreName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.shortTermTtl = model.shortTermTtl;
            this.updateTime = model.updateTime;
            this.workspace = model.workspace;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * customExtractionStrategies.
         */
        public Builder customExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
            this.customExtractionStrategies = customExtractionStrategies;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * extractionStrategies.
         */
        public Builder extractionStrategies(java.util.List<String> extractionStrategies) {
            this.extractionStrategies = extractionStrategies;
            return this;
        }

        /**
         * memoryStoreName.
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * shortTermTtl.
         */
        public Builder shortTermTtl(Integer shortTermTtl) {
            this.shortTermTtl = shortTermTtl;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetMemoryStoreResponseBody build() {
            return new GetMemoryStoreResponseBody(this);
        } 

    } 

}
