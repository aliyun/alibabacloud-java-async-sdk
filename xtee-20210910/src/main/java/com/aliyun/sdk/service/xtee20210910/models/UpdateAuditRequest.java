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
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Approval comments</p>
         * 
         * <strong>example:</strong>
         * <p>同意</p>
         */
        public Builder auditMsg(String auditMsg) {
            this.putQueryParameter("auditMsg", auditMsg);
            this.auditMsg = auditMsg;
            return this;
        }

        /**
         * <p>Associated type</p>
         * 
         * <strong>example:</strong>
         * <p>RULE</p>
         */
        public Builder auditRelationType(String auditRelationType) {
            this.putQueryParameter("auditRelationType", auditRelationType);
            this.auditRelationType = auditRelationType;
            return this;
        }

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>AGREE</p>
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("auditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * <p>The ID of the approval to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>376773</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
