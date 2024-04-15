// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerRequest} extends {@link RequestModel}
 *
 * <p>GetTriggerRequest</p>
 */
public class GetTriggerRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("triggerName")
    @Validation(required = true)
    private String triggerName;

    private GetTriggerRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.triggerName = builder.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    public static final class Builder extends Request.Builder<GetTriggerRequest, Builder> {
        private String functionName; 
        private String triggerName; 

        private Builder() {
            super();
        } 

        private Builder(GetTriggerRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.triggerName = request.triggerName;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The trigger name.
         */
        public Builder triggerName(String triggerName) {
            this.putPathParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        @Override
        public GetTriggerRequest build() {
            return new GetTriggerRequest(this);
        } 

    } 

}
