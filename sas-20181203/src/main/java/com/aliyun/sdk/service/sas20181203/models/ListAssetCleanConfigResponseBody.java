// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAssetCleanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetCleanConfigResponseBody</p>
 */
public class ListAssetCleanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The number of cleanup configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The asset cleanup configurations.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetCleanConfigResponseBody build() {
            return new ListAssetCleanConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetCleanConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetCleanConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanDays")
        private Integer cleanDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The number of days before hosts whose provider cannot be identified are automatically cleaned after they enter the offline state. Valid value: an integer that ranges from 1 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder cleanDays(Integer cleanDays) {
                this.cleanDays = cleanDays;
                return this;
            }

            /**
             * <p>Indicates whether the configuration takes effect. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The configuration does not take effect.</li>
             * <li><strong>1</strong>: The configuration takes effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of hosts that are cleaned.</p>
             * <ul>
             * <li>The value is set to <strong>1</strong>, which indicates hosts whose provider cannot be identified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
