// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountSpeechBroadcastHourRequest} extends {@link RequestModel}
 *
 * <p>CountSpeechBroadcastHourRequest</p>
 */
public class CountSpeechBroadcastHourRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("QueryDateTimeHour")
    @Validation(required = true)
    private String queryDateTimeHour;

    @Body
    @NameInMap("ShareTaskCode")
    @Validation(required = true)
    private String shareTaskCode;

    private CountSpeechBroadcastHourRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.queryDateTimeHour = builder.queryDateTimeHour;
        this.shareTaskCode = builder.shareTaskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountSpeechBroadcastHourRequest create() {
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
     * @return queryDateTimeHour
     */
    public String getQueryDateTimeHour() {
        return this.queryDateTimeHour;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static final class Builder extends Request.Builder<CountSpeechBroadcastHourRequest, Builder> {
        private String iotInstanceId; 
        private String queryDateTimeHour; 
        private String shareTaskCode; 

        private Builder() {
            super();
        } 

        private Builder(CountSpeechBroadcastHourRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.queryDateTimeHour = request.queryDateTimeHour;
            this.shareTaskCode = request.shareTaskCode;
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
         * QueryDateTimeHour.
         */
        public Builder queryDateTimeHour(String queryDateTimeHour) {
            this.putQueryParameter("QueryDateTimeHour", queryDateTimeHour);
            this.queryDateTimeHour = queryDateTimeHour;
            return this;
        }

        /**
         * ShareTaskCode.
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        @Override
        public CountSpeechBroadcastHourRequest build() {
            return new CountSpeechBroadcastHourRequest(this);
        } 

    } 

}
