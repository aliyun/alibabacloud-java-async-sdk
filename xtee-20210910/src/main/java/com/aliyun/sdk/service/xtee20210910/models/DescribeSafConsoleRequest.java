// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafConsoleRequest} extends {@link RequestModel}
 *
 * <p>DescribeSafConsoleRequest</p>
 */
public class DescribeSafConsoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service")
    @com.aliyun.core.annotation.Validation(required = true)
    private String service;

    private DescribeSafConsoleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.content = builder.content;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafConsoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<DescribeSafConsoleRequest, Builder> {
        private String lang; 
        private String content; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSafConsoleRequest request) {
            super(request);
            this.lang = request.lang;
            this.content = request.content;
            this.service = request.service;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * service.
         */
        public Builder service(String service) {
            this.putQueryParameter("service", service);
            this.service = service;
            return this;
        }

        @Override
        public DescribeSafConsoleRequest build() {
            return new DescribeSafConsoleRequest(this);
        } 

    } 

}
