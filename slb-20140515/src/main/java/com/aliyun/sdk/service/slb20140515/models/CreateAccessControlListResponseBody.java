// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateAccessControlListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessControlListResponseBody</p>
 */
public class CreateAccessControlListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-rj9xpxzcwxrukois****</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>988CB45E-1643-48C0-87B4-928DDF77EA49</p>
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
