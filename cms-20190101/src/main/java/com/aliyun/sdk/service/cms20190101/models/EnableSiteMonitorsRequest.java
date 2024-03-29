// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSiteMonitorsRequest} extends {@link RequestModel}
 *
 * <p>EnableSiteMonitorsRequest</p>
 */
public class EnableSiteMonitorsRequest extends Request {
    @Query
    @NameInMap("TaskIds")
    @Validation(required = true)
    private String taskIds;

    private EnableSiteMonitorsRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSiteMonitorsRequest create() {
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

    public static final class Builder extends Request.Builder<EnableSiteMonitorsRequest, Builder> {
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(EnableSiteMonitorsRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * The IDs of the site monitoring tasks. Separate multiple instance IDs with commas (,).
         */
        public Builder taskIds(String taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public EnableSiteMonitorsRequest build() {
            return new EnableSiteMonitorsRequest(this);
        } 

    } 

}
