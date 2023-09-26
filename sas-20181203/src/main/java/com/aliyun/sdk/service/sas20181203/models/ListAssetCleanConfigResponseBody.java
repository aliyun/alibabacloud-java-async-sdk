// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetCleanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetCleanConfigResponseBody</p>
 */
public class ListAssetCleanConfigResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListAssetCleanConfigResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetCleanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The number of cleanup configurations.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The asset cleanup configurations.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetCleanConfigResponseBody build() {
            return new ListAssetCleanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CleanDays")
        private Integer cleanDays;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.cleanDays = builder.cleanDays;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cleanDays
         */
        public Integer getCleanDays() {
            return this.cleanDays;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cleanDays; 
            private Integer status; 
            private Integer type; 

            /**
             * The number of days before hosts whose provider cannot be identified are automatically cleaned after they enter the offline state. Valid value: an integer that ranges from 1 to 30.
             */
            public Builder cleanDays(Integer cleanDays) {
                this.cleanDays = cleanDays;
                return this;
            }

            /**
             * Indicates whether the configuration takes effect. Valid values:
             * <p>
             * 
             * *   **0**: The configuration does not take effect.
             * *   **1**: The configuration takes effect.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of hosts that are cleaned.
             * <p>
             * 
             * *   The value is set to **1**, which indicates hosts whose provider cannot be identified.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
