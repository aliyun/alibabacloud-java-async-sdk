// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetCustomAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomAttributeResponseBody</p>
 */
public class GetCustomAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomAttribute")
    private CustomAttribute customAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomAttributeResponseBody(Builder builder) {
        this.customAttribute = builder.customAttribute;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customAttribute
     */
    public CustomAttribute getCustomAttribute() {
        return this.customAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private CustomAttribute customAttribute; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCustomAttributeResponseBody model) {
            this.customAttribute = model.customAttribute;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CustomAttribute.
         */
        public Builder customAttribute(CustomAttribute customAttribute) {
            this.customAttribute = customAttribute;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BA51C9E6-0CBC-5BB9-92BD-0C4FE66E1717</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomAttributeResponseBody build() {
            return new GetCustomAttributeResponseBody(this);
        } 

    } 

}
