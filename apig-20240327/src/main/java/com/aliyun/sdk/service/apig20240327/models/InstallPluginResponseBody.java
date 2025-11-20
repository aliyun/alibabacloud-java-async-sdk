// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link InstallPluginResponseBody} extends {@link TeaModel}
 *
 * <p>InstallPluginResponseBody</p>
 */
public class InstallPluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private InstallPluginResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallPluginResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InstallPluginResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response payload.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>201CFCA0-3AF5-52D0-A0F3-FBA697AF55CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallPluginResponseBody build() {
            return new InstallPluginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstallPluginResponseBody} extends {@link TeaModel}
     *
     * <p>InstallPluginResponseBody</p>
     */
    public static class InstallPluginResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        private InstallPluginResults(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.pluginId = builder.pluginId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallPluginResults create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        public static final class Builder {
            private String gatewayId; 
            private String pluginId; 

            private Builder() {
            } 

            private Builder(InstallPluginResults model) {
                this.gatewayId = model.gatewayId;
                this.pluginId = model.pluginId;
            } 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-d28mjcmm1hkub84mdbi0</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The plug-in ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-cvs7gbum1hkhs6us6vbg</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            public InstallPluginResults build() {
                return new InstallPluginResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallPluginResponseBody} extends {@link TeaModel}
     *
     * <p>InstallPluginResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("installPluginResults")
        private java.util.List<InstallPluginResults> installPluginResults;

        private Data(Builder builder) {
            this.installPluginResults = builder.installPluginResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return installPluginResults
         */
        public java.util.List<InstallPluginResults> getInstallPluginResults() {
            return this.installPluginResults;
        }

        public static final class Builder {
            private java.util.List<InstallPluginResults> installPluginResults; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.installPluginResults = model.installPluginResults;
            } 

            /**
             * <p>The installation result.</p>
             */
            public Builder installPluginResults(java.util.List<InstallPluginResults> installPluginResults) {
                this.installPluginResults = installPluginResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
