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
 * {@link UpdateSourceLocationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSourceLocationResponseBody</p>
 */
public class UpdateSourceLocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceLocation")
    private ChannelAssemblySourceLocation sourceLocation;

    private UpdateSourceLocationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceLocation = builder.sourceLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSourceLocationResponseBody create() {
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

    /**
     * @return sourceLocation
     */
    public ChannelAssemblySourceLocation getSourceLocation() {
        return this.sourceLocation;
    }

    public static final class Builder {
        private String requestId; 
        private ChannelAssemblySourceLocation sourceLocation; 

        private Builder() {
        } 

        private Builder(UpdateSourceLocationResponseBody model) {
            this.requestId = model.requestId;
            this.sourceLocation = model.sourceLocation;
        } 

        /**
         * <p><strong>Request ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxx-xxxxx-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source location information.</p>
         */
        public Builder sourceLocation(ChannelAssemblySourceLocation sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public UpdateSourceLocationResponseBody build() {
            return new UpdateSourceLocationResponseBody(this);
        } 

    } 

}
