// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListExplorerRegistryModuleVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListExplorerRegistryModuleVersionsRequest</p>
 */
public class ListExplorerRegistryModuleVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("moduleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private String moduleVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListExplorerRegistryModuleVersionsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.moduleName = builder.moduleName;
        this.moduleVersion = builder.moduleVersion;
        this.namespaceName = builder.namespaceName;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerRegistryModuleVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListExplorerRegistryModuleVersionsRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String moduleName; 
        private String moduleVersion; 
        private String namespaceName; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListExplorerRegistryModuleVersionsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.moduleName = request.moduleName;
            this.moduleVersion = request.moduleVersion;
            this.namespaceName = request.namespaceName;
            this.nextToken = request.nextToken;
        } 

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * moduleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * moduleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putQueryParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * namespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListExplorerRegistryModuleVersionsRequest build() {
            return new ListExplorerRegistryModuleVersionsRequest(this);
        } 

    } 

}
