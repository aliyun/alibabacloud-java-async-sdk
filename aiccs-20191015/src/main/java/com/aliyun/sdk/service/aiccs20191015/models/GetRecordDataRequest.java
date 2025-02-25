// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetRecordDataRequest} extends {@link RequestModel}
 *
 * <p>GetRecordDataRequest</p>
 */
public class GetRecordDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Acid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetRecordDataRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetRecordDataRequest, Builder> {
        private String acid; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRecordDataRequest request) {
            super(request);
            this.acid = request.acid;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001067****</p>
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetRecordDataRequest build() {
            return new GetRecordDataRequest(this);
        } 

    } 

}
