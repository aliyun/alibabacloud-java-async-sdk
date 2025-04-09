// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link RecordFailureRequest} extends {@link RequestModel}
 *
 * <p>RecordFailureRequest</p>
 */
public class RecordFailureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long actualTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispositionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dispositionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptionCodes")
    private String exceptionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private RecordFailureRequest(Builder builder) {
        super(builder);
        this.actualTime = builder.actualTime;
        this.callId = builder.callId;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.dispositionCode = builder.dispositionCode;
        this.exceptionCodes = builder.exceptionCodes;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordFailureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualTime
     */
    public Long getActualTime() {
        return this.actualTime;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return dispositionCode
     */
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * @return exceptionCodes
     */
    public String getExceptionCodes() {
        return this.exceptionCodes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<RecordFailureRequest, Builder> {
        private Long actualTime; 
        private String callId; 
        private String calledNumber; 
        private String callingNumber; 
        private String dispositionCode; 
        private String exceptionCodes; 
        private String instanceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(RecordFailureRequest request) {
            super(request);
            this.actualTime = request.actualTime;
            this.callId = request.callId;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.dispositionCode = request.dispositionCode;
            this.exceptionCodes = request.exceptionCodes;
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055782000</p>
         */
        public Builder actualTime(Long actualTime) {
            this.putQueryParameter("ActualTime", actualTime);
            this.actualTime = actualTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4f21446e-324e-46f2-bf62-7f341fb004ea</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>135815****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OutOfService</p>
         */
        public Builder dispositionCode(String dispositionCode) {
            this.putQueryParameter("DispositionCode", dispositionCode);
            this.dispositionCode = dispositionCode;
            return this;
        }

        /**
         * ExceptionCodes.
         */
        public Builder exceptionCodes(String exceptionCodes) {
            this.putQueryParameter("ExceptionCodes", exceptionCodes);
            this.exceptionCodes = exceptionCodes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9ab43460-c0b9-40e2-8447-48d82c97fc67</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d2295c0e-3bc3-48a5-9f56-b185db2be909</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public RecordFailureRequest build() {
            return new RecordFailureRequest(this);
        } 

    } 

}
