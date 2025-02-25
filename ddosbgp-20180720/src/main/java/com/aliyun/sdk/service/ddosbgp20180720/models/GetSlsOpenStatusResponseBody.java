// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSlsOpenStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSlsOpenStatusResponseBody</p>
 */
public class GetSlsOpenStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsOpenStatus")
    private Boolean slsOpenStatus;

    private GetSlsOpenStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsOpenStatus = builder.slsOpenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSlsOpenStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsOpenStatus
     */
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean slsOpenStatus; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D01666F5-541B-4C78-98A6-D29E02DAAC7C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether Simple Log Service was activated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slsOpenStatus(Boolean slsOpenStatus) {
            this.slsOpenStatus = slsOpenStatus;
            return this;
        }

        public GetSlsOpenStatusResponseBody build() {
            return new GetSlsOpenStatusResponseBody(this);
        } 

    } 

}
