// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link AddCustomLineResponseBody} extends {@link TeaModel}
 *
 * <p>AddCustomLineResponseBody</p>
 */
public class AddCustomLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LineCode")
    private String lineCode;

    @com.aliyun.core.annotation.NameInMap("LineId")
    private Long lineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCustomLineResponseBody(Builder builder) {
        this.lineCode = builder.lineCode;
        this.lineId = builder.lineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomLineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lineCode
     */
    public String getLineCode() {
        return this.lineCode;
    }

    /**
     * @return lineId
     */
    public Long getLineId() {
        return this.lineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String lineCode; 
        private Long lineId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddCustomLineResponseBody model) {
            this.lineCode = model.lineCode;
            this.lineId = model.lineId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The code of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>hra0yc-597</p>
         */
        public Builder lineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>597</p>
         */
        public Builder lineId(Long lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCustomLineResponseBody build() {
            return new AddCustomLineResponseBody(this);
        } 

    } 

}
