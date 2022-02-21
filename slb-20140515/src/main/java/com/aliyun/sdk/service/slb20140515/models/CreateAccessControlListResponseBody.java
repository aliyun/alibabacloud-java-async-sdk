// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessControlListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessControlListResponseBody</p>
 */
public class CreateAccessControlListResponseBody extends TeaModel {
    @NameInMap("AclId")
    private String aclId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessControlListResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessControlListResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessControlListResponseBody build() {
            return new CreateAccessControlListResponseBody(this);
        } 

    } 

}
