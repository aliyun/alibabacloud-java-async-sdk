// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateUserDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserDeliveryTaskRequest</p>
 */
public class UpdateUserDeliveryTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private UpdateUserDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.discardRate = builder.discardRate;
        this.fieldName = builder.fieldName;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDeliveryTaskRequest create() {
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateUserDeliveryTaskRequest, Builder> {
        private String businessType; 
        private Float discardRate; 
        private String fieldName; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserDeliveryTaskRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.discardRate = request.discardRate;
            this.fieldName = request.fieldName;
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
         * FieldName.
         */
        public Builder fieldName(String fieldName) {
            this.putBodyParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateUserDeliveryTaskRequest build() {
            return new UpdateUserDeliveryTaskRequest(this);
        } 

    } 

}
