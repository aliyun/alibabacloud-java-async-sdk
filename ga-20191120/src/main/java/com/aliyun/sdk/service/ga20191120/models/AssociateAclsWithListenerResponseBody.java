// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAclsWithListenerResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateAclsWithListenerResponseBody</p>
 */
public class AssociateAclsWithListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclIds")
    private java.util.List < String > aclIds;

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

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
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
        private java.util.List < String > aclIds; 
        private String listenerId; 
        private String requestId; 

        /**
         * The ID of the ACL.
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.aclIds = aclIds;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the request.
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
