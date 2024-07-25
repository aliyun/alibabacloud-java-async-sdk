// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpApiOperation} extends {@link TeaModel}
 *
 * <p>HttpApiOperation</p>
 */
public class HttpApiOperation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.NameInMap("mock")
    private HttpApiMockContract mock;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.NameInMap("request")
    private HttpApiRequestContract request;

    @com.aliyun.core.annotation.NameInMap("response")
    private HttpApiResponseContract response;

    private HttpApiOperation(Builder builder) {
        this.description = builder.description;
        this.method = builder.method;
        this.mock = builder.mock;
        this.name = builder.name;
        this.path = builder.path;
        this.request = builder.request;
        this.response = builder.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiOperation create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return mock
     */
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return request
     */
    public HttpApiRequestContract getRequest() {
        return this.request;
    }

    /**
     * @return response
     */
    public HttpApiResponseContract getResponse() {
        return this.response;
    }

    public static final class Builder {
        private String description; 
        private String method; 
        private HttpApiMockContract mock; 
        private String name; 
        private String path; 
        private HttpApiRequestContract request; 
        private HttpApiResponseContract response; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * mock.
         */
        public Builder mock(HttpApiMockContract mock) {
            this.mock = mock;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * request.
         */
        public Builder request(HttpApiRequestContract request) {
            this.request = request;
            return this;
        }

        /**
         * response.
         */
        public Builder response(HttpApiResponseContract response) {
            this.response = response;
            return this;
        }

        public HttpApiOperation build() {
            return new HttpApiOperation(this);
        } 

    } 

}
