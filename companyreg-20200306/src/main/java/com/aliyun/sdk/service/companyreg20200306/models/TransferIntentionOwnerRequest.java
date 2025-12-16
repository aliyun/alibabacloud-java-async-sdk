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
 * {@link TransferIntentionOwnerRequest} extends {@link RequestModel}
 *
 * <p>TransferIntentionOwnerRequest</p>
 */
public class TransferIntentionOwnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmployeeCode")
    private String employeeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonId")
    private Integer personId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private TransferIntentionOwnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.employeeCode = builder.employeeCode;
        this.personId = builder.personId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferIntentionOwnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * @return personId
     */
    public Integer getPersonId() {
        return this.personId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<TransferIntentionOwnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String employeeCode; 
        private Integer personId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(TransferIntentionOwnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.employeeCode = request.employeeCode;
            this.personId = request.personId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P20210709190452000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * PersonId.
         */
        public Builder personId(Integer personId) {
            this.putQueryParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public TransferIntentionOwnerRequest build() {
            return new TransferIntentionOwnerRequest(this);
        } 

    } 

}
