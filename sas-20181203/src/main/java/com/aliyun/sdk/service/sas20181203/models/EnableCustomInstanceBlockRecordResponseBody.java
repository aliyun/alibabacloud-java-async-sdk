// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomInstanceBlockRecordResponseBody} extends {@link TeaModel}
 *
 * <p>EnableCustomInstanceBlockRecordResponseBody</p>
 */
public class EnableCustomInstanceBlockRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableCustomInstanceBlockRecordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCustomInstanceBlockRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableCustomInstanceBlockRecordResponseBody build() {
            return new EnableCustomInstanceBlockRecordResponseBody(this);
        } 

    } 

}
