// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionsResponseBody</p>
 */
public class DescribeVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VersionInfo")
    private java.util.List < VersionInfo> versionInfo;

    private DescribeVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionInfo = builder.versionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionInfo
     */
    public java.util.List < VersionInfo> getVersionInfo() {
        return this.versionInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VersionInfo> versionInfo; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The available ASM versions.
         */
        public Builder versionInfo(java.util.List < VersionInfo> versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }

        public DescribeVersionsResponseBody build() {
            return new DescribeVersionsResponseBody(this);
        } 

    } 

    public static class VersionInfo extends TeaModel {
        @NameInMap("Edition")
        private String edition;

        @NameInMap("Versions")
        private java.util.List < String > versions;

        private VersionInfo(Builder builder) {
            this.edition = builder.edition;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionInfo create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return versions
         */
        public java.util.List < String > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String edition; 
            private java.util.List < String > versions; 

            /**
             * The edition of the ASM instance. Valid values:
             * <p>
             * 
             * *   `Default`: Standard Edition
             * *   `Pro`: Professional Edition that is commercially released
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * The list of ASM versions available for the ASM instance of the current edition.
             */
            public Builder versions(java.util.List < String > versions) {
                this.versions = versions;
                return this;
            }

            public VersionInfo build() {
                return new VersionInfo(this);
            } 

        } 

    }
}
