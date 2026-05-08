// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link UpdateYikeProductionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateYikeProductionResponseBody</p>
 */
public class UpdateYikeProductionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateYikeProductionResponseBody(Builder builder) {
        this.productionId = builder.productionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateYikeProductionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String productionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateYikeProductionResponseBody model) {
            this.productionId = model.productionId;
            this.requestId = model.requestId;
        } 

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.productionId = productionId;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateYikeProductionResponseBody build() {
            return new UpdateYikeProductionResponseBody(this);
        } 

    } 

}
