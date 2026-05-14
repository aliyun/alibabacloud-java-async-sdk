// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListExtenRequest} extends {@link RequestModel}
 *
 * <p>CloudListExtenRequest</p>
 */
public class CloudListExtenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaCode")
    private String areaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPower")
    private String callPower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exten")
    private String exten;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbRecord")
    private Long ibRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBind")
    private Long isBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOb")
    private String isOb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JitterBuffer")
    private Long jitterBuffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObRecord")
    private Long obRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Long type;

    private CloudListExtenRequest(Builder builder) {
        super(builder);
        this.areaCode = builder.areaCode;
        this.callPower = builder.callPower;
        this.enterpriseId = builder.enterpriseId;
        this.exten = builder.exten;
        this.ibRecord = builder.ibRecord;
        this.isBind = builder.isBind;
        this.isOb = builder.isOb;
        this.jitterBuffer = builder.jitterBuffer;
        this.limit = builder.limit;
        this.obRecord = builder.obRecord;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListExtenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @return callPower
     */
    public String getCallPower() {
        return this.callPower;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return exten
     */
    public String getExten() {
        return this.exten;
    }

    /**
     * @return ibRecord
     */
    public Long getIbRecord() {
        return this.ibRecord;
    }

    /**
     * @return isBind
     */
    public Long getIsBind() {
        return this.isBind;
    }

    /**
     * @return isOb
     */
    public String getIsOb() {
        return this.isOb;
    }

    /**
     * @return jitterBuffer
     */
    public Long getJitterBuffer() {
        return this.jitterBuffer;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return obRecord
     */
    public Long getObRecord() {
        return this.obRecord;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CloudListExtenRequest, Builder> {
        private String areaCode; 
        private String callPower; 
        private Long enterpriseId; 
        private String exten; 
        private Long ibRecord; 
        private Long isBind; 
        private String isOb; 
        private Long jitterBuffer; 
        private Long limit; 
        private Long obRecord; 
        private Long offset; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(CloudListExtenRequest request) {
            super(request);
            this.areaCode = request.areaCode;
            this.callPower = request.callPower;
            this.enterpriseId = request.enterpriseId;
            this.exten = request.exten;
            this.ibRecord = request.ibRecord;
            this.isBind = request.isBind;
            this.isOb = request.isOb;
            this.jitterBuffer = request.jitterBuffer;
            this.limit = request.limit;
            this.obRecord = request.obRecord;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
        } 

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        public Builder areaCode(String areaCode) {
            this.putQueryParameter("AreaCode", areaCode);
            this.areaCode = areaCode;
            return this;
        }

        /**
         * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callPower(String callPower) {
            this.putQueryParameter("CallPower", callPower);
            this.callPower = callPower;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>分机号</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        public Builder exten(String exten) {
            this.putQueryParameter("Exten", exten);
            this.exten = exten;
            return this;
        }

        /**
         * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ibRecord(Long ibRecord) {
            this.putQueryParameter("IbRecord", ibRecord);
            this.ibRecord = ibRecord;
            return this;
        }

        /**
         * <p>是否被座席绑定，1 绑定 0未绑定</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isBind(Long isBind) {
            this.putQueryParameter("IsBind", isBind);
            this.isBind = isBind;
            return this;
        }

        /**
         * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isOb(String isOb) {
            this.putQueryParameter("IsOb", isOb);
            this.isOb = isOb;
            return this;
        }

        /**
         * <p>网络防抖</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jitterBuffer(Long jitterBuffer) {
            this.putQueryParameter("JitterBuffer", jitterBuffer);
            this.jitterBuffer = jitterBuffer;
            return this;
        }

        /**
         * <p>条数；正整数 大于0 小于等于500 默认为10条</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder obRecord(Long obRecord) {
            this.putQueryParameter("ObRecord", obRecord);
            this.obRecord = obRecord;
            return this;
        }

        /**
         * <p>从第几条开始；正整数 默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CloudListExtenRequest build() {
            return new CloudListExtenRequest(this);
        } 

    } 

}
