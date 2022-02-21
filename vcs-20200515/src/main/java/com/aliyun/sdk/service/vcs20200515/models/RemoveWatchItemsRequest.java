// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWatchItemsRequest} extends {@link RequestModel}
 *
 * <p>RemoveWatchItemsRequest</p>
 */
public class RemoveWatchItemsRequest extends Request {
    @Body
    @NameInMap("WatchItemIds")
    @Validation(required = true)
    private String watchItemIds;

    @Body
    @NameInMap("WatchPolicyId")
    @Validation(required = true)
    private String watchPolicyId;

    private RemoveWatchItemsRequest(Builder builder) {
        super(builder);
        this.watchItemIds = builder.watchItemIds;
        this.watchPolicyId = builder.watchPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWatchItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return watchItemIds
     */
    public String getWatchItemIds() {
        return this.watchItemIds;
    }

    /**
     * @return watchPolicyId
     */
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    public static final class Builder extends Request.Builder<RemoveWatchItemsRequest, Builder> {
        private String watchItemIds; 
        private String watchPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveWatchItemsRequest response) {
            super(response);
            this.watchItemIds = response.watchItemIds;
            this.watchPolicyId = response.watchPolicyId;
        } 

        /**
         * WatchItemIds.
         */
        public Builder watchItemIds(String watchItemIds) {
            this.putBodyParameter("WatchItemIds", watchItemIds);
            this.watchItemIds = watchItemIds;
            return this;
        }

        /**
         * WatchPolicyId.
         */
        public Builder watchPolicyId(String watchPolicyId) {
            this.putBodyParameter("WatchPolicyId", watchPolicyId);
            this.watchPolicyId = watchPolicyId;
            return this;
        }

        @Override
        public RemoveWatchItemsRequest build() {
            return new RemoveWatchItemsRequest(this);
        } 

    } 

}
