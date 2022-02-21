// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcFetchResponseBody} extends {@link TeaModel}
 *
 * <p>UserGcFetchResponseBody</p>
 */
public class UserGcFetchResponseBody extends TeaModel {
    @NameInMap("Body")
    private String body;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestURL")
    private String requestURL;

    private UserGcFetchResponseBody(Builder builder) {
        this.body = builder.body;
        this.requestId = builder.requestId;
        this.requestURL = builder.requestURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserGcFetchResponseBody create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestURL
     */
    public String getRequestURL() {
        return this.requestURL;
    }

    public static final class Builder {
        private String body; 
        private String requestId; 
        private String requestURL; 

        /**
         * Body
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RequestURL
         */
        public Builder requestURL(String requestURL) {
            this.requestURL = requestURL;
            return this;
        }

        public UserGcFetchResponseBody build() {
            return new UserGcFetchResponseBody(this);
        } 

    } 

}
