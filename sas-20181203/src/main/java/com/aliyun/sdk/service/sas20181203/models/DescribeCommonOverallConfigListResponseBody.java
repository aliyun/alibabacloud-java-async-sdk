// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigListResponseBody</p>
 */
public class DescribeCommonOverallConfigListResponseBody extends TeaModel {
    @NameInMap("OverallList")
    private java.util.List < OverallList> overallList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCommonOverallConfigListResponseBody(Builder builder) {
        this.overallList = builder.overallList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigListResponseBody create() {
        return builder().build();
    }

    /**
     * @return overallList
     */
    public java.util.List < OverallList> getOverallList() {
        return this.overallList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OverallList> overallList; 
        private String requestId; 

        /**
         * OverallList.
         */
        public Builder overallList(java.util.List < OverallList> overallList) {
            this.overallList = overallList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommonOverallConfigListResponseBody build() {
            return new DescribeCommonOverallConfigListResponseBody(this);
        } 

    } 

    public static class OverallList extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("Type")
        private String type;

        private OverallList(Builder builder) {
            this.config = builder.config;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private Integer totalCount; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverallList build() {
                return new OverallList(this);
            } 

        } 

    }
}
