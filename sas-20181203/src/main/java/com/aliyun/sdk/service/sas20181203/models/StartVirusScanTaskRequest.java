// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartVirusScanTaskRequest} extends {@link RequestModel}
 *
 * <p>StartVirusScanTaskRequest</p>
 */
public class StartVirusScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInfo;

    private StartVirusScanTaskRequest(Builder builder) {
        super(builder);
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVirusScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<StartVirusScanTaskRequest, Builder> {
        private String targetInfo; 

        private Builder() {
            super();
        } 

        private Builder(StartVirusScanTaskRequest request) {
            super(request);
            this.targetInfo = request.targetInfo;
        } 

        /**
         * The asset on which you want to perform a virus scan task. You can select servers or server groups to scan for viruses. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
         * <p>
         * 
         * *   **type**: the type of the asset on which you want to perform a virus scan task. Valid values:
         * 
         *     *   **groupId**: server group.
         *     *   **uuid**: server.
         * 
         * *   **name**: the name of the server or server group.
         * 
         * *   **target**: the asset on which you want to perform a virus scan task. Valid values:
         * 
         *     *   If you set **type** to **groupId**, you must set this field to the ID of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
         *     *   If you set **type** to **uuid**, you must set this field to the UUID of the server. You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        @Override
        public StartVirusScanTaskRequest build() {
            return new StartVirusScanTaskRequest(this);
        } 

    } 

}
