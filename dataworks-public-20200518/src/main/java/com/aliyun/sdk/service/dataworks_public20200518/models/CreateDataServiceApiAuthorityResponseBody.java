// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceApiAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataServiceApiAuthorityResponseBody</p>
 */
public class CreateDataServiceApiAuthorityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateDataServiceApiAuthorityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceApiAuthorityResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the authorization was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDataServiceApiAuthorityResponseBody build() {
            return new CreateDataServiceApiAuthorityResponseBody(this);
        } 

    } 

}
