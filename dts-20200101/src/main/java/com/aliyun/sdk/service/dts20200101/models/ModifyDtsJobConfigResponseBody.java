// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifyDtsJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDtsJobConfigResponseBody</p>
 */
public class ModifyDtsJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDtsJobConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobConfigResponseBody create() {
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

        private Builder(ModifyDtsJobConfigResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>068FA72F-4800-4A54-90BB-94806068****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDtsJobConfigResponseBody build() {
            return new ModifyDtsJobConfigResponseBody(this);
        } 

    } 

}
