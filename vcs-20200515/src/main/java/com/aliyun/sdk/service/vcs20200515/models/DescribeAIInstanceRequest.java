// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIInstanceRequest</p>
 */
public class DescribeAIInstanceRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("InstanceName")
    private String instanceName;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    private DescribeAIInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DescribeAIInstanceRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private Long pageNumber; 
        private Long pageSize; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIInstanceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.instanceName = response.instanceName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
        } 

        /**
         * ??????id
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ??????id
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DescribeAIInstanceRequest build() {
            return new DescribeAIInstanceRequest(this);
        } 

    } 

}
