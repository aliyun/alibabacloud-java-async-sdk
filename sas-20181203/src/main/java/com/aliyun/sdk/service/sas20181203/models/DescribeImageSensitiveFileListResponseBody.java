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
 * {@link DescribeImageSensitiveFileListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSensitiveFileListResponseBody</p>
 */
public class DescribeImageSensitiveFileListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveFileList")
    private java.util.List<SensitiveFileList> sensitiveFileList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeImageSensitiveFileListResponseBody(Builder builder) {
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

    public static DescribeImageSensitiveFileListResponseBody create() {
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
    public java.util.List<SensitiveFileList> getSensitiveFileList() {
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
        private java.util.List<SensitiveFileList> sensitiveFileList; 
        private Boolean success; 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8D19A089-E6BC-5244-800C-7E590D50487F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information about the sensitive files.</p>
         */
        public Builder sensitiveFileList(java.util.List<SensitiveFileList> sensitiveFileList) {
            this.sensitiveFileList = sensitiveFileList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageSensitiveFileListResponseBody build() {
            return new DescribeImageSensitiveFileListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageSensitiveFileListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSensitiveFileListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LastRowKey")
        private String lastRowKey;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The key of the last data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2NDc4NjE=</p>
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
    /**
     * 
     * {@link DescribeImageSensitiveFileListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSensitiveFileListResponseBody</p>
     */
    public static class SensitiveFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("ClassKey")
        private String classKey;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveFileKey")
        private String sensitiveFileKey;

        @com.aliyun.core.annotation.NameInMap("SensitiveFileName")
        private String sensitiveFileName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UnprocessedNum")
        private Integer unprocessedNum;

        private SensitiveFileList(Builder builder) {
            this.advice = builder.advice;
            this.classKey = builder.classKey;
            this.className = builder.className;
            this.count = builder.count;
            this.description = builder.description;
            this.firstScanTime = builder.firstScanTime;
            this.lastScanTime = builder.lastScanTime;
            this.riskLevel = builder.riskLevel;
            this.sensitiveFileKey = builder.sensitiveFileKey;
            this.sensitiveFileName = builder.sensitiveFileName;
            this.status = builder.status;
            this.unprocessedNum = builder.unprocessedNum;
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
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return unprocessedNum
         */
        public Integer getUnprocessedNum() {
            return this.unprocessedNum;
        }

        public static final class Builder {
            private String advice; 
            private String classKey; 
            private String className; 
            private Integer count; 
            private String description; 
            private Long firstScanTime; 
            private Long lastScanTime; 
            private String riskLevel; 
            private String sensitiveFileKey; 
            private String sensitiveFileName; 
            private Integer status; 
            private Integer unprocessedNum; 

            /**
             * <p>The suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Assess risks based on business conditions, remove risky content.</p>
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The key of the sensitive file type.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * <p>The name of the sensitive file type.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * <p>The number of scans that are performed on the sensitive file.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The description of the sensitive file.</p>
             * 
             * <strong>example:</strong>
             * <p>Verify the validity of the leaked AK.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1663321552000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1663321552000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The type of the alert for the sensitive file. Valid values:</p>
             * <ul>
             * <li><strong>npm_token</strong>: Node Package Manager (NPM) access token.</li>
             * <li><strong>ftp_cfg</strong>: FTP configuration.</li>
             * <li><strong>google_oauth_key</strong>: Google OAuth key.</li>
             * <li><strong>planetscale_passwd</strong>: PlanetScale password.</li>
             * <li><strong>github_ssh_key</strong>: GitHub SSH key.</li>
             * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile.</li>
             * <li><strong>fastly_cdn_token</strong>: Fastly CDN token.</li>
             * <li><strong>ssh_private_key</strong>: SSH private key.</li>
             * <li><strong>aws_cli</strong>: Amazon Web Services (AWS) CLI credential.</li>
             * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPD credential.</li>
             * <li><strong>postgresql_passwd</strong>: PostgreSQL password file.</li>
             * <li><strong>discord_client_cred</strong>: Discord client credential.</li>
             * <li><strong>rails_database</strong>: Rails database configuration.</li>
             * <li><strong>aws_access_key</strong>: AWS access key.</li>
             * <li><strong>esmtp_cfg</strong>: Extended Simple Mail Transfer Protocol (ESMTP) configuration.</li>
             * <li><strong>docker_registry_cfg</strong>: Docker image repository configuration.</li>
             * <li><strong>pem</strong>: Privacy-Enhanced Mail (PEM).</li>
             * <li><strong>common_cred</strong>: common credential.</li>
             * <li><strong>sftp_cfg</strong>: Secure File Transfer Protocol (SFTP) connection configuration.</li>
             * <li><strong>grafana_token</strong>: Grafana token.</li>
             * <li><strong>slack_token</strong>: Slack token.</li>
             * <li><strong>ec_private_key</strong>: EC private key.</li>
             * <li><strong>pypi_token</strong>: upload token for the Python Package Index (PyPI).</li>
             * <li><strong>finicity_token</strong>: Finicity token.</li>
             * <li><strong>k8s_client_key</strong>: Kubernetes client private key.</li>
             * <li><strong>git_cfg</strong>: Git configuration.</li>
             * <li><strong>django_key</strong>: Django key.</li>
             * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file.</li>
             * <li><strong>openssh_private_key</strong>: OpenSSH private key.</li>
             * <li><strong>square_oauth</strong>: OAuth credential for Square.</li>
             * <li><strong>typeform_token</strong>: Typeform token.</li>
             * <li><strong>common_database_cfg</strong>: general database connection configuration.</li>
             * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration.</li>
             * <li><strong>googlecloud_api_key</strong>: API key for Google Cloud.</li>
             * <li><strong>vscode_sftp</strong>: VS Code SFTP configuration.</li>
             * <li><strong>apache_htpasswd</strong>: Apache htpasswd.</li>
             * <li><strong>planetscale_token</strong>: PlanetScale token.</li>
             * <li><strong>contentful_preview_token</strong>: preview token for Contentful.</li>
             * <li><strong>php_database_cfg</strong>: database password for a PHP application.</li>
             * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration.</li>
             * <li><strong>aws_session_token</strong>: AWS session token.</li>
             * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration.</li>
             * <li><strong>asana_client_private_key</strong>: Asana client key.</li>
             * <li><strong>tencentcloud_ak</strong>: secret ID of a third-party cloud.</li>
             * <li><strong>rsa_private_key</strong>: Rivest-Shamir-Adleman (RSA) private key.</li>
             * <li><strong>github_personal_token</strong>: personal access token for GitHub.</li>
             * <li><strong>pgp</strong>: Pretty Good Privacy (PGP) encrypted file.</li>
             * <li><strong>stripe_skpk</strong>: Stripe secret key.</li>
             * <li><strong>square_token</strong>: Square access token.</li>
             * <li><strong>rails_carrierwave</strong>: file upload credential for Rails Carrierwave.</li>
             * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration.</li>
             * <li><strong>robomongo_cred</strong>: Robomongo credential.</li>
             * <li><strong>github_oauth_token</strong>: OAuth access token for GitHub.</li>
             * <li><strong>pulumi_token</strong>: Pulumi token.</li>
             * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP server configuration.</li>
             * <li><strong>macos_keychain</strong>: macOS keychain.</li>
             * <li><strong>amazon_mws_token</strong>: Amazon MWS token.</li>
             * <li><strong>dynatrace_token</strong>: Dynatrace token.</li>
             * <li><strong>java_keystore</strong>: Java KeyStore (JKS).</li>
             * <li><strong>microsoft_sdf</strong>: Microsoft SQL Server Compact Edition (CE) database.</li>
             * <li><strong>kubernetes_dashboard_cred</strong>: user credential for Kubernetes Dashboard.</li>
             * <li><strong>atlassian_token</strong>: Atlassian token.</li>
             * <li><strong>rdp</strong>: remote desktop protocol (RDP).</li>
             * <li><strong>mailgun_key</strong>: Mailgun webhook signing key.</li>
             * <li><strong>mailchimp_api_key</strong>: API key for Mailchimp.</li>
             * <li><strong>netrc_cfg</strong>: .netrc configuration file.</li>
             * <li><strong>openvpn_cfg</strong>: OpenVPN client configuration.</li>
             * <li><strong>github_refresh_token</strong>: GitHub refresh token.</li>
             * <li><strong>salesforce</strong>: Salesforce credential.</li>
             * <li><strong>sendinblue</strong>: Sendinblue token.</li>
             * <li><strong>pkcs_private_key</strong>: PKCS#12 key.</li>
             * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file.</li>
             * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration.</li>
             * <li><strong>databricks_token</strong>: Databricks token.</li>
             * <li><strong>gitLab_personal_token</strong>: personal access token for GitLab.</li>
             * <li><strong>rails_master_key</strong>: Rails master key.</li>
             * <li><strong>sqlite</strong>: SQLite3 or SQLite database.</li>
             * <li><strong>firefox_logins</strong>: Firefox logon configuration.</li>
             * <li><strong>mailgun_private_token</strong>: Mailgun private token.</li>
             * <li><strong>joomla_cfg</strong>: Joomla configuration.</li>
             * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token.</li>
             * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration.</li>
             * <li><strong>heroku_api_key</strong>: Heroku API key.</li>
             * <li><strong>messagebird_token</strong>: MessageBird token.</li>
             * <li><strong>github_app_token</strong>: GitHub app token.</li>
             * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token.</li>
             * <li><strong>pgp_private_key</strong>: PGP private key.</li>
             * <li><strong>sshpasswd</strong>: SSH password.</li>
             * <li><strong>huaweicloud_ak</strong>: secret access key of a third-party cloud.</li>
             * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration.</li>
             * <li><strong>php_config</strong>: PHP configuration.</li>
             * <li><strong>common_private_key</strong>: private key of a common type.</li>
             * <li><strong>microsoft_mdf</strong>: Microsoft SQL Server database.</li>
             * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration.</li>
             * <li><strong>jenkins_cred</strong>: Jenkins credential.</li>
             * <li><strong>rubygems_cred</strong>: RubyGems credential.</li>
             * <li><strong>clojars_token</strong>: Clojars token.</li>
             * <li><strong>phoenix_web_passwd</strong>: Phoenix web credential.</li>
             * <li><strong>puttygen_private_key</strong>: PuTTYgen private key.</li>
             * <li><strong>google_oauth_token</strong>: Google OAuth access token.</li>
             * <li><strong>rubyonrails_cfg</strong>: Ruby on Rails database configuration.</li>
             * <li><strong>lob_api_key</strong>: Lob API key.</li>
             * <li><strong>pkcs_cred</strong>: PKCS#12 certificate.</li>
             * <li><strong>otr_private_key</strong>: Off-the-Record Messaging (OTR) private key.</li>
             * <li><strong>contentful_delivery_token</strong>: delivery token for Contentful.</li>
             * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration.</li>
             * <li><strong>dsa_private_key</strong>: Digital Signature Algorithm (DSA) private key.</li>
             * <li><strong>rails_app_token</strong>: Rails app token.</li>
             * <li><strong>git_cred</strong>: Git user credential.</li>
             * <li><strong>newrelic_api_key</strong>: user API key for New Relic.</li>
             * <li><strong>github_hub</strong>: hub configuration for storing GitHub tokens.</li>
             * <li><strong>rubygem</strong>: RubyGems token.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>google_oauth_key</p>
             */
            public Builder sensitiveFileKey(String sensitiveFileKey) {
                this.sensitiveFileKey = sensitiveFileKey;
                return this;
            }

            /**
             * <p>The name of the alert type for the sensitive file.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKeyLeak</p>
             */
            public Builder sensitiveFileName(String sensitiveFileName) {
                this.sensitiveFileName = sensitiveFileName;
                return this;
            }

            /**
             * <p>The status of the sensitive file. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled.</li>
             * <li><strong>1</strong>: handled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unprocessed mirrors.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unprocessedNum(Integer unprocessedNum) {
                this.unprocessedNum = unprocessedNum;
                return this;
            }

            public SensitiveFileList build() {
                return new SensitiveFileList(this);
            } 

        } 

    }
}
