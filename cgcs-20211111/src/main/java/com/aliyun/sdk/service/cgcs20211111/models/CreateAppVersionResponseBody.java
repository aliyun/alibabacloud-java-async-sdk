// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppVersionResponseBody</p>
 */
public class CreateAppVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppVersionResponseBody(Builder builder) {
        this.appVersionId = builder.appVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appVersionId; 
        private String requestId; 

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppVersionResponseBody build() {
            return new CreateAppVersionResponseBody(this);
        } 

    } 

}
