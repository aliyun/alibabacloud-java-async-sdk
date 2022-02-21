// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechRequest</p>
 */
public class QuerySpeechRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("SpeechCode")
    @Validation(required = true)
    private String speechCode;

    private QuerySpeechRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.speechCode = builder.speechCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechRequest create() {
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
     * @return speechCode
     */
    public String getSpeechCode() {
        return this.speechCode;
    }

    public static final class Builder extends Request.Builder<QuerySpeechRequest, Builder> {
        private String iotInstanceId; 
        private String speechCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.speechCode = response.speechCode;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * SpeechCode.
         */
        public Builder speechCode(String speechCode) {
            this.putBodyParameter("SpeechCode", speechCode);
            this.speechCode = speechCode;
            return this;
        }

        @Override
        public QuerySpeechRequest build() {
            return new QuerySpeechRequest(this);
        } 

    } 

}
