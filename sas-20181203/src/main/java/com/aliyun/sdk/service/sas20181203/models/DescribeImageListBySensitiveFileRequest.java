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
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
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
         * <p>Fuzzy match is supported.</p>
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
         * <p>The number of entries to return on each page. Default value: 20.</p>
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
         * <p>The ID of the specified container image.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation to obtain the IDs of container images from the value of the <strong>InstanceId</strong> response parameter.</p>
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
         * <p>Fuzzy match is supported.</p>
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
         * <p>The namespace to which the image repository belongs.</p>
         * <blockquote>
         * <p>Fuzzy match is supported.</p>
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
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
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
         * <p>An array consisting of the types of the assets that you want to scan. Valid values:</p>
         * <ul>
         * <li><strong>image</strong></li>
         * <li><strong>container</strong></li>
         * </ul>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The type of the alert for the sensitive file. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: npm access token.</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration.</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth key.</li>
         * <li><strong>planetscale_passwd</strong>: PlanetScale password.</li>
         * <li><strong>github_ssh_key</strong>: Github SSH key.</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile.</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token.</li>
         * <li><strong>ssh_private_key</strong>: SSH private key.</li>
         * <li><strong>aws_cli</strong>: Amazon Web Services (AWS) CLI credential.</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPD credential.</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password file.</li>
         * <li><strong>discord_client_cred</strong>: Discord client credential.</li>
         * <li><strong>rails_database</strong>: Rails database configuration.</li>
         * <li><strong>aws_access_key</strong>: AWS access key.</li>
         * <li><strong>esmtp_cfg</strong>: configuration of mail server over Extended Simple Mail Transfer Protocol (ESMTP).</li>
         * <li><strong>docker_registry_cfg</strong>: configuration of a Docker image repository.</li>
         * <li><strong>pem</strong>: Privacy-Enhanced Mail (PEM).</li>
         * <li><strong>common_cred</strong>: common credential.</li>
         * <li><strong>sftp_cfg</strong>: configuration of connection over Secure File Transfer Protocol (SFTP).</li>
         * <li><strong>grafana_token</strong>: Grafana token.</li>
         * <li><strong>slack_token</strong>: Slack token.</li>
         * <li><strong>ec_private_key</strong>: Elliptic Curve (EC) private key.</li>
         * <li><strong>pypi_token</strong>: Python Package Index (PyPI) token.</li>
         * <li><strong>finicity_token</strong>: Finicity token.</li>
         * <li><strong>k8s_client_key</strong>: private key for the Kubernetes client.</li>
         * <li><strong>git_cfg</strong>: Git configuration.</li>
         * <li><strong>django_key</strong>: Django key.</li>
         * <li><strong>jenkins_ssh</strong>: SSH configuration file for Jenkins.</li>
         * <li><strong>openssh_private_key</strong>: OpenSSH private key.</li>
         * <li><strong>square_oauth</strong>: Square OAuth credential.</li>
         * <li><strong>typeform_token</strong>: Typeform token.</li>
         * <li><strong>common_database_cfg</strong>: configuration of general database connection.</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration.</li>
         * <li><strong>googlecloud_api_key</strong>: API key for Google Cloud.</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration.</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd.</li>
         * <li><strong>planetscale_token</strong>: PlanetScale token.</li>
         * <li><strong>contentful_preview_token</strong>: preview token for Contentful.</li>
         * <li><strong>php_database_cfg</strong>: database password for a PHP application.</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration.</li>
         * <li><strong>aws_session_token</strong>: AWS session token.</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration.</li>
         * <li><strong>asana_client_private_key</strong>: private key for the Asana client.</li>
         * <li><strong>tencentcloud_ak</strong>: secret ID of a third-party cloud.</li>
         * <li><strong>rsa_private_key</strong>: Rivest-Shamir-Adleman (RSA) private key.</li>
         * <li><strong>github_personal_token</strong>: personal access token for GitHub.</li>
         * <li><strong>pgp</strong>: Pretty Good Privacy (PGP) encrypted file.</li>
         * <li><strong>stripe_skpk</strong>: Stripe secret key.</li>
         * <li><strong>square_token</strong>: Square access token.</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave credential.</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration.</li>
         * <li><strong>robomongo_cred</strong>: RoboMongo credential.</li>
         * <li><strong>github_oauth_token</strong>: OAuth access token for GitHub.</li>
         * <li><strong>pulumi_token</strong>: Pulumi token.</li>
         * <li><strong>ventrilo_voip</strong>: configuration of a Ventrilo VoIP server.</li>
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
         * <li><strong>openvpn_cfg</strong>: configuration of the OpenVPN client.</li>
         * <li><strong>github_refresh_token</strong>: GitHub refresh token.</li>
         * <li><strong>salesforce</strong>: Salesforce credential.</li>
         * <li><strong>salesforce</strong>: Sendinblue token.</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 private key.</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file.</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration.</li>
         * <li><strong>databricks_token</strong>: Databricks token.</li>
         * <li><strong>gitLab_personal_toke</strong>: personal access token for GitLab.</li>
         * <li><strong>rails_master_key</strong>: Rails master key.</li>
         * <li><strong>sqlite</strong>: SQLite3 or SQLite database.</li>
         * <li><strong>firefox_logins</strong>: Firefox logon configuration.</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun private token.</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration.</li>
         * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token.</li>
         * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration.</li>
         * <li><strong>heroku_api_key</strong>: API key for Heroku.</li>
         * <li><strong>messagebird_token</strong>: MessageBird token.</li>
         * <li><strong>github_app_token</strong>: Github app token.</li>
         * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token.</li>
         * <li><strong>pgp_private_key</strong>: PGP private key.</li>
         * <li><strong>sshpasswd</strong>: SSH password.</li>
         * <li><strong>huaweicloud_ak</strong>: secret access key of a third-party cloud.</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration.</li>
         * <li><strong>php_config</strong>: PHP configuration.</li>
         * <li><strong>common_private_key</strong>: common private key.</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL Server database.</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration.</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credential.</li>
         * <li><strong>rubygems_cred</strong>: RubyGems credential.</li>
         * <li><strong>clojars_token</strong>: Clojars token.</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix web credential.</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key.</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token.</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby On Rails database configuration.</li>
         * <li><strong>lob_api_key</strong>: Lob API key for Lob.</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate.</li>
         * <li><strong>otr_private_key</strong>: Off-the-Record Messaging (OTR) private key.</li>
         * <li><strong>contentful_delivery_token</strong>: Contentful delivery token.</li>
         * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration.</li>
         * <li><strong>dsa_private_key</strong>: Digital Signature Algorithm (DSA) private key.</li>
         * <li><strong>rails_app_token</strong>: app token for Rails.</li>
         * <li><strong>git_cred</strong>: user credential for Git.</li>
         * <li><strong>newrelic_api_key</strong>: User API key for New Relic.</li>
         * <li><strong>github_hub</strong>: hub configuration for storing GitHub tokens.</li>
         * <li><strong>rubygem</strong>: RubyGem token.</li>
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
         * <p>The sensitive file status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: ignored</li>
         * <li><strong>2</strong>: false positive</li>
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
