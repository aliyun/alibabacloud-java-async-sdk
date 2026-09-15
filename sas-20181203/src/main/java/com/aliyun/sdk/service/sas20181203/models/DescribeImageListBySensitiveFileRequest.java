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
 * {@link DescribeImageListBySensitiveFileRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageListBySensitiveFileRequest</p>
 */
public class DescribeImageListBySensitiveFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespace")
    private String repoNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeImageListBySensitiveFileRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageDigest = builder.imageDigest;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.riskLevel = builder.riskLevel;
        this.scanRange = builder.scanRange;
        this.sensitiveFileKey = builder.sensitiveFileKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListBySensitiveFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
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
     * @return repoInstanceId
     */
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return scanRange
     */
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    /**
     * @return sensitiveFileKey
     */
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeImageListBySensitiveFileRequest, Builder> {
        private Integer currentPage; 
        private String imageDigest; 
        private String lang; 
        private Integer pageSize; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String riskLevel; 
        private java.util.List<String> scanRange; 
        private String sensitiveFileKey; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageListBySensitiveFileRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageDigest = request.imageDigest;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.riskLevel = request.riskLevel;
            this.scanRange = request.scanRange;
            this.sensitiveFileKey = request.sensitiveFileKey;
            this.status = request.status;
        } 

        /**
         * <p>The page number of the current page to return. Minimum value: 1. Default value: 1.</p>
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
         * <p>The image digest.</p>
         * <blockquote>
         * <p>Fuzzy search is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v005</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>Sets the language type for request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The maximum number of entries to return on each page in a paginated query. Default value: 20.</p>
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
         * <p>The ID of the container image instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation of Container Registry to obtain the container image instance ID from the <strong>InstanceId</strong> response parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-qewqrqcsadf****</p>
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * <blockquote>
         * <p>Fuzzy search is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>harbor-image-v001</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The namespace of the image repository.</p>
         * <blockquote>
         * <p>Fuzzy search is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>libssh2</p>
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * <p>The risk level of the file. Separate multiple levels with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High risk.</li>
         * <li><strong>medium</strong>: Medium risk.</li>
         * <li><strong>low</strong>: Low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The collection of scan scopes. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: Image.</li>
         * <li><strong>container</strong>: Container.</li>
         * </ul>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The type of sensitive file alert. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: NPM access token</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth Key</li>
         * <li><strong>planetscale_passwd</strong>: Planetscale password</li>
         * <li><strong>github_ssh_key</strong>: GitHub SSH key</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
         * <li><strong>ssh_private_key</strong>: SSH private key</li>
         * <li><strong>aws_cli</strong>: AWS CLI credentials</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPd credentials</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password file</li>
         * <li><strong>discord_client_cred</strong>: Discord client credentials</li>
         * <li><strong>rails_database</strong>: Rails database configuration</li>
         * <li><strong>aws_access_key</strong>: AWS Access Key</li>
         * <li><strong>esmtp_cfg</strong>: ESMTP mail server configuration</li>
         * <li><strong>docker_registry_cfg</strong>: Docker image registry configuration</li>
         * <li><strong>pem</strong>: PEM</li>
         * <li><strong>common_cred</strong>: Common credentials</li>
         * <li><strong>sftp_cfg</strong>: SFTP connection configuration</li>
         * <li><strong>grafana_token</strong>: Grafana token</li>
         * <li><strong>slack_token</strong>: Slack Token</li>
         * <li><strong>ec_private_key</strong>: EC private key</li>
         * <li><strong>pypi_token</strong>: PyPI upload token</li>
         * <li><strong>finicity_token</strong>: Finicity platform token</li>
         * <li><strong>k8s_client_key</strong>: Kubernetes client private key</li>
         * <li><strong>git_cfg</strong>: Git configuration</li>
         * <li><strong>django_key</strong>: Django key</li>
         * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file</li>
         * <li><strong>openssh_private_key</strong>: OpenSSH private key</li>
         * <li><strong>square_oauth</strong>: Square OAuth credentials</li>
         * <li><strong>typeform_token</strong>: Typeform token</li>
         * <li><strong>common_database_cfg</strong>: Common database connection configuration</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
         * <li><strong>googlecloud_api_key</strong>: Google Cloud API Key</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd</li>
         * <li><strong>planetscale_token</strong>: Planetscale token</li>
         * <li><strong>contentful_preview_token</strong>: Contentful Preview token</li>
         * <li><strong>php_database_cfg</strong>: PHP application database password</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote sync configuration</li>
         * <li><strong>aws_session_token</strong>: AWS session token</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
         * <li><strong>asana_client_private_key</strong>: Asana project management platform client key</li>
         * <li><strong>tencentcloud_ak</strong>: Third-party cloud SecretId</li>
         * <li><strong>rsa_private_key</strong>: RSA private key</li>
         * <li><strong>github_personal_token</strong>: GitHub Personal access token</li>
         * <li><strong>pgp</strong>: PGP encrypted file</li>
         * <li><strong>stripe_skpk</strong>: Stripe Secret Key</li>
         * <li><strong>square_token</strong>: Square access token</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave file upload credentials</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
         * <li><strong>robomongo_cred</strong>: Robomongo credentials</li>
         * <li><strong>github_oauth_token</strong>: GitHub OAuth access token</li>
         * <li><strong>pulumi_token</strong>: Pulumi token</li>
         * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP Server configuration</li>
         * <li><strong>macos_keychain</strong>: macOS Keychain</li>
         * <li><strong>amazon_mws_token</strong>: Amazon MWS Token</li>
         * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
         * <li><strong>java_keystore</strong>: Java Keystore</li>
         * <li><strong>microsoft_sdf</strong>: Microsoft SQL CE database</li>
         * <li><strong>kubernetes_dashboard_cred</strong>: Kubernetes Dashboard user credentials</li>
         * <li><strong>atlassian_token</strong>: Atlassian token</li>
         * <li><strong>rdp</strong>: Remote Desktop Connection RDP</li>
         * <li><strong>mailgun_key</strong>: Mailgun Webhook Signing Key</li>
         * <li><strong>mailchimp_api_key</strong>: Mailchimp API Key</li>
         * <li><strong>netrc_cfg</strong>: .netrc configuration file</li>
         * <li><strong>openvpn_cfg</strong>: OpenVPN client configuration</li>
         * <li><strong>github_refresh_token</strong>: GitHub Refresh Token</li>
         * <li><strong>salesforce</strong>: Salesforce credentials</li>
         * <li><strong>sendinblue</strong>: Sendinblue token</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 key</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
         * <li><strong>databricks_token</strong>: Databricks token</li>
         * <li><strong>gitLab_personal_token</strong>: GitLab Personal access token</li>
         * <li><strong>rails_master_key</strong>: Rails Master Key</li>
         * <li><strong>sqlite</strong>: SQLite3/SQLite database</li>
         * <li><strong>firefox_logins</strong>: Firefox login configuration</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun Private token</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
         * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform Token</li>
         * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration</li>
         * <li><strong>heroku_api_key</strong>: Heroku API key</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>github_app_token</strong>: GitHub App Token</li>
         * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault Token</li>
         * <li><strong>pgp_private_key</strong>: PGP private key</li>
         * <li><strong>sshpasswd</strong>: SSH password</li>
         * <li><strong>huaweicloud_ak</strong>: Third-party cloud Secret Access Key</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
         * <li><strong>php_config</strong>: PHP configuration</li>
         * <li><strong>common_private_key</strong>: Common private key type</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL database</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credentials</li>
         * <li><strong>rubygems_cred</strong>: RubyGems credentials</li>
         * <li><strong>clojars_token</strong>: Clojars token</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix Web credentials</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby on Rails database configuration</li>
         * <li><strong>lob_api_key</strong>: Lob API Key</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
         * <li><strong>otr_private_key</strong>: OTR private key</li>
         * <li><strong>contentful_delivery_token</strong>: Contentful Delivery token</li>
         * <li><strong>digital_ocean_tugboat</strong>: Digital Ocean Tugboat configuration</li>
         * <li><strong>dsa_private_key</strong>: DSA private key</li>
         * <li><strong>rails_app_token</strong>: Rails App token</li>
         * <li><strong>git_cred</strong>: Git user credentials</li>
         * <li><strong>newrelic_api_key</strong>: New Relic User API Key</li>
         * <li><strong>github_hub</strong>: Hub configuration storing GitHub tokens</li>
         * <li><strong>rubygem</strong>: RubyGem token</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sshpasswd</p>
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        /**
         * <p>The status of the sensitive file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unhandled.</li>
         * <li><strong>1</strong>: Ignored.</li>
         * <li><strong>2</strong>: False positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeImageListBySensitiveFileRequest build() {
            return new DescribeImageListBySensitiveFileRequest(this);
        } 

    } 

}
