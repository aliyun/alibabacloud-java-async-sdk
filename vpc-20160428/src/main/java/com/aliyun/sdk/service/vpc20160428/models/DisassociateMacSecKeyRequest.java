// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DisassociateMacSecKeyRequest} extends {@link RequestModel}
 *
 * <p>DisassociateMacSecKeyRequest</p>
 */
public class DisassociateMacSecKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ckn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ckn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String physicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DisassociateMacSecKeyRequest(Builder builder) {
        super(builder);
        this.ckn = builder.ckn;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateMacSecKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ckn
     */
    public String getCkn() {
        return this.ckn;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisassociateMacSecKeyRequest, Builder> {
        private String ckn; 
        private String physicalConnectionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateMacSecKeyRequest request) {
            super(request);
            this.ckn = request.ckn;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The key name. Only hexadecimal characters are supported. Lowercase characters are automatically converted to uppercase. When the encryption algorithm is GCM-AES-128 or GCM-AES-XPN-128, the length must be 32 hexadecimal characters. When the encryption algorithm is GCM-AES-256 or GCM-AES-XPN-256, the length must be 64 hexadecimal characters. This value must be a key name that has been associated with the target Express Connect circuit by calling AssociateMacSecKey.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789ABCDEF0123456789ABCDEF</p>
         */
        public Builder ckn(String ckn) {
            this.putQueryParameter("Ckn", ckn);
            this.ckn = ckn;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit. The Express Connect circuit must be in the <strong>Enabled</strong> state and its <strong>BusinessStatus</strong> must be <strong>Normal</strong>. You can call DescribePhysicalConnections to query the circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1hp0wr072f6****</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/448570.html">DescribeRegions</a> operation to query region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisassociateMacSecKeyRequest build() {
            return new DisassociateMacSecKeyRequest(this);
        } 

    } 

}
