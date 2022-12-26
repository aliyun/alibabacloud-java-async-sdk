// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInterceptionTargetRequest} extends {@link RequestModel}
 *
 * <p>DeleteInterceptionTargetRequest</p>
 */
public class DeleteInterceptionTargetRequest extends Request {
    @Query
    @NameInMap("TargetIds")
    @Validation(required = true)
    private String targetIds;

    private DeleteInterceptionTargetRequest(Builder builder) {
        super(builder);
        this.targetIds = builder.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInterceptionTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetIds
     */
    public String getTargetIds() {
        return this.targetIds;
    }

    public static final class Builder extends Request.Builder<DeleteInterceptionTargetRequest, Builder> {
        private String targetIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInterceptionTargetRequest request) {
            super(request);
            this.targetIds = request.targetIds;
        } 

        /**
         * TargetIds.
         */
        public Builder targetIds(String targetIds) {
            this.putQueryParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        @Override
        public DeleteInterceptionTargetRequest build() {
            return new DeleteInterceptionTargetRequest(this);
        } 

    } 

}
