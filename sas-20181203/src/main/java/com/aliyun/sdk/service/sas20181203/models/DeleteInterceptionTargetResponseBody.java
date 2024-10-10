// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteInterceptionTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInterceptionTargetResponseBody</p>
 */
public class DeleteInterceptionTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private DeleteInterceptionTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInterceptionTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D81DD78E-E006-5C65-A171-C8CB09XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the network objects are removed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The network objects are removed.</li>
         * <li><strong>false</strong>: The network objects fail to be removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public DeleteInterceptionTargetResponseBody build() {
            return new DeleteInterceptionTargetResponseBody(this);
        } 

    } 

}
