// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceModelsResponseBody} extends {@link TeaModel}
 *
 * <p>CountDeviceModelsResponseBody</p>
 */
public class CountDeviceModelsResponseBody extends TeaModel {
    @NameInMap("ModelCount")
    private Integer modelCount;

    @NameInMap("RequestId")
    private String requestId;

    private CountDeviceModelsResponseBody(Builder builder) {
        this.modelCount = builder.modelCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountDeviceModelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelCount
     */
    public Integer getModelCount() {
        return this.modelCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer modelCount; 
        private String requestId; 

        /**
         * ModelCount.
         */
        public Builder modelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CountDeviceModelsResponseBody build() {
            return new CountDeviceModelsResponseBody(this);
        } 

    } 

}
