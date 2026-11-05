// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifySearchParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySearchParametersResponseBody</p>
 */
public class ModifySearchParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifySearchParametersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySearchParametersResponseBody create() {
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

        private Builder(ModifySearchParametersResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID. A successful response indicates that the parameter modification task has been accepted, but does not indicate that the parameters have taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySearchParametersResponseBody build() {
            return new ModifySearchParametersResponseBody(this);
        } 

    } 

}
