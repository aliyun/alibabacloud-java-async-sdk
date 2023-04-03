// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomLineResponseBody} extends {@link TeaModel}
 *
 * <p>AddCustomLineResponseBody</p>
 */
public class AddCustomLineResponseBody extends TeaModel {
    @NameInMap("LineCode")
    private String lineCode;

    @NameInMap("LineId")
    private Long lineId;

    @NameInMap("RequestId")
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

        /**
         * The code of the custom line.
         */
        public Builder lineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }

        /**
         * The unique ID of the custom line.
         */
        public Builder lineId(Long lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * The ID of the request.
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
