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
         * configVersion.
         */
        public Builder configVersion(String configVersion) {
            this.putQueryParameter("configVersion", configVersion);
            this.configVersion = configVersion;
            return this;
        }

        /**
         * deploymentName.
         */
        public Builder deploymentName(String deploymentName) {
            this.putQueryParameter("deploymentName", deploymentName);
            this.deploymentName = deploymentName;
            return this;
        }

        /**
         * deploymentNo.
         */
        public Builder deploymentNo(String deploymentNo) {
            this.putQueryParameter("deploymentNo", deploymentNo);
            this.deploymentNo = deploymentNo;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
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
