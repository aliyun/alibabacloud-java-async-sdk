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
 * {@link LoginRequest} extends {@link RequestModel}
 *
 * <p>LoginRequest</p>
 */
public class LoginRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmpId")
    private String empId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmpName")
    private String empName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private LoginRequest(Builder builder) {
        super(builder);
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginRequest create() {
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

    public static final class Builder extends Request.Builder<LoginRequest, Builder> {
        private String empId; 
        private String empName; 
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(LoginRequest request) {
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
         * <p>This parameter is required.</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public LoginRequest build() {
            return new LoginRequest(this);
        } 

    } 

}
