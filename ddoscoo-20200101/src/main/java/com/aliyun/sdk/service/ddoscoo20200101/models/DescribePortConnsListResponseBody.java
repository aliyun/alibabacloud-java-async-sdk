// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortConnsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortConnsListResponseBody</p>
 */
public class DescribePortConnsListResponseBody extends TeaModel {
    @NameInMap("ConnsList")
    private java.util.List < ConnsList> connsList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePortConnsListResponseBody(Builder builder) {
        this.connsList = builder.connsList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortConnsListResponseBody create() {
        return builder().build();
    }

    /**
     * @return connsList
     */
    public java.util.List < ConnsList> getConnsList() {
        return this.connsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConnsList> connsList; 
        private String requestId; 

        /**
         * An array that consists of the connections established over the port.
         */
        public Builder connsList(java.util.List < ConnsList> connsList) {
            this.connsList = connsList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortConnsListResponseBody build() {
            return new DescribePortConnsListResponseBody(this);
        } 

    } 

    public static class ConnsList extends TeaModel {
        @NameInMap("ActConns")
        private Long actConns;

        @NameInMap("Conns")
        private Long conns;

        @NameInMap("Cps")
        private Long cps;

        @NameInMap("InActConns")
        private Long inActConns;

        @NameInMap("Index")
        private Long index;

        private ConnsList(Builder builder) {
            this.actConns = builder.actConns;
            this.conns = builder.conns;
            this.cps = builder.cps;
            this.inActConns = builder.inActConns;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnsList create() {
            return builder().build();
        }

        /**
         * @return actConns
         */
        public Long getActConns() {
            return this.actConns;
        }

        /**
         * @return conns
         */
        public Long getConns() {
            return this.conns;
        }

        /**
         * @return cps
         */
        public Long getCps() {
            return this.cps;
        }

        /**
         * @return inActConns
         */
        public Long getInActConns() {
            return this.inActConns;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Long actConns; 
            private Long conns; 
            private Long cps; 
            private Long inActConns; 
            private Long index; 

            /**
             * The number of active connections.
             */
            public Builder actConns(Long actConns) {
                this.actConns = actConns;
                return this;
            }

            /**
             * The number of concurrent connections.
             */
            public Builder conns(Long conns) {
                this.conns = conns;
                return this;
            }

            /**
             * The new connection creation rate.
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The number of inactive connections.
             */
            public Builder inActConns(Long inActConns) {
                this.inActConns = inActConns;
                return this;
            }

            /**
             * The index number of the returned data.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public ConnsList build() {
                return new ConnsList(this);
            } 

        } 

    }
}
