// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>CommonApplyQueryRequest</p>
 */
public class CommonApplyQueryRequest extends Request {
    @Query
    @NameInMap("apply_id")
    @Validation(required = true)
    private Long applyId;

    @Query
    @NameInMap("biz_category")
    @Validation(required = true)
    private Integer bizCategory;

    @Query
    @NameInMap("user_id")
    private String userId;

    private CommonApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.bizCategory = builder.bizCategory;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonApplyQueryRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CommonApplyQueryRequest, Builder> {
        private Long applyId; 
        private Integer bizCategory; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CommonApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.bizCategory = request.bizCategory;
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
         * 业务类型
         */
        public Builder bizCategory(Integer bizCategory) {
            this.putQueryParameter("biz_category", bizCategory);
            this.bizCategory = bizCategory;
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
        public CommonApplyQueryRequest build() {
            return new CommonApplyQueryRequest(this);
        } 

    } 

}
