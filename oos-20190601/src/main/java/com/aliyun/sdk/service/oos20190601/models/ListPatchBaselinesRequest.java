// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPatchBaselinesRequest} extends {@link RequestModel}
 *
 * <p>ListPatchBaselinesRequest</p>
 */
public class ListPatchBaselinesRequest extends Request {
    @Query
    @NameInMap("ApprovedPatches")
    private java.util.List < String > approvedPatches;

    @Query
    @NameInMap("ApprovedPatchesEnableNonSecurity")
    private Boolean approvedPatchesEnableNonSecurity;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OperationSystem")
    private String operationSystem;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("Sources")
    private java.util.List < String > sources;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

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
    public java.util.List < String > getApprovedPatches() {
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
    public java.util.List < String > getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListPatchBaselinesRequest, Builder> {
        private java.util.List < String > approvedPatches; 
        private Boolean approvedPatchesEnableNonSecurity; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String operationSystem; 
        private String regionId; 
        private String resourceGroupId; 
        private String shareType; 
        private java.util.List < String > sources; 
        private java.util.List < Tags> tags; 

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
         * The approved patches.
         */
        public Builder approvedPatches(java.util.List < String > approvedPatches) {
            String approvedPatchesShrink = shrink(approvedPatches, "ApprovedPatches", "json");
            this.putQueryParameter("ApprovedPatches", approvedPatchesShrink);
            this.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * Whether the approved patch includes updates other than security.
         */
        public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.putQueryParameter("ApprovedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity);
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The name of the patch baseline.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the operating system. Valid values:
         * <p>
         * 
         * *   Windows
         * *   Ubuntu
         * *   CentOS
         * *   Debian
         * *   AliyunLinux
         * *   RedhatEnterpriseLinux
         * *   Anolis
         * *   AlmaLinux
         */
        public Builder operationSystem(String operationSystem) {
            this.putQueryParameter("OperationSystem", operationSystem);
            this.operationSystem = operationSystem;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The share type of the template. Valid values:
         * <p>
         * 
         * *   **Public**
         * *   **Private**
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * The list of patch source configurations.
         */
        public Builder sources(java.util.List < String > sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
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

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
