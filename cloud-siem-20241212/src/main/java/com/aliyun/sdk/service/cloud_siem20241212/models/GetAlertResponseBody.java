// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetAlertResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertResponseBody</p>
 */
public class GetAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alert")
    private Alert alert;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAlertResponseBody(Builder builder) {
        this.alert = builder.alert;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alert
     */
    public Alert getAlert() {
        return this.alert;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Alert alert; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAlertResponseBody model) {
            this.alert = model.alert;
            this.requestId = model.requestId;
        } 

        /**
         * Alert.
         */
        public Builder alert(Alert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlertResponseBody build() {
            return new GetAlertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertResponseBody</p>
     */
    public static class Alert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertRecord")
        private String alertRecord;

        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        private Alert(Builder builder) {
            this.alertRecord = builder.alertRecord;
            this.alertUuid = builder.alertUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alert create() {
            return builder().build();
        }

        /**
         * @return alertRecord
         */
        public String getAlertRecord() {
            return this.alertRecord;
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public static final class Builder {
            private String alertRecord; 
            private String alertUuid; 

            private Builder() {
            } 

            private Builder(Alert model) {
                this.alertRecord = model.alertRecord;
                this.alertUuid = model.alertUuid;
            } 

            /**
             * AlertRecord.
             */
            public Builder alertRecord(String alertRecord) {
                this.alertRecord = alertRecord;
                return this;
            }

            /**
             * AlertUuid.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            public Alert build() {
                return new Alert(this);
            } 

        } 

    }
}
