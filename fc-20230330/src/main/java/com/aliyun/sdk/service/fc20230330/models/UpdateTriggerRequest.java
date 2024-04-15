// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTriggerRequest</p>
 */
public class UpdateTriggerRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("triggerName")
    @Validation(required = true)
    private String triggerName;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private UpdateTriggerInput body;

    private UpdateTriggerRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.triggerName = builder.triggerName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTriggerRequest create() {
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

    /**
     * @return body
     */
    public UpdateTriggerInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateTriggerRequest, Builder> {
        private String functionName; 
        private String triggerName; 
        private UpdateTriggerInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTriggerRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.triggerName = request.triggerName;
            this.body = request.body;
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

        /**
         * The trigger configurations.
         */
        public Builder body(UpdateTriggerInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateTriggerRequest build() {
            return new UpdateTriggerRequest(this);
        } 

    } 

}
