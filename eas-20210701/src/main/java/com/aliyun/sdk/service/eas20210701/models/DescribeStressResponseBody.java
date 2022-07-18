// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStressResponseBody</p>
 */
public class DescribeStressResponseBody extends TeaModel {
    @NameInMap("AvailableAgent")
    private Long availableAgent;

    @NameInMap("CallerUid")
    private String callerUid;

    @NameInMap("DesiredAgent")
    private Long desiredAgent;

    @NameInMap("Message")
    private String message;

    @NameInMap("ParentUid")
    private String parentUid;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Status")
    private String status;

    @NameInMap("StressName")
    private String stressName;

    @NameInMap("Token")
    private String token;

    private DescribeStressResponseBody(Builder builder) {
        this.availableAgent = builder.availableAgent;
        this.callerUid = builder.callerUid;
        this.desiredAgent = builder.desiredAgent;
        this.message = builder.message;
        this.parentUid = builder.parentUid;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.stressName = builder.stressName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStressResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAgent
     */
    public Long getAvailableAgent() {
        return this.availableAgent;
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return desiredAgent
     */
    public Long getDesiredAgent() {
        return this.desiredAgent;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stressName
     */
    public String getStressName() {
        return this.stressName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private Long availableAgent; 
        private String callerUid; 
        private Long desiredAgent; 
        private String message; 
        private String parentUid; 
        private String reason; 
        private String requestId; 
        private String serviceName; 
        private String status; 
        private String stressName; 
        private String token; 

        /**
         * AvailableAgent.
         */
        public Builder availableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }

        /**
         * CallerUid.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * DesiredAgent.
         */
        public Builder desiredAgent(Long desiredAgent) {
            this.desiredAgent = desiredAgent;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StressName.
         */
        public Builder stressName(String stressName) {
            this.stressName = stressName;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DescribeStressResponseBody build() {
            return new DescribeStressResponseBody(this);
        } 

    } 

}
