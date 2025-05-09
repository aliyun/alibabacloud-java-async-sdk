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
 * {@link CreateCustomGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomGroupResponseBody</p>
 */
public class CreateCustomGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomGroupId")
    private String customGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomGroupResponseBody(Builder builder) {
        this.customGroupId = builder.customGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customGroupId
     */
    public String getCustomGroupId() {
        return this.customGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomGroupResponseBody model) {
            this.customGroupId = model.customGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * CustomGroupId.
         */
        public Builder customGroupId(String customGroupId) {
            this.customGroupId = customGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomGroupResponseBody build() {
            return new CreateCustomGroupResponseBody(this);
        } 

    } 

}
