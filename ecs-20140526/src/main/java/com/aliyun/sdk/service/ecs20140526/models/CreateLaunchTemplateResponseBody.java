// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateResponseBody</p>
 */
public class CreateLaunchTemplateResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @NameInMap("LaunchTemplateVersionNumber")
    private Long launchTemplateVersionNumber;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLaunchTemplateResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersionNumber = builder.launchTemplateVersionNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLaunchTemplateResponseBody create() {
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
         * The ID of the launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * LaunchTemplateVersionNumber.
         */
        public Builder launchTemplateVersionNumber(Long launchTemplateVersionNumber) {
            this.launchTemplateVersionNumber = launchTemplateVersionNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLaunchTemplateResponseBody build() {
            return new CreateLaunchTemplateResponseBody(this);
        } 

    } 

}
