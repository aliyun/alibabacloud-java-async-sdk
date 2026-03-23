// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSendifyAutoLoginURLResponseBody} extends {@link TeaModel}
 *
 * <p>GetSendifyAutoLoginURLResponseBody</p>
 */
public class GetSendifyAutoLoginURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoLoginURL")
    private String autoLoginURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSendifyAutoLoginURLResponseBody(Builder builder) {
        this.autoLoginURL = builder.autoLoginURL;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSendifyAutoLoginURLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoLoginURL
     */
    public String getAutoLoginURL() {
        return this.autoLoginURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String autoLoginURL; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSendifyAutoLoginURLResponseBody model) {
            this.autoLoginURL = model.autoLoginURL;
            this.requestId = model.requestId;
        } 

        /**
         * AutoLoginURL.
         */
        public Builder autoLoginURL(String autoLoginURL) {
            this.autoLoginURL = autoLoginURL;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSendifyAutoLoginURLResponseBody build() {
            return new GetSendifyAutoLoginURLResponseBody(this);
        } 

    } 

}
