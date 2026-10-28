// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link GetReadonlyModeResponseBody} extends {@link TeaModel}
 *
 * <p>GetReadonlyModeResponseBody</p>
 */
public class GetReadonlyModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetReadonlyModeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReadonlyModeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetReadonlyModeResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetReadonlyModeResponseBody build() {
            return new GetReadonlyModeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReadonlyModeResponseBody} extends {@link TeaModel}
     *
     * <p>GetReadonlyModeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("exists")
        private Boolean exists;

        @com.aliyun.core.annotation.NameInMap("gmtUpdate")
        private String gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("valueType")
        private String valueType;

        private Data(Builder builder) {
            this.configName = builder.configName;
            this.exists = builder.exists;
            this.gmtUpdate = builder.gmtUpdate;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return exists
         */
        public Boolean getExists() {
            return this.exists;
        }

        /**
         * @return gmtUpdate
         */
        public String getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String configName; 
            private Boolean exists; 
            private String gmtUpdate; 
            private String value; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configName = model.configName;
                this.exists = model.exists;
                this.gmtUpdate = model.gmtUpdate;
                this.value = model.value;
                this.valueType = model.valueType;
            } 

            /**
             * <p>The configuration name. The value is fixed to readonly.</p>
             * 
             * <strong>example:</strong>
             * <p>readonly</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>Indicates whether a configuration record exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * <p>The last update time in ISO 8601 format. The value is null if no configuration record exists.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder gmtUpdate(String gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * <p>The current effective read-only mode, returned as a string. A value of true indicates that the mode is enabled, and a value of false indicates that the mode is disabled. The value is true if not configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The configuration value type. The value is fixed to BOOL.</p>
             * 
             * <strong>example:</strong>
             * <p>BOOL</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
