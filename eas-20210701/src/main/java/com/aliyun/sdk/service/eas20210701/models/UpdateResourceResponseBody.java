// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateResourceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceResponseBody</p>
 */
public class UpdateResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    private UpdateResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceId; 
        private String resourceName; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>iot</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public UpdateResourceResponseBody build() {
            return new UpdateResourceResponseBody(this);
        } 

    } 

}
