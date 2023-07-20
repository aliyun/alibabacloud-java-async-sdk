// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAclEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkAclEntryResponseBody</p>
 */
public class CreateNetworkAclEntryResponseBody extends TeaModel {
    @NameInMap("NetworkAclEntryId")
    private String networkAclEntryId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNetworkAclEntryResponseBody(Builder builder) {
        this.networkAclEntryId = builder.networkAclEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkAclEntryId
     */
    public String getNetworkAclEntryId() {
        return this.networkAclEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkAclEntryId; 
        private String requestId; 

        /**
         * NetworkAclEntryId.
         */
        public Builder networkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkAclEntryResponseBody build() {
            return new CreateNetworkAclEntryResponseBody(this);
        } 

    } 

}
