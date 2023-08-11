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
    @NameInMap("NsLabels")
    private java.util.Map < String, ? > nsLabels;

    @NameInMap("NsList")
    private java.util.List < String > nsList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterNamespacesResponseBody(Builder builder) {
        this.nsLabels = builder.nsLabels;
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
     * @return nsLabels
     */
    public java.util.Map < String, ? > getNsLabels() {
        return this.nsLabels;
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
        private java.util.Map < String, ? > nsLabels; 
        private java.util.List < String > nsList; 
        private String requestId; 

        /**
         * The labels of the namespaces. Labels are returned only when the `ShowNsLabels` parameter is set to `true`.
         */
        public Builder nsLabels(java.util.Map < String, ? > nsLabels) {
            this.nsLabels = nsLabels;
            return this;
        }

        /**
         * The names of the namespaces.
         */
        public Builder nsList(java.util.List < String > nsList) {
            this.nsList = nsList;
            return this;
        }

        /**
         * The ID of the request.
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
