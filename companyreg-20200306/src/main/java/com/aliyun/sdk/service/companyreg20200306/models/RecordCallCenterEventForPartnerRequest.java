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
 * {@link RecordCallCenterEventForPartnerRequest} extends {@link RequestModel}
 *
 * <p>RecordCallCenterEventForPartnerRequest</p>
 */
public class RecordCallCenterEventForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAction")
    private String callAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnId")
    private String connId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmployeeCode")
    private String employeeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedId")
    private Long relatedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretMobile")
    private String secretMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillType")
    private Integer skillType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private RecordCallCenterEventForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.callAction = builder.callAction;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.connId = builder.connId;
        this.contactId = builder.contactId;
        this.employeeCode = builder.employeeCode;
        this.jobId = builder.jobId;
        this.relatedId = builder.relatedId;
        this.secretMobile = builder.secretMobile;
        this.skillType = builder.skillType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordCallCenterEventForPartnerRequest create() {
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
     * @return callAction
     */
    public String getCallAction() {
        return this.callAction;
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return connId
     */
    public String getConnId() {
        return this.connId;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return relatedId
     */
    public Long getRelatedId() {
        return this.relatedId;
    }

    /**
     * @return secretMobile
     */
    public String getSecretMobile() {
        return this.secretMobile;
    }

    /**
     * @return skillType
     */
    public Integer getSkillType() {
        return this.skillType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RecordCallCenterEventForPartnerRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String callAction; 
        private String callee; 
        private String caller; 
        private String connId; 
        private String contactId; 
        private String employeeCode; 
        private String jobId; 
        private Long relatedId; 
        private String secretMobile; 
        private Integer skillType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RecordCallCenterEventForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.callAction = request.callAction;
            this.callee = request.callee;
            this.caller = request.caller;
            this.connId = request.connId;
            this.contactId = request.contactId;
            this.employeeCode = request.employeeCode;
            this.jobId = request.jobId;
            this.relatedId = request.relatedId;
            this.secretMobile = request.secretMobile;
            this.skillType = request.skillType;
            this.tenantId = request.tenantId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
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
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * ConnId.
         */
        public Builder connId(String connId) {
            this.putQueryParameter("ConnId", connId);
            this.connId = connId;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>1000030990004</p>
         */
        public Builder relatedId(Long relatedId) {
            this.putQueryParameter("RelatedId", relatedId);
            this.relatedId = relatedId;
            return this;
        }

        /**
         * SecretMobile.
         */
        public Builder secretMobile(String secretMobile) {
            this.putQueryParameter("SecretMobile", secretMobile);
            this.secretMobile = secretMobile;
            return this;
        }

        /**
         * SkillType.
         */
        public Builder skillType(Integer skillType) {
            this.putQueryParameter("SkillType", skillType);
            this.skillType = skillType;
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
        public RecordCallCenterEventForPartnerRequest build() {
            return new RecordCallCenterEventForPartnerRequest(this);
        } 

    } 

}
