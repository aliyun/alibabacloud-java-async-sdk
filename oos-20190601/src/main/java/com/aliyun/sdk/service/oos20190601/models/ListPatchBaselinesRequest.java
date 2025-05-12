// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListPatchBaselinesRequest} extends {@link RequestModel}
 *
 * <p>ListPatchBaselinesRequest</p>
 */
public class ListPatchBaselinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovedPatches")
    private java.util.List<String> approvedPatches;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovedPatchesEnableNonSecurity")
    private Boolean approvedPatchesEnableNonSecurity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationSystem")
    private String operationSystem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List<String> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListPatchBaselinesRequest(Builder builder) {
        super(builder);
        this.approvedPatches = builder.approvedPatches;
        this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.operationSystem = builder.operationSystem;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareType = builder.shareType;
        this.sources = builder.sources;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPatchBaselinesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvedPatches
     */
    public java.util.List<String> getApprovedPatches() {
        return this.approvedPatches;
    }

    /**
     * @return approvedPatchesEnableNonSecurity
     */
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operationSystem
     */
    public String getOperationSystem() {
        return this.operationSystem;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return sources
     */
    public java.util.List<String> getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListPatchBaselinesRequest, Builder> {
        private java.util.List<String> approvedPatches; 
        private Boolean approvedPatchesEnableNonSecurity; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String operationSystem; 
        private String regionId; 
        private String resourceGroupId; 
        private String shareType; 
        private java.util.List<String> sources; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListPatchBaselinesRequest request) {
            super(request);
            this.approvedPatches = request.approvedPatches;
            this.approvedPatchesEnableNonSecurity = request.approvedPatchesEnableNonSecurity;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.operationSystem = request.operationSystem;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.shareType = request.shareType;
            this.sources = request.sources;
            this.tags = request.tags;
        } 

        /**
         * <p>The approved patches.</p>
         */
        public Builder approvedPatches(java.util.List<String> approvedPatches) {
            String approvedPatchesShrink = shrink(approvedPatches, "ApprovedPatches", "json");
            this.putQueryParameter("ApprovedPatches", approvedPatchesShrink);
            this.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * <p>Specifies whether the approved patch involves updates other than security-related updates.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.putQueryParameter("ApprovedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity);
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>MyPatchBaseline</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Ubuntu</li>
         * <li>CentOS</li>
         * <li>Debian</li>
         * <li>AliyunLinux</li>
         * <li>RedhatEnterpriseLinux</li>
         * <li>Anolis</li>
         * <li>AlmaLinux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        public Builder operationSystem(String operationSystem) {
            this.putQueryParameter("OperationSystem", operationSystem);
            this.operationSystem = operationSystem;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The share type of the template. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The patch source configurations.</p>
         */
        public Builder sources(java.util.List<String> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListPatchBaselinesRequest build() {
            return new ListPatchBaselinesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPatchBaselinesRequest} extends {@link TeaModel}
     *
     * <p>ListPatchBaselinesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
