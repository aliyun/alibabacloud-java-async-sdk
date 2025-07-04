// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListFunctionsRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionsRequest</p>
 */
public class ListFunctionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fcVersion")
    private String fcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gpuType")
    private String gpuType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runtime")
    private String runtime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    private ListFunctionsRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fcVersion = builder.fcVersion;
        this.functionName = builder.functionName;
        this.gpuType = builder.gpuType;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
        this.resourceGroupId = builder.resourceGroupId;
        this.runtime = builder.runtime;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsRequest create() {
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
     * @return fcVersion
     */
    public String getFcVersion() {
        return this.fcVersion;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListFunctionsRequest, Builder> {
        private String description; 
        private String fcVersion; 
        private String functionName; 
        private String gpuType; 
        private Integer limit; 
        private String nextToken; 
        private String prefix; 
        private String resourceGroupId; 
        private String runtime; 
        private java.util.List<Tag> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionsRequest request) {
            super(request);
            this.description = request.description;
            this.fcVersion = request.fcVersion;
            this.functionName = request.functionName;
            this.gpuType = request.gpuType;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.prefix = request.prefix;
            this.resourceGroupId = request.resourceGroupId;
            this.runtime = request.runtime;
            this.tags = request.tags;
        } 

        /**
         * <p>The description of the functions to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The version of Function Compute to which the functions belong.</p>
         * <ul>
         * <li>v3: Only lists functions of Function Compute 3.0.</li>
         * <li>v2: Only lists functions of Function Compute 2.0.</li>
         * </ul>
         * <p>By default, this parameter is left empty and functions in both Function Compute 3.0 and Function Compute 2.0 are listed.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        public Builder fcVersion(String fcVersion) {
            this.putQueryParameter("fcVersion", fcVersion);
            this.fcVersion = fcVersion;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The GPU type of the functions to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>fc.gpu.tesla.1</p>
         */
        public Builder gpuType(String gpuType) {
            this.putQueryParameter("gpuType", gpuType);
            this.gpuType = gpuType;
            return this;
        }

        /**
         * <p>The number of functions to return. The minimum value is 1 and the maximum value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNCNhYmM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The prefix of the function name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The runtime of the functions to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.10</p>
         */
        public Builder runtime(String runtime) {
            this.putQueryParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The tag of the functions to retrieve.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListFunctionsRequest build() {
            return new ListFunctionsRequest(this);
        } 

    } 

}
