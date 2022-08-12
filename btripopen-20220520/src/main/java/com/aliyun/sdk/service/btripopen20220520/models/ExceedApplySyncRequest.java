// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExceedApplySyncRequest} extends {@link RequestModel}
 *
 * <p>ExceedApplySyncRequest</p>
 */
public class ExceedApplySyncRequest extends Request {
    @Query
    @NameInMap("apply_id")
    @Validation(required = true)
    private Long applyId;

    @Query
    @NameInMap("biz_category")
    private Integer bizCategory;

    @Query
    @NameInMap("remark")
    private String remark;

    @Query
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Query
    @NameInMap("thirdparty_flow_id")
    private String thirdpartyFlowId;

    @Query
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    private ExceedApplySyncRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.bizCategory = builder.bizCategory;
        this.remark = builder.remark;
        this.status = builder.status;
        this.thirdpartyFlowId = builder.thirdpartyFlowId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExceedApplySyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return bizCategory
     */
    public Integer getBizCategory() {
        return this.bizCategory;
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
     * @return thirdpartyFlowId
     */
    public String getThirdpartyFlowId() {
        return this.thirdpartyFlowId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ExceedApplySyncRequest, Builder> {
        private Long applyId; 
        private Integer bizCategory; 
        private String remark; 
        private Integer status; 
        private String thirdpartyFlowId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ExceedApplySyncRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.bizCategory = request.bizCategory;
            this.remark = request.remark;
            this.status = request.status;
            this.thirdpartyFlowId = request.thirdpartyFlowId;
            this.userId = request.userId;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * biz_category.
         */
        public Builder bizCategory(Integer bizCategory) {
            this.putQueryParameter("biz_category", bizCategory);
            this.bizCategory = bizCategory;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * thirdparty_flow_id.
         */
        public Builder thirdpartyFlowId(String thirdpartyFlowId) {
            this.putQueryParameter("thirdparty_flow_id", thirdpartyFlowId);
            this.thirdpartyFlowId = thirdpartyFlowId;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ExceedApplySyncRequest build() {
            return new ExceedApplySyncRequest(this);
        } 

    } 

}
