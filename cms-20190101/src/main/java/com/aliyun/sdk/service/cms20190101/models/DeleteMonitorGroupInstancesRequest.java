// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DeleteMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupInstancesRequest</p>
 */
public class DeleteMonitorGroupInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIdList;

    private DeleteMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.dryRun = builder.dryRun;
        this.groupId = builder.groupId;
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupInstancesRequest, Builder> {
        private String category; 
        private Boolean dryRun; 
        private Long groupId; 
        private String instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupInstancesRequest request) {
            super(request);
            this.category = request.category;
            this.dryRun = request.dryRun;
            this.groupId = request.groupId;
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of a cloud service name, see the <code>metricCategory</code> field in the <code>Labels</code> response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits, but does not delete the instances. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a normal request. If the request passes the check, the instances are deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The IDs of the instances to be deleted. Separate multiple instance IDs with commas (,). You can delete up to 20 instances at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a2d5q7pm3f912****,i-a2d5q7pm3f222****</p>
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public DeleteMonitorGroupInstancesRequest build() {
            return new DeleteMonitorGroupInstancesRequest(this);
        } 

    } 

}
