// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>FlightExceedApplyQueryRequest</p>
 */
public class FlightExceedApplyQueryRequest extends Request {
    @Query
    @NameInMap("apply_id")
    @Validation(required = true)
    private Long applyId;

    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    private FlightExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.corpId = builder.corpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightExceedApplyQueryRequest create() {
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

    public static final class Builder extends Request.Builder<FlightExceedApplyQueryRequest, Builder> {
        private Long applyId; 
        private String corpId; 

        private Builder() {
            super();
        } 

        private Builder(FlightExceedApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.corpId = request.corpId;
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

        @Override
        public FlightExceedApplyQueryRequest build() {
            return new FlightExceedApplyQueryRequest(this);
        } 

    } 

}
