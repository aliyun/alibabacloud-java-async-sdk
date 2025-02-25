// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link UpdateFotaTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateFotaTaskRequest</p>
 */
public class UpdateFotaTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private UpdateFotaTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskUid = builder.taskUid;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFotaTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskUid
     */
    public String getTaskUid() {
        return this.taskUid;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<UpdateFotaTaskRequest, Builder> {
        private String regionId; 
        private String taskUid; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFotaTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskUid = request.taskUid;
            this.userStatus = request.userStatus;
        } 

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the image update task. You can call the <a href="https://help.aliyun.com/document_detail/437001.html">DescribeFotaTasks</a> operation to obtain the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aot-c4khwrp9ocml4****</p>
         */
        public Builder taskUid(String taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        /**
         * <p>Specifies whether to automatically push the image update task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Running: automatically pushes the image update task.</li>
         * <li>Pending: does not automatically push the image update task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public UpdateFotaTaskRequest build() {
            return new UpdateFotaTaskRequest(this);
        } 

    } 

}
