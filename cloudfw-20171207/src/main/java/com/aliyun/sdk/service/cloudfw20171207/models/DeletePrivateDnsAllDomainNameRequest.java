// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeletePrivateDnsAllDomainNameRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateDnsAllDomainNameRequest</p>
 */
public class DeletePrivateDnsAllDomainNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    private DeletePrivateDnsAllDomainNameRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivateDnsAllDomainNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DeletePrivateDnsAllDomainNameRequest, Builder> {
        private String accessInstanceId; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivateDnsAllDomainNameRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.regionNo = request.regionNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-12345</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DeletePrivateDnsAllDomainNameRequest build() {
            return new DeletePrivateDnsAllDomainNameRequest(this);
        } 

    } 

}
