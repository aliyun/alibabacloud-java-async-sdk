// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeCloudSiemAssetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudSiemAssetsRequest</p>
 */
public class DescribeCloudSiemAssetsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetUuid")
    private String assetUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private DescribeCloudSiemAssetsRequest(Builder builder) {
        super(builder);
        this.assetName = builder.assetName;
        this.assetType = builder.assetType;
        this.assetUuid = builder.assetUuid;
        this.currentPage = builder.currentPage;
        this.incidentUuid = builder.incidentUuid;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return assetUuid
     */
    public String getAssetUuid() {
        return this.assetUuid;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeCloudSiemAssetsRequest, Builder> {
        private String assetName; 
        private String assetType; 
        private String assetUuid; 
        private Integer currentPage; 
        private String incidentUuid; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudSiemAssetsRequest request) {
            super(request);
            this.assetName = request.assetName;
            this.assetType = request.assetType;
            this.assetUuid = request.assetUuid;
            this.currentPage = request.currentPage;
            this.incidentUuid = request.incidentUuid;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * AssetName.
         */
        public Builder assetName(String assetName) {
            this.putBodyParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li>ip</li>
         * <li>domain</li>
         * <li>url</li>
         * <li>process</li>
         * <li>file</li>
         * <li>host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder assetType(String assetType) {
            this.putBodyParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * AssetUuid.
         */
        public Builder assetUuid(String assetUuid) {
            this.putBodyParameter("AssetUuid", assetUuid);
            this.assetUuid = assetUuid;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeCloudSiemAssetsRequest build() {
            return new DescribeCloudSiemAssetsRequest(this);
        } 

    } 

}
