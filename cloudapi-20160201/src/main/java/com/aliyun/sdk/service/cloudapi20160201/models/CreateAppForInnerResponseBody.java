// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppForInnerResponseBody</p>
 */
public class CreateAppForInnerResponseBody extends TeaModel {
    @NameInMap("AppId")
    private Long appId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAppForInnerResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long appId; 
        private String requestId; 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
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

        public CreateAppForInnerResponseBody build() {
            return new CreateAppForInnerResponseBody(this);
        } 

    } 

}
