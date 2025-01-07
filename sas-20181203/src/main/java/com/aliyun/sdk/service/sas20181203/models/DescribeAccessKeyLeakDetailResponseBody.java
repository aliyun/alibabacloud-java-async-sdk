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
         * <p>The ID of the AccessKey pair that is leaked.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4G4VjkC9wenfEvgX****</p>
         */
        public Builder accesskeyId(String accesskeyId) {
            this.accesskeyId = accesskeyId;
            return this;
        }

        /**
         * <p>The platform to which the asset belongs. The value is fixed as <strong>Cloud platform</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud platform</p>
         */
        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        /**
         * <p>The code snippet that is leaked.</p>
         * 
         * <strong>example:</strong>
         * <p>\n1231 \nak=LTAI4G4VjkC9wenfEvgX**** \n12311123 \nsk1999 \nsk1999sk1999 \nsk1999sk1999 \n\n\ntest001 ak hht \nak=LTAI4G4VjkC9wenfEvgX**** \nsk=AjEhS9XmnIzllpAx2LxMTMdrTG****</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the AccessKey pair leak was handled.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-17 15:47:08</p>
         */
        public Builder dealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }

        /**
         * <p>The solution to the AccessKey pair leak. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: manually deleted</li>
         * <li><strong>disable</strong>: manually disabled</li>
         * <li><strong>add-whitelist</strong>: added to the whitelist</li>
         * <li><strong>pending</strong>: unhandled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add-whitelist</p>
         */
        public Builder dealType(String dealType) {
            this.dealType = dealType;
            return this;
        }

        /**
         * <p>The name of the GitHub file.</p>
         * 
         * <strong>example:</strong>
         * <p>testAkLeak</p>
         */
        public Builder githubFileName(String githubFileName) {
            this.githubFileName = githubFileName;
            return this;
        }

        /**
         * <p>The type of the GitHub file. Valid values:</p>
         * <ul>
         * <li>Python</li>
         * <li>XML</li>
         * <li>GO</li>
         * <li>Javascript</li>
         * <li>INI</li>
         * <li>JSON</li>
         * <li>C++</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Python</p>
         */
        public Builder githubFileType(String githubFileType) {
            this.githubFileType = githubFileType;
            return this;
        }

        /**
         * <p>The time when the GitHub file was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06T09:49:33</p>
         */
        public Builder githubFileUpdateTime(String githubFileUpdateTime) {
            this.githubFileUpdateTime = githubFileUpdateTime;
            return this;
        }

        /**
         * <p>The URL of the GitHub file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://github.com/Blue00Blue/ExamOnline/blob/6c932c10fc3f217783f3937e2b230f79656c18a7/testAk">https://github.com/Blue00Blue/ExamOnline/blob/6c932c10fc3f217783f3937e2b230f79656c18a7/testAk</a>****</p>
         */
        public Builder githubFileUrl(String githubFileUrl) {
            this.githubFileUrl = githubFileUrl;
            return this;
        }

        /**
         * <p>The name of the GitHub repository.</p>
         * 
         * <strong>example:</strong>
         * <p>ExamOnline</p>
         */
        public Builder githubRepoName(String githubRepoName) {
            this.githubRepoName = githubRepoName;
            return this;
        }

        /**
         * <p>The URL of the GitHub repository.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://github.com/Blue00Blue/ExamOn">https://github.com/Blue00Blue/ExamOn</a>****</p>
         */
        public Builder githubRepoUrl(String githubRepoUrl) {
            this.githubRepoUrl = githubRepoUrl;
            return this;
        }

        /**
         * <p>The username of the GitHub user.</p>
         * 
         * <strong>example:</strong>
         * <p>Blue00Blue</p>
         */
        public Builder githubUser(String githubUser) {
            this.githubUser = githubUser;
            return this;
        }

        /**
         * <p>The URL of the profile picture for the GitHub user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avatars.githubusercontent.com/u/26296896?s=48&v=">https://avatars.githubusercontent.com/u/26296896?s=48&amp;v=</a>****</p>
         */
        public Builder githubUserPicUrl(String githubUserPicUrl) {
            this.githubUserPicUrl = githubUserPicUrl;
            return this;
        }

        /**
         * <p>The first time when the AccessKey pair leak was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06 17:49:41</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The last time when the AccessKey pair leak was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06 17:49:39</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The remarks of the AccessKey pair leak.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The platform on which the AccessKey pair leak is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>GitHub</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The validity of the key that is associated with the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: to be confirmed.</li>
         * <li><strong>1</strong>: valid.</li>
         * <li><strong>2</strong>: invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tokenValid(Integer tokenValid) {
            this.tokenValid = tokenValid;
            return this;
        }

        /**
         * <p>The type of the leak. The value is fixed as <strong>AccessKey</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>AccessKey</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Indicates whether the AccessKey pair leak is added to the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>no</strong>: no</li>
         * <li><strong>yes</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder whitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        /**
         * <p>The time when the AccessKey pair was added to the whitelist. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1689172004478</p>
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
