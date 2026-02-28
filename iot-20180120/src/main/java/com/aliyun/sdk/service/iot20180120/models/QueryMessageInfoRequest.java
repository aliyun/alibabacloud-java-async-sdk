// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryMessageInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryMessageInfoRequest</p>
 */
public class QueryMessageInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniMsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniMsgId;

    private QueryMessageInfoRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.uniMsgId = builder.uniMsgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return uniMsgId
     */
    public String getUniMsgId() {
        return this.uniMsgId;
    }

    public static final class Builder extends Request.Builder<QueryMessageInfoRequest, Builder> {
        private String iotInstanceId; 
        private String uniMsgId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMessageInfoRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.uniMsgId = request.uniMsgId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>323455***</p>
         */
        public Builder uniMsgId(String uniMsgId) {
            this.putQueryParameter("UniMsgId", uniMsgId);
            this.uniMsgId = uniMsgId;
            return this;
        }

        @Override
        public QueryMessageInfoRequest build() {
            return new QueryMessageInfoRequest(this);
        } 

    } 

}
