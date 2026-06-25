// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetInstanceJobRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceJobRequest</p>
 */
public class GetInstanceJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceJobId;

    private GetInstanceJobRequest(Builder builder) {
        super(builder);
        this.instanceJobId = builder.instanceJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceJobId
     */
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    public static final class Builder extends Request.Builder<GetInstanceJobRequest, Builder> {
        private String instanceJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceJobRequest request) {
            super(request);
            this.instanceJobId = request.instanceJobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder instanceJobId(String instanceJobId) {
            this.putPathParameter("InstanceJobId", instanceJobId);
            this.instanceJobId = instanceJobId;
            return this;
        }

        @Override
        public GetInstanceJobRequest build() {
            return new GetInstanceJobRequest(this);
        } 

    } 

}
