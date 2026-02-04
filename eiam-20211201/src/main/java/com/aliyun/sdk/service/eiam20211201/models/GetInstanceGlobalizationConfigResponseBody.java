// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceGlobalizationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceGlobalizationConfigResponseBody</p>
 */
public class GetInstanceGlobalizationConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalizationConfig")
    private GlobalizationConfig globalizationConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceGlobalizationConfigResponseBody(Builder builder) {
        this.globalizationConfig = builder.globalizationConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceGlobalizationConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalizationConfig
     */
    public GlobalizationConfig getGlobalizationConfig() {
        return this.globalizationConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GlobalizationConfig globalizationConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceGlobalizationConfigResponseBody model) {
            this.globalizationConfig = model.globalizationConfig;
            this.requestId = model.requestId;
        } 

        /**
         * GlobalizationConfig.
         */
        public Builder globalizationConfig(GlobalizationConfig globalizationConfig) {
            this.globalizationConfig = globalizationConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceGlobalizationConfigResponseBody build() {
            return new GetInstanceGlobalizationConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceGlobalizationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceGlobalizationConfigResponseBody</p>
     */
    public static class GlobalizationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private GlobalizationConfig(Builder builder) {
            this.language = builder.language;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalizationConfig create() {
            return builder().build();
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String language; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(GlobalizationConfig model) {
                this.language = model.language;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>语言</p>
             * 
             * <strong>example:</strong>
             * <p>zh-Hans-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>时区</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public GlobalizationConfig build() {
                return new GlobalizationConfig(this);
            } 

        } 

    }
}
