// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyApproveRequest} extends {@link RequestModel}
 *
 * <p>ApplyApproveRequest</p>
 */
public class ApplyApproveRequest extends Request {
    @Body
    @NameInMap("apply_id")
    @Validation(required = true)
    private String applyId;

    @Body
    @NameInMap("note")
    private String note;

    @Body
    @NameInMap("operate_time")
    @Validation(required = true)
    private String operateTime;

    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("user_name")
    private String userName;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private ApplyApproveRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.note = builder.note;
        this.operateTime = builder.operateTime;
        this.status = builder.status;
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
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 外部申请单id
         */
        public Builder applyId(String applyId) {
            this.putBodyParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * 备注
         */
        public Builder note(String note) {
            this.putBodyParameter("note", note);
            this.note = note;
            return this;
        }

        /**
         * 操作时间
         */
        public Builder operateTime(String operateTime) {
            this.putBodyParameter("operate_time", operateTime);
            this.operateTime = operateTime;
            return this;
        }

        /**
         * 1已同意 2已拒绝 3已转交 4已取消
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * 审批人id（第三方用户Id），无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 审批人名字
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
