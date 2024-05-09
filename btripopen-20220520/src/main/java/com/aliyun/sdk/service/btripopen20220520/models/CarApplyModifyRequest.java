// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyModifyRequest} extends {@link RequestModel}
 *
 * <p>CarApplyModifyRequest</p>
 */
public class CarApplyModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operate_time")
    private String operateTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CarApplyModifyRequest(Builder builder) {
        super(builder);
        this.operateTime = builder.operateTime;
        this.remark = builder.remark;
        this.status = builder.status;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateTime
     */
    public String getOperateTime() {
        return this.operateTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdPartApplyId
     */
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<CarApplyModifyRequest, Builder> {
        private String operateTime; 
        private String remark; 
        private Integer status; 
        private String thirdPartApplyId; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyModifyRequest request) {
            super(request);
            this.operateTime = request.operateTime;
            this.remark = request.remark;
            this.status = request.status;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * operate_time.
         */
        public Builder operateTime(String operateTime) {
            this.putBodyParameter("operate_time", operateTime);
            this.operateTime = operateTime;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * third_part_apply_id.
         */
        public Builder thirdPartApplyId(String thirdPartApplyId) {
            this.putBodyParameter("third_part_apply_id", thirdPartApplyId);
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
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
        public CarApplyModifyRequest build() {
            return new CarApplyModifyRequest(this);
        } 

    } 

}
