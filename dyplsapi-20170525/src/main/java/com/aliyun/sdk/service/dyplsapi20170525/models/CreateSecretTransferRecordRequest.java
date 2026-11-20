// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link CreateSecretTransferRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretTransferRecordRequest</p>
 */
public class CreateSecretTransferRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastPartnerKey")
    private String lastPartnerKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginPartnerKey")
    private String originPartnerKey;

    private CreateSecretTransferRecordRequest(Builder builder) {
        super(builder);
        this.lastPartnerKey = builder.lastPartnerKey;
        this.numberList = builder.numberList;
        this.originPartnerKey = builder.originPartnerKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretTransferRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lastPartnerKey
     */
    public String getLastPartnerKey() {
        return this.lastPartnerKey;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return originPartnerKey
     */
    public String getOriginPartnerKey() {
        return this.originPartnerKey;
    }

    public static final class Builder extends Request.Builder<CreateSecretTransferRecordRequest, Builder> {
        private String lastPartnerKey; 
        private String numberList; 
        private String originPartnerKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretTransferRecordRequest request) {
            super(request);
            this.lastPartnerKey = request.lastPartnerKey;
            this.numberList = request.numberList;
            this.originPartnerKey = request.originPartnerKey;
        } 

        /**
         * <p>迁移后的新号码池key</p>
         * 
         * <strong>example:</strong>
         * <p>FC111111</p>
         */
        public Builder lastPartnerKey(String lastPartnerKey) {
            this.putQueryParameter("LastPartnerKey", lastPartnerKey);
            this.lastPartnerKey = lastPartnerKey;
            return this;
        }

        /**
         * <p>指定号码（单一、批量）迁移;一次最多可迁移500个号码，号码间请换行隔开.</p>
         * 
         * <strong>example:</strong>
         * <p>198xxxxxxxx
         * 138xxxxxxx</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * <p>要迁移的原号码池key</p>
         * 
         * <strong>example:</strong>
         * <p>FC123456</p>
         */
        public Builder originPartnerKey(String originPartnerKey) {
            this.putQueryParameter("OriginPartnerKey", originPartnerKey);
            this.originPartnerKey = originPartnerKey;
            return this;
        }

        @Override
        public CreateSecretTransferRecordRequest build() {
            return new CreateSecretTransferRecordRequest(this);
        } 

    } 

}
