// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnmapPlanogramRailRequest} extends {@link RequestModel}
 *
 * <p>UnmapPlanogramRailRequest</p>
 */
public class UnmapPlanogramRailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RailCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String railCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private UnmapPlanogramRailRequest(Builder builder) {
        super(builder);
        this.railCode = builder.railCode;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnmapPlanogramRailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return railCode
     */
    public String getRailCode() {
        return this.railCode;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<UnmapPlanogramRailRequest, Builder> {
        private String railCode; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(UnmapPlanogramRailRequest request) {
            super(request);
            this.railCode = request.railCode;
            this.storeId = request.storeId;
        } 

        /**
         * RailCode.
         */
        public Builder railCode(String railCode) {
            this.putBodyParameter("RailCode", railCode);
            this.railCode = railCode;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public UnmapPlanogramRailRequest build() {
            return new UnmapPlanogramRailRequest(this);
        } 

    } 

}
