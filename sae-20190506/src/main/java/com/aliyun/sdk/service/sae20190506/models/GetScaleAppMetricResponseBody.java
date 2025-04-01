// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link GetScaleAppMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetScaleAppMetricResponseBody</p>
 */
public class GetScaleAppMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetScaleAppMetricResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScaleAppMetricResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetScaleAppMetricResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code. The following limits are imposed on the ID:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of applications.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned. The following limits are imposed on the ID:</p>
         * <ul>
         * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
         * <li>An error code: If the call fails, an error code is returned.</li>
         * </ul>
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
         * <p>3B763F98-0BA2-5C23-B6B8-558568D2C1C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the microservice list was obtained. The following limits are imposed on the ID:</p>
         * <ul>
         * <li><strong>true</strong>: The namespaces were obtained.</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScaleAppMetricResponseBody build() {
            return new GetScaleAppMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScaleAppMetricResponseBody} extends {@link TeaModel}
     *
     * <p>GetScaleAppMetricResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Long maxReplicas;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Runnings")
        private Long runnings;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.maxReplicas = builder.maxReplicas;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.runnings = builder.runnings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return maxReplicas
         */
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runnings
         */
        public Long getRunnings() {
            return this.runnings;
        }

        public static final class Builder {
            private String appId; 
            private Long maxReplicas; 
            private String name; 
            private String regionId; 
            private Long runnings; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.maxReplicas = model.maxReplicas;
                this.name = model.name;
                this.regionId = model.regionId;
                this.runnings = model.runnings;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The maximum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReplicas(Long maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The current number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder runnings(Long runnings) {
                this.runnings = runnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
