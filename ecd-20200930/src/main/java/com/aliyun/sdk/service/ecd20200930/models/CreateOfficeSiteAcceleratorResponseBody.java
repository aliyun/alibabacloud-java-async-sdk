// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateOfficeSiteAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOfficeSiteAcceleratorResponseBody</p>
 */
public class CreateOfficeSiteAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOfficeSiteAcceleratorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOfficeSiteAcceleratorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOfficeSiteAcceleratorResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1qxuk10jceqw3zb***p</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOfficeSiteAcceleratorResponseBody build() {
            return new CreateOfficeSiteAcceleratorResponseBody(this);
        } 

    } 

}
