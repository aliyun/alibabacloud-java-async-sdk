// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamResponseBody</p>
 */
public class CreateIpamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamId")
    private String ipamId;

    @com.aliyun.core.annotation.NameInMap("PrivateDefaultScopeId")
    private String privateDefaultScopeId;

    @com.aliyun.core.annotation.NameInMap("PublicDefaultScopeId")
    private String publicDefaultScopeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamResponseBody(Builder builder) {
        this.ipamId = builder.ipamId;
        this.privateDefaultScopeId = builder.privateDefaultScopeId;
        this.publicDefaultScopeId = builder.publicDefaultScopeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipamId
     */
    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * @return privateDefaultScopeId
     */
    public String getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }

    /**
     * @return publicDefaultScopeId
     */
    public String getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamId; 
        private String privateDefaultScopeId; 
        private String publicDefaultScopeId; 
        private String requestId; 

        /**
         * IpamId.
         */
        public Builder ipamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }

        /**
         * PrivateDefaultScopeId.
         */
        public Builder privateDefaultScopeId(String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }

        /**
         * PublicDefaultScopeId.
         */
        public Builder publicDefaultScopeId(String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpamResponseBody build() {
            return new CreateIpamResponseBody(this);
        } 

    } 

}
