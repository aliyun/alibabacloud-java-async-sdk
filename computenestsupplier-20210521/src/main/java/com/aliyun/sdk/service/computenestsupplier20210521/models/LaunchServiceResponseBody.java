// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(LaunchServiceResponseBody model) {
            this.requestId = model.requestId;
            this.serviceLaunchResultType = model.serviceLaunchResultType;
            this.version = model.version;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The mode of the service online. Valid Type</p>
         * <ul>
         * <li>PublishNewVersion: Launch new version</li>
         * <li>PublishOfflineVersion:  The offline version is online again.</li>
         * <li>UpdateLatestVersion: Update the latest version online</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublishNewVersion</p>
         */
        public Builder serviceLaunchResultType(String serviceLaunchResultType) {
            this.serviceLaunchResultType = serviceLaunchResultType;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
