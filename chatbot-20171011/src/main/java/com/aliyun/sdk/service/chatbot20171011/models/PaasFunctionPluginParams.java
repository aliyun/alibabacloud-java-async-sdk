// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasFunctionPluginParams} extends {@link TeaModel}
 *
 * <p>PaasFunctionPluginParams</p>
 */
public class PaasFunctionPluginParams extends TeaModel {
    @NameInMap("Body")
    private String body;

    @NameInMap("Header")
    private java.util.Map < String, String > header;

    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @NameInMap("Query")
    private java.util.Map < String, String > query;

    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private PaasFunctionPluginParams(Builder builder) {
        this.body = builder.body;
        this.header = builder.header;
        this.method = builder.method;
        this.query = builder.query;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasFunctionPluginParams create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return header
     */
    public java.util.Map < String, String > getHeader() {
        return this.header;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return query
     */
    public java.util.Map < String, String > getQuery() {
        return this.query;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String body; 
        private java.util.Map < String, String > header; 
        private String method; 
        private java.util.Map < String, String > query; 
        private String url; 

        /**
         * Body
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Header
         */
        public Builder header(java.util.Map < String, String > header) {
            this.header = header;
            return this;
        }

        /**
         * Method
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * Query
         */
        public Builder query(java.util.Map < String, String > query) {
            this.query = query;
            return this;
        }

        /**
         * Url
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public PaasFunctionPluginParams build() {
            return new PaasFunctionPluginParams(this);
        } 

    } 

}
