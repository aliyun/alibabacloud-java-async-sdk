// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateMOQuotaAlertThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMOQuotaAlertThresholdResponseBody</p>
 */
public class UpdateMOQuotaAlertThresholdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateMOQuotaAlertThresholdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMOQuotaAlertThresholdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateMOQuotaAlertThresholdResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateMOQuotaAlertThresholdResponseBody build() {
            return new UpdateMOQuotaAlertThresholdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMOQuotaAlertThresholdResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMOQuotaAlertThresholdResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apikey")
        private String apikey;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Integer thresholdPercent;

        private Results(Builder builder) {
            this.apikey = builder.apikey;
            this.instanceId = builder.instanceId;
            this.keyName = builder.keyName;
            this.keyType = builder.keyType;
            this.thresholdPercent = builder.thresholdPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return apikey
         */
        public String getApikey() {
            return this.apikey;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return thresholdPercent
         */
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        public static final class Builder {
            private String apikey; 
            private String instanceId; 
            private String keyName; 
            private String keyType; 
            private Integer thresholdPercent; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.apikey = model.apikey;
                this.instanceId = model.instanceId;
                this.keyName = model.keyName;
                this.keyType = model.keyType;
                this.thresholdPercent = model.thresholdPercent;
            } 

            /**
             * <p>API Key</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-*****</p>
             */
            public Builder apikey(String apikey) {
                this.apikey = apikey;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * ThresholdPercent.
             */
            public Builder thresholdPercent(Integer thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
