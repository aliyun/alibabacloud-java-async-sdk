// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link ListIpOrHostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpOrHostsResponseBody</p>
 */
public class ListIpOrHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpNames")
    private IpNames ipNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIpOrHostsResponseBody(Builder builder) {
        this.ipNames = builder.ipNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpOrHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipNames
     */
    public IpNames getIpNames() {
        return this.ipNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IpNames ipNames; 
        private String requestId; 

        /**
         * <p>The IP addresses.</p>
         */
        public Builder ipNames(IpNames ipNames) {
            this.ipNames = ipNames;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1FC4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIpOrHostsResponseBody build() {
            return new ListIpOrHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpOrHostsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpOrHostsResponseBody</p>
     */
    public static class IpNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpName")
        private java.util.List<String> ipName;

        private IpNames(Builder builder) {
            this.ipName = builder.ipName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpNames create() {
            return builder().build();
        }

        /**
         * @return ipName
         */
        public java.util.List<String> getIpName() {
            return this.ipName;
        }

        public static final class Builder {
            private java.util.List<String> ipName; 

            /**
             * IpName.
             */
            public Builder ipName(java.util.List<String> ipName) {
                this.ipName = ipName;
                return this;
            }

            public IpNames build() {
                return new IpNames(this);
            } 

        } 

    }
}
