// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckGrantResponseBody} extends {@link TeaModel}
 *
 * <p>CheckGrantResponseBody</p>
 */
public class CheckGrantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private CheckGrantResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGrantResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Integer status; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DB002CE5-5E6C-5F11-AE15-B525299A40F6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Anti-DDoS Origin is authorized to obtain information about the assets within the current Alibaba Cloud account.</li>
         * <li><strong>0</strong>: Anti-DDoS Origin is not authorized to obtain information about the assets within the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public CheckGrantResponseBody build() {
            return new CheckGrantResponseBody(this);
        } 

    } 

}
