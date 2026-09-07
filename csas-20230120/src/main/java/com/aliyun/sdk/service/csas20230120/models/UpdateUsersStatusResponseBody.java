// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateUsersStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUsersStatusResponseBody</p>
 */
public class UpdateUsersStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateUsersStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUsersStatusResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateUsersStatusResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>47363C2B-1AAA-5954-8847-0E50FCC54117</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUsersStatusResponseBody build() {
            return new UpdateUsersStatusResponseBody(this);
        } 

    } 

}
