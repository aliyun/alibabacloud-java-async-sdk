// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVSwitchRequest} extends {@link RequestModel}
 *
 * <p>DeleteVSwitchRequest</p>
 */
public class DeleteVSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private DeleteVSwitchRequest(Builder builder) {
        super(builder);
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DeleteVSwitchRequest, Builder> {
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVSwitchRequest request) {
            super(request);
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The ID of the vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5m9xhl****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DeleteVSwitchRequest build() {
            return new DeleteVSwitchRequest(this);
        } 

    } 

}
