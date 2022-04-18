// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataLimitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataLimitResponseBody</p>
 */
public class CreateDataLimitResponseBody extends TeaModel {
    @NameInMap("Id")
    private Integer id;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDataLimitResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer id; 
        private String requestId; 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataLimitResponseBody build() {
            return new CreateDataLimitResponseBody(this);
        } 

    } 

}
