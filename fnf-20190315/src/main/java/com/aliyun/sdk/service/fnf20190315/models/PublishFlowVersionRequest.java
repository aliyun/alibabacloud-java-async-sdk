// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link PublishFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishFlowVersionRequest</p>
 */
public class PublishFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    private PublishFlowVersionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFlowVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    public static final class Builder extends Request.Builder<PublishFlowVersionRequest, Builder> {
        private String description; 
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(PublishFlowVersionRequest request) {
            super(request);
            this.description = request.description;
            this.flowName = request.flowName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-flow-name</p>
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        @Override
        public PublishFlowVersionRequest build() {
            return new PublishFlowVersionRequest(this);
        } 

    } 

}
