// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddCasterVideoResourceResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterVideoResourceResponseBody</p>
 */
public class AddCasterVideoResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private AddCasterVideoResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterVideoResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private String resourceId; 

        private Builder() {
        } 

        private Builder(AddCasterVideoResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource. This parameter can be used as a request parameter in the API operation that you can call to delete the video source in the production studio or modify the video source in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>e5542d98-b08c-46bf-83e9-5b09d08c****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public AddCasterVideoResourceResponseBody build() {
            return new AddCasterVideoResourceResponseBody(this);
        } 

    } 

}
