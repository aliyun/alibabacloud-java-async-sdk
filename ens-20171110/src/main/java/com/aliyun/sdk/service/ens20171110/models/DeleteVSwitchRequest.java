// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVSwitchRequest} extends {@link RequestModel}
 *
 * <p>DeleteVSwitchRequest</p>
 */
public class DeleteVSwitchRequest extends Request {
    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DeleteVSwitchRequest(Builder builder) {
        super(builder);
        this.vSwitchId = builder.vSwitchId;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DeleteVSwitchRequest, Builder> {
        private String vSwitchId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVSwitchRequest response) {
            super(response);
            this.vSwitchId = response.vSwitchId;
            this.version = response.version;
        } 

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DeleteVSwitchRequest build() {
            return new DeleteVSwitchRequest(this);
        } 

    } 

}
