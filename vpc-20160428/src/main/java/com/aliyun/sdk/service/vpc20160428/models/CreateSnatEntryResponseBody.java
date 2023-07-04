// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnatEntryResponseBody</p>
 */
public class CreateSnatEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnatEntryId")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the SNAT entry.
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
