// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ApplyApproveRequest} extends {@link RequestModel}
 *
 * <p>ApplyApproveRequest</p>
 */
public class ApplyApproveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("note")
    private String note;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operate_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyApproveRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.note = builder.note;
        this.operateTime = builder.operateTime;
        this.status = builder.status;
        this.subCorpId = builder.subCorpId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyApproveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public String getApplyId() {
        return this.applyId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return operateTime
     */
    public String getOperateTime() {
        return this.operateTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyApproveRequest, Builder> {
        private String applyId; 
        private String note; 
        private String operateTime; 
        private Integer status; 
        private String subCorpId; 
        private String userId; 
        private String userName; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyApproveRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.note = request.note;
            this.operateTime = request.operateTime;
            this.status = request.status;
            this.subCorpId = request.subCorpId;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdfg</p>
         */
        public Builder applyId(String applyId) {
            this.putBodyParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * note.
         */
        public Builder note(String note) {
            this.putBodyParameter("note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12 16:12:53</p>
         */
        public Builder operateTime(String operateTime) {
            this.putBodyParameter("operate_time", operateTime);
            this.operateTime = operateTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putBodyParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thirdpart12138</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ApplyApproveRequest build() {
            return new ApplyApproveRequest(this);
        } 

    } 

}
