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
 * {@link ExportRecordRequest} extends {@link RequestModel}
 *
 * <p>ExportRecordRequest</p>
 */
public class ExportRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportFileType")
    private String exportFileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private ExportRecordRequest(Builder builder) {
        super(builder);
        this.exportFileType = builder.exportFileType;
        this.exportType = builder.exportType;
        this.lang = builder.lang;
        this.params = builder.params;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportFileType
     */
    public String getExportFileType() {
        return this.exportFileType;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<ExportRecordRequest, Builder> {
        private String exportFileType; 
        private String exportType; 
        private String lang; 
        private String params; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecordRequest request) {
            super(request);
            this.exportFileType = request.exportFileType;
            this.exportType = request.exportType;
            this.lang = request.lang;
            this.params = request.params;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The type of file to export. Valid values:</p>
         * <ul>
         * <li><strong>virusScanExport</strong>: Exports details of a virus scan task. This parameter is required when ExportType is set to virusScanExport.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>virusScanExport</p>
         */
        public Builder exportFileType(String exportFileType) {
            this.putQueryParameter("ExportFileType", exportFileType);
            this.exportFileType = exportFileType;
            return this;
        }

        /**
         * <p>The type of records to export. Valid values:</p>
         * <ul>
         * <li><p><strong>assetInstance</strong>: The list of servers in Asset Center</p>
         * </li>
         * <li><p><strong>user</strong>: The list of account asset fingerprints</p>
         * </li>
         * <li><p><strong>port</strong>: The list of port asset fingerprints</p>
         * </li>
         * <li><p><strong>process</strong>: The list of process asset fingerprints</p>
         * </li>
         * <li><p><strong>sca</strong>: The list of middleware asset fingerprints</p>
         * </li>
         * <li><p><strong>database</strong>: The list of database asset fingerprints</p>
         * </li>
         * <li><p><strong>web</strong>: The list of web service asset fingerprints</p>
         * </li>
         * <li><p><strong>software</strong>: The list of software asset fingerprints</p>
         * </li>
         * <li><p><strong>cron</strong>: The list of scheduled task (cron) asset fingerprints</p>
         * </li>
         * <li><p><strong>autorun</strong>: The list of startup item asset fingerprints</p>
         * </li>
         * <li><p><strong>lkm</strong>: The list of kernel module asset fingerprints</p>
         * </li>
         * <li><p><strong>webserver</strong>: The list of website asset fingerprints</p>
         * </li>
         * <li><p><strong>virusScanExport</strong>: The list of virus scan task details</p>
         * </li>
         * <li><p><strong>imageVulExport</strong>: The list of system vulnerabilities in images</p>
         * </li>
         * <li><p>imageVulExport: The list of system vulnerabilities in images</p>
         * </li>
         * <li><p><strong>imageBaseLineExport</strong>: The list of image baseline check results</p>
         * </li>
         * <li><p><strong>imageAffectedMaliciousExport</strong>: The list of malicious sample check results for images</p>
         * </li>
         * <li><p><strong>baselineCspm</strong>: The list of cloud platform configuration check results</p>
         * </li>
         * <li><p><strong>attack</strong>: The list of attack analysis alerts</p>
         * </li>
         * <li><p><strong>accessKey</strong>: The list of AK leakage detection alerts</p>
         * </li>
         * <li><p><strong>exportObjectScanEvents</strong>: The list of malicious file detection alerts</p>
         * </li>
         * <li><p><strong>domainDetail</strong>: Website assets</p>
         * </li>
         * <li><p><strong>assetsPropertyScaProcessDetail</strong>: RASP-protected processes</p>
         * </li>
         * <li><p><strong>exportHcWarning</strong>: The list of system baseline risks</p>
         * </li>
         * <li><p><strong>raspAttackAlert</strong>: The list of RASP attack alerts</p>
         * </li>
         * <li><p><strong>raspApplicationConfiguration</strong>: The list of RASP application configurations</p>
         * </li>
         * <li><p><strong>raspWeaknessDetection</strong>: The list of RASP weakness detection results</p>
         * </li>
         * <li><p><strong>raspInMemoryWebshellDetection</strong>: The list of RASP alerts for in-memory webshell detection</p>
         * </li>
         * <li><p><strong>raspInMemoryWebshellInsertion</strong>: The list of RASP alerts for in-memory webshell insertion</p>
         * </li>
         * <li><p><strong>listAgentExport</strong>: The list of agents</p>
         * </li>
         * <li><p><strong>listSkillExport</strong>: The list of skills</p>
         * </li>
         * <li><p><strong>listModelExport</strong>: The list of models</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
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
         * <p>The filter conditions for the exported content.</p>
         * <blockquote>
         * <p>This is a general-purpose operation for exporting various detection lists from Cloud Security Center. As parameter configurations vary by feature, we recommend that you omit this parameter to export the complete list. You can then filter the data in the exported Excel file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;extend&quot;:&quot;1&quot;,&quot;currentPage&quot;:1,&quot;pageSize&quot;:10}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the management account for a member in Resource Directory.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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

        @Override
        public ExportRecordRequest build() {
            return new ExportRecordRequest(this);
        } 

    } 

}
