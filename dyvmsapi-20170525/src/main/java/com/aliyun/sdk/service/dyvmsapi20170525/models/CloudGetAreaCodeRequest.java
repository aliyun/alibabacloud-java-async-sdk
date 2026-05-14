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
 * {@link CloudGetAreaCodeRequest} extends {@link RequestModel}
 *
 * <p>CloudGetAreaCodeRequest</p>
 */
public class CloudGetAreaCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tel;

    private CloudGetAreaCodeRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.tel = builder.tel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetAreaCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    public static final class Builder extends Request.Builder<CloudGetAreaCodeRequest, Builder> {
        private Long enterpriseId; 
        private String tel; 

        private Builder() {
            super();
        } 

        private Builder(CloudGetAreaCodeRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.tel = request.tel;
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
         * <p>11位手机号；只能查询手机号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17750247753</p>
         */
        public Builder tel(String tel) {
            this.putQueryParameter("Tel", tel);
            this.tel = tel;
            return this;
        }

        @Override
        public CloudGetAreaCodeRequest build() {
            return new CloudGetAreaCodeRequest(this);
        } 

    } 

}
