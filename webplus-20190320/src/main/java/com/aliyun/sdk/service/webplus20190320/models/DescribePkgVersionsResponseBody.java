// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePkgVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePkgVersionsResponseBody</p>
 */
public class DescribePkgVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PkgVersions")
    private PkgVersions pkgVersions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePkgVersionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pkgVersions = builder.pkgVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePkgVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pkgVersions
     */
    public PkgVersions getPkgVersions() {
        return this.pkgVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private PkgVersions pkgVersions; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PkgVersions.
         */
        public Builder pkgVersions(PkgVersions pkgVersions) {
            this.pkgVersions = pkgVersions;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePkgVersionsResponseBody build() {
            return new DescribePkgVersionsResponseBody(this);
        } 

    } 

    public static class PkgVersion extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("PackageETag")
        private String packageETag;

        @NameInMap("PackageSource")
        private String packageSource;

        @NameInMap("PkgVersionDescription")
        private String pkgVersionDescription;

        @NameInMap("PkgVersionId")
        private String pkgVersionId;

        @NameInMap("PkgVersionLabel")
        private String pkgVersionLabel;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private PkgVersion(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.packageETag = builder.packageETag;
            this.packageSource = builder.packageSource;
            this.pkgVersionDescription = builder.pkgVersionDescription;
            this.pkgVersionId = builder.pkgVersionId;
            this.pkgVersionLabel = builder.pkgVersionLabel;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PkgVersion create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUsername
         */
        public String getCreateUsername() {
            return this.createUsername;
        }

        /**
         * @return packageETag
         */
        public String getPackageETag() {
            return this.packageETag;
        }

        /**
         * @return packageSource
         */
        public String getPackageSource() {
            return this.packageSource;
        }

        /**
         * @return pkgVersionDescription
         */
        public String getPkgVersionDescription() {
            return this.pkgVersionDescription;
        }

        /**
         * @return pkgVersionId
         */
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        /**
         * @return pkgVersionLabel
         */
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Long createTime; 
            private String createUsername; 
            private String packageETag; 
            private String packageSource; 
            private String pkgVersionDescription; 
            private String pkgVersionId; 
            private String pkgVersionLabel; 
            private Long updateTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUsername.
             */
            public Builder createUsername(String createUsername) {
                this.createUsername = createUsername;
                return this;
            }

            /**
             * PackageETag.
             */
            public Builder packageETag(String packageETag) {
                this.packageETag = packageETag;
                return this;
            }

            /**
             * PackageSource.
             */
            public Builder packageSource(String packageSource) {
                this.packageSource = packageSource;
                return this;
            }

            /**
             * PkgVersionDescription.
             */
            public Builder pkgVersionDescription(String pkgVersionDescription) {
                this.pkgVersionDescription = pkgVersionDescription;
                return this;
            }

            /**
             * PkgVersionId.
             */
            public Builder pkgVersionId(String pkgVersionId) {
                this.pkgVersionId = pkgVersionId;
                return this;
            }

            /**
             * PkgVersionLabel.
             */
            public Builder pkgVersionLabel(String pkgVersionLabel) {
                this.pkgVersionLabel = pkgVersionLabel;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PkgVersion build() {
                return new PkgVersion(this);
            } 

        } 

    }
    public static class PkgVersions extends TeaModel {
        @NameInMap("PkgVersion")
        private java.util.List < PkgVersion> pkgVersion;

        private PkgVersions(Builder builder) {
            this.pkgVersion = builder.pkgVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PkgVersions create() {
            return builder().build();
        }

        /**
         * @return pkgVersion
         */
        public java.util.List < PkgVersion> getPkgVersion() {
            return this.pkgVersion;
        }

        public static final class Builder {
            private java.util.List < PkgVersion> pkgVersion; 

            /**
             * PkgVersion.
             */
            public Builder pkgVersion(java.util.List < PkgVersion> pkgVersion) {
                this.pkgVersion = pkgVersion;
                return this;
            }

            public PkgVersions build() {
                return new PkgVersions(this);
            } 

        } 

    }
}
