// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListAppTemplatesRequest</p>
 */
public class ListAppTemplatesRequest extends Request {
    @Query
    @NameInMap("AppType")
    @Validation(required = true)
    private String appType;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private ListAppTemplatesRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.source = builder.source;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListAppTemplatesRequest, Builder> {
        private String appType; 
        private String source; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListAppTemplatesRequest request) {
            super(request);
            this.appType = request.appType;
            this.source = request.source;
            this.templateType = request.templateType;
        } 

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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
        public ListAppTemplatesRequest build() {
            return new ListAppTemplatesRequest(this);
        } 

    } 

}
