// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScanTaskResponseBody</p>
 */
public class CreateScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateScanTaskResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanTaskResponseBody create() {
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
         * The ID of the custom scan task.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateScanTaskResponseBody build() {
            return new CreateScanTaskResponseBody(this);
        } 

    } 

}
