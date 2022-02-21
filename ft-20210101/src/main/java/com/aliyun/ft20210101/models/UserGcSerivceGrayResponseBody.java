// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserGcSerivceGrayResponseBody} extends {@link TeaModel}
 *
 * <p>UserGcSerivceGrayResponseBody</p>
 */
public class UserGcSerivceGrayResponseBody extends TeaModel {
    @NameInMap("Body")
    private String body;

    @NameInMap("RequestId")
    private String requestId;

    private UserGcSerivceGrayResponseBody(Builder builder) {
        this.body = builder.body;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserGcSerivceGrayResponseBody create() {
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

    public static final class Builder {
        private String body; 
        private String requestId; 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UserGcSerivceGrayResponseBody build() {
            return new UserGcSerivceGrayResponseBody(this);
        } 

    } 

}
