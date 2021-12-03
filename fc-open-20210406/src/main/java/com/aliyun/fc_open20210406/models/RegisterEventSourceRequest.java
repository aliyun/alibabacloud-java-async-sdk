// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RegisterEventSourceRequest} extends {@link RequestModel}
 *
 * <p>RegisterEventSourceRequest</p>
 */
public class RegisterEventSourceRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Body
    @NameInMap("sourceArn")
    private String sourceArn;

    @Query
    @NameInMap("qualifier")
    private String qualifier;


    private RegisterEventSourceRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.sourceArn = builder.sourceArn;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterEventSourceRequest create() {
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
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
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
        private String sourceArn; 
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
         * <p>事件源资源标识符</p>
         */
        public Builder sourceArn(String sourceArn) {
            this.putBodyParameter("sourceArn", sourceArn);
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * <p>别名或版本</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public RegisterEventSourceRequest build() {
            return new RegisterEventSourceRequest(this);
        } 

    } 

}
