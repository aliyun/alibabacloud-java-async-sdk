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
 * {@link SaveBatchDomainRemarkResponseBody} extends {@link TeaModel}
 *
 * <p>SaveBatchDomainRemarkResponseBody</p>
 */
public class SaveBatchDomainRemarkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SaveBatchDomainRemarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchDomainRemarkResponseBody create() {
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

        private Builder(SaveBatchDomainRemarkResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>4189E320-961E-4786-8E15-0000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SaveBatchDomainRemarkResponseBody build() {
            return new SaveBatchDomainRemarkResponseBody(this);
        } 

    } 

}
