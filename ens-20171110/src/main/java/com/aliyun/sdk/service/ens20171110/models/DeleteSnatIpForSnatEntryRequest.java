// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSnatIpForSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnatIpForSnatEntryRequest</p>
 */
public class DeleteSnatIpForSnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatIp;

    private DeleteSnatIpForSnatEntryRequest(Builder builder) {
        super(builder);
        this.snatEntryId = builder.snatEntryId;
        this.snatIp = builder.snatIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnatIpForSnatEntryRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSnatIpForSnatEntryRequest, Builder> {
        private String snatEntryId; 
        private String snatIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnatIpForSnatEntryRequest request) {
            super(request);
            this.snatEntryId = request.snatEntryId;
            this.snatIp = request.snatIp;
        } 

        /**
         * <p>The ID of the SNAT entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tfi6f8gds82mjmlofeym****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * <p>The EIP that you want to delete from the SNAT entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120.72.56.71</p>
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        @Override
        public DeleteSnatIpForSnatEntryRequest build() {
            return new DeleteSnatIpForSnatEntryRequest(this);
        } 

    } 

}
