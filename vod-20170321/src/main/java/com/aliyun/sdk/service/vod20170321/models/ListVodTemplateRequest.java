// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListVodTemplateRequest</p>
 */
public class ListVodTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private ListVodTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListVodTemplateRequest, Builder> {
        private String appId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListVodTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.templateType = request.templateType;
        } 

        /**
         * The ID of the application. Set the value to **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The type of the template. Set the value to **Snapshot**.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListVodTemplateRequest build() {
            return new ListVodTemplateRequest(this);
        } 

    } 

}
