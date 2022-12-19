// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningsRequest</p>
 */
public class DescribeCheckWarningsRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private Long checkId;

    @Query
    @NameInMap("CheckType")
    private String checkType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskId")
    @Validation(required = true)
    private Long riskId;

    @Query
    @NameInMap("RiskStatus")
    private Integer riskStatus;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private DescribeCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkType = builder.checkType;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
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
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
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
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskId = request.riskId;
            this.riskStatus = request.riskStatus;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * The ID of the check item.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The type of the check item. Valid values:
         * <p>
         * 
         * *   **hc.check.type.identity_auth**: identity authentication
         * *   **hc.check.type.access_control**: access control
         * *   **hc.check.type.network_service**: network and service
         * *   **hc.check.type.service_conf**: service configuration
         * *   **hc.check.type.file_rights**: file permission
         * *   **hc.check.type.security_audit**: security audit
         * *   **hc.check.type.attack_defense**: intrusion prevention
         * *   **hc.check.type.others**: others
         */
        public Builder checkType(String checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the risk item.
         * <p>
         * 
         * >  To query specified risk items and the check items of a specified server, you must provide the IDs of the risk items. You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of risk items.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * The status of the check item. Valid values:
         * <p>
         * 
         * *   **1**: failed
         * *   **2**: verifying
         * *   **3**: passed
         * *   **5**: expired
         * *   **6**: ignored
         */
        public Builder riskStatus(Integer riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
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
         * The UUID of the server on which the baseline check is performed.
         * <p>
         * 
         * >  To query specified risk items and the check items of a specified server, you must provide the ID of the server on which the baseline check is performed. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the IDs of servers.
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
