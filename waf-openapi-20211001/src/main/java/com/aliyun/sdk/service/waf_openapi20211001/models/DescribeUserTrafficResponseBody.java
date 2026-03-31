// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeUserTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserTrafficResponseBody</p>
 */
public class DescribeUserTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserTraffic")
    private java.util.List<UserTraffic> userTraffic;

    private DescribeUserTrafficResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userTraffic = builder.userTraffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTrafficResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userTraffic
     */
    public java.util.List<UserTraffic> getUserTraffic() {
        return this.userTraffic;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UserTraffic> userTraffic; 

        private Builder() {
        } 

        private Builder(DescribeUserTrafficResponseBody model) {
            this.requestId = model.requestId;
            this.userTraffic = model.userTraffic;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserTraffic.
         */
        public Builder userTraffic(java.util.List<UserTraffic> userTraffic) {
            this.userTraffic = userTraffic;
            return this;
        }

        public DescribeUserTrafficResponseBody build() {
            return new DescribeUserTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserTrafficResponseBody</p>
     */
    public static class UserTraffic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        private UserTraffic(Builder builder) {
            this.index = builder.index;
            this.pv = builder.pv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserTraffic create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        public static final class Builder {
            private Long index; 
            private Long pv; 

            private Builder() {
            } 

            private Builder(UserTraffic model) {
                this.index = model.index;
                this.pv = model.pv;
            } 

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            public UserTraffic build() {
                return new UserTraffic(this);
            } 

        } 

    }
}
