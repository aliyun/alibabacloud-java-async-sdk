// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link LoginAppRequest} extends {@link RequestModel}
 *
 * <p>LoginAppRequest</p>
 */
public class LoginAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmpId")
    private String empId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmpName")
    private String empName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private LoginAppRequest(Builder builder) {
        super(builder);
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return empId
     */
    public String getEmpId() {
        return this.empId;
    }

    /**
     * @return empName
     */
    public String getEmpName() {
        return this.empName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<LoginAppRequest, Builder> {
        private String empId; 
        private String empName; 
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(LoginAppRequest request) {
            super(request);
            this.empId = request.empId;
            this.empName = request.empName;
            this.token = request.token;
            this.type = request.type;
        } 

        /**
         * EmpId.
         */
        public Builder empId(String empId) {
            this.putBodyParameter("EmpId", empId);
            this.empId = empId;
            return this;
        }

        /**
         * EmpName.
         */
        public Builder empName(String empName) {
            this.putBodyParameter("EmpName", empName);
            this.empName = empName;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public LoginAppRequest build() {
            return new LoginAppRequest(this);
        } 

    } 

}
