// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageSensitiveFileByKeyRequest</p>
 */
public class DescribeImageSensitiveFileByKeyRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageUuid")
    private String imageUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    @Query
    @NameInMap("SensitiveFileKey")
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
    public java.util.List < String > getScanRange() {
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
        private java.util.List < String > scanRange; 
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The UUID of the image.
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
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
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the asset that you want to scan. Valid values:
         * <p>
         * 
         * *   **image**
         * *   **container**
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
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
