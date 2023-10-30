// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLabelTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLabelTableResponseBody</p>
 */
public class CreateLabelTableResponseBody extends TeaModel {
    @NameInMap("LabelTableId")
    private String labelTableId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLabelTableResponseBody(Builder builder) {
        this.labelTableId = builder.labelTableId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabelTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String labelTableId; 
        private String requestId; 

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.labelTableId = labelTableId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLabelTableResponseBody build() {
            return new CreateLabelTableResponseBody(this);
        } 

    } 

}
