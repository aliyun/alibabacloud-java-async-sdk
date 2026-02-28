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
 * {@link CountSpeechBroadcastHourRequest} extends {@link RequestModel}
 *
 * <p>CountSpeechBroadcastHourRequest</p>
 */
public class CountSpeechBroadcastHourRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDateTimeHour")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryDateTimeHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-2w****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The end time of the hour in which you want to query the number of broadcasted speeches. Example: 2020090919, which indicates 19:00 on September 9, 2020.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020090919</p>
         */
        public Builder queryDateTimeHour(String queryDateTimeHour) {
            this.putQueryParameter("QueryDateTimeHour", queryDateTimeHour);
            this.queryDateTimeHour = queryDateTimeHour;
            return this;
        }

        /**
         * <p>The code that is used to share the speeches.</p>
         * <p>You can obtain the <strong>code</strong> on the <strong>Shared Corpus Management</strong> page of <strong>Speech Sending Voice Broadcasting Service</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ebed9280_ba25_48df_80c2_****</p>
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
