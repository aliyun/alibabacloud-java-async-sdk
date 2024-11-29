// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFullNatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFullNatEntryResponseBody</p>
 */
public class CreateFullNatEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullNatEntryId")
    private String fullNatEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The FULLNAT entry ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fullnat-gw8fz23jezpbblf1j****</p>
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
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
