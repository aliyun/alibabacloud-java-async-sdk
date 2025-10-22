// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link OperateCallCenterForPartnerRequest} extends {@link RequestModel}
 *
 * <p>OperateCallCenterForPartnerRequest</p>
 */
public class OperateCallCenterForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAction")
    private String callAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmployeeCode")
    private String employeeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Request")
    private String request;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private OperateCallCenterForPartnerRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.callAction = builder.callAction;
        this.employeeCode = builder.employeeCode;
        this.request = builder.request;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCallCenterForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return callAction
     */
    public String getCallAction() {
        return this.callAction;
    }

    /**
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * @return request
     */
    public String getRequest() {
        return this.request;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<OperateCallCenterForPartnerRequest, Builder> {
        private String bizType; 
        private String callAction; 
        private String employeeCode; 
        private String request; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(OperateCallCenterForPartnerRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.callAction = request.callAction;
            this.employeeCode = request.employeeCode;
            this.request = request.request;
            this.tenantId = request.tenantId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CallAction.
         */
        public Builder callAction(String callAction) {
            this.putQueryParameter("CallAction", callAction);
            this.callAction = callAction;
            return this;
        }

        /**
         * EmployeeCode.
         */
        public Builder employeeCode(String employeeCode) {
            this.putQueryParameter("EmployeeCode", employeeCode);
            this.employeeCode = employeeCode;
            return this;
        }

        /**
         * Request.
         */
        public Builder request(String request) {
            this.putQueryParameter("Request", request);
            this.request = request;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public OperateCallCenterForPartnerRequest build() {
            return new OperateCallCenterForPartnerRequest(this);
        } 

    } 

}
