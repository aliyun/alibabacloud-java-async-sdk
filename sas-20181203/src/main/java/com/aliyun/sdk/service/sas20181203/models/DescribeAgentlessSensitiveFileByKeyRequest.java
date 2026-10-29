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
 * {@link DescribeAgentlessSensitiveFileByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgentlessSensitiveFileByKeyRequest</p>
 */
public class DescribeAgentlessSensitiveFileByKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAgentlessSensitiveFileByKeyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.scanRange = builder.scanRange;
        this.sensitiveFileKey = builder.sensitiveFileKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentlessSensitiveFileByKeyRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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

    public static final class Builder extends Request.Builder<DescribeAgentlessSensitiveFileByKeyRequest, Builder> {
        private Integer currentPage; 
        private String imageUuid; 
        private String instanceId; 
        private Integer pageSize; 
        private String remark; 
        private java.util.List<String> scanRange; 
        private String sensitiveFileKey; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgentlessSensitiveFileByKeyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.scanRange = request.scanRange;
            this.sensitiveFileKey = request.sensitiveFileKey;
            this.status = request.status;
        } 

        /**
         * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The UUID of the scanned asset. You can obtain the UUID on the Host Assets and Cloud Products pages. In the host security detection scenario, this parameter specifies the UUID of the scanned host. In the snapshot security detection and custom image security detection scenarios, this parameter specifies the ID of the scanned image or snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>06293273b67d19516cfcc712194f****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>Instance ID of the asset instance to query. You can obtain instance ID by choosing Task Management &gt; Details &gt; Detection Target.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1fu4aqltf1huhc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page in a paged query. The default number of entries displayed per page is 20. If this parameter is left empty, 20 entries are returned by default for paging.</p>
         * <blockquote>
         * <p>Do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name or IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The scan ranges.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The type of the sensitive file. Valid values:</p>
         * <ul>
         * <li><strong>npm_token</strong>: NPM access token</li>
         * <li><strong>ftp_cfg</strong>: FTP configuration</li>
         * <li><strong>google_oauth_key</strong>: Google OAuth key</li>
         * <li><strong>planetscale_passwd</strong>: PlanetScale password</li>
         * <li><strong>github_ssh_key</strong>: GitHub SSH key</li>
         * <li><strong>msbuild_publish_profile</strong>: MSBuild publish profile</li>
         * <li><strong>fastly_cdn_token</strong>: Fastly CDN token</li>
         * <li><strong>ssh_private_key</strong>: SSH private key</li>
         * <li><strong>aws_cli</strong>: AWS CLI credential</li>
         * <li><strong>cpanel_proftpd</strong>: cPanel ProFTPd credential</li>
         * <li><strong>postgresql_passwd</strong>: PostgreSQL password file</li>
         * <li><strong>discord_client_cred</strong>: Discord client credential</li>
         * <li><strong>rails_database</strong>: Rails database configuration</li>
         * <li><strong>aws_access_key</strong>: AWS access key</li>
         * <li><strong>esmtp_cfg</strong>: ESMTP mail server configuration</li>
         * <li><strong>docker_registry_cfg</strong>: Docker image registry configuration</li>
         * <li><strong>pem</strong>: PEM</li>
         * <li><strong>common_cred</strong>: common credential</li>
         * <li><strong>sftp_cfg</strong>: SFTP connection configuration</li>
         * <li><strong>grafana_token</strong>: Grafana token</li>
         * <li><strong>slack_token</strong>: Slack token</li>
         * <li><strong>ec_private_key</strong>: EC private key</li>
         * <li><strong>pypi_token</strong>: PyPI upload token</li>
         * <li><strong>finicity_token</strong>: Finicity platform token</li>
         * <li><strong>k8s_client_key</strong>: Kubernetes client private key</li>
         * <li><strong>git_cfg</strong>: Git configuration</li>
         * <li><strong>django_key</strong>: Django key</li>
         * <li><strong>jenkins_ssh</strong>: Jenkins SSH configuration file</li>
         * <li><strong>openssh_private_key</strong>: OpenSSH private key</li>
         * <li><strong>square_oauth</strong>: Square OAuth credential</li>
         * <li><strong>typeform_token</strong>: Typeform token</li>
         * <li><strong>common_database_cfg</strong>: common database connection configuration</li>
         * <li><strong>wordpress_database_cfg</strong>: WordPress database configuration</li>
         * <li><strong>googlecloud_api_key</strong>: Google Cloud API key</li>
         * <li><strong>vscode_sftp</strong>: VSCode SFTP configuration</li>
         * <li><strong>apache_htpasswd</strong>: Apache htpasswd</li>
         * <li><strong>planetscale_token</strong>: PlanetScale token</li>
         * <li><strong>contentful_preview_token</strong>: Contentful preview token</li>
         * <li><strong>php_database_cfg</strong>: PHP application database password</li>
         * <li><strong>atom_remote_sync</strong>: Atom remote sync configuration</li>
         * <li><strong>aws_session_token</strong>: AWS session token</li>
         * <li><strong>atom_sftp_cfg</strong>: Atom SFTP configuration</li>
         * <li><strong>asana_client_private_key</strong>: Asana project management platform client key</li>
         * <li><strong>tencentcloud_ak</strong>: SecretId of other cloud providers</li>
         * <li><strong>rsa_private_key</strong>: RSA private key</li>
         * <li><strong>github_personal_token</strong>: GitHub personal access token</li>
         * <li><strong>pgp</strong>: PGP encrypted file</li>
         * <li><strong>stripe_skpk</strong>: Stripe secret key</li>
         * <li><strong>square_token</strong>: Square access token</li>
         * <li><strong>rails_carrierwave</strong>: Rails Carrierwave file upload credential</li>
         * <li><strong>dbeaver_database_cfg</strong>: DBeaver database configuration</li>
         * <li><strong>robomongo_cred</strong>: Robomongo credential</li>
         * <li><strong>github_oauth_token</strong>: GitHub OAuth access token</li>
         * <li><strong>pulumi_token</strong>: Pulumi token</li>
         * <li><strong>ventrilo_voip</strong>: Ventrilo VoIP server configuration</li>
         * <li><strong>macos_keychain</strong>: macOS keychain</li>
         * <li><strong>amazon_mws_token</strong>: Amazon MWS token</li>
         * <li><strong>dynatrace_token</strong>: Dynatrace token</li>
         * <li><strong>java_keystore</strong>: Java keystore</li>
         * <li><strong>microsoft_sdf</strong>: Microsoft SQL CE database</li>
         * <li><strong>kubernetes_dashboard_cred</strong>: Kubernetes Dashboard user credential</li>
         * <li><strong>atlassian_token</strong>: Atlassian token</li>
         * <li><strong>rdp</strong>: Remote Desktop Protocol (RDP) connection</li>
         * <li><strong>mailgun_key</strong>: Mailgun webhook signing key</li>
         * <li><strong>mailchimp_api_key</strong>: Mailchimp API key</li>
         * <li><strong>netrc_cfg</strong>: .netrc configuration file</li>
         * <li><strong>openvpn_cfg</strong>: OpenVPN client configuration</li>
         * <li><strong>github_refresh_token</strong>: GitHub refresh token</li>
         * <li><strong>salesforce</strong>: Salesforce credential</li>
         * <li><strong>sendinblue</strong>: Sendinblue token</li>
         * <li><strong>pkcs_private_key</strong>: PKCS#12 key</li>
         * <li><strong>rubyonrails_passwd</strong>: Ruby on Rails password file</li>
         * <li><strong>filezilla_ftp</strong>: FileZilla FTP configuration</li>
         * <li><strong>databricks_token</strong>: Databricks token</li>
         * <li><strong>gitLab_personal_token</strong>: GitLab personal access token</li>
         * <li><strong>rails_master_key</strong>: Rails master key</li>
         * <li><strong>sqlite</strong>: SQLite3/SQLite database</li>
         * <li><strong>firefox_logins</strong>: Firefox logon configuration</li>
         * <li><strong>mailgun_private_token</strong>: Mailgun private token</li>
         * <li><strong>joomla_cfg</strong>: Joomla configuration</li>
         * <li><strong>hashicorp_terraform_token</strong>: HashiCorp Terraform token</li>
         * <li><strong>jetbrains_ides</strong>: JetBrains IDEs configuration</li>
         * <li><strong>heroku_api_key</strong>: Heroku API key</li>
         * <li><strong>messagebird_token</strong>: MessageBird token</li>
         * <li><strong>github_app_token</strong>: GitHub App token</li>
         * <li><strong>hashicorp_vault_token</strong>: HashiCorp Vault token</li>
         * <li><strong>pgp_private_key</strong>: PGP private key</li>
         * <li><strong>sshpasswd</strong>: SSH password</li>
         * <li><strong>huaweicloud_ak</strong>: Secret Access Key of other cloud providers</li>
         * <li><strong>aws_s3cmd</strong>: AWS S3cmd configuration</li>
         * <li><strong>php_config</strong>: PHP configuration</li>
         * <li><strong>common_private_key</strong>: common private key type</li>
         * <li><strong>microsoft_mdf</strong>: Microsoft SQL database</li>
         * <li><strong>mediawiki_cfg</strong>: MediaWiki configuration</li>
         * <li><strong>jenkins_cred</strong>: Jenkins credential</li>
         * <li><strong>rubygems_cred</strong>: RubyGems credential</li>
         * <li><strong>clojars_token</strong>: Clojars token</li>
         * <li><strong>phoenix_web_passwd</strong>: Phoenix Web credential</li>
         * <li><strong>puttygen_private_key</strong>: PuTTYgen private key</li>
         * <li><strong>google_oauth_token</strong>: Google OAuth access token</li>
         * <li><strong>rubyonrails_cfg</strong>: Ruby on Rails database configuration</li>
         * <li><strong>lob_api_key</strong>: Lob API key</li>
         * <li><strong>pkcs_cred</strong>: PKCS#12 certificate</li>
         * <li><strong>otr_private_key</strong>: OTR private key</li>
         * <li><strong>contentful_delivery_token</strong>: Contentful delivery token</li>
         * <li><strong>digital_ocean_tugboat</strong>: DigitalOcean Tugboat configuration</li>
         * <li><strong>dsa_private_key</strong>: DSA private key</li>
         * <li><strong>rails_app_token</strong>: Rails App token</li>
         * <li><strong>git_cred</strong>: Git user credential</li>
         * <li><strong>newrelic_api_key</strong>: New Relic User API key</li>
         * <li><strong>github_hub</strong>: hub configuration that stores GitHub tokens</li>
         * <li><strong>rubygem</strong>: RubyGems token<blockquote>
         * <p>This parameter is required. If this parameter is not provided, the API returns HTTP 400 and the error code -101.</p>
         * </blockquote>
         * </li>
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
         * <p>The fix status of the baseline risk. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unfixed.</li>
         * <li><strong>1</strong>: Fixed.</li>
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
        public DescribeAgentlessSensitiveFileByKeyRequest build() {
            return new DescribeAgentlessSensitiveFileByKeyRequest(this);
        } 

    } 

}
