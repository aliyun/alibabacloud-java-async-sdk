// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdbSecureRequest} extends {@link RequestModel}
 *
 * <p>GetAdbSecureRequest</p>
 */
public class GetAdbSecureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private GetAdbSecureRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdbSecureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<GetAdbSecureRequest, Builder> {
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAdbSecureRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public GetAdbSecureRequest build() {
            return new GetAdbSecureRequest(this);
        } 

    } 

}
