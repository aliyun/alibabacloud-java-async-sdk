// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerlessTopNAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerlessTopNAppsResponseBody</p>
 */
public class ListServerlessTopNAppsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListServerlessTopNAppsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerlessTopNAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListServerlessTopNAppsResponseBody build() {
            return new ListServerlessTopNAppsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Error")
        private Integer error;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Region")
        private String region;

        @NameInMap("Rt")
        private Float rt;

        private Data(Builder builder) {
            this.count = builder.count;
            this.error = builder.error;
            this.name = builder.name;
            this.pid = builder.pid;
            this.region = builder.region;
            this.rt = builder.rt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return error
         */
        public Integer getError() {
            return this.error;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return rt
         */
        public Float getRt() {
            return this.rt;
        }

        public static final class Builder {
            private Integer count; 
            private Integer error; 
            private String name; 
            private String pid; 
            private String region; 
            private Float rt; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(Integer error) {
                this.error = error;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(Float rt) {
                this.rt = rt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
