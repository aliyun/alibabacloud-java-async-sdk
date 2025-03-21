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
 * {@link DescribeCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningsRequest</p>
 */
public class DescribeCheckWarningsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    private String checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskStatus")
    private Integer riskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DescribeCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkType = builder.checkType;
        this.containerName = builder.containerName;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.riskId = builder.riskId;
        this.riskStatus = builder.riskStatus;
        this.sourceIp = builder.sourceIp;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningsRequest create() {
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
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return riskStatus
     */
    public Integer getRiskStatus() {
        return this.riskStatus;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningsRequest, Builder> {
        private Long checkId; 
        private String checkType; 
        private String containerName; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private Long riskId; 
        private Integer riskStatus; 
        private String sourceIp; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningsRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.checkType = request.checkType;
            this.containerName = request.containerName;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.riskId = request.riskId;
            this.riskStatus = request.riskStatus;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>2546</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The type of the check item. Valid values:</p>
         * <ul>
         * <li><strong>hc.check.type.identity_auth</strong>: identity authentication</li>
         * <li><strong>hc.check.type.access_control</strong>: access control</li>
         * <li><strong>hc.check.type.network_service</strong>: network and service</li>
         * <li><strong>hc.check.type.service_conf</strong>: service configuration</li>
         * <li><strong>hc.check.type.file_rights</strong>: file permission</li>
         * <li><strong>hc.check.type.security_audit</strong>: security audit</li>
         * <li><strong>hc.check.type.attack_defense</strong>: intrusion prevention</li>
         * <li><strong>hc.check.type.others</strong>: others</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hc.check.type.attack_defense</p>
         */
        public Builder checkType(String checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/redis</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
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
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> To obtain the Alibaba Cloud account ID, call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The ID of the risk item. This parameter is required.</p>
         * <blockquote>
         * <p> To query the information about the risk items and check items of a server, you must specify the IDs of the risk items. You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10354</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>2</strong>: verifying</li>
         * <li><strong>3</strong>: passed</li>
         * <li><strong>5</strong>: expired</li>
         * <li><strong>6</strong>: ignored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskStatus(Integer riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The UUID of the server on which the baseline check is performed.</p>
         * <blockquote>
         * <p>To query specified risk items and the check items of a specified server, you must provide the ID of the server on which the baseline check is performed. You can call the <a href="~~DescribeWarningMachines~~">DescribeWarningMachines</a> operation to query the IDs of servers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d42f938c-d962-48a0-90f9-05****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeCheckWarningsRequest build() {
            return new DescribeCheckWarningsRequest(this);
        } 

    } 

}
