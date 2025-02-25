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
 * {@link CreateLaunchTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateResponseBody</p>
 */
public class CreateLaunchTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionNumber")
    private Long launchTemplateVersionNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
