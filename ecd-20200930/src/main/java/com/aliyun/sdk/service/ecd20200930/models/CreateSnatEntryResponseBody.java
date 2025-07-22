// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateSnatEntryResponseBody model) {
            this.requestId = model.requestId;
            this.snatEntryId = model.snatEntryId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnatEntryId.
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
