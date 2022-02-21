// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatchTasksRequest} extends {@link RequestModel}
 *
 * <p>DeleteWatchTasksRequest</p>
 */
public class DeleteWatchTasksRequest extends Request {
    @Body
    @NameInMap("WatchTaskIds")
    @Validation(required = true)
    private String watchTaskIds;

    private DeleteWatchTasksRequest(Builder builder) {
        super(builder);
        this.watchTaskIds = builder.watchTaskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWatchTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return watchTaskIds
     */
    public String getWatchTaskIds() {
        return this.watchTaskIds;
    }

    public static final class Builder extends Request.Builder<DeleteWatchTasksRequest, Builder> {
        private String watchTaskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWatchTasksRequest response) {
            super(response);
            this.watchTaskIds = response.watchTaskIds;
        } 

        /**
         * WatchTaskIds.
         */
        public Builder watchTaskIds(String watchTaskIds) {
            this.putBodyParameter("WatchTaskIds", watchTaskIds);
            this.watchTaskIds = watchTaskIds;
            return this;
        }

        @Override
        public DeleteWatchTasksRequest build() {
            return new DeleteWatchTasksRequest(this);
        } 

    } 

}
