// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link AddDnatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>AddDnatEntryResponseBody</p>
 */
public class AddDnatEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnatEntryId")
    private String dnatEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDnatEntryResponseBody(Builder builder) {
        this.dnatEntryId = builder.dnatEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnatEntryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnatEntryId
     */
    public String getDnatEntryId() {
        return this.dnatEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dnatEntryId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddDnatEntryResponseBody model) {
            this.dnatEntryId = model.dnatEntryId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-kxe4fq3xuzczze****</p>
         */
        public Builder dnatEntryId(String dnatEntryId) {
            this.dnatEntryId = dnatEntryId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>56BF6C79-C77D-41A0-86DD-A4B156E784EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDnatEntryResponseBody build() {
            return new AddDnatEntryResponseBody(this);
        } 

    } 

}
