// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessKeyLeakDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessKeyLeakDetailResponseBody</p>
 */
public class DescribeAccessKeyLeakDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccesskeyId")
    private String accesskeyId;

    @com.aliyun.core.annotation.NameInMap("Asset")
    private String asset;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DealTime")
    private String dealTime;

    @com.aliyun.core.annotation.NameInMap("DealType")
    private String dealType;

    @com.aliyun.core.annotation.NameInMap("GithubFileName")
    private String githubFileName;

    @com.aliyun.core.annotation.NameInMap("GithubFileType")
    private String githubFileType;

    @com.aliyun.core.annotation.NameInMap("GithubFileUpdateTime")
    private String githubFileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("GithubFileUrl")
    private String githubFileUrl;

    @com.aliyun.core.annotation.NameInMap("GithubRepoName")
    private String githubRepoName;

    @com.aliyun.core.annotation.NameInMap("GithubRepoUrl")
    private String githubRepoUrl;

    @com.aliyun.core.annotation.NameInMap("GithubUser")
    private String githubUser;

    @com.aliyun.core.annotation.NameInMap("GithubUserPicUrl")
    private String githubUserPicUrl;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("TokenValid")
    private Integer tokenValid;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("WhitelistStatus")
    private String whitelistStatus;

    @com.aliyun.core.annotation.NameInMap("WhitelistTime")
    private Long whitelistTime;

    private DescribeAccessKeyLeakDetailResponseBody(Builder builder) {
        this.accesskeyId = builder.accesskeyId;
        this.asset = builder.asset;
        this.code = builder.code;
        this.dealTime = builder.dealTime;
        this.dealType = builder.dealType;
        this.githubFileName = builder.githubFileName;
        this.githubFileType = builder.githubFileType;
        this.githubFileUpdateTime = builder.githubFileUpdateTime;
        this.githubFileUrl = builder.githubFileUrl;
        this.githubRepoName = builder.githubRepoName;
        this.githubRepoUrl = builder.githubRepoUrl;
        this.githubUser = builder.githubUser;
        this.githubUserPicUrl = builder.githubUserPicUrl;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.tokenValid = builder.tokenValid;
        this.type = builder.type;
        this.whitelistStatus = builder.whitelistStatus;
        this.whitelistTime = builder.whitelistTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessKeyLeakDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return accesskeyId
     */
    public String getAccesskeyId() {
        return this.accesskeyId;
    }

    /**
     * @return asset
     */
    public String getAsset() {
        return this.asset;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dealTime
     */
    public String getDealTime() {
        return this.dealTime;
    }

    /**
     * @return dealType
     */
    public String getDealType() {
        return this.dealType;
    }

    /**
     * @return githubFileName
     */
    public String getGithubFileName() {
        return this.githubFileName;
    }

    /**
     * @return githubFileType
     */
    public String getGithubFileType() {
        return this.githubFileType;
    }

    /**
     * @return githubFileUpdateTime
     */
    public String getGithubFileUpdateTime() {
        return this.githubFileUpdateTime;
    }

    /**
     * @return githubFileUrl
     */
    public String getGithubFileUrl() {
        return this.githubFileUrl;
    }

    /**
     * @return githubRepoName
     */
    public String getGithubRepoName() {
        return this.githubRepoName;
    }

    /**
     * @return githubRepoUrl
     */
    public String getGithubRepoUrl() {
        return this.githubRepoUrl;
    }

    /**
     * @return githubUser
     */
    public String getGithubUser() {
        return this.githubUser;
    }

    /**
     * @return githubUserPicUrl
     */
    public String getGithubUserPicUrl() {
        return this.githubUserPicUrl;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tokenValid
     */
    public Integer getTokenValid() {
        return this.tokenValid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return whitelistStatus
     */
    public String getWhitelistStatus() {
        return this.whitelistStatus;
    }

    /**
     * @return whitelistTime
     */
    public Long getWhitelistTime() {
        return this.whitelistTime;
    }

    public static final class Builder {
        private String accesskeyId; 
        private String asset; 
        private String code; 
        private String dealTime; 
        private String dealType; 
        private String githubFileName; 
        private String githubFileType; 
        private String githubFileUpdateTime; 
        private String githubFileUrl; 
        private String githubRepoName; 
        private String githubRepoUrl; 
        private String githubUser; 
        private String githubUserPicUrl; 
        private String gmtCreate; 
        private String gmtModified; 
        private String remark; 
        private String requestId; 
        private String source; 
        private Integer tokenValid; 
        private String type; 
        private String whitelistStatus; 
        private Long whitelistTime; 

        /**
         * The ID of the AccessKey pair that is leaked.
         */
        public Builder accesskeyId(String accesskeyId) {
            this.accesskeyId = accesskeyId;
            return this;
        }

        /**
         * The platform to which the asset belongs. The value is fixed as **Cloud platform**.
         */
        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        /**
         * The code snippet that is leaked.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the AccessKey pair leak was handled.
         */
        public Builder dealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }

        /**
         * The solution to the AccessKey pair leak. Valid values:
         * <p>
         * 
         * *   **manual**: manually deleted
         * *   **disable**: manually disabled
         * *   **add-whitelist**: added to the whitelist
         * *   **pending**: unhandled
         */
        public Builder dealType(String dealType) {
            this.dealType = dealType;
            return this;
        }

        /**
         * The name of the GitHub file.
         */
        public Builder githubFileName(String githubFileName) {
            this.githubFileName = githubFileName;
            return this;
        }

        /**
         * The type of the GitHub file. Valid values:
         * <p>
         * 
         * *   Python
         * *   XML
         * *   GO
         * *   Javascript
         * *   INI
         * *   JSON
         * *   C++
         */
        public Builder githubFileType(String githubFileType) {
            this.githubFileType = githubFileType;
            return this;
        }

        /**
         * The time when the GitHub file was updated.
         */
        public Builder githubFileUpdateTime(String githubFileUpdateTime) {
            this.githubFileUpdateTime = githubFileUpdateTime;
            return this;
        }

        /**
         * The URL of the GitHub file.
         */
        public Builder githubFileUrl(String githubFileUrl) {
            this.githubFileUrl = githubFileUrl;
            return this;
        }

        /**
         * The name of the GitHub repository.
         */
        public Builder githubRepoName(String githubRepoName) {
            this.githubRepoName = githubRepoName;
            return this;
        }

        /**
         * The URL of the GitHub repository.
         */
        public Builder githubRepoUrl(String githubRepoUrl) {
            this.githubRepoUrl = githubRepoUrl;
            return this;
        }

        /**
         * The username of the GitHub user.
         */
        public Builder githubUser(String githubUser) {
            this.githubUser = githubUser;
            return this;
        }

        /**
         * The URL of the profile picture for the GitHub user.
         */
        public Builder githubUserPicUrl(String githubUserPicUrl) {
            this.githubUserPicUrl = githubUserPicUrl;
            return this;
        }

        /**
         * The first time when the AccessKey pair leak was detected.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * The last time when the AccessKey pair leak was detected.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * The remarks of the AccessKey pair leak.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * The platform on which the AccessKey pair leak is detected.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * The validity of the key associated with the AK. Value:
         * <p>
         * 
         * * 0: to be confirmed
         * * 1: Valid
         * * 2: Invalid
         */
        public Builder tokenValid(Integer tokenValid) {
            this.tokenValid = tokenValid;
            return this;
        }

        /**
         * The type of the leak. The value is fixed as **AccessKey**.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Indicates whether the AccessKey pair leak is added to the whitelist. Valid values:
         * <p>
         * 
         * *   **no**: no
         * *   **yes**: yes
         */
        public Builder whitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        /**
         * The time when the AK whitelist was added. Unit: milliseconds.
         */
        public Builder whitelistTime(Long whitelistTime) {
            this.whitelistTime = whitelistTime;
            return this;
        }

        public DescribeAccessKeyLeakDetailResponseBody build() {
            return new DescribeAccessKeyLeakDetailResponseBody(this);
        } 

    } 

}
