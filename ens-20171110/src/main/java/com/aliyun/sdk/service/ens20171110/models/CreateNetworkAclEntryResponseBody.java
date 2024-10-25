// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNetworkAclEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkAclEntryResponseBody</p>
 */
public class CreateNetworkAclEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
    private String networkAclEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>nae-5****</p>
         */
        public Builder networkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
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
