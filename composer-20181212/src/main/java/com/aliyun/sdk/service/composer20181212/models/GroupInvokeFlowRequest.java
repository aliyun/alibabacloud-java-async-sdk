// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupInvokeFlowRequest} extends {@link RequestModel}
 *
 * <p>GroupInvokeFlowRequest</p>
 */
public class GroupInvokeFlowRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Body
    @NameInMap("GroupKey")
    @Validation(required = true)
    private String groupKey;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Body
    @NameInMap("TotalCount")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer totalCount;

    private GroupInvokeFlowRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.data = builder.data;
        this.flowId = builder.flowId;
        this.groupKey = builder.groupKey;
        this.tags = builder.tags;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupInvokeFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return groupKey
     */
    public String getGroupKey() {
        return this.groupKey;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<GroupInvokeFlowRequest, Builder> {
        private String clientToken; 
        private String data; 
        private String flowId; 
        private String groupKey; 
        private String tags; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(GroupInvokeFlowRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.data = request.data;
            this.flowId = request.flowId;
            this.groupKey = request.groupKey;
            this.tags = request.tags;
            this.totalCount = request.totalCount;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The information required by the group execution. Set this parameter to a JSON array of strings in the following format:`{"Items": []}`. Each string provides the information required by one time of execution. The string must use the format of the Data parameter in the InvokeFlow operation.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The ID of the workflow that you want to execute.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The name of the group. The name must be unique among the groups.
         */
        public Builder groupKey(String groupKey) {
            this.putBodyParameter("GroupKey", groupKey);
            this.groupKey = groupKey;
            return this;
        }

        /**
         * The tag that is attached to each time of execution. The value is a JSON array. The number of tags in the array is the same as the value of the TotalCount parameter.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The number of times of execution. The value must be the same as the number of strings in the value of the Data parameter.
         */
        public Builder totalCount(Integer totalCount) {
            this.putBodyParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public GroupInvokeFlowRequest build() {
            return new GroupInvokeFlowRequest(this);
        } 

    } 

}
