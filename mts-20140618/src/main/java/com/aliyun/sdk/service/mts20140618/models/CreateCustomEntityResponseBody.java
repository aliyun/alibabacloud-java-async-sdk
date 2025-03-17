// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link CreateCustomEntityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomEntityResponseBody</p>
 */
public class CreateCustomEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomEntityId")
    private String customEntityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomEntityResponseBody(Builder builder) {
        this.customEntityId = builder.customEntityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customEntityId
     */
    public String getCustomEntityId() {
        return this.customEntityId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customEntityId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomEntityResponseBody model) {
            this.customEntityId = model.customEntityId;
            this.requestId = model.requestId;
        } 

        /**
         * CustomEntityId.
         */
        public Builder customEntityId(String customEntityId) {
            this.customEntityId = customEntityId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomEntityResponseBody build() {
            return new CreateCustomEntityResponseBody(this);
        } 

    } 

}
