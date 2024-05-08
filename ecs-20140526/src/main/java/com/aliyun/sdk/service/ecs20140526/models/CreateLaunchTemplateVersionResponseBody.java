// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateVersionResponseBody</p>
 */
public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionNumber")
    private Long launchTemplateVersionNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLaunchTemplateVersionResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersionNumber = builder.launchTemplateVersionNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLaunchTemplateVersionResponseBody create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String launchTemplateId; 
        private Long launchTemplateVersionNumber; 
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
         * The version number of the launch template.
         */
        public Builder launchTemplateVersionNumber(Long launchTemplateVersionNumber) {
            this.launchTemplateVersionNumber = launchTemplateVersionNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLaunchTemplateVersionResponseBody build() {
            return new CreateLaunchTemplateVersionResponseBody(this);
        } 

    } 

}
