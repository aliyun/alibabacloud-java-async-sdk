// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntriesFromAclResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveEntriesFromAclResponseBody</p>
 */
public class RemoveEntriesFromAclResponseBody extends TeaModel {
    @NameInMap("AclId")
    private String aclId;

    @NameInMap("RequestId")
    private String requestId;

    private RemoveEntriesFromAclResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEntriesFromAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aclId; 
        private String requestId; 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveEntriesFromAclResponseBody build() {
            return new RemoveEntriesFromAclResponseBody(this);
        } 

    } 

}
