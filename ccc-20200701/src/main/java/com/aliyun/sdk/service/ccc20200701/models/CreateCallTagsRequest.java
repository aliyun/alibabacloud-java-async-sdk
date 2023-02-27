// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCallTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateCallTagsRequest</p>
 */
public class CreateCallTagsRequest extends Request {
    @Query
    @NameInMap("CallTagNameList")
    @Validation(required = true)
    private String callTagNameList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CreateCallTagsRequest(Builder builder) {
        super(builder);
        this.callTagNameList = builder.callTagNameList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTagNameList
     */
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCallTagsRequest, Builder> {
        private String callTagNameList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallTagsRequest request) {
            super(request);
            this.callTagNameList = request.callTagNameList;
            this.instanceId = request.instanceId;
        } 

        /**
         * CallTagNameList.
         */
        public Builder callTagNameList(String callTagNameList) {
            this.putQueryParameter("CallTagNameList", callTagNameList);
            this.callTagNameList = callTagNameList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateCallTagsRequest build() {
            return new CreateCallTagsRequest(this);
        } 

    } 

}
