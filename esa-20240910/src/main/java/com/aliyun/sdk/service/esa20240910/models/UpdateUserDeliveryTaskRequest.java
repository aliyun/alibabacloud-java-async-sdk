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
 * {@link UpdateUserDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserDeliveryTaskRequest</p>
 */
public class UpdateUserDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiscardRate")
    private Float discardRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterVer")
    private String filterVer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private UpdateUserDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.details = builder.details;
        this.discardRate = builder.discardRate;
        this.fieldName = builder.fieldName;
        this.filterVer = builder.filterVer;
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
     * @return details
     */
    public String getDetails() {
        return this.details;
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
     * @return filterVer
     */
    public String getFilterVer() {
        return this.filterVer;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateUserDeliveryTaskRequest, Builder> {
        private String businessType; 
        private String details; 
        private Float discardRate; 
        private String fieldName; 
        private String filterVer; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserDeliveryTaskRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.details = request.details;
            this.discardRate = request.discardRate;
            this.fieldName = request.fieldName;
            this.filterVer = request.filterVer;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The real-time log type. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine function logs.</li>
         * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
         * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_er</p>
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The list of ER PODs to configure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder details(String details) {
            this.putBodyParameter("Details", details);
            this.details = details;
            return this;
        }

        /**
         * <p>The discard rate. If not specified, the default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The selected fields, separated by commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientRequestID,ClientRequestHost</p>
         */
        public Builder fieldName(String fieldName) {
            this.putBodyParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The version of the filter rule.</p>
         * <blockquote>
         * <p>Compatible with legacy filter rules. The default value is v1. Newly created tasks use v2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder filterVer(String filterVer) {
            this.putBodyParameter("FilterVer", filterVer);
            this.filterVer = filterVer;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
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
