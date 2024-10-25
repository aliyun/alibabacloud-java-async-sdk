// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LaunchServiceResponseBody} extends {@link TeaModel}
 *
 * <p>LaunchServiceResponseBody</p>
 */
public class LaunchServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceLaunchResultType")
    private String serviceLaunchResultType;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private LaunchServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceLaunchResultType = builder.serviceLaunchResultType;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceLaunchResultType
     */
    public String getServiceLaunchResultType() {
        return this.serviceLaunchResultType;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceLaunchResultType; 
        private String version; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceLaunchResultType.
         */
        public Builder serviceLaunchResultType(String serviceLaunchResultType) {
            this.serviceLaunchResultType = serviceLaunchResultType;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public LaunchServiceResponseBody build() {
            return new LaunchServiceResponseBody(this);
        } 

    } 

}
