// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ModifyRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleStatusRequest</p>
 */
public class ModifyRuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applyUserId")
    private String applyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applyUserName")
    private String applyUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditRemark")
    private String auditRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditUserId")
    private String auditUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditUserName")
    private String auditUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleAuditType")
    private String ruleAuditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleVersionId")
    private Long ruleVersionId;

    private ModifyRuleStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.applyUserId = builder.applyUserId;
        this.applyUserName = builder.applyUserName;
        this.auditRemark = builder.auditRemark;
        this.auditUserId = builder.auditUserId;
        this.auditUserName = builder.auditUserName;
        this.consoleRuleId = builder.consoleRuleId;
        this.eventType = builder.eventType;
        this.regId = builder.regId;
        this.ruleAuditType = builder.ruleAuditType;
        this.ruleId = builder.ruleId;
        this.ruleVersionId = builder.ruleVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return applyUserId
     */
    public String getApplyUserId() {
        return this.applyUserId;
    }

    /**
     * @return applyUserName
     */
    public String getApplyUserName() {
        return this.applyUserName;
    }

    /**
     * @return auditRemark
     */
    public String getAuditRemark() {
        return this.auditRemark;
    }

    /**
     * @return auditUserId
     */
    public String getAuditUserId() {
        return this.auditUserId;
    }

    /**
     * @return auditUserName
     */
    public String getAuditUserName() {
        return this.auditUserName;
    }

    /**
     * @return consoleRuleId
     */
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleAuditType
     */
    public String getRuleAuditType() {
        return this.ruleAuditType;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleVersionId
     */
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

    public static final class Builder extends Request.Builder<ModifyRuleStatusRequest, Builder> {
        private String lang; 
        private String applyUserId; 
        private String applyUserName; 
        private String auditRemark; 
        private String auditUserId; 
        private String auditUserName; 
        private Long consoleRuleId; 
        private String eventType; 
        private String regId; 
        private String ruleAuditType; 
        private String ruleId; 
        private Long ruleVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRuleStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.applyUserId = request.applyUserId;
            this.applyUserName = request.applyUserName;
            this.auditRemark = request.auditRemark;
            this.auditUserId = request.auditUserId;
            this.auditUserName = request.auditUserName;
            this.consoleRuleId = request.consoleRuleId;
            this.eventType = request.eventType;
            this.regId = request.regId;
            this.ruleAuditType = request.ruleAuditType;
            this.ruleId = request.ruleId;
            this.ruleVersionId = request.ruleVersionId;
        } 

        /**
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>UID of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        public Builder applyUserId(String applyUserId) {
            this.putQueryParameter("applyUserId", applyUserId);
            this.applyUserId = applyUserId;
            return this;
        }

        /**
         * <p>Name of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder applyUserName(String applyUserName) {
            this.putQueryParameter("applyUserName", applyUserName);
            this.applyUserName = applyUserName;
            return this;
        }

        /**
         * <p>Approval remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>申请发布上线</p>
         */
        public Builder auditRemark(String auditRemark) {
            this.putQueryParameter("auditRemark", auditRemark);
            this.auditRemark = auditRemark;
            return this;
        }

        /**
         * <p>UID of the auditor.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        public Builder auditUserId(String auditUserId) {
            this.putQueryParameter("auditUserId", auditUserId);
            this.auditUserId = auditUserId;
            return this;
        }

        /**
         * <p>Name of the auditor.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder auditUserName(String auditUserName) {
            this.putQueryParameter("auditUserName", auditUserName);
            this.auditUserName = auditUserName;
            return this;
        }

        /**
         * <p>Primary key ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>6843</p>
         */
        public Builder consoleRuleId(Long consoleRuleId) {
            this.putQueryParameter("consoleRuleId", consoleRuleId);
            this.consoleRuleId = consoleRuleId;
            return this;
        }

        /**
         * <p>Event type.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Audit status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT_TO_RUNNING</p>
         */
        public Builder ruleAuditType(String ruleAuditType) {
            this.putQueryParameter("ruleAuditType", ruleAuditType);
            this.ruleAuditType = ruleAuditType;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101544</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Primary key ID of the policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>11519</p>
         */
        public Builder ruleVersionId(Long ruleVersionId) {
            this.putQueryParameter("ruleVersionId", ruleVersionId);
            this.ruleVersionId = ruleVersionId;
            return this;
        }

        @Override
        public ModifyRuleStatusRequest build() {
            return new ModifyRuleStatusRequest(this);
        } 

    } 

}
