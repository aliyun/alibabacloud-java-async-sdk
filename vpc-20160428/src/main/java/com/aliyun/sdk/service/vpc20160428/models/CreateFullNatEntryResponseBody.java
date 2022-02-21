// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFullNatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFullNatEntryResponseBody</p>
 */
public class CreateFullNatEntryResponseBody extends TeaModel {
    @NameInMap("FullNatEntryId")
    private String fullNatEntryId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFullNatEntryResponseBody(Builder builder) {
        this.fullNatEntryId = builder.fullNatEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFullNatEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fullNatEntryId; 
        private String requestId; 

        /**
         * FullNatEntryId.
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFullNatEntryResponseBody build() {
            return new CreateFullNatEntryResponseBody(this);
        } 

    } 

}
