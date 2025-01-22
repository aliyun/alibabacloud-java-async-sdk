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
 * {@link GetSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceResponseBody</p>
 */
public class GetSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private ChannelAssemblySource source;

    private GetSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public ChannelAssemblySource getSource() {
        return this.source;
    }

    public static final class Builder {
        private String requestId; 
        private ChannelAssemblySource source; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(ChannelAssemblySource source) {
            this.source = source;
            return this;
        }

        public GetSourceResponseBody build() {
            return new GetSourceResponseBody(this);
        } 

    } 

}
