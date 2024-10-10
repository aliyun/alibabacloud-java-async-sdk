// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSiteDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteDeliveryTaskRequest</p>
 */
public class UpdateSiteDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private UpdateSiteDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.discardRate = builder.discardRate;
        this.fieldName = builder.fieldName;
        this.siteId = builder.siteId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteDeliveryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return discardRate
     */
    public Float getDiscardRate() {
        return this.discardRate;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
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

    public static final class Builder extends Request.Builder<UpdateSiteDeliveryTaskRequest, Builder> {
        private String businessType; 
        private Float discardRate; 
        private String fieldName; 
        private Long siteId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteDeliveryTaskRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.discardRate = request.discardRate;
            this.fieldName = request.fieldName;
            this.siteId = request.siteId;
            this.taskName = request.taskName;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * DiscardRate.
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientIP,UserAgent</p>
         */
        public Builder fieldName(String fieldName) {
            this.putBodyParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * SiteId.
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
        public UpdateSiteDeliveryTaskRequest build() {
            return new UpdateSiteDeliveryTaskRequest(this);
        } 

    } 

}
