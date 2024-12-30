// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetLinkInfoByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetLinkInfoByUserIdResponseBody</p>
 */
public class GetLinkInfoByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<AccountLinkInfo> items;

    private GetLinkInfoByUserIdResponseBody(Builder builder) {
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLinkInfoByUserIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<AccountLinkInfo> getItems() {
        return this.items;
    }

    public static final class Builder {
        private java.util.List<AccountLinkInfo> items; 

        /**
         * <p>The information about the users.</p>
         */
        public Builder items(java.util.List<AccountLinkInfo> items) {
            this.items = items;
            return this;
        }

        public GetLinkInfoByUserIdResponseBody build() {
            return new GetLinkInfoByUserIdResponseBody(this);
        } 

    } 

}
