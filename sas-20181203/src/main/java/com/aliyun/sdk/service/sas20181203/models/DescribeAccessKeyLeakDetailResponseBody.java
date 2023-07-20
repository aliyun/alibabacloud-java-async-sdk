// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessKeyLeakDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessKeyLeakDetailResponseBody</p>
 */
public class DescribeAccessKeyLeakDetailResponseBody extends TeaModel {
    @NameInMap("AccesskeyId")
    private String accesskeyId;

    @NameInMap("Asset")
    private String asset;

    @NameInMap("Code")
    private String code;

    @NameInMap("DealTime")
    private String dealTime;

    @NameInMap("DealType")
    private String dealType;

    @NameInMap("GithubFileName")
    private String githubFileName;

    @NameInMap("GithubFileType")
    private String githubFileType;

    @NameInMap("GithubFileUpdateTime")
    private String githubFileUpdateTime;

    @NameInMap("GithubFileUrl")
    private String githubFileUrl;

    @NameInMap("GithubRepoName")
    private String githubRepoName;

    @NameInMap("GithubRepoUrl")
    private String githubRepoUrl;

    @NameInMap("GithubUser")
    private String githubUser;

    @NameInMap("GithubUserPicUrl")
    private String githubUserPicUrl;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Source")
    private String source;

    @NameInMap("TokenValid")
    private Integer tokenValid;

    @NameInMap("Type")
    private String type;

    @NameInMap("WhitelistStatus")
    private String whitelistStatus;

    @NameInMap("WhitelistTime")
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
         * AccesskeyId.
         */
        public Builder accesskeyId(String accesskeyId) {
            this.accesskeyId = accesskeyId;
            return this;
        }

        /**
         * Asset.
         */
        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DealTime.
         */
        public Builder dealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }

        /**
         * DealType.
         */
        public Builder dealType(String dealType) {
            this.dealType = dealType;
            return this;
        }

        /**
         * GithubFileName.
         */
        public Builder githubFileName(String githubFileName) {
            this.githubFileName = githubFileName;
            return this;
        }

        /**
         * GithubFileType.
         */
        public Builder githubFileType(String githubFileType) {
            this.githubFileType = githubFileType;
            return this;
        }

        /**
         * GithubFileUpdateTime.
         */
        public Builder githubFileUpdateTime(String githubFileUpdateTime) {
            this.githubFileUpdateTime = githubFileUpdateTime;
            return this;
        }

        /**
         * GithubFileUrl.
         */
        public Builder githubFileUrl(String githubFileUrl) {
            this.githubFileUrl = githubFileUrl;
            return this;
        }

        /**
         * GithubRepoName.
         */
        public Builder githubRepoName(String githubRepoName) {
            this.githubRepoName = githubRepoName;
            return this;
        }

        /**
         * GithubRepoUrl.
         */
        public Builder githubRepoUrl(String githubRepoUrl) {
            this.githubRepoUrl = githubRepoUrl;
            return this;
        }

        /**
         * GithubUser.
         */
        public Builder githubUser(String githubUser) {
            this.githubUser = githubUser;
            return this;
        }

        /**
         * GithubUserPicUrl.
         */
        public Builder githubUserPicUrl(String githubUserPicUrl) {
            this.githubUserPicUrl = githubUserPicUrl;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * TokenValid.
         */
        public Builder tokenValid(Integer tokenValid) {
            this.tokenValid = tokenValid;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * WhitelistStatus.
         */
        public Builder whitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        /**
         * WhitelistTime.
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
