// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link CreateNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkPathResponseBody</p>
 */
public class CreateNetworkPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkPathId")
    private String networkPathId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkPathResponseBody(Builder builder) {
        this.networkPathId = builder.networkPathId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkPathResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPathId
     */
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkPathId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNetworkPathResponseBody model) {
            this.networkPathId = model.networkPathId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the network path.</p>
         * 
         * <strong>example:</strong>
         * <p>np-4cbf598673d14d27****</p>
         */
        public Builder networkPathId(String networkPathId) {
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92DD9FFB-06FB-56F7-83EF-5CEF98F5562A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkPathResponseBody build() {
            return new CreateNetworkPathResponseBody(this);
        } 

    } 

}
