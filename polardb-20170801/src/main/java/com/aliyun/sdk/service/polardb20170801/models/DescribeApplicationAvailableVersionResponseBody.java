// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationAvailableVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationAvailableVersionResponseBody</p>
 */
public class DescribeApplicationAvailableVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List<Versions> versions;

    private DescribeApplicationAvailableVersionResponseBody(Builder builder) {
        this.latestVersion = builder.latestVersion;
        this.requestId = builder.requestId;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationAvailableVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String latestVersion; 
        private String requestId; 
        private java.util.List<Versions> versions; 

        private Builder() {
        } 

        private Builder(DescribeApplicationAvailableVersionResponseBody model) {
            this.latestVersion = model.latestVersion;
            this.requestId = model.requestId;
            this.versions = model.versions;
        } 

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of versions.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public DescribeApplicationAvailableVersionResponseBody build() {
            return new DescribeApplicationAvailableVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationAvailableVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableVersionResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseDate")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionDescription")
        private String versionDescription;

        private Versions(Builder builder) {
            this.releaseDate = builder.releaseDate;
            this.releaseNote = builder.releaseNote;
            this.releaseType = builder.releaseType;
            this.version = builder.version;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public static final class Builder {
            private String releaseDate; 
            private String releaseNote; 
            private String releaseType; 
            private String version; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.releaseDate = model.releaseDate;
                this.releaseNote = model.releaseNote;
                this.releaseType = model.releaseType;
                this.version = model.version;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * <p>The release date.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T00:00:00Z</p>
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * <p>The release notes of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>release</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The release type.</p>
             * 
             * <strong>example:</strong>
             * <p>Stable</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version description.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.2</p>
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
