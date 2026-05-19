// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddFileProtectBindMachineRequest} extends {@link RequestModel}
 *
 * <p>AddFileProtectBindMachineRequest</p>
 */
public class AddFileProtectBindMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertUuids")
    private java.util.List<String> alertUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockUuids")
    private java.util.List<String> blockUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoneUuids")
    private java.util.List<String> noneUuids;

    private AddFileProtectBindMachineRequest(Builder builder) {
        super(builder);
        this.alertUuids = builder.alertUuids;
        this.blockUuids = builder.blockUuids;
        this.noneUuids = builder.noneUuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileProtectBindMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertUuids
     */
    public java.util.List<String> getAlertUuids() {
        return this.alertUuids;
    }

    /**
     * @return blockUuids
     */
    public java.util.List<String> getBlockUuids() {
        return this.blockUuids;
    }

    /**
     * @return noneUuids
     */
    public java.util.List<String> getNoneUuids() {
        return this.noneUuids;
    }

    public static final class Builder extends Request.Builder<AddFileProtectBindMachineRequest, Builder> {
        private java.util.List<String> alertUuids; 
        private java.util.List<String> blockUuids; 
        private java.util.List<String> noneUuids; 

        private Builder() {
            super();
        } 

        private Builder(AddFileProtectBindMachineRequest request) {
            super(request);
            this.alertUuids = request.alertUuids;
            this.blockUuids = request.blockUuids;
            this.noneUuids = request.noneUuids;
        } 

        /**
         * AlertUuids.
         */
        public Builder alertUuids(java.util.List<String> alertUuids) {
            this.putQueryParameter("AlertUuids", alertUuids);
            this.alertUuids = alertUuids;
            return this;
        }

        /**
         * BlockUuids.
         */
        public Builder blockUuids(java.util.List<String> blockUuids) {
            this.putQueryParameter("BlockUuids", blockUuids);
            this.blockUuids = blockUuids;
            return this;
        }

        /**
         * NoneUuids.
         */
        public Builder noneUuids(java.util.List<String> noneUuids) {
            this.putQueryParameter("NoneUuids", noneUuids);
            this.noneUuids = noneUuids;
            return this;
        }

        @Override
        public AddFileProtectBindMachineRequest build() {
            return new AddFileProtectBindMachineRequest(this);
        } 

    } 

}
