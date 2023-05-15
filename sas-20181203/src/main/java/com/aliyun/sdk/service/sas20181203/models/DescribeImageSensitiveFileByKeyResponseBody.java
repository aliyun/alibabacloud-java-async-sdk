// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileByKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSensitiveFileByKeyResponseBody</p>
 */
public class DescribeImageSensitiveFileByKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveFileList")
    private java.util.List < SensitiveFileList> sensitiveFileList;

    @NameInMap("Success")
    private Boolean success;

    private DescribeImageSensitiveFileByKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.sensitiveFileList = builder.sensitiveFileList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSensitiveFileByKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveFileList
     */
    public java.util.List < SensitiveFileList> getSensitiveFileList() {
        return this.sensitiveFileList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < SensitiveFileList> sensitiveFileList; 
        private Boolean success; 

        /**
         * The status code returned. If the 200 status code is returned, the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the sensitive files.
         */
        public Builder sensitiveFileList(java.util.List < SensitiveFileList> sensitiveFileList) {
            this.sensitiveFileList = sensitiveFileList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageSensitiveFileByKeyResponseBody build() {
            return new DescribeImageSensitiveFileByKeyResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("LastRowKey")
        private String lastRowKey;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.lastRowKey = builder.lastRowKey;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lastRowKey
         */
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private String lastRowKey; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The key of the last data entry.
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class SensitiveFileList extends TeaModel {
        @NameInMap("Advice")
        private String advice;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("LayerDigest")
        private String layerDigest;

        @NameInMap("Promt")
        private String promt;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SensitiveFileKey")
        private String sensitiveFileKey;

        @NameInMap("SensitiveFileName")
        private String sensitiveFileName;

        private SensitiveFileList(Builder builder) {
            this.advice = builder.advice;
            this.filePath = builder.filePath;
            this.firstScanTime = builder.firstScanTime;
            this.lastScanTime = builder.lastScanTime;
            this.layerDigest = builder.layerDigest;
            this.promt = builder.promt;
            this.riskLevel = builder.riskLevel;
            this.sensitiveFileKey = builder.sensitiveFileKey;
            this.sensitiveFileName = builder.sensitiveFileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveFileList create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return layerDigest
         */
        public String getLayerDigest() {
            return this.layerDigest;
        }

        /**
         * @return promt
         */
        public String getPromt() {
            return this.promt;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sensitiveFileKey
         */
        public String getSensitiveFileKey() {
            return this.sensitiveFileKey;
        }

        /**
         * @return sensitiveFileName
         */
        public String getSensitiveFileName() {
            return this.sensitiveFileName;
        }

        public static final class Builder {
            private String advice; 
            private String filePath; 
            private Long firstScanTime; 
            private Long lastScanTime; 
            private String layerDigest; 
            private String promt; 
            private String riskLevel; 
            private String sensitiveFileKey; 
            private String sensitiveFileName; 

            /**
             * The suggestion.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * The file path.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The timestamp when the first scan was performed. Unit: milliseconds.
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * The timestamp when the last scan was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The digest of the image layer.
             */
            public Builder layerDigest(String layerDigest) {
                this.layerDigest = layerDigest;
                return this;
            }

            /**
             * The sensitive content.
             */
            public Builder promt(String promt) {
                this.promt = promt;
                return this;
            }

            /**
             * The risk level of the sensitive file. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The alert type of the sensitive file. Valid values:
             * <p>
             * 
             * *   **npm_token**: NPM Token
             * *   **ftp_cfg**: FTP Config
             * *   **google_oauth_key**: Google OAuth Key
             * *   **planetscale_passwd**: Planetscale password
             * *   **github_ssh_key**: Github SSH Key
             * *   **msbuild_publish_profile**: MSBuild publish profile
             * *   **fastly_cdn_token**: Fastly CDN Token
             * *   **ssh_private_key**: SSH Private Key
             * *   **aws_cli**: AWS CLI Credentials
             * *   **cpanel_proftpd**: cPanel ProFTPd Credential
             * *   **postgresql_passwd**: PostgreSQl Passwd
             * *   **discord_client_cred**: Discord Client Credential
             * *   **rails_database**: Rails Database Config
             * *   **aws_access_key**: AWS Access Key
             * *   **esmtp_cfg**: ESMTP Config
             * *   **docker_registry_cfg**: Docker Registry Config
             * *   **pem**: PEM
             * *   **common_cred**: Common Credential
             * *   **sftp_cfg**: SFTP Config
             * *   **grafana_token**: Grafana Token
             * *   **slack_token**: Slack Token
             * *   **ec_private_key**: EC Private Key
             * *   **pypi_token**: PyPI Token
             * *   **finicity_token**: Finicity Token
             * *   **k8s_client_key**: Kubernetes Client Key
             * *   **git_cfg**: Git Config
             * *   **django_key**: Django Key
             * *   **jenkins_ssh**: Jenkins SSH Config
             * *   **openssh_private_key**: OPENSSH Private Key
             * *   **square_oauth**: Square OAuth Token
             * *   **typeform_token**: Typeform Token
             * *   **common_database_cfg**: Common Database Config
             * *   **wordpress_database_cfg**: Wordpress Database Config
             * *   **googlecloud_api_key**: Google Cloud API Key
             * *   **vscode_sftp**: VSCode SFTP Config
             * *   **apache_htpasswd**: Apache htpasswd
             * *   **planetscale_token**: Planetscale Token
             * *   **contentful_preview_token**: Contentful Preview Token
             * *   **php_database_cfg**: PHP Database Config
             * *   **atom_remote_sync**: Atom Remote Sync Config
             * *   **aws_session_token**: AWS Session Token
             * *   **atom_sftp_cfg**: Atom SFTP Config
             * *   **asana_client_private_key**: Asana Client Private Key
             * *   **tencentcloud_ak**: Tencent Cloud SecretId
             * *   **rsa_private_key**: RSA Private Key
             * *   **github_personal_token**: Github Personal Token
             * *   **pgp**: PGP
             * *   **stripe_skpk**: Stripe Secret Key
             * *   **square_token**: Square Token
             * *   **rails_carrierwave**: Rails Carrierwave Credential
             * *   **dbeaver_database_cfg**: DBeaver Database Config
             * *   **robomongo_cred**: Robomongo Credential
             * *   **github_oauth_token**: Github OAuth Token
             * *   **pulumi_token**: Pulumi Token
             * *   **ventrilo_voip**: Ventrilo VoIP Server Config
             * *   **macos_keychain**: macOS Keychain
             * *   **amazon_mws_token**: Amazon MWS Token
             * *   **dynatrace_token**: Dynatrace Token
             * *   **java_keystore**: Java Keystore
             * *   **microsoft_sdf**: Microsoft SDF
             * *   **kubernetes_dashboard_cred**: Kubernetes Dashboard User Credential
             * *   **atlassian_token**: Atlassian Token
             * *   **rdp**: RDP
             * *   **mailgun_key**: Mailgun Webhook Signing Key
             * *   **mailchimp_api_key**: Mailchimp API Key
             * *   **netrc_cfg**: .netrc config
             * *   **openvpn_cfg**: OpenVPN Config
             * *   **github_refresh_token**: Github Refresh Token
             * *   **salesforce**: Salesforce Credential
             * *   **sendinblue**: Sendinblue Token
             * *   **pkcs_private_key**: PKCS Private Key
             * *   **rubyonrails_passwd**: Ruby on Rails Passwd
             * *   **filezilla_ftp**: FileZilla FTP Config
             * *   **databricks_token**: Databricks Token
             * *   **gitLab_personal_token**: GitLab Personal Token
             * *   **rails_master_key**: Rails Master Key
             * *   **sqlite**: SQLite3/SQLite Database
             * *   **firefox_logins**: Firefox Login Config
             * *   **mailgun_private_token**: Mailgun Private Token
             * *   **joomla_cfg**: Joomla Config
             * *   **hashicorp_terraform_token**: Hashicorp Terraform Token
             * *   **jetbrains_ides**: Jetbrains IDEs Config
             * *   **heroku_api_key**: Heroku API key
             * *   **messagebird_token**: MessageBird Token
             * *   **github_app_token**: Github App Token
             * *   **hashicorp_vault_token**: Hashicorp Vault Token
             * *   **pgp_private_key**: PGP Private Key
             * *   **sshpasswd**: SSH password
             * *   **huaweicloud_ak**: Huaei Cloud Access Key
             * *   **aws_s3cmd**: AWS S3cmd Config
             * *   **php_config**: php Config
             * *   **common_private_key**: Common Private Key Type
             * *   **microsoft_mdf**: Microsoft MDF
             * *   **mediawiki_cfg**: MediaWiki Config
             * *   **jenkins_cred**: Jenkins Credential
             * *   **rubygems_cred**: Rubygems Credential
             * *   **clojars_token**: Clojars Token
             * *   **phoenix_web_passwd**: Phoenix Web Credential
             * *   **puttygen_private_key**: PuTTYgen Private Key
             * *   **google_oauth_token**: Google Oauth Token
             * *   **rubyonrails_cfg**: Ruby On Rails Database Config
             * *   **lob_api_key**: Lob API Key
             * *   **pkcs_cred**: PKCS#12
             * *   **otr_private_key**: OTR Private Key
             * *   **contentful_delivery_token**: Contentful Delivery Token
             * *   **digital_ocean_tugboat**: Digital Ocean Tugboat Config
             * *   **dsa_private_key**: DSA Private Key
             * *   **rails_app_token**: Rails App Token
             * *   **git_cred**: Git User Credential
             * *   **newrelic_api_key**: New Relic User API Key
             * *   **github_hub**: Github Token
             * *   **rubygem**: Rubygem Token
             */
            public Builder sensitiveFileKey(String sensitiveFileKey) {
                this.sensitiveFileKey = sensitiveFileKey;
                return this;
            }

            /**
             * The alert type name of the sensitive file.
             */
            public Builder sensitiveFileName(String sensitiveFileName) {
                this.sensitiveFileName = sensitiveFileName;
                return this;
            }

            public SensitiveFileList build() {
                return new SensitiveFileList(this);
            } 

        } 

    }
}
