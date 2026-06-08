// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetProcessInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetProcessInstanceRequest</p>
 */
public class GetProcessInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processInstanceId;

    private GetProcessInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.processInstanceId = builder.processInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProcessInstanceRequest create() {
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
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public static final class Builder extends Request.Builder<GetProcessInstanceRequest, Builder> {
        private String regionId; 
        private String processInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetProcessInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.processInstanceId = request.processInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putQueryParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        @Override
        public GetProcessInstanceRequest build() {
            return new GetProcessInstanceRequest(this);
        } 

    } 

}
