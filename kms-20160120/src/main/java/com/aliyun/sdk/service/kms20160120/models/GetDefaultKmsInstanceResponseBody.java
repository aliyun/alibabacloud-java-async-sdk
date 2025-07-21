// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetDefaultKmsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefaultKmsInstanceResponseBody</p>
 */
public class GetDefaultKmsInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultKmsInstanceId")
    private String defaultKmsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDefaultKmsInstanceResponseBody(Builder builder) {
        this.defaultKmsInstanceId = builder.defaultKmsInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultKmsInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultKmsInstanceId
     */
    public String getDefaultKmsInstanceId() {
        return this.defaultKmsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String defaultKmsInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDefaultKmsInstanceResponseBody model) {
            this.defaultKmsInstanceId = model.defaultKmsInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * DefaultKmsInstanceId.
         */
        public Builder defaultKmsInstanceId(String defaultKmsInstanceId) {
            this.defaultKmsInstanceId = defaultKmsInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDefaultKmsInstanceResponseBody build() {
            return new GetDefaultKmsInstanceResponseBody(this);
        } 

    } 

}
