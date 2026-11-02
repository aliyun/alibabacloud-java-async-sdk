// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link QueryMiniGameQualificationByAppResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMiniGameQualificationByAppResponseBody</p>
 */
public class QueryMiniGameQualificationByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMiniGameQualificationByAppResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.content = builder.content;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMiniGameQualificationByAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Content> content; 
        private String errorCode; 
        private String requestId; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryMiniGameQualificationByAppResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.content = model.content;
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMiniGameQualificationByAppResponseBody build() {
            return new QueryMiniGameQualificationByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMiniGameQualificationByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMiniGameQualificationByAppResponseBody</p>
     */
    public static class CopyrightAuthorizationFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CopyrightAuthorizationFiles(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CopyrightAuthorizationFiles create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            private Builder() {
            } 

            private Builder(CopyrightAuthorizationFiles model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CopyrightAuthorizationFiles build() {
                return new CopyrightAuthorizationFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMiniGameQualificationByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMiniGameQualificationByAppResponseBody</p>
     */
    public static class IpAuthorizationFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private IpAuthorizationFiles(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAuthorizationFiles create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            private Builder() {
            } 

            private Builder(IpAuthorizationFiles model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public IpAuthorizationFiles build() {
                return new IpAuthorizationFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMiniGameQualificationByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMiniGameQualificationByAppResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessLicenseName")
        private String businessLicenseName;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseUrl")
        private String businessLicenseUrl;

        @com.aliyun.core.annotation.NameInMap("CopyrightAuthorizationFiles")
        private java.util.List<CopyrightAuthorizationFiles> copyrightAuthorizationFiles;

        @com.aliyun.core.annotation.NameInMap("CopyrightFileName")
        private String copyrightFileName;

        @com.aliyun.core.annotation.NameInMap("CopyrightRegistrationNumber")
        private String copyrightRegistrationNumber;

        @com.aliyun.core.annotation.NameInMap("CopyrightUrl")
        private String copyrightUrl;

        @com.aliyun.core.annotation.NameInMap("Developer")
        private String developer;

        @com.aliyun.core.annotation.NameInMap("GameType")
        private String gameType;

        @com.aliyun.core.annotation.NameInMap("GameVersionId")
        private String gameVersionId;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("IcpFileName")
        private String icpFileName;

        @com.aliyun.core.annotation.NameInMap("IcpUrl")
        private String icpUrl;

        @com.aliyun.core.annotation.NameInMap("IdCode")
        private String idCode;

        @com.aliyun.core.annotation.NameInMap("IpAuthorizationFiles")
        private java.util.List<IpAuthorizationFiles> ipAuthorizationFiles;

        @com.aliyun.core.annotation.NameInMap("MiniProgramCode")
        private String miniProgramCode;

        @com.aliyun.core.annotation.NameInMap("MiniProgramId")
        private Long miniProgramId;

        @com.aliyun.core.annotation.NameInMap("OnlineGamePubReFileName")
        private String onlineGamePubReFileName;

        @com.aliyun.core.annotation.NameInMap("OnlineGamePubReUrl")
        private String onlineGamePubReUrl;

        @com.aliyun.core.annotation.NameInMap("PrivacyPolicyUrl")
        private String privacyPolicyUrl;

        @com.aliyun.core.annotation.NameInMap("Publisher")
        private String publisher;

        @com.aliyun.core.annotation.NameInMap("ReviewStatus")
        private String reviewStatus;

        private Content(Builder builder) {
            this.businessLicenseName = builder.businessLicenseName;
            this.businessLicenseUrl = builder.businessLicenseUrl;
            this.copyrightAuthorizationFiles = builder.copyrightAuthorizationFiles;
            this.copyrightFileName = builder.copyrightFileName;
            this.copyrightRegistrationNumber = builder.copyrightRegistrationNumber;
            this.copyrightUrl = builder.copyrightUrl;
            this.developer = builder.developer;
            this.gameType = builder.gameType;
            this.gameVersionId = builder.gameVersionId;
            this.gmtModified = builder.gmtModified;
            this.icpFileName = builder.icpFileName;
            this.icpUrl = builder.icpUrl;
            this.idCode = builder.idCode;
            this.ipAuthorizationFiles = builder.ipAuthorizationFiles;
            this.miniProgramCode = builder.miniProgramCode;
            this.miniProgramId = builder.miniProgramId;
            this.onlineGamePubReFileName = builder.onlineGamePubReFileName;
            this.onlineGamePubReUrl = builder.onlineGamePubReUrl;
            this.privacyPolicyUrl = builder.privacyPolicyUrl;
            this.publisher = builder.publisher;
            this.reviewStatus = builder.reviewStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return businessLicenseName
         */
        public String getBusinessLicenseName() {
            return this.businessLicenseName;
        }

        /**
         * @return businessLicenseUrl
         */
        public String getBusinessLicenseUrl() {
            return this.businessLicenseUrl;
        }

        /**
         * @return copyrightAuthorizationFiles
         */
        public java.util.List<CopyrightAuthorizationFiles> getCopyrightAuthorizationFiles() {
            return this.copyrightAuthorizationFiles;
        }

        /**
         * @return copyrightFileName
         */
        public String getCopyrightFileName() {
            return this.copyrightFileName;
        }

        /**
         * @return copyrightRegistrationNumber
         */
        public String getCopyrightRegistrationNumber() {
            return this.copyrightRegistrationNumber;
        }

        /**
         * @return copyrightUrl
         */
        public String getCopyrightUrl() {
            return this.copyrightUrl;
        }

        /**
         * @return developer
         */
        public String getDeveloper() {
            return this.developer;
        }

        /**
         * @return gameType
         */
        public String getGameType() {
            return this.gameType;
        }

        /**
         * @return gameVersionId
         */
        public String getGameVersionId() {
            return this.gameVersionId;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return icpFileName
         */
        public String getIcpFileName() {
            return this.icpFileName;
        }

        /**
         * @return icpUrl
         */
        public String getIcpUrl() {
            return this.icpUrl;
        }

        /**
         * @return idCode
         */
        public String getIdCode() {
            return this.idCode;
        }

        /**
         * @return ipAuthorizationFiles
         */
        public java.util.List<IpAuthorizationFiles> getIpAuthorizationFiles() {
            return this.ipAuthorizationFiles;
        }

        /**
         * @return miniProgramCode
         */
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        /**
         * @return miniProgramId
         */
        public Long getMiniProgramId() {
            return this.miniProgramId;
        }

        /**
         * @return onlineGamePubReFileName
         */
        public String getOnlineGamePubReFileName() {
            return this.onlineGamePubReFileName;
        }

        /**
         * @return onlineGamePubReUrl
         */
        public String getOnlineGamePubReUrl() {
            return this.onlineGamePubReUrl;
        }

        /**
         * @return privacyPolicyUrl
         */
        public String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        /**
         * @return reviewStatus
         */
        public String getReviewStatus() {
            return this.reviewStatus;
        }

        public static final class Builder {
            private String businessLicenseName; 
            private String businessLicenseUrl; 
            private java.util.List<CopyrightAuthorizationFiles> copyrightAuthorizationFiles; 
            private String copyrightFileName; 
            private String copyrightRegistrationNumber; 
            private String copyrightUrl; 
            private String developer; 
            private String gameType; 
            private String gameVersionId; 
            private Long gmtModified; 
            private String icpFileName; 
            private String icpUrl; 
            private String idCode; 
            private java.util.List<IpAuthorizationFiles> ipAuthorizationFiles; 
            private String miniProgramCode; 
            private Long miniProgramId; 
            private String onlineGamePubReFileName; 
            private String onlineGamePubReUrl; 
            private String privacyPolicyUrl; 
            private String publisher; 
            private String reviewStatus; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.businessLicenseName = model.businessLicenseName;
                this.businessLicenseUrl = model.businessLicenseUrl;
                this.copyrightAuthorizationFiles = model.copyrightAuthorizationFiles;
                this.copyrightFileName = model.copyrightFileName;
                this.copyrightRegistrationNumber = model.copyrightRegistrationNumber;
                this.copyrightUrl = model.copyrightUrl;
                this.developer = model.developer;
                this.gameType = model.gameType;
                this.gameVersionId = model.gameVersionId;
                this.gmtModified = model.gmtModified;
                this.icpFileName = model.icpFileName;
                this.icpUrl = model.icpUrl;
                this.idCode = model.idCode;
                this.ipAuthorizationFiles = model.ipAuthorizationFiles;
                this.miniProgramCode = model.miniProgramCode;
                this.miniProgramId = model.miniProgramId;
                this.onlineGamePubReFileName = model.onlineGamePubReFileName;
                this.onlineGamePubReUrl = model.onlineGamePubReUrl;
                this.privacyPolicyUrl = model.privacyPolicyUrl;
                this.publisher = model.publisher;
                this.reviewStatus = model.reviewStatus;
            } 

            /**
             * BusinessLicenseName.
             */
            public Builder businessLicenseName(String businessLicenseName) {
                this.businessLicenseName = businessLicenseName;
                return this;
            }

            /**
             * BusinessLicenseUrl.
             */
            public Builder businessLicenseUrl(String businessLicenseUrl) {
                this.businessLicenseUrl = businessLicenseUrl;
                return this;
            }

            /**
             * CopyrightAuthorizationFiles.
             */
            public Builder copyrightAuthorizationFiles(java.util.List<CopyrightAuthorizationFiles> copyrightAuthorizationFiles) {
                this.copyrightAuthorizationFiles = copyrightAuthorizationFiles;
                return this;
            }

            /**
             * CopyrightFileName.
             */
            public Builder copyrightFileName(String copyrightFileName) {
                this.copyrightFileName = copyrightFileName;
                return this;
            }

            /**
             * CopyrightRegistrationNumber.
             */
            public Builder copyrightRegistrationNumber(String copyrightRegistrationNumber) {
                this.copyrightRegistrationNumber = copyrightRegistrationNumber;
                return this;
            }

            /**
             * CopyrightUrl.
             */
            public Builder copyrightUrl(String copyrightUrl) {
                this.copyrightUrl = copyrightUrl;
                return this;
            }

            /**
             * Developer.
             */
            public Builder developer(String developer) {
                this.developer = developer;
                return this;
            }

            /**
             * GameType.
             */
            public Builder gameType(String gameType) {
                this.gameType = gameType;
                return this;
            }

            /**
             * GameVersionId.
             */
            public Builder gameVersionId(String gameVersionId) {
                this.gameVersionId = gameVersionId;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IcpFileName.
             */
            public Builder icpFileName(String icpFileName) {
                this.icpFileName = icpFileName;
                return this;
            }

            /**
             * IcpUrl.
             */
            public Builder icpUrl(String icpUrl) {
                this.icpUrl = icpUrl;
                return this;
            }

            /**
             * IdCode.
             */
            public Builder idCode(String idCode) {
                this.idCode = idCode;
                return this;
            }

            /**
             * IpAuthorizationFiles.
             */
            public Builder ipAuthorizationFiles(java.util.List<IpAuthorizationFiles> ipAuthorizationFiles) {
                this.ipAuthorizationFiles = ipAuthorizationFiles;
                return this;
            }

            /**
             * MiniProgramCode.
             */
            public Builder miniProgramCode(String miniProgramCode) {
                this.miniProgramCode = miniProgramCode;
                return this;
            }

            /**
             * MiniProgramId.
             */
            public Builder miniProgramId(Long miniProgramId) {
                this.miniProgramId = miniProgramId;
                return this;
            }

            /**
             * OnlineGamePubReFileName.
             */
            public Builder onlineGamePubReFileName(String onlineGamePubReFileName) {
                this.onlineGamePubReFileName = onlineGamePubReFileName;
                return this;
            }

            /**
             * OnlineGamePubReUrl.
             */
            public Builder onlineGamePubReUrl(String onlineGamePubReUrl) {
                this.onlineGamePubReUrl = onlineGamePubReUrl;
                return this;
            }

            /**
             * PrivacyPolicyUrl.
             */
            public Builder privacyPolicyUrl(String privacyPolicyUrl) {
                this.privacyPolicyUrl = privacyPolicyUrl;
                return this;
            }

            /**
             * Publisher.
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * ReviewStatus.
             */
            public Builder reviewStatus(String reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
