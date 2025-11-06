// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveRegistrantProfileRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>SaveRegistrantProfileRealNameVerificationResponseBody</p>
 */
public class SaveRegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SaveRegistrantProfileRealNameVerificationResponseBody(Builder builder) {
        this.registrantProfileId = builder.registrantProfileId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveRegistrantProfileRealNameVerificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long registrantProfileId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SaveRegistrantProfileRealNameVerificationResponseBody model) {
            this.registrantProfileId = model.registrantProfileId;
            this.requestId = model.requestId;
        } 

        /**
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SaveRegistrantProfileRealNameVerificationResponseBody build() {
            return new SaveRegistrantProfileRealNameVerificationResponseBody(this);
        } 

    } 

}
