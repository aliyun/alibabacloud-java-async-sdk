// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNumberLocationRequest} extends {@link RequestModel}
 *
 * <p>GetNumberLocationRequest</p>
 */
public class GetNumberLocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    private GetNumberLocationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNumberLocationRequest create() {
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

    public static final class Builder extends Request.Builder<GetNumberLocationRequest, Builder> {
        private String instanceId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(GetNumberLocationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.number = request.number;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1312121****</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public GetNumberLocationRequest build() {
            return new GetNumberLocationRequest(this);
        } 

    } 

}
