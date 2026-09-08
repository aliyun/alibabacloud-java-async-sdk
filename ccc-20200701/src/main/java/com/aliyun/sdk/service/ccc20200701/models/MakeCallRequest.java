// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link MakeCallRequest} extends {@link RequestModel}
 *
 * <p>MakeCallRequest</p>
 */
public class MakeCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsVariables")
    private String flashSmsVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskedCallee")
    private String maskedCallee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 30)
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private MakeCallRequest(Builder builder) {
        super(builder);
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.deviceId = builder.deviceId;
        this.flashSmsVariables = builder.flashSmsVariables;
        this.instanceId = builder.instanceId;
        this.maskedCallee = builder.maskedCallee;
        this.mediaType = builder.mediaType;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MakeCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return flashSmsVariables
     */
    public String getFlashSmsVariables() {
        return this.flashSmsVariables;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maskedCallee
     */
    public String getMaskedCallee() {
        return this.maskedCallee;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<MakeCallRequest, Builder> {
        private String callee; 
        private String caller; 
        private String deviceId; 
        private String flashSmsVariables; 
        private String instanceId; 
        private String maskedCallee; 
        private String mediaType; 
        private String tags; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(MakeCallRequest request) {
            super(request);
            this.callee = request.callee;
            this.caller = request.caller;
            this.deviceId = request.deviceId;
            this.flashSmsVariables = request.flashSmsVariables;
            this.instanceId = request.instanceId;
            this.maskedCallee = request.maskedCallee;
            this.mediaType = request.mediaType;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
        } 

        /**
         * <p>Callee number. For internal calls, specify the target agent\&quot;s extension number in this field. For outbound calls, specify the customer\&quot;s phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1318888****</p>
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * <p>Caller number. This parameter is invalid for internal calls. For outbound calls, specify an outbound number available to the current agent. Ensure that the number supports outbound calling and that the agent has permission to use it. Permission can be granted in two ways: either by attaching the number to the skill group the agent signed into, or by setting the number as the agent\&quot;s personal outbound number.</p>
         * 
         * <strong>example:</strong>
         * <p>010989****</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>Device ID. This field is meaningless and can be filled with any value.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Flash SMS configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;applicationId\&quot;:\&quot;6bd18325-ea7f-4881-8902-4d06283d3b3b\&quot;,\&quot;templateId\&quot;:\&quot;1722217249064\&quot;}</p>
         */
        public Builder flashSmsVariables(String flashSmsVariables) {
            this.putQueryParameter("FlashSmsVariables", flashSmsVariables);
            this.flashSmsVariables = flashSmsVariables;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The desensitized callee number. If this field is not empty, it indicates that the callee number must be desensitized. The desensitization rule is defined by the customer. You only need to enter the desensitized callee number here. Using a desensitized callee number means that in certain scenarios, you will see the desensitized callee number and cannot view the real callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>131****8888</p>
         */
        public Builder maskedCallee(String maskedCallee) {
            this.putQueryParameter("MaskedCallee", maskedCallee);
            this.maskedCallee = maskedCallee;
            return this;
        }

        /**
         * <p>Media type. The default value is AUDIO. Other valid values include VIDEO.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDIO</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Ingest endpoint data. The customer does not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>tags</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Timeout. If the call is not answered within the time specified by this parameter, the system automatically hangs up. Valid values range from 30 to 300 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * <p>Agent ID initiating the outbound call. This field is optional. If not specified, the system uses the agent mapped to the current RAM user by default.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public MakeCallRequest build() {
            return new MakeCallRequest(this);
        } 

    } 

}
