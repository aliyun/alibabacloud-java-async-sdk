// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeVulDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulDesktopsRequest</p>
 */
public class DescribeVulDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveId")
    private String cveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIdList")
    private java.util.List<String> desktopIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeFixResult")
    private Boolean includeFixResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyCurrentMonthFixAttempted")
    private Boolean onlyCurrentMonthFixAttempted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchId")
    private String patchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulLevel")
    private String vulLevel;

    private DescribeVulDesktopsRequest(Builder builder) {
        super(builder);
        this.cveId = builder.cveId;
        this.desktopIdList = builder.desktopIdList;
        this.includeFixResult = builder.includeFixResult;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.onlyCurrentMonthFixAttempted = builder.onlyCurrentMonthFixAttempted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patchId = builder.patchId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.searchRegionId = builder.searchRegionId;
        this.statusList = builder.statusList;
        this.vulLevel = builder.vulLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cveId
     */
    public String getCveId() {
        return this.cveId;
    }

    /**
     * @return desktopIdList
     */
    public java.util.List<String> getDesktopIdList() {
        return this.desktopIdList;
    }

    /**
     * @return includeFixResult
     */
    public Boolean getIncludeFixResult() {
        return this.includeFixResult;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return onlyCurrentMonthFixAttempted
     */
    public Boolean getOnlyCurrentMonthFixAttempted() {
        return this.onlyCurrentMonthFixAttempted;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patchId
     */
    public String getPatchId() {
        return this.patchId;
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
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return vulLevel
     */
    public String getVulLevel() {
        return this.vulLevel;
    }

    public static final class Builder extends Request.Builder<DescribeVulDesktopsRequest, Builder> {
        private String cveId; 
        private java.util.List<String> desktopIdList; 
        private Boolean includeFixResult; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private Boolean onlyCurrentMonthFixAttempted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String patchId; 
        private String regionId; 
        private String resourceGroupId; 
        private String searchRegionId; 
        private java.util.List<String> statusList; 
        private String vulLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulDesktopsRequest request) {
            super(request);
            this.cveId = request.cveId;
            this.desktopIdList = request.desktopIdList;
            this.includeFixResult = request.includeFixResult;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.onlyCurrentMonthFixAttempted = request.onlyCurrentMonthFixAttempted;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.patchId = request.patchId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.searchRegionId = request.searchRegionId;
            this.statusList = request.statusList;
            this.vulLevel = request.vulLevel;
        } 

        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-43284</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>The list of cloud computer IDs.</p>
         */
        public Builder desktopIdList(java.util.List<String> desktopIdList) {
            this.putQueryParameter("DesktopIdList", desktopIdList);
            this.desktopIdList = desktopIdList;
            return this;
        }

        /**
         * <p>Specifies whether to include patch update results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeFixResult(Boolean includeFixResult) {
            this.putQueryParameter("IncludeFixResult", includeFixResult);
            this.includeFixResult = includeFixResult;
            return this;
        }

        /**
         * <p>The language type of the returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>ch</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Specifies whether to include only cloud computers on which fix tasks were executed in the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyCurrentMonthFixAttempted(Boolean onlyCurrentMonthFixAttempted) {
            this.putQueryParameter("OnlyCurrentMonthFixAttempted", onlyCurrentMonthFixAttempted);
            this.onlyCurrentMonthFixAttempted = onlyCurrentMonthFixAttempted;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The patch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>KB5082063</p>
         */
        public Builder patchId(String patchId) {
            this.putQueryParameter("PatchId", patchId);
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-f3s3dgt8dtb0vlqc8</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The region ID used to filter cloud computer information for a specific region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * <p>The list of vulnerability status details.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The security level of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>low</strong>: Low risk.</li>
         * <li><strong>medium</strong>: Medium risk.</li>
         * <li><strong>critical</strong>: High risk.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not set this parameter, vulnerabilities of all security levels are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder vulLevel(String vulLevel) {
            this.putQueryParameter("VulLevel", vulLevel);
            this.vulLevel = vulLevel;
            return this;
        }

        @Override
        public DescribeVulDesktopsRequest build() {
            return new DescribeVulDesktopsRequest(this);
        } 

    } 

}
