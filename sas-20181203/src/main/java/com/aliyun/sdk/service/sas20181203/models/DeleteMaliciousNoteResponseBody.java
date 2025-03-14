// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteMaliciousNoteResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMaliciousNoteResponseBody</p>
 */
public class DeleteMaliciousNoteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMaliciousNoteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaliciousNoteResponseBody create() {
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

        private Builder(DeleteMaliciousNoteResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53CXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMaliciousNoteResponseBody build() {
            return new DeleteMaliciousNoteResponseBody(this);
        } 

    } 

}
