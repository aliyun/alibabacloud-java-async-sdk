// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFlowVersionRequest</p>
 */
public class GetFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowVersion;

    private GetFlowVersionRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowVersion = builder.flowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetFlowVersionRequest, Builder> {
        private String flowName; 
        private String flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowVersionRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowVersion = request.flowVersion;
        } 

        /**
         * <p>工作流实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow</p>
         */
        public Builder flowName(String flowName) {
            this.putPathParameter("flowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>要获取详情的工作流版本号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder flowVersion(String flowVersion) {
            this.putPathParameter("flowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public GetFlowVersionRequest build() {
            return new GetFlowVersionRequest(this);
        } 

    } 

}
