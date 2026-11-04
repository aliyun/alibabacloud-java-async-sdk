// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetNumberRegionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetNumberRegionInfoRequest</p>
 */
public class GetNumberRegionInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    private GetNumberRegionInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNumberRegionInfoRequest create() {
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

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<GetNumberRegionInfoRequest, Builder> {
        private String instanceId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(GetNumberRegionInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.number = request.number;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public GetNumberRegionInfoRequest build() {
            return new GetNumberRegionInfoRequest(this);
        } 

    } 

}
