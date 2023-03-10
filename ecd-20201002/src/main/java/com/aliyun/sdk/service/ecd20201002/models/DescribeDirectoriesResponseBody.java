// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirectoriesResponseBody</p>
 */
public class DescribeDirectoriesResponseBody extends TeaModel {
    @NameInMap("Directories")
    private java.util.List < Directories> directories;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDirectoriesResponseBody(Builder builder) {
        this.directories = builder.directories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return directories
     */
    public java.util.List < Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Directories> directories; 
        private String requestId; 

        /**
         * Directories.
         */
        public Builder directories(java.util.List < Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDirectoriesResponseBody build() {
            return new DescribeDirectoriesResponseBody(this);
        } 

    } 

    public static class Directories extends TeaModel {
        @NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryType")
        private String directoryType;

        @NameInMap("ProviderId")
        private String providerId;

        @NameInMap("SsoServiceUrl")
        private String ssoServiceUrl;

        private Directories(Builder builder) {
            this.desktopAccessType = builder.desktopAccessType;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.providerId = builder.providerId;
            this.ssoServiceUrl = builder.ssoServiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return desktopAccessType
         */
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return providerId
         */
        public String getProviderId() {
            return this.providerId;
        }

        /**
         * @return ssoServiceUrl
         */
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

        public static final class Builder {
            private String desktopAccessType; 
            private String directoryId; 
            private String directoryType; 
            private String providerId; 
            private String ssoServiceUrl; 

            /**
             * DesktopAccessType.
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DirectoryType.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * ProviderId.
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * SsoServiceUrl.
             */
            public Builder ssoServiceUrl(String ssoServiceUrl) {
                this.ssoServiceUrl = ssoServiceUrl;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}
