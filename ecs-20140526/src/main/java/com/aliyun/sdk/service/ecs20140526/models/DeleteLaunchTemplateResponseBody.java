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

    @NameInMap("RequestId")
    private String requestId;

    private DeleteLaunchTemplateResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String launchTemplateId; 
        private String requestId; 

        /**
         * LaunchTemplateId.
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

        public DeleteLaunchTemplateResponseBody build() {
            return new DeleteLaunchTemplateResponseBody(this);
        } 

    } 

}
