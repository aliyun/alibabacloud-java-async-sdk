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
         * <p>The type of the file to export. Valid values:</p>
         * <ul>
         * <li><strong>virusScanExport</strong>: The details of the virus scan tasks are exported. This parameter is available and required when ExportType is set to virusScanExport.</li>
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
         * <p>The type of the check result list that you want to export. Valid values:</p>
         * <ul>
         * <li><strong>assetInstance</strong>: the list of servers displayed on the Host page</li>
         * <li><strong>user</strong>: the list of fingerprints for accounts</li>
         * <li><strong>port</strong>: the list of fingerprints for ports</li>
         * <li><strong>process</strong>: the list of fingerprints for processes</li>
         * <li><strong>sca</strong>: the list of fingerprints for middleware assets</li>
         * <li><strong>database</strong>: the list of fingerprints for databases</li>
         * <li><strong>web</strong>: the list of fingerprints for web services</li>
         * <li><strong>software</strong>: the list of fingerprints for software assets</li>
         * <li><strong>cron</strong>: the list of fingerprints for scheduled tasks</li>
         * <li><strong>autorun</strong>: the list of fingerprints for startup items</li>
         * <li><strong>lkm</strong>: the list of fingerprints for kernel modules</li>
         * <li><strong>webserver</strong>: the list of fingerprints for websites</li>
         * <li><strong>virusScanExport</strong>: the details of the virus scan tasks</li>
         * <li><strong>imageVulExport</strong>: the list of image system vulnerabilities</li>
         * <li><strong>imageBaseLineExport</strong>: the list of check results for image baselines</li>
         * <li><strong>imageAffectedMaliciousExport</strong>: the list of check results for malicious image samples</li>
         * <li><strong>baselineCspm</strong>: the list of check results for configuration assessment</li>
         * <li><strong>attack</strong>: the list of alert events for attack analysis</li>
         * <li><strong>accessKey</strong>: the list of alerts that are generated for AccessKey pair leaks</li>
         * <li><strong>exportObjectScanEvents</strong>: the list of alerts generated for malicious files</li>
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
         * <p>The conditions that are used to filter check results.</p>
         * <blockquote>
         * <p>This operation is a common export operation for multiple features of Security Center. The available configuration fields of this parameter vary based on the features. We recommend that you do not specify this parameter when you call the operation. You can export an information list without specifying this parameter, and then filter data in the exported Excel file.</p>
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

        @Override
        public ExportRecordRequest build() {
            return new ExportRecordRequest(this);
        } 

    } 

}
