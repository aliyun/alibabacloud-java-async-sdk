// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyRefreshProcessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRefreshProcessInfoResponseBody</p>
 */
public class ModifyRefreshProcessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRefreshProcessInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRefreshProcessInfoResponseBody create() {
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

        private Builder(ModifyRefreshProcessInfoResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>814FCBBC-3A02-5555-8D05-F8D9FD62A295</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRefreshProcessInfoResponseBody build() {
            return new ModifyRefreshProcessInfoResponseBody(this);
        } 

    } 

}
