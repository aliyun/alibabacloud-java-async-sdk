// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCloudGtmMonitorTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudGtmMonitorTemplateRequest</p>
 */
public class DescribeCloudGtmMonitorTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private DescribeCloudGtmMonitorTemplateRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmMonitorTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeCloudGtmMonitorTemplateRequest, Builder> {
        private String acceptLanguage; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudGtmMonitorTemplateRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the health check template that you want to query. This ID uniquely identifies the health check template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mtp-89518052425100**80</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeCloudGtmMonitorTemplateRequest build() {
            return new DescribeCloudGtmMonitorTemplateRequest(this);
        } 

    } 

}
