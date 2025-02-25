// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link CreateSupplierRegistrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSupplierRegistrationResponseBody</p>
 */
public class CreateSupplierRegistrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSupplierRegistrationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSupplierRegistrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C4A145D8-xxxx-xxxx-xxxx-9730CDA27578</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSupplierRegistrationResponseBody build() {
            return new CreateSupplierRegistrationResponseBody(this);
        } 

    } 

}
