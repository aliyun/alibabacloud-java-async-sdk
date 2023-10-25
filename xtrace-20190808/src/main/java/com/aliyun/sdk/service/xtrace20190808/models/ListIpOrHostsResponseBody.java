// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpOrHostsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpOrHostsResponseBody</p>
 */
public class ListIpOrHostsResponseBody extends TeaModel {
    @NameInMap("IpNames")
    private IpNames ipNames;

    @NameInMap("RequestId")
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
         * The IP addresses.
         */
        public Builder ipNames(IpNames ipNames) {
            this.ipNames = ipNames;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIpOrHostsResponseBody build() {
            return new ListIpOrHostsResponseBody(this);
        } 

    } 

    public static class IpNames extends TeaModel {
        @NameInMap("IpName")
        private java.util.List < String > ipName;

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
        public java.util.List < String > getIpName() {
            return this.ipName;
        }

        public static final class Builder {
            private java.util.List < String > ipName; 

            /**
             * IpName.
             */
            public Builder ipName(java.util.List < String > ipName) {
                this.ipName = ipName;
                return this;
            }

            public IpNames build() {
                return new IpNames(this);
            } 

        } 

    }
}
