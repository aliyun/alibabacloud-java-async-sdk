// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWaterMarkTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWaterMarkTemplateResponseBody</p>
 */
public class DeleteWaterMarkTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WaterMarkTemplateId")
    private String waterMarkTemplateId;

    private DeleteWaterMarkTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waterMarkTemplateId = builder.waterMarkTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWaterMarkTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waterMarkTemplateId
     */
    public String getWaterMarkTemplateId() {
        return this.waterMarkTemplateId;
    }

    public static final class Builder {
        private String requestId; 
        private String waterMarkTemplateId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaterMarkTemplateId.
         */
        public Builder waterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }

        public DeleteWaterMarkTemplateResponseBody build() {
            return new DeleteWaterMarkTemplateResponseBody(this);
        } 

    } 

}
