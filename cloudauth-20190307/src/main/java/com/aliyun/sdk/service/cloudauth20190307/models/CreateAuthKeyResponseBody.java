// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateAuthKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthKeyResponseBody</p>
 */
public class CreateAuthKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAuthKeyResponseBody(Builder builder) {
        this.authKey = builder.authKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAuthKeyResponseBody model) {
            this.authKey = model.authKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The key that can be used for authorization activation. The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
         * 
         * <strong>example:</strong>
         * <p>auth.1KQMcnLd4m37LN2D0F0WCD-1qtQI$</p>
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthKeyResponseBody build() {
            return new CreateAuthKeyResponseBody(this);
        } 

    } 

}
