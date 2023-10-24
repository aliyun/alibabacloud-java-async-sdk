// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageEventOperationRequest} extends {@link RequestModel}
 *
 * <p>AddImageEventOperationRequest</p>
 */
public class AddImageEventOperationRequest extends Request {
    @Query
    @NameInMap("Conditions")
    private String conditions;

    @Query
    @NameInMap("EventKey")
    private String eventKey;

    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("OperationCode")
    private String operationCode;

    @Query
    @NameInMap("Scenarios")
    private String scenarios;

    private AddImageEventOperationRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.eventKey = builder.eventKey;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.operationCode = builder.operationCode;
        this.scenarios = builder.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageEventOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return eventKey
     */
    public String getEventKey() {
        return this.eventKey;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return scenarios
     */
    public String getScenarios() {
        return this.scenarios;
    }

    public static final class Builder extends Request.Builder<AddImageEventOperationRequest, Builder> {
        private String conditions; 
        private String eventKey; 
        private String eventName; 
        private String eventType; 
        private String operationCode; 
        private String scenarios; 

        private Builder() {
            super();
        } 

        private Builder(AddImageEventOperationRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.eventKey = request.eventKey;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.operationCode = request.operationCode;
            this.scenarios = request.scenarios;
        } 

        /**
         * Conditions.
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * EventKey.
         */
        public Builder eventKey(String eventKey) {
            this.putQueryParameter("EventKey", eventKey);
            this.eventKey = eventKey;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * OperationCode.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * Scenarios.
         */
        public Builder scenarios(String scenarios) {
            this.putQueryParameter("Scenarios", scenarios);
            this.scenarios = scenarios;
            return this;
        }

        @Override
        public AddImageEventOperationRequest build() {
            return new AddImageEventOperationRequest(this);
        } 

    } 

}
