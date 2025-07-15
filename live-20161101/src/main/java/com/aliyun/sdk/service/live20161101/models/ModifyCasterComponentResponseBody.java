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
 * {@link ModifyCasterComponentResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCasterComponentResponseBody</p>
 */
public class ModifyCasterComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private String componentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCasterComponentResponseBody(Builder builder) {
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterComponentResponseBody create() {
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

        private Builder(ModifyCasterComponentResponseBody model) {
            this.componentId = model.componentId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the component. You can use the ID as a request parameter in the API operation that is called to query components in a production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
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

        public ModifyCasterComponentResponseBody build() {
            return new ModifyCasterComponentResponseBody(this);
        } 

    } 

}
