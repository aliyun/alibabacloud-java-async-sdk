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
 * {@link DeleteCasterComponentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCasterComponentResponseBody</p>
 */
public class DeleteCasterComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private String componentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCasterComponentResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterComponentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
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
        private String casterId; 
        private String componentId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteCasterComponentResponseBody model) {
            this.casterId = model.casterId;
            this.componentId = model.componentId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is called to query the components in the production studio, add an episode list to the production studio, or modify a component in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The component ID. You can use the ID as a request parameter in the API operation that is called to query the component in the production studio or modify the component in the production studio.</p>
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

        public DeleteCasterComponentResponseBody build() {
            return new DeleteCasterComponentResponseBody(this);
        } 

    } 

}
