// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectFeatureViewOwnersResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectFeatureViewOwnersResponseBody</p>
 */
public class ListProjectFeatureViewOwnersResponseBody extends TeaModel {
    @NameInMap("Owners")
    private java.util.List < String > owners;

    @NameInMap("RequestId")
    private String requestId;

    private ListProjectFeatureViewOwnersResponseBody(Builder builder) {
        this.owners = builder.owners;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectFeatureViewOwnersResponseBody create() {
        return builder().build();
    }

    /**
     * @return owners
     */
    public java.util.List < String > getOwners() {
        return this.owners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > owners; 
        private String requestId; 

        /**
         * Owners.
         */
        public Builder owners(java.util.List < String > owners) {
            this.owners = owners;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectFeatureViewOwnersResponseBody build() {
            return new ListProjectFeatureViewOwnersResponseBody(this);
        } 

    } 

}
