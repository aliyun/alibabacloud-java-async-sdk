// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCloudCenterInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudCenterInstancesRequest</p>
 */
public class DescribeCloudCenterInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Flags")
    private String flags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Importance")
    private Integer importance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoGroupTrace")
    private Boolean noGroupTrace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @Deprecated
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    private DescribeCloudCenterInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.flags = builder.flags;
        this.importance = builder.importance;
        this.lang = builder.lang;
        this.logicalExp = builder.logicalExp;
        this.machineTypes = builder.machineTypes;
        this.nextToken = builder.nextToken;
        this.noGroupTrace = builder.noGroupTrace;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.useNextToken = builder.useNextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudCenterInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return flags
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * @return importance
     */
    public Integer getImportance() {
        return this.importance;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return noGroupTrace
     */
    public Boolean getNoGroupTrace() {
        return this.noGroupTrace;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public static final class Builder extends Request.Builder<DescribeCloudCenterInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String flags; 
        private Integer importance; 
        private String lang; 
        private String logicalExp; 
        private String machineTypes; 
        private String nextToken; 
        private Boolean noGroupTrace; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceDirectoryAccountId; 
        private Boolean useNextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudCenterInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.flags = request.flags;
            this.importance = request.importance;
            this.lang = request.lang;
            this.logicalExp = request.logicalExp;
            this.machineTypes = request.machineTypes;
            this.nextToken = request.nextToken;
            this.noGroupTrace = request.noGroupTrace;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.useNextToken = request.useNextToken;
        } 

        /**
         * <p>The conditions for searching assets. This parameter is in JSON format. Note that the parameter values are case-sensitive.</p>
         * <blockquote>
         * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. Call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number of the first page to return. Default value: <strong>1</strong>, which indicates that the query results are returned starting from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The asset vendor. Separate multiple asset vendors with commas (,). Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder flags(String flags) {
            this.putQueryParameter("Flags", flags);
            this.flags = flags;
            return this;
        }

        /**
         * <p>The importance level of the asset. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Important asset.</li>
         * <li><strong>1</strong>: General asset.</li>
         * <li><strong>0</strong>: Test asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder importance(Integer importance) {
            this.putQueryParameter("Importance", importance);
            this.importance = importance;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The logical relationship between multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions have an <strong>OR</strong> relationship.</li>
         * <li><strong>AND</strong>: The search conditions have an <strong>AND</strong> relationship.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The type of asset to query. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: server.</li>
         * <li><strong>cloud_product</strong>: cloud product.</li>
         * <li><strong>eci</strong>: elastic container instance.</li>
         * <li><strong>rund</strong>: RunD container instance.</li>
         * <li><strong>runc</strong>: RunC container instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>The NextToken value returned when the NextToken method is used. Leave this parameter empty for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Specifies whether to disable internationalization for the default group name <strong>未分组</strong>. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Internationalization is disabled. If the value of the GroupTrace response parameter is the default Security Center group <strong>未分组</strong>, the value is still displayed as <strong>未分组</strong>.</li>
         * <li><strong>false</strong>: Internationalization is enabled. If the value of the GroupTrace response parameter is the default Security Center group <strong>未分组</strong>, the value is displayed as <strong>default</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder noGroupTrace(Boolean noGroupTrace) {
            this.putQueryParameter("NoGroupTrace", noGroupTrace);
            this.noGroupTrace = noGroupTrace;
            return this;
        }

        /**
         * <p>The number of assets to display on each page in a paged conditional query. Default value: <strong>20</strong>, which indicates that 20 asset records are displayed on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance to query.</p>
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
         * <p>The ID of the Alibaba Cloud account that corresponds to the member account in the resource directory.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies whether to use the NextToken method to retrieve asset list data. If this parameter is set to true, TotalCount is no longer returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Uses the NextToken method.</li>
         * <li><strong>false</strong>: Does not use the NextToken method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        @Override
        public DescribeCloudCenterInstancesRequest build() {
            return new DescribeCloudCenterInstancesRequest(this);
        } 

    } 

}
