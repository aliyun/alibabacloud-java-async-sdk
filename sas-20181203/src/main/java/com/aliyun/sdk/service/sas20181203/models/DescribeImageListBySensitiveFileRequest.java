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
         * The ID of the container image.
         * <p>
         * 
         * > You can call the [ListRepository](~~451339~~) operation to query the IDs of container images from the value of the InstanceId response parameter.
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
         * The alert type of the sensitive file. Valid values:
         * <p>
         * 
         * *   **npm_token**: NPM Token
         * *   **ftp_cfg**: FTP Config
         * *   **google\_oauth_key**: Google OAuth Key
         * *   **planetscale_passwd**: Planetscale password
         * *   **github\_ssh_key**: Github SSH Key
         * *   **msbuild\_publish_profile**: MSBuild publish profile
         * *   **fastly\_cdn_token**: Fastly CDN Token
         * *   **ssh\_private_key**: SSH Private Key
         * *   **aws_cli**: AWS CLI Credentials
         * *   **cpanel\_proftpd**: cPanel ProFTPd Credential
         * *   **postgresql_passwd**: PostgreSQl Passwd
         * *   **discord\_client_cred**: Discord Client Credential
         * *   **rails_database**: Rails Database Config
         * *   **aws\_access_key**: AWS Access Key
         * *   **esmtp_cfg**: ESMTP Config
         * *   **docker\_registry_cfg**: Docker Registry Config
         * *   **pem**: PEM
         * *   **common_cred**: Common Credential
         * *   **sftp_cfg**: SFTP Config
         * *   **grafana_token**: Grafana Token
         * *   **slack_token**: Slack Token
         * *   **ec\_private_key**: EC Private Key
         * *   **pypi_token**: PyPI Token
         * *   **finicity_token**: Finicity Token
         * *   **k8s\_client_key**: Kubernetes Client Key
         * *   **git_cfg**: Git Config
         * *   **django_key**: Django Key
         * *   **jenkins_ssh**: Jenkins SSH Config
         * *   **openssh\_private_key**: OPENSSH Private Key
         * *   **square_oauth**: Square OAuth Token
         * *   **typeform_token**: Typeform Token
         * *   **common\_database_cfg**: Common Database Config
         * *   **wordpress\_database_cfg**: Wordpress Database Config
         * *   **googlecloud\_api_key**: Google Cloud API Key
         * *   **vscode_sftp**: VSCode SFTP Config
         * *   **apache_htpasswd**: Apache htpasswd
         * *   **planetscale_token**: Planetscale Token
         * *   **contentful\_preview_token**: Contentful Preview Token
         * *   **php\_database_cfg**: PHP Database Config
         * *   **atom\_remote_sync**: Atom Remote Sync Config
         * *   **aws\_session_token**: AWS Session Token
         * *   **atom\_sftp_cfg**: Atom SFTP Config
         * *   **asana\_client\_private_key**: Asana Client Private Key
         * *   **tencentcloud_ak**: Tencent Cloud SecretId
         * *   **rsa\_private_key**: RSA Private Key
         * *   **github\_personal_token**: Github Personal Token
         * *   **pgp**: PGP
         * *   **stripe_skpk**: Stripe Secret Key
         * *   **square_token**: Square Token
         * *   **rails_carrierwave**: Rails Carrierwave Credential
         * *   **dbeaver\_database_cfg**: DBeaver Database Config
         * *   **robomongo_cred**: Robomongo Credential
         * *   **github\_oauth_token**: Github OAuth Token
         * *   **pulumi_token**: Pulumi Token
         * *   **ventrilo_voip**: Ventrilo VoIP Server Config
         * *   **macos_keychain**: macOS Keychain
         * *   **amazon\_mws_token**: Amazon MWS Token
         * *   **dynatrace_token**: Dynatrace Token
         * *   **java_keystore**: Java Keystore
         * *   **microsoft_sdf**: Microsoft SDF
         * *   **kubernetes\_dashboard_cred**: Kubernetes Dashboard User Credential
         * *   **atlassian_token**: Atlassian Token
         * *   **rdp**: RDP
         * *   **mailgun_key**: Mailgun Webhook Signing Key
         * *   **mailchimp\_api_key**: Mailchimp API Key
         * *   **netrc_cfg**: .netrc config
         * *   **openvpn_cfg**: OpenVPN Config
         * *   **github\_refresh_token**: Github Refresh Token
         * *   **salesforce**: Salesforce Credential
         * *   **sendinblue**: Sendinblue Token
         * *   **pkcs\_private_key**: PKCS Private Key
         * *   **rubyonrails_passwd**: Ruby on Rails Passwd
         * *   **filezilla_ftp**: FileZilla FTP Config
         * *   **databricks_token**: Databricks Token
         * *   **gitLab\_personal_token**: GitLab Personal Token
         * *   **rails\_master_key**: Rails Master Key
         * *   **sqlite**: SQLite3/SQLite Database
         * *   **firefox_logins**: Firefox Login Config
         * *   **mailgun\_private_token**: Mailgun Private Token
         * *   **joomla_cfg**: Joomla Config
         * *   **hashicorp\_terraform_token**: Hashicorp Terraform Token
         * *   **jetbrains_ides**: Jetbrains IDEs Config
         * *   **heroku\_api_key**: Heroku API key
         * *   **messagebird_token**: MessageBird Token
         * *   **github\_app_token**: Github App Token
         * *   **hashicorp\_vault_token**: Hashicorp Vault Token
         * *   **pgp\_private_key**: PGP Private Key
         * *   **sshpasswd**: SSH password
         * *   **huaweicloud_ak**: Huaei Cloud Access Key
         * *   **aws_s3cmd**: AWS S3cmd Config
         * *   **php_config**: php Config
         * *   **common\_private_key**: Common Private Key Type
         * *   **microsoft_mdf**: Microsoft MDF
         * *   **mediawiki_cfg**: MediaWiki Config
         * *   **jenkins_cred**: Jenkins Credential
         * *   **rubygems_cred**: Rubygems Credential
         * *   **clojars_token**: Clojars Token
         * *   **phoenix\_web_passwd**: Phoenix Web Credential
         * *   **puttygen\_private_key**: PuTTYgen Private Key
         * *   **google\_oauth_token**: Google Oauth Token
         * *   **rubyonrails_cfg**: Ruby On Rails Database Config
         * *   **lob\_api_key**: Lob API Key
         * *   **pkcs_cred**: PKCS#12
         * *   **otr\_private_key**: OTR Private Key
         * *   **contentful\_delivery_token**: Contentful Delivery Token
         * *   **digital\_ocean_tugboat**: Digital Ocean Tugboat Config
         * *   **dsa\_private_key**: DSA Private Key
         * *   **rails\_app_token**: Rails App Token
         * *   **git_cred**: Git User Credential
         * *   **newrelic\_api_key**: New Relic User API Key
         * *   **github_hub**: Github Token
         * *   **rubygem**: Rubygem Token
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
