// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateThreadResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateThreadResponseBody</p>
 */
public class UpdateThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private UpdateThreadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threadId = builder.threadId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateThreadResponseBody create() {
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
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private String threadId; 
        private Long version; 

        private Builder() {
        } 

        private Builder(UpdateThreadResponseBody model) {
            this.requestId = model.requestId;
            this.threadId = model.threadId;
            this.version = model.version;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public UpdateThreadResponseBody build() {
            return new UpdateThreadResponseBody(this);
        } 

    } 

}
