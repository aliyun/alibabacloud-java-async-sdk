// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Query
    @NameInMap("qualifier")
    private String qualifier;


    private GetServiceRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
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
         * <p>限定符</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public GetServiceRequest build() {
            return new GetServiceRequest(this);
        } 

    } 

}
