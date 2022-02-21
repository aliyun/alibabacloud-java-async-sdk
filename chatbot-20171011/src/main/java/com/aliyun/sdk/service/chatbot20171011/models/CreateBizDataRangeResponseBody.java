// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBizDataRangeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBizDataRangeResponseBody</p>
 */
public class CreateBizDataRangeResponseBody extends TeaModel {
    @NameInMap("BizDataRangeId")
    private Long bizDataRangeId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateBizDataRangeResponseBody(Builder builder) {
        this.bizDataRangeId = builder.bizDataRangeId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBizDataRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizDataRangeId
     */
    public Long getBizDataRangeId() {
        return this.bizDataRangeId;
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
        private Long bizDataRangeId; 
        private String requestId; 
        private Boolean success; 

        /**
         * BizDataRangeId.
         */
        public Builder bizDataRangeId(Long bizDataRangeId) {
            this.bizDataRangeId = bizDataRangeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateBizDataRangeResponseBody build() {
            return new CreateBizDataRangeResponseBody(this);
        } 

    } 

}
