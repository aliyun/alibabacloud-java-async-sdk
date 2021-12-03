// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetTriggerRequest} extends {@link RequestModel}
 *
 * <p>GetTriggerRequest</p>
 */
public class GetTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Path
    @NameInMap("triggerName")
    private String triggerName;


    private GetTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.triggerName = builder.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTriggerRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
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

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private String triggerName; 

        /**
         * <p>service名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>function名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>trigger名称</p>
         */
        public Builder triggerName(String triggerName) {
            this.putPathParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        public GetTriggerRequest build() {
            return new GetTriggerRequest(this);
        } 

    } 

}
