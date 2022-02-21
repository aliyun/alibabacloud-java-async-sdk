// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteEpnInstanceRequest</p>
 */
public class DeleteEpnInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    private String EPNInstanceId;

    private DeleteEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEpnInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEpnInstanceRequest response) {
            super(response);
            this.EPNInstanceId = response.EPNInstanceId;
        } 

        /**
         * EPNInstanceId.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        @Override
        public DeleteEpnInstanceRequest build() {
            return new DeleteEpnInstanceRequest(this);
        } 

    } 

}
