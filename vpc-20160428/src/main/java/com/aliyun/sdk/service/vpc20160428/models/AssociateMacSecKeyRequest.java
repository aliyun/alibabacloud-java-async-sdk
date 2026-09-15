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
 * {@link AssociateMacSecKeyRequest} extends {@link RequestModel}
 *
 * <p>AssociateMacSecKeyRequest</p>
 */
public class AssociateMacSecKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cak")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CipherSuite")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cipherSuite;

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

    private AssociateMacSecKeyRequest(Builder builder) {
        super(builder);
        this.cak = builder.cak;
        this.cipherSuite = builder.cipherSuite;
        this.ckn = builder.ckn;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateMacSecKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cak
     */
    public String getCak() {
        return this.cak;
    }

    /**
     * @return cipherSuite
     */
    public String getCipherSuite() {
        return this.cipherSuite;
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

    public static final class Builder extends Request.Builder<AssociateMacSecKeyRequest, Builder> {
        private String cak; 
        private String cipherSuite; 
        private String ckn; 
        private String physicalConnectionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateMacSecKeyRequest request) {
            super(request);
            this.cak = request.cak;
            this.cipherSuite = request.cipherSuite;
            this.ckn = request.ckn;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The passphrase. Only hexadecimal characters are supported. Lowercase characters are automatically transformed to uppercase. When the encryption algorithm type is GCM-AES-128 or GCM-AES-XPN-128, the length must be 32 hexadecimal characters. When the encryption algorithm type is GCM-AES-256 or GCM-AES-XPN-256, the length must be 64 hexadecimal characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789ABCDEF0123456789ABCDEF</p>
         */
        public Builder cak(String cak) {
            this.putQueryParameter("Cak", cak);
            this.cak = cak;
            return this;
        }

        /**
         * <p>The encryption algorithm type. Valid values:</p>
         * <ul>
         * <li><p>GCM-AES-128</p>
         * </li>
         * <li><p>GCM-AES-XPN-128</p>
         * </li>
         * <li><p>GCM-AES-256</p>
         * </li>
         * <li><p>GCM-AES-XPN-256</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GCM-AES-128</p>
         */
        public Builder cipherSuite(String cipherSuite) {
            this.putQueryParameter("CipherSuite", cipherSuite);
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * <p>The key name. Only hexadecimal characters are supported. Lowercase characters are automatically transformed to uppercase. When the encryption algorithm type is GCM-AES-128 or GCM-AES-XPN-128, the length must be 32 hexadecimal characters. When the encryption algorithm type is GCM-AES-256 or GCM-AES-XPN-256, the length must be 64 hexadecimal characters.</p>
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
         * <p>The ID of the Express Connect circuit. The Express Connect circuit must be a dedicated circuit that has completed payment, supports MACsec, and is in the <strong>Enabled</strong> state. You can call DescribePhysicalConnections to query the current status and device capabilities.</p>
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
        public AssociateMacSecKeyRequest build() {
            return new AssociateMacSecKeyRequest(this);
        } 

    } 

}
