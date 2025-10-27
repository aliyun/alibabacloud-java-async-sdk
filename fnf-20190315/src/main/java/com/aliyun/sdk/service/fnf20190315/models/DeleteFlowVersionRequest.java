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
 * {@link DeleteFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowVersionRequest</p>
 */
public class DeleteFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowVersion;

    private DeleteFlowVersionRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowVersion = builder.flowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public static final class Builder extends Request.Builder<DeleteFlowVersionRequest, Builder> {
        private String flowName; 
        private String flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowVersionRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowVersion = request.flowVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-flow</p>
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder flowVersion(String flowVersion) {
            this.putBodyParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public DeleteFlowVersionRequest build() {
            return new DeleteFlowVersionRequest(this);
        } 

    } 

}
