// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProblemServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddProblemServiceGroupRequest</p>
 */
public class AddProblemServiceGroupRequest extends Request {
    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("serviceGroupIds")
    private java.util.List < Long > serviceGroupIds;

    private AddProblemServiceGroupRequest(Builder builder) {
        super(builder);
        this.problemId = builder.problemId;
        this.serviceGroupIds = builder.serviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProblemServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return serviceGroupIds
     */
    public java.util.List < Long > getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public static final class Builder extends Request.Builder<AddProblemServiceGroupRequest, Builder> {
        private Long problemId; 
        private java.util.List < Long > serviceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(AddProblemServiceGroupRequest response) {
            super(response);
            this.problemId = response.problemId;
            this.serviceGroupIds = response.serviceGroupIds;
        } 

        /**
         * 故障ID
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * 应急协同组
         */
        public Builder serviceGroupIds(java.util.List < Long > serviceGroupIds) {
            this.putBodyParameter("serviceGroupIds", serviceGroupIds);
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        @Override
        public AddProblemServiceGroupRequest build() {
            return new AddProblemServiceGroupRequest(this);
        } 

    } 

}
