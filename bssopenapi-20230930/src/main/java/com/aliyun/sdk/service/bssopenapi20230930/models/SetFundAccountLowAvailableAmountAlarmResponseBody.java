// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SetFundAccountLowAvailableAmountAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>SetFundAccountLowAvailableAmountAlarmResponseBody</p>
 */
public class SetFundAccountLowAvailableAmountAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetFundAccountLowAvailableAmountAlarmResponseBody(Builder builder) {
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFundAccountLowAvailableAmountAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetFundAccountLowAvailableAmountAlarmResponseBody model) {
            this.data = model.data;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08108BF5-1AA3-518E-9986-95A3616E8DA9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetFundAccountLowAvailableAmountAlarmResponseBody build() {
            return new SetFundAccountLowAvailableAmountAlarmResponseBody(this);
        } 

    } 

}
