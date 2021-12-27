// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {
        private String dealed; 
        private String exportType; 
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

        /**
         * <p>Dealed.</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>ExportType.</p>
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>IsCleartextPwd.</p>
         */
        public Builder isCleartextPwd(Integer isCleartextPwd) {
            this.putQueryParameter("IsCleartextPwd", isCleartextPwd);
            this.isCleartextPwd = isCleartextPwd;
            return this;
        }

        /**
         * <p>IsSummaryExport.</p>
         */
        public Builder isSummaryExport(Integer isSummaryExport) {
            this.putQueryParameter("IsSummaryExport", isSummaryExport);
            this.isSummaryExport = isSummaryExport;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>RiskIds.</p>
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * <p>RiskLevels.</p>
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * <p>RiskName.</p>
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>StatusList.</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>StrategyId.</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>SubTypeNames.</p>
         */
        public Builder subTypeNames(String subTypeNames) {
            this.putQueryParameter("SubTypeNames", subTypeNames);
            this.subTypeNames = subTypeNames;
            return this;
        }

        /**
         * <p>TypeName.</p>
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * <p>TypeNames.</p>
         */
        public Builder typeNames(String typeNames) {
            this.putQueryParameter("TypeNames", typeNames);
            this.typeNames = typeNames;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public ExportWarningRequest build() {
            return new ExportWarningRequest(this);
        } 

    } 

}
