// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelBusinessGroupRequest} extends {@link RequestModel}
 *
 * <p>DelBusinessGroupRequest</p>
 */
public class DelBusinessGroupRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    private DelBusinessGroupRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelBusinessGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public static final class Builder extends Request.Builder<DelBusinessGroupRequest, Builder> {
        private String businessGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DelBusinessGroupRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        @Override
        public DelBusinessGroupRequest build() {
            return new DelBusinessGroupRequest(this);
        } 

    } 

}
