// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetRtcTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetRtcTokenResponseBody</p>
 */
public class GetRtcTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRtcTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRtcTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRtcTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cleansession&quot;:true,&quot;clientId&quot;:&quot;GID_VOIP@@@ClientId_2000000001271771_100685295007&quot;,&quot;conferenceTopic&quot;:&quot;cs_alicom_voip_conference_pre&quot;,&quot;dataTopic&quot;:&quot;alicom_voip_data_pre&quot;,&quot;host&quot;:&quot;mqtt-cn-4590mdhb901.mqtt.aliyuncs.com&quot;,&quot;meetingEventKeepAliveInterval&quot;:0,&quot;phoneTopic&quot;:&quot;alicom_voip_phone&quot;,&quot;port&quot;:0,&quot;reconnectTimeout&quot;:2000,&quot;registerTime&quot;:0,&quot;sdkClientPort&quot;:8883,&quot;serverId&quot;:&quot;GID_VOIP@@@MTEuMjIuMTQ1Ljgy&quot;,&quot;sgwServerTopic&quot;:&quot;alicom_voip_server_pre&quot;,&quot;tlsport&quot;:443,&quot;tokenData&quot;:&quot;LzMT+XLFl5s/YWJ/MlDz4t/Lq5HC1iGU1P28HAMaxYzmBSHQsWXgdISJ1ZJ+2cxaU0jwYsoyG8Q8cCIbLZTwwaFHf7gc7pPXbJGYgJWUr5ooKsoHaVvvG34cww7W8woWE1OsmZGFDODvooOIjF1CZSorVrR8OwRdprW99yqhMhkJKh7r5f3HfiQgoJWL8b3A85RrRGCSP057skgQ5rIqVAlx7jDFrOTdLtz+krken8qYvpaVBO9wRfFyWQLvxAgNJNx3Oql/hpzc2o3+xbKGTA/P2siLn6Nee1FYk5ClpXcnvfSTM4BAauuWR+oES10VblKEKTU5R/pfjXj3UKOlZ1+OdGO93WA16BR/l1uRb3cOLqya5pjWM+oSmo0sOR7B0ATLz6K1xA0Pc+p6Mu8hZl+OdGO93WA1kj1L0h9Z6CAZG4ol/BNdIg9z6noy7yFmX450Y73dYDWSPUvSH1noIBkbiiX8E10iT0a6ypXxupQdyyrhh8j1yw6otqnw5AT5Tj5VsVWVfflXeZ8nPt1ydXC9nWeHX7K80O6vtOU9M8Qn5VrhkP0F1umbOoYs3NfM+WYZIQx4pkViQo6qqkxgbEg1l6oHJbmOVzrxYRrDTIxqgE/pb0YVJQ==&quot;,&quot;useTLS&quot;:false,&quot;username&quot;:&quot;LTAI27GqAW1VrcQA&quot;}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRtcTokenResponseBody build() {
            return new GetRtcTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRtcTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetRtcTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("RtcId")
        private String rtcId;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private Data(Builder builder) {
            this.accountName = builder.accountName;
            this.rtcId = builder.rtcId;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return rtcId
         */
        public String getRtcId() {
            return this.rtcId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String accountName; 
            private String rtcId; 
            private String token; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountName = model.accountName;
                this.rtcId = model.rtcId;
                this.token = model.token;
            } 

            /**
             * <p>Account name.</p>
             * 
             * <strong>example:</strong>
             * <p>139000000</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The identity of the endpoint that accesses through the Internet domain.</p>
             * 
             * <strong>example:</strong>
             * <p>200000000*******</p>
             */
            public Builder rtcId(String rtcId) {
                this.rtcId = rtcId;
                return this;
            }

            /**
             * <p>Token information.</p>
             * 
             * <strong>example:</strong>
             * <p>{“cleansession”:true,”clientId”:”GID_VOIP@@@ClientId_****”,”conferenceTopic”:”cs_alicom_voip_conference”,”host”:”mqtt-cn-4590mdhb901.mqtt.aliyuncs.com”,”meetingEventKeepAliveInterval”:0,”phoneTopic”:”alicom_voip_phone”,”port”:0,”reconnectTimeout”:2000,”registerTime”:0,”sdkClientPort”:8883,”serverId”:”GID_VOIP@@@MTEuMTMuMTM2LjExOA==”,”sgwServerTopic”:”alicom_voip_server_pre”,”tlsport”:443,”tokenData”:”abcdef”,”useTLS”:false}</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
