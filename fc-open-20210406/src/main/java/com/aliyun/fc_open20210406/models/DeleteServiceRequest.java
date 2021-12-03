// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceRequest</p>
 */
public class DeleteServiceRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;


    private DeleteServiceRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.ifMatch = builder.ifMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String ifMatch; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
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

        public DeleteServiceRequest build() {
            return new DeleteServiceRequest(this);
        } 

    } 

}
