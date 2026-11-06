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
 * {@link GetApiPathFieldConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiPathFieldConfigResponseBody</p>
 */
public class GetApiPathFieldConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetApiPathFieldConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPathFieldConfigResponseBody create() {
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

        private Builder(GetApiPathFieldConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiPathFieldConfigResponseBody build() {
            return new GetApiPathFieldConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiPathFieldConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPathFieldConfigResponseBody</p>
     */
    public static class PathConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldPaths")
        private java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> fieldPaths;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private PathConfigs(Builder builder) {
            this.fieldPaths = builder.fieldPaths;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfigs create() {
            return builder().build();
        }

        /**
         * @return fieldPaths
         */
        public java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> getFieldPaths() {
            return this.fieldPaths;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> fieldPaths; 
            private String path; 

            private Builder() {
            } 

            private Builder(PathConfigs model) {
                this.fieldPaths = model.fieldPaths;
                this.path = model.path;
            } 

            /**
             * <p>The collection of field configurations under the path, grouped by mapping key, where each group represents a set of field configuration items.</p>
             */
            public Builder fieldPaths(java.util.Map<String, java.util.List<DataPathConfigsFieldPathsValue>> fieldPaths) {
                this.fieldPaths = fieldPaths;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public PathConfigs build() {
                return new PathConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiPathFieldConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPathFieldConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("pathConfigs")
        private java.util.List<PathConfigs> pathConfigs;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.gatewayId = builder.gatewayId;
            this.pathConfigs = builder.pathConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return pathConfigs
         */
        public java.util.List<PathConfigs> getPathConfigs() {
            return this.pathConfigs;
        }

        public static final class Builder {
            private String apiId; 
            private String gatewayId; 
            private java.util.List<PathConfigs> pathConfigs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiId = model.apiId;
                this.gatewayId = model.gatewayId;
                this.pathConfigs = model.pathConfigs;
            } 

            /**
             * <p>The ID of the HTTP API.</p>
             * 
             * <strong>example:</strong>
             * <p>api-123456</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The ID of the cloud-native API gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-123456</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The list of field configurations grouped by API request path.</p>
             */
            public Builder pathConfigs(java.util.List<PathConfigs> pathConfigs) {
                this.pathConfigs = pathConfigs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
