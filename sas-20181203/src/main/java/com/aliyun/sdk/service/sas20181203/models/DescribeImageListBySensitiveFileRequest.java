// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageListBySensitiveFileRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageListBySensitiveFileRequest</p>
 */
public class DescribeImageListBySensitiveFileRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageDigest")
    private String imageDigest;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RepoNamespace")
    private String repoNamespace;

    @Query
    @NameInMap("RiskLevel")
    private String riskLevel;

    @Query
    @NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    @Query
    @NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

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
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    /**
     * @return sensitiveFileKey
     */
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
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
        private java.util.List < String > scanRange; 
        private String sensitiveFileKey; 

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
        } 

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The image digest.
         * <p>
         * > Fuzzy match is supported.
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
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
         * The number of entries to return on each page. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the specified container image.
         * <p>
         * 
         * > You can call the [ListRepository](~~451339~~) operation to obtain the IDs of container images from the value of the **InstanceId** response parameter.
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * The name of the image repository.
         * <p>
         * 
         * > Fuzzy match is supported.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The namespace to which the image repository belongs.
         * <p>
         * > Fuzzy match is supported.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * The risk level of the file. Separate multiple levels with commas (,). Valid values:
         * <p>
         * 
         * - **high**
         * - **medium**
         * - **low**
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * An array consisting of the types of the assets that you want to scan. Valid values:
         * <p>
         * - **image**
         * - **container**
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * The type of the alert for the sensitive file. Valid values:
         * <p>
         * 
         * *   **npm_token**: npm access token.
         * *   **ftp_cfg**: FTP configuration.
         * *   **google_oauth_key**: Google OAuth key.
         * *   **planetscale_passwd**: PlanetScale password.
         * *   **github_ssh_key**: Github SSH key.
         * *   **msbuild_publish_profile**: MSBuild publish profile.
         * *   **fastly_cdn_token**: Fastly CDN token.
         * *   **ssh_private_key**: SSH private key.
         * *   **aws_cli**: Amazon Web Services (AWS) CLI credential.
         * *   **cpanel_proftpd**: cPanel ProFTPD credential.
         * *   **postgresql_passwd**: PostgreSQL password file.
         * *   **discord_client_cred**: Discord client credential.
         * *   **rails_database**: Rails database configuration.
         * *   **aws_access_key**: AWS access key.
         * *   **esmtp_cfg**: configuration of mail server over Extended Simple Mail Transfer Protocol (ESMTP).
         * *   **docker_registry_cfg**: configuration of a Docker image repository.
         * *   **pem**: Privacy-Enhanced Mail (PEM).
         * *   **common_cred**: common credential.
         * *   **sftp_cfg**: configuration of connection over Secure File Transfer Protocol (SFTP).
         * *   **grafana_token**: Grafana token.
         * *   **slack_token**: Slack token.
         * *   **ec_private_key**: Elliptic Curve (EC) private key.
         * *   **pypi_token**: Python Package Index (PyPI) token.
         * *   **finicity_token**: Finicity token.
         * *   **k8s_client_key**: private key for the Kubernetes client.
         * *   **git_cfg**: Git configuration.
         * *   **django_key**: Django key.
         * *   **jenkins_ssh**: SSH configuration file for Jenkins.
         * *   **openssh_private_key**: OpenSSH private key.
         * *   **square_oauth**: Square OAuth credential.
         * *   **typeform_token**: Typeform token.
         * *   **common_database_cfg**: configuration of general database connection.
         * *   **wordpress_database_cfg**: WordPress database configuration.
         * *   **googlecloud_api_key**: API key for Google Cloud.
         * *   **vscode_sftp**: VSCode SFTP configuration.
         * *   **apache_htpasswd**: Apache htpasswd.
         * *   **planetscale_token**: PlanetScale token.
         * *   **contentful_preview_token**: preview token for Contentful.
         * *   **php_database_cfg**: database password for a PHP application.
         * *   **atom_remote_sync**: Atom remote synchronization configuration.
         * *   **aws_session_token**: AWS session token.
         * *   **atom_sftp_cfg**: Atom SFTP configuration.
         * *   **asana_client_private_key**: private key for the Asana client.
         * *   **tencentcloud_ak**: secret ID of a third-party cloud.
         * *   **rsa_private_key**: Rivest-Shamir-Adleman (RSA) private key.
         * *   **github_personal_token**: personal access token for GitHub.
         * *   **pgp**: Pretty Good Privacy (PGP) encrypted file.
         * *   **stripe_skpk**: Stripe secret key.
         * *   **square_token**: Square access token.
         * *   **rails_carrierwave**: Rails Carrierwave credential.
         * *   **dbeaver_database_cfg**: DBeaver database configuration.
         * *   **robomongo_cred**: RoboMongo credential.
         * *   **github_oauth_token**: OAuth access token for GitHub.
         * *   **pulumi_token**: Pulumi token.
         * *   **ventrilo_voip**: configuration of a Ventrilo VoIP server.
         * *   **macos_keychain**: macOS keychain.
         * *   **amazon_mws_token**: Amazon MWS token.
         * *   **dynatrace_token**: Dynatrace token.
         * *   **java_keystore**: Java KeyStore (JKS).
         * *   **microsoft_sdf**: Microsoft SQL Server Compact Edition (CE) database.
         * *   **kubernetes_dashboard_cred**: user credential for Kubernetes Dashboard.
         * *   **atlassian_token**: Atlassian token.
         * *   **rdp**: remote desktop protocol (RDP).
         * *   **mailgun_key**: Mailgun webhook signing key.
         * *   **mailchimp_api_key**: API key for Mailchimp.
         * *   **netrc_cfg**: .netrc configuration file.
         * *   **openvpn_cfg**: configuration of the OpenVPN client.
         * *   **github_refresh_token**: GitHub refresh token.
         * *   **salesforce**: Salesforce credential.
         * *   **salesforce**: Sendinblue token.
         * *   **pkcs_private_key**: PKCS#12 private key.
         * *   **rubyonrails_passwd**: Ruby on Rails password file.
         * *   **filezilla_ftp**: FileZilla FTP configuration.
         * *   **databricks_token**: Databricks token.
         * *   **gitLab_personal_toke**: personal access token for GitLab.
         * *   **rails_master_key**: Rails master key.
         * *   **sqlite**: SQLite3 or SQLite database.
         * *   **firefox_logins**: Firefox logon configuration.
         * *   **mailgun_private_token**: Mailgun private token.
         * *   **joomla_cfg**: Joomla configuration.
         * *   **hashicorp_terraform_token**: HashiCorp Terraform token.
         * *   **jetbrains_ides**: JetBrains IDEs configuration.
         * *   **heroku_api_key**: API key for Heroku.
         * *   **messagebird_token**: MessageBird token.
         * *   **github_app_token**: Github app token.
         * *   **hashicorp_vault_token**: HashiCorp Vault token.
         * *   **pgp_private_key**: PGP private key.
         * *   **sshpasswd**: SSH password.
         * *   **huaweicloud_ak**: secret access key of a third-party cloud.
         * *   **aws_s3cmd**: AWS S3cmd configuration.
         * *   **php_config**: PHP configuration.
         * *   **common_private_key**: common private key.
         * *   **microsoft_mdf**: Microsoft SQL Server database.
         * *   **mediawiki_cfg**: MediaWiki configuration.
         * *   **jenkins_cred**: Jenkins credential.
         * *   **rubygems_cred**: RubyGems credential.
         * *   **clojars_token**: Clojars token.
         * *   **phoenix_web_passwd**: Phoenix web credential.
         * *   **puttygen_private_key**: PuTTYgen private key.
         * *   **google_oauth_token**: Google OAuth access token.
         * *   **rubyonrails_cfg**: Ruby On Rails database configuration.
         * *   **lob_api_key**: Lob API key for Lob.
         * *   **pkcs_cred**: PKCS#12 certificate.
         * *   **otr_private_key**: Off-the-Record Messaging (OTR) private key.
         * *   **contentful_delivery_token**: Contentful delivery token.
         * *   **digital_ocean_tugboat**: DigitalOcean Tugboat configuration.
         * *   **dsa_private_key**: Digital Signature Algorithm (DSA) private key.
         * *   **rails_app_token**: app token for Rails.
         * *   **git_cred**: user credential for Git.
         * *   **newrelic_api_key**: User API key for New Relic.
         * *   **github_hub**: hub configuration for storing GitHub tokens.
         * *   **rubygem**: RubyGem token.
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        @Override
        public DescribeImageListBySensitiveFileRequest build() {
            return new DescribeImageListBySensitiveFileRequest(this);
        } 

    } 

}
