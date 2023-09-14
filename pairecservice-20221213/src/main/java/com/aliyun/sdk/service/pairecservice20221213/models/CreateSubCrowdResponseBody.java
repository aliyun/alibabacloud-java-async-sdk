// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCrowdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubCrowdResponseBody</p>
 */
public class CreateSubCrowdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCrowdId")
    private String subCrowdId;

    private CreateSubCrowdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subCrowdId = builder.subCrowdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCrowdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCrowdId
     */
    public String getSubCrowdId() {
        return this.subCrowdId;
    }

    public static final class Builder {
        private String requestId; 
        private String subCrowdId; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCrowdId.
         */
        public Builder subCrowdId(String subCrowdId) {
            this.subCrowdId = subCrowdId;
            return this;
        }

        public CreateSubCrowdResponseBody build() {
            return new CreateSubCrowdResponseBody(this);
        } 

    } 

}
