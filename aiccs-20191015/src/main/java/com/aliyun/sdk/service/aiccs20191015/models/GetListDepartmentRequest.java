// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListDepartmentRequest} extends {@link RequestModel}
 *
 * <p>GetListDepartmentRequest</p>
 */
public class GetListDepartmentRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetListDepartmentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListDepartmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetListDepartmentRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetListDepartmentRequest response) {
            super(response);
            this.instanceId = response.instanceId;
        } 

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetListDepartmentRequest build() {
            return new GetListDepartmentRequest(this);
        } 

    } 

}
