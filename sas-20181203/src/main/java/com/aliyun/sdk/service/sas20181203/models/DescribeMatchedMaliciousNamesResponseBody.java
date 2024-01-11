// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMatchedMaliciousNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMatchedMaliciousNamesResponseBody</p>
 */
public class DescribeMatchedMaliciousNamesResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMatchedMaliciousNamesResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMatchedMaliciousNamesResponseBody create() {
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
         * 分页查询时，当前页显示的数据条数。
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 返回数据。
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMatchedMaliciousNamesResponseBody build() {
            return new DescribeMatchedMaliciousNamesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Key")
        private String key;

        private Data(Builder builder) {
            this.displayName = builder.displayName;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String displayName; 
            private String key; 

            /**
             * 恶意样本类型显示名称。
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 恶意样本类型Key。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
