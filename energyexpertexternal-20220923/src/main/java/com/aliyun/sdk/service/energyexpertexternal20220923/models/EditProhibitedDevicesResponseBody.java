// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EditProhibitedDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>EditProhibitedDevicesResponseBody</p>
 */
public class EditProhibitedDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private EditProhibitedDevicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditProhibitedDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9bc20a5a-b26b-4c28-922a-7cd10b61f96f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditProhibitedDevicesResponseBody build() {
            return new EditProhibitedDevicesResponseBody(this);
        } 

    } 

}
