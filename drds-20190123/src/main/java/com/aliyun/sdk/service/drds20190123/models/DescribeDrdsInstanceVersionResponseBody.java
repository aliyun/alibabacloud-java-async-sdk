// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceVersionResponseBody</p>
 */
public class DescribeDrdsInstanceVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsInstanceVersionResponseBody build() {
            return new DescribeDrdsInstanceVersionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InstanceVersion")
        private String instanceVersion;

        @NameInMap("NewestVersion")
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
             * InstanceVersion.
             */
            public Builder instanceVersion(String instanceVersion) {
                this.instanceVersion = instanceVersion;
                return this;
            }

            /**
             * NewestVersion.
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
