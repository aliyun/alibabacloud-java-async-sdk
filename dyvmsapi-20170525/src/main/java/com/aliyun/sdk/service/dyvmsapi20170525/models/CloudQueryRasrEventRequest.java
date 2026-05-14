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
 * {@link CloudQueryRasrEventRequest} extends {@link RequestModel}
 *
 * <p>CloudQueryRasrEventRequest</p>
 */
public class CloudQueryRasrEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniqueId;

    private CloudQueryRasrEventRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryRasrEventRequest create() {
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
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<CloudQueryRasrEventRequest, Builder> {
        private Long enterpriseId; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(CloudQueryRasrEventRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.uniqueId = request.uniqueId;
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
         * <p>通话唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public CloudQueryRasrEventRequest build() {
            return new CloudQueryRasrEventRequest(this);
        } 

    } 

}
