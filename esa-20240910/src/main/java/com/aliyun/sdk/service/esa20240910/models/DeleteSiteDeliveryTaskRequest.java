// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSiteDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteSiteDeliveryTaskRequest</p>
 */
public class DeleteSiteDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private DeleteSiteDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSiteDeliveryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteSiteDeliveryTaskRequest, Builder> {
        private Long siteId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSiteDeliveryTaskRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456******</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn-test-task</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DeleteSiteDeliveryTaskRequest build() {
            return new DeleteSiteDeliveryTaskRequest(this);
        } 

    } 

}
