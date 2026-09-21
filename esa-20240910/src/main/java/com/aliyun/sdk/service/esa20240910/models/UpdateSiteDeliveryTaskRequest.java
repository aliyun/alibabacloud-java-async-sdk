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
    @com.aliyun.core.annotation.NameInMap("FilterVer")
    private String filterVer;

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
        this.filterVer = builder.filterVer;
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
     * @return filterVer
     */
    public String getFilterVer() {
        return this.filterVer;
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
        private String filterVer; 
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
            this.filterVer = request.filterVer;
            this.siteId = request.siteId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The log type of real-time logs. Valid values:</p>
         * <ul>
         * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
         * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
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
         * <p>The discard rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder discardRate(Float discardRate) {
            this.putBodyParameter("DiscardRate", discardRate);
            this.discardRate = discardRate;
            return this;
        }

        /**
         * <p>The list of delivery fields to modify, separated by commas.</p>
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
         * <p>The version of the filter rule.</p>
         * <blockquote>
         * <p>Compatible with legacy filter rules. The default value is v1. Newly created rules use v2.</p>
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
         * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The task name.</p>
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
