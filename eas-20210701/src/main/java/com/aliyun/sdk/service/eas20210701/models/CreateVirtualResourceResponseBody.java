// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateVirtualResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualResourceResponseBody</p>
 */
public class CreateVirtualResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    private String virtualResourceId;

    private CreateVirtualResourceResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.virtualResourceId = builder.virtualResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String virtualResourceId; 

        private Builder() {
        } 

        private Builder(CreateVirtualResourceResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.virtualResourceId = model.virtualResourceId;
        } 

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully created virtual resource eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        public CreateVirtualResourceResponseBody build() {
            return new CreateVirtualResourceResponseBody(this);
        } 

    } 

}
