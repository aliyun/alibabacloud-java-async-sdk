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
 * {@link GetArmsTopNMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetArmsTopNMetricResponseBody</p>
 */
public class GetArmsTopNMetricResponseBody extends TeaModel {
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

    private GetArmsTopNMetricResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArmsTopNMetricResponseBody create() {
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

        private Builder(GetArmsTopNMetricResponseBody model) {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>3B763F98-0BA2-5C23-B6B8-558568D2C1C2</p>
         * 
         * <strong>example:</strong>
         * <p>3B763F98-0BA2-5C23-B6B8-558568D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the list of applications was obtained. The following limits are imposed on the ID:</p>
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

        public GetArmsTopNMetricResponseBody build() {
            return new GetArmsTopNMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArmsTopNMetricResponseBody} extends {@link TeaModel}
     *
     * <p>GetArmsTopNMetricResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Error")
        private Long error;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Long rt;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.count = builder.count;
            this.error = builder.error;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.rt = builder.rt;
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
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return error
         */
        public Long getError() {
            return this.error;
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
         * @return rt
         */
        public Long getRt() {
            return this.rt;
        }

        public static final class Builder {
            private String appId; 
            private Long count; 
            private Long error; 
            private String name; 
            private String regionId; 
            private Long rt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.count = model.count;
                this.error = model.error;
                this.name = model.name;
                this.regionId = model.regionId;
                this.rt = model.rt;
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
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The number of errors.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder error(Long error) {
                this.error = error;
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
             * <p>The average response time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rt(Long rt) {
                this.rt = rt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
