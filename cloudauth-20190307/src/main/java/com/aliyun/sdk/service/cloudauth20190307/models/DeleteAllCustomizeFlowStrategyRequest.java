// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAllCustomizeFlowStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAllCustomizeFlowStrategyRequest</p>
 */
public class DeleteAllCustomizeFlowStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private DeleteAllCustomizeFlowStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAllCustomizeFlowStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteAllCustomizeFlowStrategyRequest, Builder> {
        private String regionId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAllCustomizeFlowStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>User ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>126005125163xxxx</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteAllCustomizeFlowStrategyRequest build() {
            return new DeleteAllCustomizeFlowStrategyRequest(this);
        } 

    } 

}
