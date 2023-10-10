// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoryDeployVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoryDeployVersionResponseBody</p>
 */
public class ListHistoryDeployVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PackageVersionList")
    private PackageVersionList packageVersionList;

    @NameInMap("RequestId")
    private String requestId;

    private ListHistoryDeployVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.packageVersionList = builder.packageVersionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoryDeployVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return packageVersionList
     */
    public PackageVersionList getPackageVersionList() {
        return this.packageVersionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private PackageVersionList packageVersionList; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about historical deployment packages.
         */
        public Builder packageVersionList(PackageVersionList packageVersionList) {
            this.packageVersionList = packageVersionList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHistoryDeployVersionResponseBody build() {
            return new ListHistoryDeployVersionResponseBody(this);
        } 

    } 

    public static class PackageVersion extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("PublicUrl")
        private String publicUrl;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("WarUrl")
        private String warUrl;

        private PackageVersion(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.packageVersion = builder.packageVersion;
            this.publicUrl = builder.publicUrl;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.warUrl = builder.warUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageVersion create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return warUrl
         */
        public String getWarUrl() {
            return this.warUrl;
        }

        public static final class Builder {
            private String appId; 
            private Long createTime; 
            private String description; 
            private String id; 
            private String packageVersion; 
            private String publicUrl; 
            private String type; 
            private Long updateTime; 
            private String warUrl; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the deployment package was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the deployment package.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The unique ID of the deployment package.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The version of the application that was released by using the deployment package. This version can be used to call the RollbackApplication operation.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * The URL of the deployment package.
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            /**
             * The deployment mode of the application. Valid values:
             * <p>
             * 
             * *   url: The application is deployed by using a JAR or WAR package.
             * *   image: The application is deployed by using an image.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the deployment package was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The URL of the deployment package.
             */
            public Builder warUrl(String warUrl) {
                this.warUrl = warUrl;
                return this;
            }

            public PackageVersion build() {
                return new PackageVersion(this);
            } 

        } 

    }
    public static class PackageVersionList extends TeaModel {
        @NameInMap("PackageVersion")
        private java.util.List < PackageVersion> packageVersion;

        private PackageVersionList(Builder builder) {
            this.packageVersion = builder.packageVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageVersionList create() {
            return builder().build();
        }

        /**
         * @return packageVersion
         */
        public java.util.List < PackageVersion> getPackageVersion() {
            return this.packageVersion;
        }

        public static final class Builder {
            private java.util.List < PackageVersion> packageVersion; 

            /**
             * The version of the application that was released by using the deployment package. This version can be used to call the RollbackApplication operation.
             */
            public Builder packageVersion(java.util.List < PackageVersion> packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            public PackageVersionList build() {
                return new PackageVersionList(this);
            } 

        } 

    }
}
