// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortConnsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortConnsListResponseBody</p>
 */
public class DescribePortConnsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnsList")
    private java.util.List<ConnsList> connsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ConnsList> getConnsList() {
        return this.connsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConnsList> connsList; 
        private String requestId; 

        /**
         * <p>Details about the connections established over the port.</p>
         */
        public Builder connsList(java.util.List<ConnsList> connsList) {
            this.connsList = connsList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6D48AED0-41DB-5D9B-B484-3B6AAD312AD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortConnsListResponseBody build() {
            return new DescribePortConnsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortConnsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortConnsListResponseBody</p>
     */
    public static class ConnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActConns")
        private Long actConns;

        @com.aliyun.core.annotation.NameInMap("Conns")
        private Long conns;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Long cps;

        @com.aliyun.core.annotation.NameInMap("InActConns")
        private Long inActConns;

        @com.aliyun.core.annotation.NameInMap("Index")
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
             * <p>The number of active connections.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder actConns(Long actConns) {
                this.actConns = actConns;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in internal preview. Do not use this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder conns(Long conns) {
                this.conns = conns;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The number of inactive connections.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder inActConns(Long inActConns) {
                this.inActConns = inActConns;
                return this;
            }

            /**
             * <p>The index number of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>16506</p>
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
