// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResponseBody</p>
 */
public class CreateAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private Integer appId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer appId; 
        private String requestId; 

        /**
         * AppId.
         */
        public Builder appId(Integer appId) {
            this.appId = appId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppResponseBody build() {
            return new CreateAppResponseBody(this);
        } 

    } 

}
