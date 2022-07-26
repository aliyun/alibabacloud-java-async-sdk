// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>HotelExceedApplyQueryRequest</p>
 */
public class HotelExceedApplyQueryRequest extends Request {
    @Query
    @NameInMap("apply_id")
    @Validation(required = true)
    private Long applyId;

    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Query
    @NameInMap("user_id")
    private String userId;

    private HotelExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.corpId = builder.corpId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelExceedApplyQueryRequest create() {
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
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<HotelExceedApplyQueryRequest, Builder> {
        private Long applyId; 
        private String corpId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(HotelExceedApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.corpId = request.corpId;
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
         * corp_id.
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
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
        public HotelExceedApplyQueryRequest build() {
            return new HotelExceedApplyQueryRequest(this);
        } 

    } 

}
