// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLaunchTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLaunchTemplateResponseBody</p>
 */
public class DeleteLaunchTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionNumbers")
    private LaunchTemplateVersionNumbers launchTemplateVersionNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLaunchTemplateResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersionNumbers = builder.launchTemplateVersionNumbers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLaunchTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateVersionNumbers
     */
    public LaunchTemplateVersionNumbers getLaunchTemplateVersionNumbers() {
        return this.launchTemplateVersionNumbers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String launchTemplateId; 
        private LaunchTemplateVersionNumbers launchTemplateVersionNumbers; 
        private String requestId; 

        /**
         * The ID of the launch template. For more information, see [DescribeLaunchTemplates](~~73759~~).
         * <p>
         * 
         * You must specify `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The versions of the deleted launch template.
         */
        public Builder launchTemplateVersionNumbers(LaunchTemplateVersionNumbers launchTemplateVersionNumbers) {
            this.launchTemplateVersionNumbers = launchTemplateVersionNumbers;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLaunchTemplateResponseBody build() {
            return new DeleteLaunchTemplateResponseBody(this);
        } 

    } 

    public static class LaunchTemplateVersionNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("versionNumbers")
        private java.util.List < Long > versionNumbers;

        private LaunchTemplateVersionNumbers(Builder builder) {
            this.versionNumbers = builder.versionNumbers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionNumbers create() {
            return builder().build();
        }

        /**
         * @return versionNumbers
         */
        public java.util.List < Long > getVersionNumbers() {
            return this.versionNumbers;
        }

        public static final class Builder {
            private java.util.List < Long > versionNumbers; 

            /**
             * versionNumbers.
             */
            public Builder versionNumbers(java.util.List < Long > versionNumbers) {
                this.versionNumbers = versionNumbers;
                return this;
            }

            public LaunchTemplateVersionNumbers build() {
                return new LaunchTemplateVersionNumbers(this);
            } 

        } 

    }
}
