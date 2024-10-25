// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartEpnInstanceRequest</p>
 */
public class StartEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    private StartEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartEpnInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<StartEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
        } 

        /**
         * <p>The ID of the EPN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-****</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        @Override
        public StartEpnInstanceRequest build() {
            return new StartEpnInstanceRequest(this);
        } 

    } 

}
