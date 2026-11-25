// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link OperateApplicationRequest} extends {@link RequestModel}
 *
 * <p>OperateApplicationRequest</p>
 */
public class OperateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentTypes")
    private String componentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupNames")
    private String groupNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    private OperateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.componentTypes = builder.componentTypes;
        this.groupNames = builder.groupNames;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return componentTypes
     */
    public String getComponentTypes() {
        return this.componentTypes;
    }

    /**
     * @return groupNames
     */
    public String getGroupNames() {
        return this.groupNames;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<OperateApplicationRequest, Builder> {
        private String applicationId; 
        private String componentTypes; 
        private String groupNames; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(OperateApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.componentTypes = request.componentTypes;
            this.groupNames = request.groupNames;
            this.operation = request.operation;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The Ray component type. Supported only for the restart operation of Ray applications. The value is a comma-separated list of components. Valid components are head, jupyterlab, and grafana, which can be combined. worker or gpuworker is not accepted. To select workers, you must specify GroupNames. If only head is specified, other components are not actively restarted, but connections and jobs may be affected. To restore dependencies, explicitly add jupyterlab or select the entire cluster. When provided together with GroupNames, the union of both is used and deduplicated. If neither selection parameter is provided, all resident components are restarted, but scaled-out workers are not restarted. Explicit empty strings, pure whitespace, comma-only strings, unknown types, or non-Ray applications are rejected and do not fall back to a full-cluster operation. DisableHeadScheduling and EnableHeadScheduling always apply to the head of the entire application. Specifying this parameter for these operations is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>head,jupyterlab,grafana</p>
         */
        public Builder componentTypes(String componentTypes) {
            this.putQueryParameter("ComponentTypes", componentTypes);
            this.componentTypes = componentTypes;
            return this;
        }

        /**
         * <p>The Ray resident worker group name. Supported only for the restart operation of Ray applications. The value is a comma-separated list of exact workerGroup names, which are trimmed, deduplicated, and case-sensitive. Only resident CPU or GPU workers in the specified groups are restarted, excluding scaled-out workers. If only this parameter is specified, the head, other groups, or auxiliary components are not restarted. Unknown group names, explicit empty strings, pure whitespace, comma-only strings, or non-Ray applications are rejected. If any explicitly selected group exists but has no resident targets, the entire request is rejected and does not expand to scaled-out workers or a full-cluster operation. Full-cluster requests without selection parameters skip groups with no resident targets. DisableHeadScheduling and EnableHeadScheduling do not restart any workers. Specifying this parameter for these operations is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuGroup,gpuGroup</p>
         */
        public Builder groupNames(String groupNames) {
            this.putQueryParameter("GroupNames", groupNames);
            this.groupNames = groupNames;
            return this;
        }

        /**
         * <p>The operation type.</p>
         * <ul>
         * <li><strong>restart</strong>: Restart.</li>
         * <li><strong>stop</strong>: Stop.</li>
         * <li><strong>start</strong>: Start.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>restart</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public OperateApplicationRequest build() {
            return new OperateApplicationRequest(this);
        } 

    } 

}
