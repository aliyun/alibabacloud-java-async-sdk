// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirectoriesResponseBody</p>
 */
public class DescribeDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directories")
    private java.util.List<Directories> directories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directories
     */
    public java.util.List<Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Directories> directories; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDirectoriesResponseBody model) {
            this.directories = model.directories;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The directories.</p>
         */
        public Builder directories(java.util.List<Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F369A091-002F-49C8-AD55-02A77629****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDirectoriesResponseBody build() {
            return new DescribeDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDirectoriesResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("ProviderId")
        private String providerId;

        @com.aliyun.core.annotation.NameInMap("SsoServiceUrl")
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

            private Builder() {
            } 

            private Builder(Directories model) {
                this.desktopAccessType = model.desktopAccessType;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.providerId = model.providerId;
                this.ssoServiceUrl = model.ssoServiceUrl;
            } 

            /**
             * <p>The connection method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>VPC: End users connect to cloud computers over an enterprise virtual private cloud (VPC).</li>
             * <li>INTERNET: End users connect to cloud computers over the Internet.</li>
             * <li>ANY: End users connect to cloud computers over the Internet or an enterprise VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory type.</p>
             * 
             * <strong>example:</strong>
             * <p>AD_CONNECTOR</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * <p>The URL of the SSO service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eds-cn-shanghai-67726">https://eds-cn-shanghai-67726</a>****</p>
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
