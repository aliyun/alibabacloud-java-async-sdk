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
 * {@link DeleteAlertContactResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactResponseBody</p>
 */
public class DeleteAlertContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAlertContactResponseBody(Builder builder) {
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactResponseBody create() {
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
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><code>true</code>: The call was successful.</li>
         * <li><code>false</code>: The call failed.</li>
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
         * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAlertContactResponseBody build() {
            return new DeleteAlertContactResponseBody(this);
        } 

    } 

}
