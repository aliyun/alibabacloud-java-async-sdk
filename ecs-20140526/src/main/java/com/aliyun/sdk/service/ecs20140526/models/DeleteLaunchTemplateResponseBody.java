// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLaunchTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLaunchTemplateResponseBody</p>
 */
public class DeleteLaunchTemplateResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @NameInMap("LaunchTemplateVersionNumbers")
    private LaunchTemplateVersionNumbers launchTemplateVersionNumbers;

    @NameInMap("RequestId")
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
         * 启动模板ID。更多信息，请参见[DescribeLaunchTemplates](~~73759~~)。
         * <p>
         * 
         * 使用启动模板创建实例时，您必须指定`LaunchTemplateId`或`LaunchTemplateName`以确定启动模板。
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * LaunchTemplateVersionNumbers.
         */
        public Builder launchTemplateVersionNumbers(LaunchTemplateVersionNumbers launchTemplateVersionNumbers) {
            this.launchTemplateVersionNumbers = launchTemplateVersionNumbers;
            return this;
        }

        /**
         * The ID of the request.
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
        @NameInMap("versionNumbers")
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
