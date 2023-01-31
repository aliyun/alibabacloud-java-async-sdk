// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordFailureRequest} extends {@link RequestModel}
 *
 * <p>RecordFailureRequest</p>
 */
public class RecordFailureRequest extends Request {
    @Query
    @NameInMap("ActualTime")
    @Validation(required = true)
    private Long actualTime;

    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    @Validation(required = true)
    private String callingNumber;

    @Query
    @NameInMap("DispositionCode")
    @Validation(required = true)
    private String dispositionCode;

    @Query
    @NameInMap("ExceptionCodes")
    private String exceptionCodes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
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
         * ActualTime.
         */
        public Builder actualTime(Long actualTime) {
            this.putQueryParameter("ActualTime", actualTime);
            this.actualTime = actualTime;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * DispositionCode.
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TaskId.
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
