// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateNetworkZoneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkZoneResponseBody</p>
 */
public class CreateNetworkZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkZoneId")
    private String networkZoneId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkZoneResponseBody(Builder builder) {
        this.networkZoneId = builder.networkZoneId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkZoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkZoneId
     */
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkZoneId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNetworkZoneResponseBody model) {
            this.networkZoneId = model.networkZoneId;
            this.requestId = model.requestId;
        } 

        /**
         * NetworkZoneId.
         */
        public Builder networkZoneId(String networkZoneId) {
            this.networkZoneId = networkZoneId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkZoneResponseBody build() {
            return new CreateNetworkZoneResponseBody(this);
        } 

    } 

}
