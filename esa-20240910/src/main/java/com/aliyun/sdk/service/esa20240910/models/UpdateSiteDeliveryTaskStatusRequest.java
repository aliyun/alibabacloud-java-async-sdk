// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateSiteDeliveryTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteDeliveryTaskStatusRequest</p>
 */
public class UpdateSiteDeliveryTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private UpdateSiteDeliveryTaskStatusRequest(Builder builder) {
        super(builder);
        this.method = builder.method;
        this.siteId = builder.siteId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteDeliveryTaskStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateSiteDeliveryTaskStatusRequest, Builder> {
        private String method; 
        private Long siteId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteDeliveryTaskStatusRequest request) {
            super(request);
            this.method = request.method;
            this.siteId = request.siteId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>Specifies whether to enable the delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn-test-task</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateSiteDeliveryTaskStatusRequest build() {
            return new UpdateSiteDeliveryTaskStatusRequest(this);
        } 

    } 

}
