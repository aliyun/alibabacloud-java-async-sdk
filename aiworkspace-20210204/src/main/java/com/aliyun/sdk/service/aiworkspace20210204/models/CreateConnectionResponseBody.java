// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConnectionResponseBody</p>
 */
public class CreateConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    private String connectionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateConnectionResponseBody(Builder builder) {
        this.connectionId = builder.connectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateConnectionResponseBody model) {
            this.connectionId = model.connectionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-pai9m***mi47</p>
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConnectionResponseBody build() {
            return new CreateConnectionResponseBody(this);
        } 

    } 

}
