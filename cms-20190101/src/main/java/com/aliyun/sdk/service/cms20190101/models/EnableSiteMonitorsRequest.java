// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableSiteMonitorsRequest} extends {@link RequestModel}
 *
 * <p>EnableSiteMonitorsRequest</p>
 */
public class EnableSiteMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the site monitoring task. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>49f7b317-7645-4cc9-94fd-ea42e522****,49f7b317-7645-4cc9-94fd-ea42e522****</p>
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
