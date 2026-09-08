// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link GetInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceAttributeResponseBody</p>
 */
public class GetInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
    private String currentKernelVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("KmsEncryptionSupported")
    private Boolean kmsEncryptionSupported;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private Long maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private Long maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetInstanceAttributeResponseBody(Builder builder) {
        this.currentKernelVersion = builder.currentKernelVersion;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.kmsEncryptionSupported = builder.kmsEncryptionSupported;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentKernelVersion
     */
    public String getCurrentKernelVersion() {
        return this.currentKernelVersion;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return kmsEncryptionSupported
     */
    public Boolean getKmsEncryptionSupported() {
        return this.kmsEncryptionSupported;
    }

    /**
     * @return maintainEndTime
     */
    public Long getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public Long getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String currentKernelVersion; 
        private String engine; 
        private String engineVersion; 
        private String errorCode; 
        private String errorMessage; 
        private Boolean kmsEncryptionSupported; 
        private Long maintainEndTime; 
        private Long maintainStartTime; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetInstanceAttributeResponseBody model) {
            this.currentKernelVersion = model.currentKernelVersion;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.kmsEncryptionSupported = model.kmsEncryptionSupported;
            this.maintainEndTime = model.maintainEndTime;
            this.maintainStartTime = model.maintainStartTime;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * CurrentKernelVersion.
         */
        public Builder currentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * KmsEncryptionSupported.
         */
        public Builder kmsEncryptionSupported(Boolean kmsEncryptionSupported) {
            this.kmsEncryptionSupported = kmsEncryptionSupported;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(Long maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(Long maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetInstanceAttributeResponseBody build() {
            return new GetInstanceAttributeResponseBody(this);
        } 

    } 

}
