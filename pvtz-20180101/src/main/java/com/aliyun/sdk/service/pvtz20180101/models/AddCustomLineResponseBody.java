// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
    @com.aliyun.core.annotation.NameInMap("LineId")
    private String lineId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCustomLineResponseBody(Builder builder) {
        this.lineId = builder.lineId;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String lineId; 
        private String name; 
        private String requestId; 

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>1065001</p>
         */
        public Builder lineId(String lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The name of the custom line.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
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
