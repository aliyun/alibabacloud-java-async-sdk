// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListImageCachesRequest} extends {@link RequestModel}
 *
 * <p>ListImageCachesRequest</p>
 */
public class ListImageCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("digest")
    private String digest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imageRefContains")
    private String imageRefContains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("registry")
    private String registry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repository")
    private String repository;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListImageCachesRequest(Builder builder) {
        super(builder);
        this.acrInstanceId = builder.acrInstanceId;
        this.digest = builder.digest;
        this.imageRefContains = builder.imageRefContains;
        this.maxResults = builder.maxResults;
        this.namespace = builder.namespace;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.registry = builder.registry;
        this.repository = builder.repository;
        this.status = builder.status;
        this.tag = builder.tag;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageCachesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return imageRefContains
     */
    public String getImageRefContains() {
        return this.imageRefContains;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return registry
     */
    public String getRegistry() {
        return this.registry;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListImageCachesRequest, Builder> {
        private String acrInstanceId; 
        private String digest; 
        private String imageRefContains; 
        private Integer maxResults; 
        private String namespace; 
        private String nextToken; 
        private String regionId; 
        private String registry; 
        private String repository; 
        private String status; 
        private String tag; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListImageCachesRequest request) {
            super(request);
            this.acrInstanceId = request.acrInstanceId;
            this.digest = request.digest;
            this.imageRefContains = request.imageRefContains;
            this.maxResults = request.maxResults;
            this.namespace = request.namespace;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.registry = request.registry;
            this.repository = request.repository;
            this.status = request.status;
            this.tag = request.tag;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the source ACR Enterprise instance. The match must be exact. Empty character strings are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putQueryParameter("acrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The complete image digest in the sha256: format followed by a 64-character lowercase hexadecimal string. The format is verified by the console. The match must be exact, and prefixes are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>Performs a case-insensitive literal substring search on the complete source image reference in the registry/repository:tag format, where the repository already includes the namespace. If the value is empty after trimming leading and trailing whitespace, it is treated as not provided. Percent signs, underscores, and backslashes are treated as literal characters.</p>
         * 
         * <strong>example:</strong>
         * <p>team/app</p>
         */
        public Builder imageRefContains(String imageRefContains) {
            this.putQueryParameter("imageRefContains", imageRefContains);
            this.imageRefContains = imageRefContains;
            return this;
        }

        /**
         * <p>The maximum number of results to return. If this parameter is not provided or is set to 0, the default value is 20. If the value exceeds 100, it is treated as 100. Negative values return an InvalidMaxResults error. The value can be adjusted for subsequent pages.</p>
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
         * <p>The source namespace. The match is case-sensitive and must be exact. Empty strings are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Omit this parameter for the first request. For subsequent requests, pass the nextToken value from the previous response exactly as returned. If the filter conditions change, you must query the first page again.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The product entry region, which is determined by the selected region endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name of the source repository. The match is case-insensitive and must be exact. Do not include the protocol, path, or tag. Public network and VPC domain names are not considered equal. Empty strings are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
         */
        public Builder registry(String registry) {
            this.putQueryParameter("registry", registry);
            this.registry = registry;
            return this;
        }

        /**
         * <p>The name of the repository under the namespace. The match is case-sensitive and must be exact. Do not include the namespace. If this parameter is provided, the namespace parameter must also be provided. Empty strings are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder repository(String repository) {
            this.putQueryParameter("repository", repository);
            this.repository = repository;
            return this;
        }

        /**
         * <p>Filters the results by a single cache status. Omit this parameter to query all statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag of the source image. The match is case-sensitive and must be exact. The latest tag is not inferred. Empty strings are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The current routed workspace. The server verifies the account, region, and resource ownership. This parameter cannot be omitted or used to access other workspaces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListImageCachesRequest build() {
            return new ListImageCachesRequest(this);
        } 

    } 

}
