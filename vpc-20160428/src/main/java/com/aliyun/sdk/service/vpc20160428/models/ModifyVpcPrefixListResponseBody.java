// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcPrefixListResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpcPrefixListResponseBody</p>
 */
public class ModifyVpcPrefixListResponseBody extends TeaModel {
    @NameInMap("PrefixListId")
    private String prefixListId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyVpcPrefixListResponseBody(Builder builder) {
        this.prefixListId = builder.prefixListId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcPrefixListResponseBody create() {
        return builder().build();
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prefixListId; 
        private String requestId; 

        /**
         * PrefixListId.
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVpcPrefixListResponseBody build() {
            return new ModifyVpcPrefixListResponseBody(this);
        } 

    } 

}
