// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSnatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnatEntryResponseBody</p>
 */
public class CreateSnatEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    private String snatEntryId;

    private CreateSnatEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snatEntryId = builder.snatEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnatEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String snatEntryId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>018EED6A-69CA-58C8-A345-498927D5D34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tc08qfj5ecblfdn2rqr9****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }

        public CreateSnatEntryResponseBody build() {
            return new CreateSnatEntryResponseBody(this);
        } 

    } 

}
