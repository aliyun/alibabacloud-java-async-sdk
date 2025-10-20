// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link AddApplicationAccountToUserResponseBody} extends {@link TeaModel}
 *
 * <p>AddApplicationAccountToUserResponseBody</p>
 */
public class AddApplicationAccountToUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationAccountId")
    private String applicationAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddApplicationAccountToUserResponseBody(Builder builder) {
        this.applicationAccountId = builder.applicationAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddApplicationAccountToUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAccountId
     */
    public String getApplicationAccountId() {
        return this.applicationAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddApplicationAccountToUserResponseBody model) {
            this.applicationAccountId = model.applicationAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationAccountId.
         */
        public Builder applicationAccountId(String applicationAccountId) {
            this.applicationAccountId = applicationAccountId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddApplicationAccountToUserResponseBody build() {
            return new AddApplicationAccountToUserResponseBody(this);
        } 

    } 

}
