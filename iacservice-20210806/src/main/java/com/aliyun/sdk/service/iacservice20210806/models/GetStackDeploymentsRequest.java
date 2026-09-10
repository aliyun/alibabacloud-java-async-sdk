// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetStackDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>GetStackDeploymentsRequest</p>
 */
public class GetStackDeploymentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configVersion")
    private String configVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentName")
    private String deploymentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentNo")
    private String deploymentNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetStackDeploymentsRequest(Builder builder) {
        super(builder);
        this.stackId = builder.stackId;
        this.configVersion = builder.configVersion;
        this.deploymentName = builder.deploymentName;
        this.deploymentNo = builder.deploymentNo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackDeploymentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return configVersion
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * @return deploymentName
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * @return deploymentNo
     */
    public String getDeploymentNo() {
        return this.deploymentNo;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetStackDeploymentsRequest, Builder> {
        private String stackId; 
        private String configVersion; 
        private String deploymentName; 
        private String deploymentNo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetStackDeploymentsRequest request) {
            super(request);
            this.stackId = request.stackId;
            this.configVersion = request.configVersion;
            this.deploymentName = request.deploymentName;
            this.deploymentNo = request.deploymentNo;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The unique identifier of the stack after it is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld8bgqxxxxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.putPathParameter("stackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The configuration version, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder configVersion(String configVersion) {
            this.putQueryParameter("configVersion", configVersion);
            this.configVersion = configVersion;
            return this;
        }

        /**
         * <p>The deployment name.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder deploymentName(String deploymentName) {
            this.putQueryParameter("deploymentName", deploymentName);
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * <p>The deployment number. The deployment number for each stack starts from 1 and increments each time a deployment is successfully triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deploymentNo(String deploymentNo) {
            this.putQueryParameter("deploymentNo", deploymentNo);
            this.deploymentNo = deploymentNo;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The deployment status.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Name</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Pending</td>
         * <td>The initial status after the deployment is created.</td>
         * </tr>
         * <tr>
         * <td>PriorityQueued</td>
         * <td>Priority queuing in progress.</td>
         * </tr>
         * <tr>
         * <td>PlanQueued</td>
         * <td>The deployment is queuing because no workflow is available after creation.</td>
         * </tr>
         * <tr>
         * <td>ApplyQueued</td>
         * <td>The deployment is queuing because no workflow is available during execution.</td>
         * </tr>
         * <tr>
         * <td>Planning</td>
         * <td>The resource deployment is in the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>Planned</td>
         * <td>The resource deployment has completed the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveInProgress</td>
         * <td>Compliance pre-check in progress.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveSuccess</td>
         * <td>Compliance pre-check succeeded.</td>
         * </tr>
         * <tr>
         * <td>DetectInProgress</td>
         * <td>Drift detection in progress.</td>
         * </tr>
         * <tr>
         * <td>ImportQueued</td>
         * <td>The deployment is queuing because no workflow is available during Import execution.</td>
         * </tr>
         * <tr>
         * <td>Importing</td>
         * <td>The resource deployment is in the Import phase.</td>
         * </tr>
         * <tr>
         * <td>Imported</td>
         * <td>The resource deployment has completed the Import phase.</td>
         * </tr>
         * <tr>
         * <td>StateQueued</td>
         * <td>The deployment is queuing because no workflow is available during state command execution.</td>
         * </tr>
         * <tr>
         * <td>Stating</td>
         * <td>The resource deployment is executing the state command.</td>
         * </tr>
         * <tr>
         * <td>Stated</td>
         * <td>The resource deployment has completed the state command execution.</td>
         * </tr>
         * <tr>
         * <td>Confirmed</td>
         * <td>The resource deployment has been confirmed after the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>PlannedAndFinished</td>
         * <td>No diff was found after the Plan phase. The deployment is in a final status.</td>
         * </tr>
         * <tr>
         * <td>Applying</td>
         * <td>The resource deployment is in the Apply phase.</td>
         * </tr>
         * <tr>
         * <td>Applied</td>
         * <td>The resource deployment has completed the Apply phase.</td>
         * </tr>
         * <tr>
         * <td>Discarded</td>
         * <td>The resource deployment has been discarded and is in a final status.</td>
         * </tr>
         * <tr>
         * <td>Errored</td>
         * <td>The deployment execution encountered an error and is in a final status.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveFailure</td>
         * <td>Compliance pre-check failed.</td>
         * </tr>
         * <tr>
         * <td>Canceled</td>
         * <td>The deployment execution has been canceled and is in a final status.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Applied</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetStackDeploymentsRequest build() {
            return new GetStackDeploymentsRequest(this);
        } 

    } 

}
