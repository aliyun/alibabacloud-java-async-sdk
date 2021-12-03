// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListVpcBindingsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcBindingsRequest</p>
 */
public class ListVpcBindingsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;


    private ListVpcBindingsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 

        /**
         * <p>serviceName.</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        public ListVpcBindingsRequest build() {
            return new ListVpcBindingsRequest(this);
        } 

    } 

}
