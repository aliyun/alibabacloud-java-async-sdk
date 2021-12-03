// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteFunctionAsyncInvokeConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionAsyncInvokeConfigRequest</p>
 */
public class DeleteFunctionAsyncInvokeConfigRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Query
    @NameInMap("qualifier")
    private String qualifier;


    private DeleteFunctionAsyncInvokeConfigRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionAsyncInvokeConfigRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private String qualifier; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>限定符</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public DeleteFunctionAsyncInvokeConfigRequest build() {
            return new DeleteFunctionAsyncInvokeConfigRequest(this);
        } 

    } 

}
