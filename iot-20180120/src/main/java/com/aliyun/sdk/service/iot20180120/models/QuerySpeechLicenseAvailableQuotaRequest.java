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
 * {@link QuerySpeechLicenseAvailableQuotaRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechLicenseAvailableQuotaRequest</p>
 */
public class QuerySpeechLicenseAvailableQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QuerySpeechLicenseAvailableQuotaRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechLicenseAvailableQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<QuerySpeechLicenseAvailableQuotaRequest, Builder> {
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechLicenseAvailableQuotaRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public QuerySpeechLicenseAvailableQuotaRequest build() {
            return new QuerySpeechLicenseAvailableQuotaRequest(this);
        } 

    } 

}
