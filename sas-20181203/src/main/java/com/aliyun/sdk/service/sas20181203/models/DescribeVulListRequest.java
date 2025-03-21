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
 * {@link DescribeVulListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulListRequest</p>
 */
public class DescribeVulListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachTypes")
    private String attachTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private String statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    private DescribeVulListRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.attachTypes = builder.attachTypes;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.name = builder.name;
        this.necessity = builder.necessity;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.statusList = builder.statusList;
        this.type = builder.type;
        this.useNextToken = builder.useNextToken;
        this.uuids = builder.uuids;
        this.vpcInstanceIds = builder.vpcInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return attachTypes
     */
    public String getAttachTypes() {
        return this.attachTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return vpcInstanceIds
     */
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    public static final class Builder extends Request.Builder<DescribeVulListRequest, Builder> {
        private String aliasName; 
        private String attachTypes; 
        private Integer currentPage; 
        private String dealed; 
        private String groupId; 
        private String ids; 
        private String lang; 
        private String name; 
        private String necessity; 
        private String nextToken; 
        private Integer pageSize; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private String statusList; 
        private String type; 
        private Boolean useNextToken; 
        private String uuids; 
        private String vpcInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulListRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.attachTypes = request.attachTypes;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.ids = request.ids;
            this.lang = request.lang;
            this.name = request.name;
            this.necessity = request.necessity;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statusList = request.statusList;
            this.type = request.type;
            this.useNextToken = request.useNextToken;
            this.uuids = request.uuids;
            this.vpcInstanceIds = request.vpcInstanceIds;
        } 

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:0230-Important: polkit security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. Set the value to <strong>sca</strong>. If you set <strong>Type</strong> to <strong>app</strong>, you must specify this parameter.</p>
         * <blockquote>
         * <p>If you set this parameter to <strong>sca</strong>, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>Specifies whether the vulnerabilities are fixed. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: yes</li>
         * <li><strong>n</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9207613</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The IDs of vulnerabilities. You can specify up to 50 IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>282,281,283</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20172836</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high</li>
         * <li><strong>later</strong>: medium</li>
         * <li><strong>nntf</strong>: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap,later,nntf</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken. You do not need to specify this parameter for the first request.</p>
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
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
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
         * <p>The status of the vulnerability. Separate multiple statuses with commas (,). Valid values:</p>
         * <ul>
         * <li>1: unfixed</li>
         * <li>2: fix failed</li>
         * <li>3: rollback failed</li>
         * <li>4: being fixed</li>
         * <li>5: being rolled back</li>
         * <li>6: being verified</li>
         * <li>7: fixed</li>
         * <li>8: fixed and to be restarted</li>
         * <li>9: rolled back</li>
         * <li>10: ignored</li>
         * <li>11: rolled back and to be restarted</li>
         * <li>12: not found</li>
         * <li>20: expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>app</strong>: application vulnerability that is detected by using web scanner</li>
         * <li><strong>emg</strong>: urgent vulnerability.</li>
         * <li><strong>sca</strong>: application vulnerability that is detected by using software component analysis</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies whether to use NextToken to query the data of vulnerabilities. If you set UseNextToken to true, the value of TotalCount is not returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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

        /**
         * <p>The UUIDs of the servers on which you want to query the vulnerabilities. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUIDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1587bedb-fdb4-48c4-9330-****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ins-133****,ins-5414****</p>
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        @Override
        public DescribeVulListRequest build() {
            return new DescribeVulListRequest(this);
        } 

    } 

}
