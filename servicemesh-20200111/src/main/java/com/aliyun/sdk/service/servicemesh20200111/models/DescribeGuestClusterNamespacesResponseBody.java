// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterNamespacesResponseBody</p>
 */
public class DescribeGuestClusterNamespacesResponseBody extends TeaModel {
    @NameInMap("NsList")
    private java.util.List < String > nsList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterNamespacesResponseBody(Builder builder) {
        this.nsList = builder.nsList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nsList
     */
    public java.util.List < String > getNsList() {
        return this.nsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > nsList; 
        private String requestId; 

        /**
         * NsList.
         */
        public Builder nsList(java.util.List < String > nsList) {
            this.nsList = nsList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterNamespacesResponseBody build() {
            return new DescribeGuestClusterNamespacesResponseBody(this);
        } 

    } 

}
