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
 * {@link AddCasterComponentResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterComponentResponseBody</p>
 */
public class AddCasterComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private String componentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCasterComponentResponseBody(Builder builder) {
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterComponentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String componentId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddCasterComponentResponseBody model) {
            this.componentId = model.componentId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The component ID. The value can be used as the value of a request parameter to query, modify, or delete a production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCasterComponentResponseBody build() {
            return new AddCasterComponentResponseBody(this);
        } 

    } 

}
