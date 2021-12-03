// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetAliasRequest} extends {@link RequestModel}
 *
 * <p>GetAliasRequest</p>
 */
public class GetAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("aliasName")
    private String aliasName;


    private GetAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.aliasName = builder.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliasRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String aliasName; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>别名</p>
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        public GetAliasRequest build() {
            return new GetAliasRequest(this);
        } 

    } 

}
