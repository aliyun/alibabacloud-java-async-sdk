// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomBlockRecordResponseBody} extends {@link TeaModel}
 *
 * <p>EnableCustomBlockRecordResponseBody</p>
 */
public class EnableCustomBlockRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableCustomBlockRecordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCustomBlockRecordResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableCustomBlockRecordResponseBody build() {
            return new EnableCustomBlockRecordResponseBody(this);
        } 

    } 

}
