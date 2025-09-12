// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link RemoveDataSet2Request} extends {@link RequestModel}
 *
 * <p>RemoveDataSet2Request</p>
 */
public class RemoveDataSet2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSetId")
    private Long dataSetId;

    private RemoveDataSet2Request(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.dataSetId = builder.dataSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDataSet2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return dataSetId
     */
    public Long getDataSetId() {
        return this.dataSetId;
    }

    public static final class Builder extends Request.Builder<RemoveDataSet2Request, Builder> {
        private Long clientId; 
        private Long dataSetId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDataSet2Request request) {
            super(request);
            this.clientId = request.clientId;
            this.dataSetId = request.dataSetId;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * dataSetId.
         */
        public Builder dataSetId(Long dataSetId) {
            this.putBodyParameter("dataSetId", dataSetId);
            this.dataSetId = dataSetId;
            return this;
        }

        @Override
        public RemoveDataSet2Request build() {
            return new RemoveDataSet2Request(this);
        } 

    } 

}
