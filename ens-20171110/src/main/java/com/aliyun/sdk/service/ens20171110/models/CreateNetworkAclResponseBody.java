// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkAclResponseBody</p>
 */
public class CreateNetworkAclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    private String networkAclId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkAclResponseBody(Builder builder) {
        this.networkAclId = builder.networkAclId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkAclId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNetworkAclResponseBody model) {
            this.networkAclId = model.networkAclId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-5p1fg655nh68xyz9i****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
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

        public CreateNetworkAclResponseBody build() {
            return new CreateNetworkAclResponseBody(this);
        } 

    } 

}
