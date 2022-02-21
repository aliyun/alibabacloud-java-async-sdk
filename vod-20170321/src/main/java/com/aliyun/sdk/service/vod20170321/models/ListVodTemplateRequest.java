// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListVodTemplateRequest</p>
 */
public class ListVodTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
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

        private Builder(ListVodTemplateRequest response) {
            super(response);
            this.appId = response.appId;
            this.templateType = response.templateType;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * TemplateType.
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
