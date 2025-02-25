// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuditRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuditRequest</p>
 */
public class UpdateAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditMsg")
    private String auditMsg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditRelationType")
    private String auditRelationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditStatus")
    private String auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private UpdateAuditRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.auditMsg = builder.auditMsg;
        this.auditRelationType = builder.auditRelationType;
        this.auditStatus = builder.auditStatus;
        this.id = builder.id;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuditRequest create() {
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
     * @return auditMsg
     */
    public String getAuditMsg() {
        return this.auditMsg;
    }

    /**
     * @return auditRelationType
     */
    public String getAuditRelationType() {
        return this.auditRelationType;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<UpdateAuditRequest, Builder> {
        private String lang; 
        private String auditMsg; 
        private String auditRelationType; 
        private String auditStatus; 
        private Long id; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuditRequest request) {
            super(request);
            this.lang = request.lang;
            this.auditMsg = request.auditMsg;
            this.auditRelationType = request.auditRelationType;
            this.auditStatus = request.auditStatus;
            this.id = request.id;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * auditMsg.
         */
        public Builder auditMsg(String auditMsg) {
            this.putQueryParameter("auditMsg", auditMsg);
            this.auditMsg = auditMsg;
            return this;
        }

        /**
         * auditRelationType.
         */
        public Builder auditRelationType(String auditRelationType) {
            this.putQueryParameter("auditRelationType", auditRelationType);
            this.auditRelationType = auditRelationType;
            return this;
        }

        /**
         * auditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("auditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public UpdateAuditRequest build() {
            return new UpdateAuditRequest(this);
        } 

    } 

}
