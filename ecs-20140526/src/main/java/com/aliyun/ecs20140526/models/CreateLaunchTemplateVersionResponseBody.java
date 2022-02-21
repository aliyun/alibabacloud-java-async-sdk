// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLaunchTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateVersionResponseBody</p>
 */
public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateVersionNumber")
    private Long launchTemplateVersionNumber;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLaunchTemplateVersionResponseBody(Builder builder) {
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
        private Long launchTemplateVersionNumber; 
        private String requestId; 

        /**
         * The version number of the instance launch template.
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

        public CreateLaunchTemplateVersionResponseBody build() {
            return new CreateLaunchTemplateVersionResponseBody(this);
        } 

    } 

}
