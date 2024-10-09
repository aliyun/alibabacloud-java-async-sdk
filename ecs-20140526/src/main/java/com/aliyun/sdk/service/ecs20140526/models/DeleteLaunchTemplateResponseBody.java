// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the launch template. For more information, see <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
         * <p>You must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp1apo0bbbkuy0rj****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The versions of the deleted launch template.</p>
         */
        public Builder launchTemplateVersionNumbers(LaunchTemplateVersionNumbers launchTemplateVersionNumbers) {
            this.launchTemplateVersionNumbers = launchTemplateVersionNumbers;
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

        public DeleteLaunchTemplateResponseBody build() {
            return new DeleteLaunchTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteLaunchTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLaunchTemplateResponseBody</p>
     */
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
