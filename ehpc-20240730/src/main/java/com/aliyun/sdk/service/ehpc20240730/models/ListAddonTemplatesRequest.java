// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link ListAddonTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListAddonTemplatesRequest</p>
 */
public class ListAddonTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonNames")
    private java.util.List<String> addonNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCategory")
    private String clusterCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListAddonTemplatesRequest(Builder builder) {
        super(builder);
        this.addonNames = builder.addonNames;
        this.clusterCategory = builder.clusterCategory;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonNames
     */
    public java.util.List<String> getAddonNames() {
        return this.addonNames;
    }

    /**
     * @return clusterCategory
     */
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAddonTemplatesRequest, Builder> {
        private java.util.List<String> addonNames; 
        private String clusterCategory; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAddonTemplatesRequest request) {
            super(request);
            this.addonNames = request.addonNames;
            this.clusterCategory = request.clusterCategory;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The addon names.</p>
         */
        public Builder addonNames(java.util.List<String> addonNames) {
            this.putQueryParameter("AddonNames", addonNames);
            this.addonNames = addonNames;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li>Standard</li>
         * <li>Serverless</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder clusterCategory(String clusterCategory) {
            this.putQueryParameter("ClusterCategory", clusterCategory);
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAddonTemplatesRequest build() {
            return new ListAddonTemplatesRequest(this);
        } 

    } 

}
