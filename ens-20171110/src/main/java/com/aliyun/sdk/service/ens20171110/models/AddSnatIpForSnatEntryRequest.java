// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSnatIpForSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>AddSnatIpForSnatEntryRequest</p>
 */
public class AddSnatIpForSnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatIp;

    private AddSnatIpForSnatEntryRequest(Builder builder) {
        super(builder);
        this.snatEntryId = builder.snatEntryId;
        this.snatIp = builder.snatIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSnatIpForSnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    public static final class Builder extends Request.Builder<AddSnatIpForSnatEntryRequest, Builder> {
        private String snatEntryId; 
        private String snatIp; 

        private Builder() {
            super();
        } 

        private Builder(AddSnatIpForSnatEntryRequest request) {
            super(request);
            this.snatEntryId = request.snatEntryId;
            this.snatIp = request.snatIp;
        } 

        /**
         * The ID of the SNAT entry.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The EIP specified in the SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        @Override
        public AddSnatIpForSnatEntryRequest build() {
            return new AddSnatIpForSnatEntryRequest(this);
        } 

    } 

}
