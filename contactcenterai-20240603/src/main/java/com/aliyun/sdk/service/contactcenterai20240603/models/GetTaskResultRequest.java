// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link GetTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetTaskResultRequest</p>
 */
public class GetTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requiredFieldList")
    private java.util.List<String> requiredFieldList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetTaskResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.requiredFieldList = builder.requiredFieldList;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResultRequest create() {
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
     * @return requiredFieldList
     */
    public java.util.List<String> getRequiredFieldList() {
        return this.requiredFieldList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetTaskResultRequest, Builder> {
        private String regionId; 
        private java.util.List<String> requiredFieldList; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.requiredFieldList = request.requiredFieldList;
            this.taskId = request.taskId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * requiredFieldList.
         */
        public Builder requiredFieldList(java.util.List<String> requiredFieldList) {
            String requiredFieldListShrink = shrink(requiredFieldList, "requiredFieldList", "simple");
            this.putQueryParameter("requiredFieldList", requiredFieldListShrink);
            this.requiredFieldList = requiredFieldList;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetTaskResultRequest build() {
            return new GetTaskResultRequest(this);
        } 

    } 

}
