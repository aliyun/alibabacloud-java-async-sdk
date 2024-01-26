// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportWarningRequest} extends {@link RequestModel}
 *
 * <p>ExportWarningRequest</p>
 */
public class ExportWarningRequest extends Request {
    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("ExportType")
    private String exportType;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("IsCleartextPwd")
    private Integer isCleartextPwd;

    @Query
    @NameInMap("IsSummaryExport")
    private Integer isSummaryExport;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskIds")
    private String riskIds;

    @Query
    @NameInMap("RiskLevels")
    private String riskLevels;

    @Query
    @NameInMap("RiskName")
    private String riskName;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("StrategyId")
    private Long strategyId;

    @Query
    @NameInMap("SubTypeNames")
    private String subTypeNames;

    @Query
    @NameInMap("TypeName")
    private String typeName;

    @Query
    @NameInMap("TypeNames")
    private String typeNames;

    @Query
    @NameInMap("Uuids")
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
         * Specifies whether the baseline risks are handled. Valid values:
         * <p>
         * 
         * *   **Y**: yes
         * *   **N**: no
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The type of the export task. Set the value to **hc_check_warning**, which indicates tasks to export baseline check results.
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * The ID of the server group.
         * <p>
         * 
         * >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The export method of the results for the weak password baseline check. Valid values:
         * <p>
         * 
         * *   **0**: exports the check results after it is masked.
         * *   **1**: exports the check results in plaintext.
         */
        public Builder isCleartextPwd(Integer isCleartextPwd) {
            this.putQueryParameter("IsCleartextPwd", isCleartextPwd);
            this.isCleartextPwd = isCleartextPwd;
            return this;
        }

        /**
         * Specifies whether the baseline check results are aggregated and exported. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder isSummaryExport(Integer isSummaryExport) {
            this.putQueryParameter("IsSummaryExport", isSummaryExport);
            this.isSummaryExport = isSummaryExport;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the risk item in the baseline check results. Separate multiple IDs with commas (,).
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * The severity of the baseline check item. Separate multiple severities with commas (,). Valid values:
         * <p>
         * 
         * *   **high**
         * *   **medium**
         * *   **low**
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * The name of the baseline.
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The status of the check item in the baseline check results. Separate multiple statuses with commas (,). Valid values:
         * <p>
         * 
         * *   **3**: passed
         * *   **1**: failed
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The subtypes of the baselines based on which baseline checks are performed. Separate multiple subtypes with commas (,).
         * <p>
         * 
         * > You must set the value of this parameter to the value of the **TypeName** parameter that is contained in the **SubTypes** parameter. You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to obtain the value of the TypeName parameter.
         */
        public Builder subTypeNames(String subTypeNames) {
            this.putQueryParameter("SubTypeNames", subTypeNames);
            this.subTypeNames = subTypeNames;
            return this;
        }

        /**
         * The type of the baseline based on which baseline checks are performed.
         * <p>
         * 
         * > You must set the value of this parameter to the value of the **TypeName** parameter that is returned by calling the [DescribeRiskType](~~DescribeRiskType~~) operation. If both the **TypeName** and **TypeNames** parameters are specified, only the **TypeName** parameter takes effect.
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * The types of the baselines based on which baseline checks are performed. Separate multiple types with commas (,).
         * <p>
         * 
         * > You must set the value of this parameter to the value of the **TypeName** parameter that is returned by calling the [DescribeRiskType](~~DescribeRiskType~~) operation. If both the **TypeName** and **TypeNames** parameters are specified, only the **TypeName** parameter takes effect.
         */
        public Builder typeNames(String typeNames) {
            this.putQueryParameter("TypeNames", typeNames);
            this.typeNames = typeNames;
            return this;
        }

        /**
         * The UUID of the server whose baseline check results you want to export. Separate multiple UUIDs with commas (,).
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
