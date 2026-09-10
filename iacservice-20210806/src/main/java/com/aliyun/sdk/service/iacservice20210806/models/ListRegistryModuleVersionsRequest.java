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
 * {@link ListRegistryModuleVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListRegistryModuleVersionsRequest</p>
 */
public class ListRegistryModuleVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListRegistryModuleVersionsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.moduleName = builder.moduleName;
        this.namespaceName = builder.namespaceName;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistryModuleVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListRegistryModuleVersionsRequest, Builder> {
        private Integer maxResults; 
        private String moduleName; 
        private String namespaceName; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRegistryModuleVersionsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.moduleName = request.moduleName;
            this.namespaceName = request.namespaceName;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The Registry template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MamespaceName</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>TRkuCaTw/VsEHrnCZgrBA0ftQSEJU/lzo2ei7MJjplg=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListRegistryModuleVersionsRequest build() {
            return new ListRegistryModuleVersionsRequest(this);
        } 

    } 

}
