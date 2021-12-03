// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteTriggerRequest</p>
 */
public class DeleteTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Path
    @NameInMap("triggerName")
    private String triggerName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;


    private DeleteTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.triggerName = builder.triggerName;
        this.ifMatch = builder.ifMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTriggerRequest create() {
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

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private String triggerName; 
        private String ifMatch; 

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
         * <p>删除trigger</p>
         */
        public Builder triggerName(String triggerName) {
            this.putPathParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>用于确保实际更改的资源和期望更改的资源是一致的，该值来自Create，Get和Update API的响应</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        public DeleteTriggerRequest build() {
            return new DeleteTriggerRequest(this);
        } 

    } 

}
