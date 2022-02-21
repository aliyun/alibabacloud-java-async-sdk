// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizDataRangeRequest} extends {@link RequestModel}
 *
 * <p>DescribeBizDataRangeRequest</p>
 */
public class DescribeBizDataRangeRequest extends Request {
    @Query
    @NameInMap("BizDataRangeId")
    @Validation(required = true)
    private Long bizDataRangeId;

    private DescribeBizDataRangeRequest(Builder builder) {
        super(builder);
        this.bizDataRangeId = builder.bizDataRangeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizDataRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizDataRangeId
     */
    public Long getBizDataRangeId() {
        return this.bizDataRangeId;
    }

    public static final class Builder extends Request.Builder<DescribeBizDataRangeRequest, Builder> {
        private Long bizDataRangeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBizDataRangeRequest response) {
            super(response);
            this.bizDataRangeId = response.bizDataRangeId;
        } 

        /**
         * BizDataRangeId.
         */
        public Builder bizDataRangeId(Long bizDataRangeId) {
            this.putQueryParameter("BizDataRangeId", bizDataRangeId);
            this.bizDataRangeId = bizDataRangeId;
            return this;
        }

        @Override
        public DescribeBizDataRangeRequest build() {
            return new DescribeBizDataRangeRequest(this);
        } 

    } 

}
