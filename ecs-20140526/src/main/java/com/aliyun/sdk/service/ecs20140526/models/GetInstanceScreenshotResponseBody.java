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
 * {@link GetInstanceScreenshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceScreenshotResponseBody</p>
 */
public class GetInstanceScreenshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Screenshot")
    private String screenshot;

    private GetInstanceScreenshotResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.screenshot = builder.screenshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceScreenshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return screenshot
     */
    public String getScreenshot() {
        return this.screenshot;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private String screenshot; 

        private Builder() {
        } 

        private Builder(GetInstanceScreenshotResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.screenshot = model.screenshot;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1gbz20g229bvu5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Base64-encoded instance screenshot in the JPG format.</p>
         * 
         * <strong>example:</strong>
         * <p>iVBORw0KGgoA...AAABJRU5ErkJggg==</p>
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
