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
 * {@link DescribeImageSensitiveFileByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageSensitiveFileByKeyRequest</p>
 */
public class DescribeImageSensitiveFileByKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    private DescribeImageSensitiveFileByKeyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.scanRange = builder.scanRange;
        this.sensitiveFileKey = builder.sensitiveFileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSensitiveFileByKeyRequest create() {
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
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
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

    public static final class Builder extends Request.Builder<DescribeImageSensitiveFileByKeyRequest, Builder> {
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List<String> scanRange; 
        private String sensitiveFileKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageSensitiveFileByKeyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.scanRange = request.scanRange;
            this.sensitiveFileKey = request.sensitiveFileKey;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0083a31ccf7c10367a6e783e8601****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
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
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
         * <p>The type of the asset that you want to scan. Valid values:</p>
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
         * <p>The type of alerts for the sensitive files. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: Node Package Manager (NPM) access token</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth key</li>
         * <li><strong>planetscale_passwd</strong>: PlanetScale password</li>
         * <li><strong>github_ssh_key</strong>: Github SSH key</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
         * <li><strong>ssh_private_key</strong>: SSH private key</li>
         * <li><strong>aws_cli</strong>: Amazon Web Services (AWS) CLI credentials</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPD credentials</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password</li>
         * <li><strong>discord_client_cred</strong>: Discord client credentials</li>
         * <li><strong>rails_database</strong>: Rails database configuration</li>
         * <li><strong>aws_access_key</strong>: AWS Access Key</li>
         * <li><strong>esmtp_cfg</strong> :Extended Simple Mail Transfer Protocol (ESMTP) configuration</li>
         * <li><strong>docker_registry_cfg</strong>: Docker image repository configuration</li>
         * <li><strong>pem</strong>: Privacy-Enhanced Mail (PEM)</li>
         * <li><strong>common_cred</strong>: common credentials</li>
         * <li><strong>sftp_cfg</strong>: Secure File Transfer Protocol (SFTP) connection configuration</li>
         * <li><strong>grafana_token</strong>: Grafana token</li>
         * <li><strong>slack_token</strong>: Slack token</li>
         * <li><strong>ec_private_key</strong>: EC private key</li>
         * <li><strong>pypi_token</strong>: Python Package Index (PyPI) token</li>
         * <li><strong>finicity_token</strong>: Finicity token</li>
         * <li><strong>k8s_client_key</strong>: Kubernetes private key</li>
         * <li><strong>git_cfg</strong>: Git configuration</li>
         * <li><strong>django_key</strong>: Django key</li>
         * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file</li>
         * <li><strong>openssh_private_key</strong>: OpenSSL private key</li>
         * <li><strong>square_oauth</strong>: OAuth credential for Square</li>
         * <li><strong>typeform_token</strong>: Typeform token</li>
         * <li><strong>common_database_cfg</strong>: general database connection configuration</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
         * <li><strong>googlecloud_api_key</strong>: API key for Google Cloud</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd</li>
         * <li><strong>planetscale_token</strong>: PlanetScale token</li>
         * <li><strong>contentful_preview_token</strong>: preview token for Contentful</li>
         * <li><strong>php_database_cfg</strong>: database password for a PHP application</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote synchronization configuration</li>
         * <li><strong>aws_session_token</strong>: AWS session token</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
         * <li><strong>asana_client_private_key</strong>: Asana client key</li>
         * <li><strong>tencentcloud_ak</strong>: secret ID of a third-party cloud</li>
         * <li><strong>rsa_private_key</strong>: Rivest-Shamir-Adleman (RSA) private key</li>
         * <li><strong>github_personal_token</strong>: personal access token for GitHub</li>
         * <li><strong>pgp</strong>: Pretty Good Privacy (PGP) encrypted file</li>
         * <li><strong>stripe_skpk</strong>: Stripe secret key</li>
         * <li><strong>square_token</strong>: Square access token</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave credential</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
         * <li><strong>robomongo_cred</strong>: Robomongo credentials</li>
         * <li><strong>github_oauth_token</strong>: OAuth access token for GitHub</li>
         * <li><strong>pulumi_token</strong>: Pulumi token</li>
         * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP server configuration</li>
         * <li><strong>macos_keychain</strong>: macOS Keychain</li>
         * <li><strong>amazon_mws_token</strong>: Amazon MWS token</li>
         * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
         * <li><strong>java_keystore</strong>: Java KeyStore (JKS)</li>
         * <li><strong>microsoft_sdf</strong>: Microsoft SQL Server Compact Edition (CE) database</li>
         * <li><strong>kubernetes_dashboard_cred</strong>: user credentials for Kubernetes Dashboard</li>
         * <li><strong>atlassian_token</strong>: Atlassian token</li>
         * <li><strong>rdp</strong>: remote desktop protocol (RDP)</li>
         * <li><strong>mailgun_key</strong>: Mailgun webhook signing key</li>
         * <li><strong>mailchimp_api_key</strong>: API key for Mailchimp</li>
         * <li><strong>netrc_cfg</strong>: .netrc configuration file</li>
         * <li><strong>openvpn_cfg</strong>: OpenVPN configuration</li>
         * <li><strong>github_refresh_token</strong>: GitHub refresh token</li>
         * <li><strong>salesforce</strong>: Salesforce credentials</li>
         * <li><strong>salesforce</strong>: Sendinblue credentials</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 key</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
         * <li><strong>databricks_token</strong>: Databricks token</li>
         * <li><strong>gitLab_personal_toke</strong>: personal access token for GitLab</li>
         * <li><strong>rails_master_key</strong>: Rails master key</li>
         * <li><strong>sqlite</strong>: SQLite3 or SQLite database</li>
         * <li><strong>firefox_logins</strong>: Firefox logon configuration</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun private token</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
         * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token</li>
         * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration</li>
         * <li><strong>heroku_api_key</strong>: Heroku API key</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token</li>
         * <li><strong>pgp_private_key</strong>: PGP private key</li>
         * <li><strong>sshpasswd</strong>: SSH password</li>
         * <li><strong>huaweicloud_ak</strong>: secret access key of a third-party cloud</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
         * <li><strong>php_config</strong>: PHP configuration</li>
         * <li><strong>common_private_key</strong>: private key of a common type</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL Server database</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credentials</li>
         * <li><strong>rubygems_cred</strong>: RubyGems credentials</li>
         * <li><strong>clojars_token</strong>: Clojars token</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix web credentials</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby On Rails database configuration</li>
         * <li><strong>lob_api_key</strong>: Lob API key</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
         * <li><strong>otr_private_key</strong>: Off-the-Record Messaging (OTR) private key</li>
         * <li><strong>contentful_delivery_token</strong>: delivery token for Contentful</li>
         * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration</li>
         * <li><strong>dsa_private_key</strong>: Digital Signature Algorithm (DSA) private key</li>
         * <li><strong>rails_app_token</strong>: Rails app token</li>
         * <li><strong>git_cred</strong>: Git user credential</li>
         * <li><strong>newrelic_api_key</strong>: User API key for New Relic</li>
         * <li><strong>github_hub</strong>: hub configuration for storing GitHub tokens</li>
         * <li><strong>rubygem</strong>: Rubygem Token</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>google_oauth_key</p>
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        @Override
        public DescribeImageSensitiveFileByKeyRequest build() {
            return new DescribeImageSensitiveFileByKeyRequest(this);
        } 

    } 

}
