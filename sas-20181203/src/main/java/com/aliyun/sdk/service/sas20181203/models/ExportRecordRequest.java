// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private ExportRecordRequest(Builder builder) {
        super(builder);
        this.exportFileType = builder.exportFileType;
        this.exportType = builder.exportType;
        this.lang = builder.lang;
        this.params = builder.params;
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

    public static final class Builder extends Request.Builder<ExportRecordRequest, Builder> {
        private String exportFileType; 
        private String exportType; 
        private String lang; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecordRequest request) {
            super(request);
            this.exportFileType = request.exportFileType;
            this.exportType = request.exportType;
            this.lang = request.lang;
            this.params = request.params;
        } 

        /**
         * The type of the file to export. Valid values:
         * <p>
         * 
         * *   **virusScanExport**: The details of the virus scan tasks are exported. This parameter is available and required when ExportType is set to virusScanExport.
         */
        public Builder exportFileType(String exportFileType) {
            this.putQueryParameter("ExportFileType", exportFileType);
            this.exportFileType = exportFileType;
            return this;
        }

        /**
         * The type of the check result list to export. Valid values:
         * <p>
         * 
         * *   **assetInstance**: the list of servers displayed on the Host page
         * *   **user**: the list of fingerprints for accounts
         * *   **port**: the list of fingerprints for ports
         * *   **process**: the list of fingerprints for processes
         * *   **sca**: the list of fingerprints for middleware assets
         * *   **database**: the list of fingerprints for databases
         * *   **web**: the list of fingerprints for web services
         * *   **software**: the list of fingerprints for software assets
         * *   **cron**: the list of fingerprints for scheduled tasks
         * *   **autorun**: the list of fingerprints for startup items
         * *   **lkm**: the list of fingerprints for kernel modules
         * *   **webserver**: the list of fingerprints for websites
         * *   **virusScanExport**: the details of the virus scan tasks
         * *   **imageVulExport**: the list of image system vulnerabilities
         * *   **imageBaseLineExport**: the list of check results for image baselines
         * *   **imageAffectedMaliciousExport**: the list of check results for malicious image samples
         * *   **baselineCspm**: the list of check results for configuration assessment
         * *   **attack**: the list of alert events for attack analysis
         * *   **accessKey**: the list of alerts that are generated for AccessKey pair leaks
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
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
         * The conditions that are used to filter check results.
         * <p>
         * 
         * > This operation is a common export operation for multiple features of Security Center. The available configuration fields of this parameter vary based on the features. We recommend that you do not specify this parameter when you call the operation. You can export an information list without specifying this parameter, and then filter data in the exported Excel file.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public ExportRecordRequest build() {
            return new ExportRecordRequest(this);
        } 

    } 

}
