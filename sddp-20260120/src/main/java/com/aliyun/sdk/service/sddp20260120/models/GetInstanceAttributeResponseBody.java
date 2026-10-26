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
         * <p>The current kernel version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_20220731</p>
         */
        public Builder currentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The major version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The business error code for the record or operation. This parameter can be empty when no error occurs. You should evaluate this parameter together with ErrorMessage.</p>
         * 
         * <strong>example:</strong>
         * <p>data_masking_not_running</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The business error message for the record or operation.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is not in the running state</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether the instance supports using KMS keys for column encryption.</p>
         */
        public Builder kmsEncryptionSupported(Boolean kmsEncryptionSupported) {
            this.kmsEncryptionSupported = kmsEncryptionSupported;
            return this;
        }

        /**
         * <p>The end time of the maintenance window. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. The returned value combines the UTC time of the maintenance window with the date of the query day.</p>
         * 
         * <strong>example:</strong>
         * <p>1788570000000</p>
         */
        public Builder maintainEndTime(Long maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the maintenance window. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. The returned value combines the UTC time of the maintenance window with the date of the query day.</p>
         * 
         * <strong>example:</strong>
         * <p>1788566400000</p>
         */
        public Builder maintainStartTime(Long maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>The request ID, which can be used to locate this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The current running status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
