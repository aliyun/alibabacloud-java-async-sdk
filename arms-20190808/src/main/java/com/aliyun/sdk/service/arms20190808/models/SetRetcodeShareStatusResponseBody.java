// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The call is successful.</li>
         * <li><code>false</code>: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
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
