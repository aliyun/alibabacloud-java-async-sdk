// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceScreenshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceScreenshotResponseBody</p>
 */
public class GetInstanceScreenshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Screenshot")
    private String screenshot;

    private GetInstanceScreenshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instanceId = builder.instanceId;
        this.screenshot = builder.screenshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceScreenshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return screenshot
     */
    public String getScreenshot() {
        return this.screenshot;
    }

    public static final class Builder {
        private String requestId; 
        private String instanceId; 
        private String screenshot; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * A screenshot of an instance in JPG format. The base64-encoded image is returned.
         */
        public Builder screenshot(String screenshot) {
            this.screenshot = screenshot;
            return this;
        }

        public GetInstanceScreenshotResponseBody build() {
            return new GetInstanceScreenshotResponseBody(this);
        } 

    } 

}
