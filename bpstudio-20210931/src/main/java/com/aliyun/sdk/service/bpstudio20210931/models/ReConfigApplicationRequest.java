// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReConfigApplicationRequest} extends {@link RequestModel}
 *
 * <p>ReConfigApplicationRequest</p>
 */
public class ReConfigApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    private ReConfigApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReConfigApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<ReConfigApplicationRequest, Builder> {
        private String appId; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(ReConfigApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.variables = request.variables;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(String variables) {
            this.putBodyParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public ReConfigApplicationRequest build() {
            return new ReConfigApplicationRequest(this);
        } 

    } 

}
