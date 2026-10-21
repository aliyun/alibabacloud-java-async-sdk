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
         * <p>If this value is true, the minor engine version is not the latest version.</p>
         * <blockquote>
         * <p>If the minor engine version of your server is not the latest version, the sampling logs may be inaccurate, which causes imprecise IP statistics. We recommend that you upgrade the minor engine version at your earliest convenience.</p>
         * </blockquote>
         */
        public Builder alert(Alert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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
             * <p>The alert content.</p>
             * 
             * <strong>example:</strong>
             * <p>{***}</p>
             */
            public Builder alertRecord(String alertRecord) {
                this.alertRecord = alertRecord;
                return this;
            }

            /**
             * <p>The alert UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_1175554881779200_e59368b3ce1690eae7978f7712a69050</p>
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
