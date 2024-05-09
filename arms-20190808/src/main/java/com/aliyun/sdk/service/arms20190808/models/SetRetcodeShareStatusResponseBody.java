// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRetcodeShareStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetRetcodeShareStatusResponseBody</p>
 */
public class SetRetcodeShareStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetRetcodeShareStatusResponseBody(Builder builder) {
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRetcodeShareStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   `true`: The call is successful.
         * *   `false`: The call fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetRetcodeShareStatusResponseBody build() {
            return new SetRetcodeShareStatusResponseBody(this);
        } 

    } 

}
