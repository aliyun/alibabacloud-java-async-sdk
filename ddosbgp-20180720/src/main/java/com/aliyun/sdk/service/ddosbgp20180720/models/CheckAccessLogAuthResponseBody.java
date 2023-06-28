// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAccessLogAuthResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAccessLogAuthResponseBody</p>
 */
public class CheckAccessLogAuthResponseBody extends TeaModel {
    @NameInMap("AccessLogAuth")
    private Boolean accessLogAuth;

    @NameInMap("RequestId")
    private String requestId;

    private CheckAccessLogAuthResponseBody(Builder builder) {
        this.accessLogAuth = builder.accessLogAuth;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAccessLogAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessLogAuth
     */
    public Boolean getAccessLogAuth() {
        return this.accessLogAuth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean accessLogAuth; 
        private String requestId; 

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
         * <p>
         * 
         * For more information about sample requests, see the **"Examples"** section of this topic.
         */
        public Builder accessLogAuth(Boolean accessLogAuth) {
            this.accessLogAuth = accessLogAuth;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckAccessLogAuthResponseBody build() {
            return new CheckAccessLogAuthResponseBody(this);
        } 

    } 

}
