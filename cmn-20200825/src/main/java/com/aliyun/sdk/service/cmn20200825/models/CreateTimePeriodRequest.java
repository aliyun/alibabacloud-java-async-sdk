// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimePeriodRequest} extends {@link RequestModel}
 *
 * <p>CreateTimePeriodRequest</p>
 */
public class CreateTimePeriodRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("Expression")
    @Validation(required = true)
    private String expression;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TimePeriodDescription")
    @Validation(required = true)
    private String timePeriodDescription;

    @Body
    @NameInMap("TimePeriodName")
    @Validation(required = true)
    private String timePeriodName;

    private CreateTimePeriodRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.expression = builder.expression;
        this.instanceId = builder.instanceId;
        this.timePeriodDescription = builder.timePeriodDescription;
        this.timePeriodName = builder.timePeriodName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimePeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return timePeriodDescription
     */
    public String getTimePeriodDescription() {
        return this.timePeriodDescription;
    }

    /**
     * @return timePeriodName
     */
    public String getTimePeriodName() {
        return this.timePeriodName;
    }

    public static final class Builder extends Request.Builder<CreateTimePeriodRequest, Builder> {
        private String clientToken; 
        private String expression; 
        private String instanceId; 
        private String timePeriodDescription; 
        private String timePeriodName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTimePeriodRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.expression = request.expression;
            this.instanceId = request.instanceId;
            this.timePeriodDescription = request.timePeriodDescription;
            this.timePeriodName = request.timePeriodName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putBodyParameter("Expression", expression);
            this.expression = expression;
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
         * TimePeriodDescription.
         */
        public Builder timePeriodDescription(String timePeriodDescription) {
            this.putBodyParameter("TimePeriodDescription", timePeriodDescription);
            this.timePeriodDescription = timePeriodDescription;
            return this;
        }

        /**
         * TimePeriodName.
         */
        public Builder timePeriodName(String timePeriodName) {
            this.putBodyParameter("TimePeriodName", timePeriodName);
            this.timePeriodName = timePeriodName;
            return this;
        }

        @Override
        public CreateTimePeriodRequest build() {
            return new CreateTimePeriodRequest(this);
        } 

    } 

}
