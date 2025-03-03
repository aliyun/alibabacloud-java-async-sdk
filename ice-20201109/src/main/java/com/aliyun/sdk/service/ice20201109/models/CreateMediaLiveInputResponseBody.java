// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateMediaLiveInputResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMediaLiveInputResponseBody</p>
 */
public class CreateMediaLiveInputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputId")
    private String inputId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMediaLiveInputResponseBody(Builder builder) {
        this.inputId = builder.inputId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaLiveInputResponseBody create() {
        return builder().build();
    }

    /**
     * @return inputId
     */
    public String getInputId() {
        return this.inputId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String inputId; 
        private String requestId; 

        /**
         * InputId.
         */
        public Builder inputId(String inputId) {
            this.inputId = inputId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMediaLiveInputResponseBody build() {
            return new CreateMediaLiveInputResponseBody(this);
        } 

    } 

}
