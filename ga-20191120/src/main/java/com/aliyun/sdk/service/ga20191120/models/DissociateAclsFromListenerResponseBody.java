// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAclsFromListenerResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateAclsFromListenerResponseBody</p>
 */
public class DissociateAclsFromListenerResponseBody extends TeaModel {
    @NameInMap("AclIds")
    private java.util.List < String > aclIds;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("RequestId")
    private String requestId;

    private DissociateAclsFromListenerResponseBody(Builder builder) {
        this.aclIds = builder.aclIds;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateAclsFromListenerResponseBody create() {
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
         * The IDs of the ACL.
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

        public DissociateAclsFromListenerResponseBody build() {
            return new DissociateAclsFromListenerResponseBody(this);
        } 

    } 

}
