// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link BridgeWebCallRequest} extends {@link RequestModel}
 *
 * <p>BridgeWebCallRequest</p>
 */
public class BridgeWebCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Integer sampleRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sandbox")
    private Boolean sandbox;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    private BridgeWebCallRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.businessUnitId = builder.businessUnitId;
        this.caller = builder.caller;
        this.deviceId = builder.deviceId;
        this.sampleRate = builder.sampleRate;
        this.sandbox = builder.sandbox;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BridgeWebCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
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
     * @return sampleRate
     */
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sandbox
     */
    public Boolean getSandbox() {
        return this.sandbox;
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

    public static final class Builder extends Request.Builder<BridgeWebCallRequest, Builder> {
        private String applicationId; 
        private String businessUnitId; 
        private String caller; 
        private String deviceId; 
        private Integer sampleRate; 
        private Boolean sandbox; 
        private String tags; 
        private Integer timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(BridgeWebCallRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.businessUnitId = request.businessUnitId;
            this.caller = request.caller;
            this.deviceId = request.deviceId;
            this.sampleRate = request.sampleRate;
            this.sandbox = request.sandbox;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a395011f-a247-400f-bc69-28796749fd52</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-c11iig67g863rih8</p>
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putQueryParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>467539456766097392-cn-shenzhen</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(Integer sampleRate) {
            this.putQueryParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * Sandbox.
         */
        public Builder sandbox(Boolean sandbox) {
            this.putQueryParameter("Sandbox", sandbox);
            this.sandbox = sandbox;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public BridgeWebCallRequest build() {
            return new BridgeWebCallRequest(this);
        } 

    } 

}
