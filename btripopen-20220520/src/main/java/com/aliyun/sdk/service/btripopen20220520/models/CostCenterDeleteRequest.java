// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterDeleteRequest} extends {@link RequestModel}
 *
 * <p>CostCenterDeleteRequest</p>
 */
public class CostCenterDeleteRequest extends Request {
    @Query
    @NameInMap("thirdpart_id")
    @Validation(required = true)
    private String thirdpartId;

    @Query
    @NameInMap("user_id")
    private String userId;

    private CostCenterDeleteRequest(Builder builder) {
        super(builder);
        this.thirdpartId = builder.thirdpartId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CostCenterDeleteRequest, Builder> {
        private String thirdpartId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterDeleteRequest request) {
            super(request);
            this.thirdpartId = request.thirdpartId;
            this.userId = request.userId;
        } 

        /**
         * 第三方成本中心id
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putQueryParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
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
        public CostCenterDeleteRequest build() {
            return new CostCenterDeleteRequest(this);
        } 

    } 

}
