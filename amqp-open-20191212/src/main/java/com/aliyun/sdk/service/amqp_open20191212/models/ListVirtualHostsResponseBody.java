// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualHostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualHostsResponseBody</p>
 */
public class ListVirtualHostsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListVirtualHostsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualHostsResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

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

        public ListVirtualHostsResponseBody build() {
            return new ListVirtualHostsResponseBody(this);
        } 

    } 

    public static class VirtualHosts extends TeaModel {
        @NameInMap("Name")
        private String name;

        private VirtualHosts(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualHosts create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VirtualHosts build() {
                return new VirtualHosts(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("VirtualHosts")
        private java.util.List < VirtualHosts> virtualHosts;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.virtualHosts = builder.virtualHosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return virtualHosts
         */
        public java.util.List < VirtualHosts> getVirtualHosts() {
            return this.virtualHosts;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List < VirtualHosts> virtualHosts; 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * VirtualHosts.
             */
            public Builder virtualHosts(java.util.List < VirtualHosts> virtualHosts) {
                this.virtualHosts = virtualHosts;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
