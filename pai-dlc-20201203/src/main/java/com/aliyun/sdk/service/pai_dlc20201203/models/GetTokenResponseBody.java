// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenResponseBody</p>
 */
public class GetTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String requestId; 
        private String token; 

        private Builder() {
        } 

        private Builder(GetTokenResponseBody model) {
            this.requestId = model.requestId;
            this.token = model.token;
        } 

        /**
         * <p>The request ID, which is used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The token of the shared job, which can be used as the value of the Token parameter in the GetJob API operation to view information about the shared job.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9*****</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetTokenResponseBody build() {
            return new GetTokenResponseBody(this);
        } 

    } 

}
