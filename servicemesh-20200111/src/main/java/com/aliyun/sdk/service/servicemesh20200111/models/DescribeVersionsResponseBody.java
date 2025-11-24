// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionsResponseBody</p>
 */
public class DescribeVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionInfo")
    private java.util.List<VersionInfo> versionInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VersionInfo> getVersionInfo() {
        return this.versionInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VersionInfo> versionInfo; 

        private Builder() {
        } 

        private Builder(DescribeVersionsResponseBody model) {
            this.requestId = model.requestId;
            this.versionInfo = model.versionInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The available ASM versions.</p>
         */
        public Builder versionInfo(java.util.List<VersionInfo> versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }

        public DescribeVersionsResponseBody build() {
            return new DescribeVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVersionsResponseBody</p>
     */
    public static class VersionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

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
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String edition; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(VersionInfo model) {
                this.edition = model.edition;
                this.versions = model.versions;
            } 

            /**
             * <p>The edition of the ASM instance. Valid values:</p>
             * <ul>
             * <li><code>Default</code>: Standard Edition</li>
             * <li><code>Pro</code>: Professional Edition that is commercially released</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>The list of ASM versions available for the ASM instance of the current edition.</p>
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public VersionInfo build() {
                return new VersionInfo(this);
            } 

        } 

    }
}
