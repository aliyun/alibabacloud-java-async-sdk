// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFlowCategoryResponseBody</p>
 */
public class DeleteFlowCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteFlowCategoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteFlowCategoryResponseBody build() {
            return new DeleteFlowCategoryResponseBody(this);
        } 

    } 

}
