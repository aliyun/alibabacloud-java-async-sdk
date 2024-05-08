// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLaunchTemplateDefaultVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLaunchTemplateDefaultVersionResponseBody</p>
 */
public class ModifyLaunchTemplateDefaultVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLaunchTemplateDefaultVersionResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLaunchTemplateDefaultVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String launchTemplateId; 
        private String requestId; 

        /**
         * The ID of the launch template. For more information, see [DescribeLaunchTemplates](~~73759~~). You must specify `LaunchTemplateId` or `LaunchTemplateName` to specify a launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyLaunchTemplateDefaultVersionResponseBody build() {
            return new ModifyLaunchTemplateDefaultVersionResponseBody(this);
        } 

    } 

}
