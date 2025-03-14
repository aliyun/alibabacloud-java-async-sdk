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
 * {@link DescribeCheckWarningMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningMachinesRequest</p>
 */
public class DescribeCheckWarningMachinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterUuid")
    private String filterUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

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
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeCheckWarningMachinesRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.currentPage = builder.currentPage;
        this.filterUuid = builder.filterUuid;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.riskId = builder.riskId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningMachinesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return filterUuid
     */
    public String getFilterUuid() {
        return this.filterUuid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningMachinesRequest, Builder> {
        private Long checkId; 
        private Integer currentPage; 
        private String filterUuid; 
        private String instanceId; 
        private String lang; 
        private Integer pageSize; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private Long riskId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningMachinesRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.currentPage = request.currentPage;
            this.filterUuid = request.filterUuid;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.riskId = request.riskId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
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
         * <p>The instance ID of the asset that you don&quot;t want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2f64e1a0f9316c48*******</p>
         */
        public Builder filterUuid(String filterUuid) {
            this.putQueryParameter("FilterUuid", filterUuid);
            this.filterUuid = filterUuid;
            return this;
        }

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-rv4nvbv8iju4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The information about the server that you want to query. The value can be the name or the public IP address of the server.</p>
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
         * <p>The ID of the baseline.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of baselines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The risk status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>3</strong>: passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCheckWarningMachinesRequest build() {
            return new DescribeCheckWarningMachinesRequest(this);
        } 

    } 

}
