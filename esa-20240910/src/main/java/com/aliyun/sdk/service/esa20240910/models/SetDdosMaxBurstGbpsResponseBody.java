// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetDdosMaxBurstGbpsResponseBody} extends {@link TeaModel}
 *
 * <p>SetDdosMaxBurstGbpsResponseBody</p>
 */
public class SetDdosMaxBurstGbpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetDdosMaxBurstGbpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDdosMaxBurstGbpsResponseBody create() {
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

        private Builder(SetDdosMaxBurstGbpsResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request. Alibaba Cloud generates this unique ID for each request. Use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDdosMaxBurstGbpsResponseBody build() {
            return new SetDdosMaxBurstGbpsResponseBody(this);
        } 

    } 

}
