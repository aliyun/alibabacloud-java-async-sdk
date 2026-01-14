// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link AssociateAclsWithListenerResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateAclsWithListenerResponseBody</p>
 */
public class AssociateAclsWithListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclIds")
    private java.util.List<String> aclIds;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateAclsWithListenerResponseBody(Builder builder) {
        this.aclIds = builder.aclIds;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAclsWithListenerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> aclIds; 
        private String listenerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssociateAclsWithListenerResponseBody model) {
            this.aclIds = model.aclIds;
            this.listenerId = model.listenerId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the ACL.</p>
         */
        public Builder aclIds(java.util.List<String> aclIds) {
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateAclsWithListenerResponseBody build() {
            return new AssociateAclsWithListenerResponseBody(this);
        } 

    } 

}
