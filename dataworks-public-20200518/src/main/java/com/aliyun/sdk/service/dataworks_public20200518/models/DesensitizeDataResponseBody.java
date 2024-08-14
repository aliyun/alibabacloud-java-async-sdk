// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesensitizeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DesensitizeDataResponseBody</p>
 */
public class DesensitizeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesensitizeData")
    private String desensitizeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DesensitizeDataResponseBody(Builder builder) {
        this.desensitizeData = builder.desensitizeData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DesensitizeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return desensitizeData
     */
    public String getDesensitizeData() {
        return this.desensitizeData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String desensitizeData; 
        private String requestId; 

        /**
         * The data returned after masking.
         */
        public Builder desensitizeData(String desensitizeData) {
            this.desensitizeData = desensitizeData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DesensitizeDataResponseBody build() {
            return new DesensitizeDataResponseBody(this);
        } 

    } 

}
