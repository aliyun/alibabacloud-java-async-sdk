// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("Paging")
    private Boolean paging;

    @NameInMap("RequestId")
    private String requestId;

    private CreateUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.paging = builder.paging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return paging
     */
    public Boolean getPaging() {
        return this.paging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private Boolean paging; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * Paging.
         */
        public Builder paging(Boolean paging) {
            this.paging = paging;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

}
