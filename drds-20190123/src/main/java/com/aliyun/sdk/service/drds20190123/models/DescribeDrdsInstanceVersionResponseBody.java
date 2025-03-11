// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsInstanceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceVersionResponseBody</p>
 */
public class DescribeDrdsInstanceVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsInstanceVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceVersionResponseBody create() {
        return builder().build();
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

        /**
         * <p>The details about the instance version.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
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

        public DescribeDrdsInstanceVersionResponseBody build() {
            return new DescribeDrdsInstanceVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsInstanceVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstanceVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceVersion")
        private String instanceVersion;

        @com.aliyun.core.annotation.NameInMap("NewestVersion")
        private String newestVersion;

        private Data(Builder builder) {
            this.instanceVersion = builder.instanceVersion;
            this.newestVersion = builder.newestVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceVersion
         */
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

        /**
         * @return newestVersion
         */
        public String getNewestVersion() {
            return this.newestVersion;
        }

        public static final class Builder {
            private String instanceVersion; 
            private String newestVersion; 

            /**
             * <p>The current version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.3.12-15682777</p>
             */
            public Builder instanceVersion(String instanceVersion) {
                this.instanceVersion = instanceVersion;
                return this;
            }

            /**
             * <p>The latest version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.4.12-16315258</p>
             */
            public Builder newestVersion(String newestVersion) {
                this.newestVersion = newestVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
