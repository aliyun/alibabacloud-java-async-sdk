// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link SubmitImageRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageRequest</p>
 */
public class SubmitImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationRegionList")
    private java.util.List<String> destinationRegionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SubmitImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationRegionList = builder.destinationRegionList;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageRequest create() {
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
     * @return destinationRegionList
     */
    public java.util.List<String> getDestinationRegionList() {
        return this.destinationRegionList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SubmitImageRequest, Builder> {
        private String regionId; 
        private java.util.List<String> destinationRegionList; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationRegionList = request.destinationRegionList;
            this.taskId = request.taskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of destination regions to which the image is copied.</p>
         * 
         * <strong>example:</strong>
         * <p>List</p>
         */
        public Builder destinationRegionList(java.util.List<String> destinationRegionList) {
            this.putBodyParameter("DestinationRegionList", destinationRegionList);
            this.destinationRegionList = destinationRegionList;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-be7jzm29wrrz5****</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SubmitImageRequest build() {
            return new SubmitImageRequest(this);
        } 

    } 

}
