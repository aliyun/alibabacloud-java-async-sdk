// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateMaintainWindowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMaintainWindowResponseBody</p>
 */
public class CreateMaintainWindowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    private String maintainWindowId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMaintainWindowResponseBody(Builder builder) {
        this.maintainWindowId = builder.maintainWindowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaintainWindowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maintainWindowId
     */
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String maintainWindowId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMaintainWindowResponseBody model) {
            this.maintainWindowId = model.maintainWindowId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the created silence policy.</p>
         * 
         * <strong>example:</strong>
         * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.maintainWindowId = maintainWindowId;
            return this;
        }

        /**
         * <p>The unique ID of the request. You can use this ID for troubleshooting and ticket tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMaintainWindowResponseBody build() {
            return new CreateMaintainWindowResponseBody(this);
        } 

    } 

}
