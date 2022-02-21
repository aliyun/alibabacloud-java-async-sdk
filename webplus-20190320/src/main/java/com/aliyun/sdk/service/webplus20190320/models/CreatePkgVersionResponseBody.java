// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePkgVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePkgVersionResponseBody</p>
 */
public class CreatePkgVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PkgVersion")
    private PkgVersion pkgVersion;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePkgVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pkgVersion = builder.pkgVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePkgVersionResponseBody create() {
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
     * @return pkgVersion
     */
    public PkgVersion getPkgVersion() {
        return this.pkgVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private PkgVersion pkgVersion; 
        private String requestId; 

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
         * PkgVersion.
         */
        public Builder pkgVersion(PkgVersion pkgVersion) {
            this.pkgVersion = pkgVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePkgVersionResponseBody build() {
            return new CreatePkgVersionResponseBody(this);
        } 

    } 

    public static class PkgVersion extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

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
}
