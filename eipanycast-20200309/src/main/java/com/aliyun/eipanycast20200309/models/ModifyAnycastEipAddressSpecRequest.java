// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyAnycastEipAddressSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnycastEipAddressSpecRequest</p>
 */
public class ModifyAnycastEipAddressSpecRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    private String anycastId;

    @Query
    @NameInMap("Bandwidth")
    private String bandwidth;


    private ModifyAnycastEipAddressSpecRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.bandwidth = builder.bandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnycastEipAddressSpecRequest create() {
        return builder().build();
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String anycastId; 
        private String bandwidth; 

        /**
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>Bandwidth.</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        public ModifyAnycastEipAddressSpecRequest build() {
            return new ModifyAnycastEipAddressSpecRequest(this);
        } 

    } 

}
