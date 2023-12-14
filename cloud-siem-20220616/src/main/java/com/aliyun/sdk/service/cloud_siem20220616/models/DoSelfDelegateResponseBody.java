// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoSelfDelegateResponseBody} extends {@link TeaModel}
 *
 * <p>DoSelfDelegateResponseBody</p>
 */
public class DoSelfDelegateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private DoSelfDelegateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoSelfDelegateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * Indicates whether a regular member is authorized. Valid values:
         * <p>
         * 
         * *   true: The member is authorized.
         * *   false: The authorization is canceled.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DoSelfDelegateResponseBody build() {
            return new DoSelfDelegateResponseBody(this);
        } 

    } 

}
