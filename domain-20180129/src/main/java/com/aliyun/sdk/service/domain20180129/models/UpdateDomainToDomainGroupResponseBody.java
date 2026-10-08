// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link UpdateDomainToDomainGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDomainToDomainGroupResponseBody</p>
 */
public class UpdateDomainToDomainGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDomainToDomainGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainToDomainGroupResponseBody create() {
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

        private Builder(UpdateDomainToDomainGroupResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDomainToDomainGroupResponseBody build() {
            return new UpdateDomainToDomainGroupResponseBody(this);
        } 

    } 

}
