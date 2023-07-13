// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSiteMonitorsRequest} extends {@link RequestModel}
 *
 * <p>DisableSiteMonitorsRequest</p>
 */
public class DisableSiteMonitorsRequest extends Request {
    @Query
    @NameInMap("TaskIds")
    @Validation(required = true)
    private String taskIds;

    private DisableSiteMonitorsRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableSiteMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DisableSiteMonitorsRequest, Builder> {
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DisableSiteMonitorsRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * The IDs of the site monitoring tasks. Separate multiple IDs with commas (,).
         */
        public Builder taskIds(String taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DisableSiteMonitorsRequest build() {
            return new DisableSiteMonitorsRequest(this);
        } 

    } 

}
