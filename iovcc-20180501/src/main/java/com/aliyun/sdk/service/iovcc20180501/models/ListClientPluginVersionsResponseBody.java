// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientPluginVersionsResponseBody</p>
 */
public class ListClientPluginVersionsResponseBody extends TeaModel {
    @NameInMap("ClientPluginVersions")
    private java.util.List < ClientPluginVersions> clientPluginVersions;

    @NameInMap("RequestId")
    private String requestId;

    private ListClientPluginVersionsResponseBody(Builder builder) {
        this.clientPluginVersions = builder.clientPluginVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientPluginVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientPluginVersions
     */
    public java.util.List < ClientPluginVersions> getClientPluginVersions() {
        return this.clientPluginVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClientPluginVersions> clientPluginVersions; 
        private String requestId; 

        /**
         * ClientPluginVersions.
         */
        public Builder clientPluginVersions(java.util.List < ClientPluginVersions> clientPluginVersions) {
            this.clientPluginVersions = clientPluginVersions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientPluginVersionsResponseBody build() {
            return new ListClientPluginVersionsResponseBody(this);
        } 

    } 

    public static class ClientPluginVersions extends TeaModel {
        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PkgName")
        private String pkgName;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionCode")
        private Long versionCode;

        private ClientPluginVersions(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.id = builder.id;
            this.pkgName = builder.pkgName;
            this.size = builder.size;
            this.version = builder.version;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientPluginVersions create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return pkgName
         */
        public String getPkgName() {
            return this.pkgName;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionCode
         */
        public Long getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long id; 
            private String pkgName; 
            private Long size; 
            private String version; 
            private Long versionCode; 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * PkgName.
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(Long versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public ClientPluginVersions build() {
                return new ClientPluginVersions(this);
            } 

        } 

    }
}
