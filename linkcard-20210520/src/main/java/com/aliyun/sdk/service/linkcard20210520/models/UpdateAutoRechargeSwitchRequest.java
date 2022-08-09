// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoRechargeSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoRechargeSwitchRequest</p>
 */
public class UpdateAutoRechargeSwitchRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("Open")
    @Validation(required = true)
    private Boolean open;

    private UpdateAutoRechargeSwitchRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.open = builder.open;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoRechargeSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return open
     */
    public Boolean getOpen() {
        return this.open;
    }

    public static final class Builder extends Request.Builder<UpdateAutoRechargeSwitchRequest, Builder> {
        private String iccid; 
        private Boolean open; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoRechargeSwitchRequest request) {
            super(request);
            this.iccid = request.iccid;
            this.open = request.open;
        } 

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * Open.
         */
        public Builder open(Boolean open) {
            this.putQueryParameter("Open", open);
            this.open = open;
            return this;
        }

        @Override
        public UpdateAutoRechargeSwitchRequest build() {
            return new UpdateAutoRechargeSwitchRequest(this);
        } 

    } 

}
