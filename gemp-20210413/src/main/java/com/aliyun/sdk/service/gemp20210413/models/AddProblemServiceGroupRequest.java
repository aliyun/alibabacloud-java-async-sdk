// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProblemServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddProblemServiceGroupRequest</p>
 */
public class AddProblemServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupIds")
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

        private Builder(AddProblemServiceGroupRequest request) {
            super(request);
            this.problemId = request.problemId;
            this.serviceGroupIds = request.serviceGroupIds;
        } 

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * serviceGroupIds.
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
