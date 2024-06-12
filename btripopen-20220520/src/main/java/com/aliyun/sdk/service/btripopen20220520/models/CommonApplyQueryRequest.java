// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>CommonApplyQueryRequest</p>
 */
public class CommonApplyQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("biz_category")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("business_instance_id")
    private String businessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CommonApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.bizCategory = builder.bizCategory;
        this.businessInstanceId = builder.businessInstanceId;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
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
     * @return businessInstanceId
     */
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
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

    public static final class Builder extends Request.Builder<CommonApplyQueryRequest, Builder> {
        private Long applyId; 
        private Integer bizCategory; 
        private String businessInstanceId; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CommonApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.bizCategory = request.bizCategory;
            this.businessInstanceId = request.businessInstanceId;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
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
         * business_instance_id.
         */
        public Builder businessInstanceId(String businessInstanceId) {
            this.putQueryParameter("business_instance_id", businessInstanceId);
            this.businessInstanceId = businessInstanceId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
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
        public CommonApplyQueryRequest build() {
            return new CommonApplyQueryRequest(this);
        } 

    } 

}
