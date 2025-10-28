// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListHistoryDeployVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoryDeployVersionResponseBody</p>
 */
public class ListHistoryDeployVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PackageVersionList")
    private PackageVersionList packageVersionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListHistoryDeployVersionResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.packageVersionList = model.packageVersionList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about historical deployment packages.</p>
         */
        public Builder packageVersionList(PackageVersionList packageVersionList) {
            this.packageVersionList = packageVersionList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHistoryDeployVersionResponseBody build() {
            return new ListHistoryDeployVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHistoryDeployVersionResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoryDeployVersionResponseBody</p>
     */
    public static class PackageVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
        private String publicUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("WarUrl")
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

            private Builder() {
            } 

            private Builder(PackageVersion model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.id = model.id;
                this.packageVersion = model.packageVersion;
                this.publicUrl = model.publicUrl;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.warUrl = model.warUrl;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the deployment package was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573627440892</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique ID of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>441beb18-da42-44dc-<strong><strong>-</strong></strong>********</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The version of the application that was released by using the deployment package. This version can be used to call the RollbackApplication operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The URL of the deployment package.</p>
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            /**
             * <p>The deployment mode of the application. Valid values:</p>
             * <ul>
             * <li>url: The application is deployed by using a JAR or WAR package.</li>
             * <li>image: The application is deployed by using an image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>url</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the deployment package was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573627440892</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The URL of the deployment package.</p>
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
    /**
     * 
     * {@link ListHistoryDeployVersionResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoryDeployVersionResponseBody</p>
     */
    public static class PackageVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private java.util.List<PackageVersion> packageVersion;

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
        public java.util.List<PackageVersion> getPackageVersion() {
            return this.packageVersion;
        }

        public static final class Builder {
            private java.util.List<PackageVersion> packageVersion; 

            private Builder() {
            } 

            private Builder(PackageVersionList model) {
                this.packageVersion = model.packageVersion;
            } 

            /**
             * <p>The version of the application that was released by using the deployment package. This version can be used to call the RollbackApplication operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder packageVersion(java.util.List<PackageVersion> packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            public PackageVersionList build() {
                return new PackageVersionList(this);
            } 

        } 

    }
}
