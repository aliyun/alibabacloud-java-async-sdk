// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DeleteLaunchTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLaunchTemplateVersionResponseBody</p>
 */
public class DeleteLaunchTemplateVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersions")
    private LaunchTemplateVersions launchTemplateVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLaunchTemplateVersionResponseBody(Builder builder) {
        this.launchTemplateVersions = builder.launchTemplateVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLaunchTemplateVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateVersions
     */
    public LaunchTemplateVersions getLaunchTemplateVersions() {
        return this.launchTemplateVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LaunchTemplateVersions launchTemplateVersions; 
        private String requestId; 

        /**
         * <p>The deleted launch template versions.</p>
         */
        public Builder launchTemplateVersions(LaunchTemplateVersions launchTemplateVersions) {
            this.launchTemplateVersions = launchTemplateVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLaunchTemplateVersionResponseBody build() {
            return new DeleteLaunchTemplateVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteLaunchTemplateVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLaunchTemplateVersionResponseBody</p>
     */
    public static class LaunchTemplateVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionNumber")
        private Long launchTemplateVersionNumber;

        private LaunchTemplateVersion(Builder builder) {
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersionNumber = builder.launchTemplateVersionNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersion create() {
            return builder().build();
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateVersionNumber
         */
        public Long getLaunchTemplateVersionNumber() {
            return this.launchTemplateVersionNumber;
        }

        public static final class Builder {
            private String launchTemplateId; 
            private Long launchTemplateVersionNumber; 

            /**
             * <p>The ID of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5eiaupmvm2op9d****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The version number of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder launchTemplateVersionNumber(Long launchTemplateVersionNumber) {
                this.launchTemplateVersionNumber = launchTemplateVersionNumber;
                return this;
            }

            public LaunchTemplateVersion build() {
                return new LaunchTemplateVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteLaunchTemplateVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLaunchTemplateVersionResponseBody</p>
     */
    public static class LaunchTemplateVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private java.util.List<LaunchTemplateVersion> launchTemplateVersion;

        private LaunchTemplateVersions(Builder builder) {
            this.launchTemplateVersion = builder.launchTemplateVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersions create() {
            return builder().build();
        }

        /**
         * @return launchTemplateVersion
         */
        public java.util.List<LaunchTemplateVersion> getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public static final class Builder {
            private java.util.List<LaunchTemplateVersion> launchTemplateVersion; 

            /**
             * LaunchTemplateVersion.
             */
            public Builder launchTemplateVersion(java.util.List<LaunchTemplateVersion> launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            public LaunchTemplateVersions build() {
                return new LaunchTemplateVersions(this);
            } 

        } 

    }
}
