// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeFilterConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilterConfigsResponseBody</p>
 */
public class DescribeFilterConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilterConfigs")
    private java.util.List<FilterConfigs> filterConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFilterConfigsResponseBody(Builder builder) {
        this.filterConfigs = builder.filterConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilterConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterConfigs
     */
    public java.util.List<FilterConfigs> getFilterConfigs() {
        return this.filterConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FilterConfigs> filterConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFilterConfigsResponseBody model) {
            this.filterConfigs = model.filterConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * FilterConfigs.
         */
        public Builder filterConfigs(java.util.List<FilterConfigs> filterConfigs) {
            this.filterConfigs = filterConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFilterConfigsResponseBody build() {
            return new DescribeFilterConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilterConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilterConfigsResponseBody</p>
     */
    public static class FilterConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterName")
        private String filterName;

        @com.aliyun.core.annotation.NameInMap("ItemConfigs")
        private String itemConfigs;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UuId")
        private String uuId;

        private FilterConfigs(Builder builder) {
            this.filterName = builder.filterName;
            this.itemConfigs = builder.itemConfigs;
            this.type = builder.type;
            this.uuId = builder.uuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterConfigs create() {
            return builder().build();
        }

        /**
         * @return filterName
         */
        public String getFilterName() {
            return this.filterName;
        }

        /**
         * @return itemConfigs
         */
        public String getItemConfigs() {
            return this.itemConfigs;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuId
         */
        public String getUuId() {
            return this.uuId;
        }

        public static final class Builder {
            private String filterName; 
            private String itemConfigs; 
            private String type; 
            private String uuId; 

            private Builder() {
            } 

            private Builder(FilterConfigs model) {
                this.filterName = model.filterName;
                this.itemConfigs = model.itemConfigs;
                this.type = model.type;
                this.uuId = model.uuId;
            } 

            /**
             * FilterName.
             */
            public Builder filterName(String filterName) {
                this.filterName = filterName;
                return this;
            }

            /**
             * ItemConfigs.
             */
            public Builder itemConfigs(String itemConfigs) {
                this.itemConfigs = itemConfigs;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UuId.
             */
            public Builder uuId(String uuId) {
                this.uuId = uuId;
                return this;
            }

            public FilterConfigs build() {
                return new FilterConfigs(this);
            } 

        } 

    }
}
