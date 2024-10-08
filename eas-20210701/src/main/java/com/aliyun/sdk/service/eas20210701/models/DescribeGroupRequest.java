// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupRequest</p>
 */
public class DescribeGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private DescribeGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<DescribeGroupRequest, Builder> {
        private String clusterId; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The ID of the region to which the service group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the service group. For more information about how to query the group name, see <a href="~~412109~~">ListServices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder groupName(String groupName) {
            this.putPathParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public DescribeGroupRequest build() {
            return new DescribeGroupRequest(this);
        } 

    } 

}
