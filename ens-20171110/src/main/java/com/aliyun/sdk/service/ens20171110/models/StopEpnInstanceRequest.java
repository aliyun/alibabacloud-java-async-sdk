// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link StopEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopEpnInstanceRequest</p>
 */
public class StopEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    private StopEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopEpnInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public static final class Builder extends Request.Builder<StopEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(StopEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
        } 

        /**
         * <p>The ID of the EPN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-20201014152822q2S9tQ</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        @Override
        public StopEpnInstanceRequest build() {
            return new StopEpnInstanceRequest(this);
        } 

    } 

}
