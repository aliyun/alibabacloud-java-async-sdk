// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionFor2CBrowserRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransactionFor2CBrowserRequest</p>
 */
public class DescribeTransactionFor2CBrowserRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AlipayAuthCode")
    @Validation(required = true)
    private String alipayAuthCode;

    @Body
    @NameInMap("Bizid")
    @Validation(required = true)
    private String bizid;

    @Body
    @NameInMap("Hash")
    @Validation(required = true)
    private String hash;

    private DescribeTransactionFor2CBrowserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alipayAuthCode = builder.alipayAuthCode;
        this.bizid = builder.bizid;
        this.hash = builder.hash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransactionFor2CBrowserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alipayAuthCode
     */
    public String getAlipayAuthCode() {
        return this.alipayAuthCode;
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    public static final class Builder extends Request.Builder<DescribeTransactionFor2CBrowserRequest, Builder> {
        private String regionId; 
        private String alipayAuthCode; 
        private String bizid; 
        private String hash; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransactionFor2CBrowserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alipayAuthCode = request.alipayAuthCode;
            this.bizid = request.bizid;
            this.hash = request.hash;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AlipayAuthCode.
         */
        public Builder alipayAuthCode(String alipayAuthCode) {
            this.putBodyParameter("AlipayAuthCode", alipayAuthCode);
            this.alipayAuthCode = alipayAuthCode;
            return this;
        }

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Hash.
         */
        public Builder hash(String hash) {
            this.putBodyParameter("Hash", hash);
            this.hash = hash;
            return this;
        }

        @Override
        public DescribeTransactionFor2CBrowserRequest build() {
            return new DescribeTransactionFor2CBrowserRequest(this);
        } 

    } 

}
