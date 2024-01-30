// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRegistrantProfileResponseBody} extends {@link TeaModel}
 *
 * <p>SaveRegistrantProfileResponseBody</p>
 */
public class SaveRegistrantProfileResponseBody extends TeaModel {
    @NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @NameInMap("RequestId")
    private String requestId;

    private SaveRegistrantProfileResponseBody(Builder builder) {
        this.registrantProfileId = builder.registrantProfileId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveRegistrantProfileResponseBody create() {
        return builder().build();
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

        public SaveRegistrantProfileResponseBody build() {
            return new SaveRegistrantProfileResponseBody(this);
        } 

    } 

}
