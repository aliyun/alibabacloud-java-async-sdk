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
 * {@link ExportWarningRequest} extends {@link RequestModel}
 *
 * <p>ExportWarningRequest</p>
 */
public class ExportWarningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCleartextPwd")
    private Integer isCleartextPwd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSummaryExport")
    private Integer isSummaryExport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskIds")
    private String riskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private String riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskName")
    private String riskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private String statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTypeNames")
    private String subTypeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeNames")
    private String typeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ExportWarningRequest(Builder builder) {
        super(builder);
        this.dealed = builder.dealed;
        this.exportType = builder.exportType;
        this.groupId = builder.groupId;
        this.isCleartextPwd = builder.isCleartextPwd;
        this.isSummaryExport = builder.isSummaryExport;
        this.lang = builder.lang;
        this.riskIds = builder.riskIds;
        this.riskLevels = builder.riskLevels;
        this.riskName = builder.riskName;
        this.sourceIp = builder.sourceIp;
        this.statusList = builder.statusList;
        this.strategyId = builder.strategyId;
        this.subTypeNames = builder.subTypeNames;
        this.typeName = builder.typeName;
        this.typeNames = builder.typeNames;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportWarningRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return isCleartextPwd
     */
    public Integer getIsCleartextPwd() {
        return this.isCleartextPwd;
    }

    /**
     * @return isSummaryExport
     */
    public Integer getIsSummaryExport() {
        return this.isSummaryExport;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return riskIds
     */
    public String getRiskIds() {
        return this.riskIds;
    }

    /**
     * @return riskLevels
     */
    public String getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return subTypeNames
     */
    public String getSubTypeNames() {
        return this.subTypeNames;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return typeNames
     */
    public String getTypeNames() {
        return this.typeNames;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ExportWarningRequest, Builder> {
        private String dealed; 
        private String exportType; 
        private Long groupId; 
        private Integer isCleartextPwd; 
        private Integer isSummaryExport; 
        private String lang; 
        private String riskIds; 
        private String riskLevels; 
        private String riskName; 
        private String sourceIp; 
        private String statusList; 
        private Long strategyId; 
        private String subTypeNames; 
        private String typeName; 
        private String typeNames; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ExportWarningRequest request) {
            super(request);
            this.dealed = request.dealed;
            this.exportType = request.exportType;
            this.groupId = request.groupId;
            this.isCleartextPwd = request.isCleartextPwd;
            this.isSummaryExport = request.isSummaryExport;
            this.lang = request.lang;
            this.riskIds = request.riskIds;
            this.riskLevels = request.riskLevels;
            this.riskName = request.riskName;
            this.sourceIp = request.sourceIp;
            this.statusList = request.statusList;
            this.strategyId = request.strategyId;
            this.subTypeNames = request.subTypeNames;
            this.typeName = request.typeName;
            this.typeNames = request.typeNames;
            this.uuids = request.uuids;
        } 

        /**
         * <p>Specifies whether the baseline issue is handled. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: The issue is handled.</li>
         * <li><strong>N</strong>: The issue is not handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The type of the export task. Set the value to <strong>hc_check_warning</strong>, which indicates exporting baseline check results.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_check_warning</p>
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain the ID of the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>13007754</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies the export method for weak password baseline check results. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Weak passwords are masked before export.</li>
         * <li><strong>1</strong>: Weak passwords are exported in plaintext.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isCleartextPwd(Integer isCleartextPwd) {
            this.putQueryParameter("IsCleartextPwd", isCleartextPwd);
            this.isCleartextPwd = isCleartextPwd;
            return this;
        }

        /**
         * <p>Specifies whether to export the baseline check results in summary mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The results are not exported in summary mode.</li>
         * <li><strong>1</strong>: The results are exported in summary mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isSummaryExport(Integer isSummaryExport) {
            this.putQueryParameter("IsSummaryExport", isSummaryExport);
            this.isSummaryExport = isSummaryExport;
            return this;
        }

        /**
         * <p>Specifies the language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The IDs of the risk items in the baseline check results. Separate multiple risk item IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123,124</p>
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * <p>The risk levels of the baselines. Separate multiple risk levels with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High</li>
         * <li><strong>medium</strong>: Medium</li>
         * <li><strong>low</strong>: Low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high,medium</p>
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Standard - Windows 2016/2019  Security Baseline</p>
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The statuses of the risk items in the baseline check results. Separate multiple status values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Passed</li>
         * <li><strong>1</strong>: Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,3</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>Specifies the baseline subtypes to which the baseline check results to be exported belong. Separate multiple subtypes with commas (,).</p>
         * <blockquote>
         * <p>The value is the <strong>TypeName</strong> field under the <strong>SubTypes</strong> field returned by the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc_middleware_ack_master</p>
         */
        public Builder subTypeNames(String subTypeNames) {
            this.putQueryParameter("SubTypeNames", subTypeNames);
            this.subTypeNames = subTypeNames;
            return this;
        }

        /**
         * <p>Specifies the baseline type to which the baseline check results to be exported belong.</p>
         * <blockquote>
         * <p>The value is the <strong>TypeName</strong> field returned by the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation. If both <strong>TypeName</strong> and <strong>TypeNames</strong> are specified, only <strong>TypeName</strong> takes effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc_container</p>
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * <p>Specifies the baseline types to which the baseline check results to be exported belong. Separate multiple types with commas (,).</p>
         * <blockquote>
         * <p>The value is the <strong>TypeName</strong> field returned by the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation. If both <strong>TypeName</strong> and <strong>TypeNames</strong> are specified, only <strong>TypeName</strong> takes effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc_container,cis</p>
         */
        public Builder typeNames(String typeNames) {
            this.putQueryParameter("TypeNames", typeNames);
            this.typeNames = typeNames;
            return this;
        }

        /**
         * <p>The UUIDs of the server assets for which you want to export the baseline check results. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>inet-7c676676-06fa-442e-90fb-b802e****,inet-7c676676-06fa-442e-90fb-b****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ExportWarningRequest build() {
            return new ExportWarningRequest(this);
        } 

    } 

}
