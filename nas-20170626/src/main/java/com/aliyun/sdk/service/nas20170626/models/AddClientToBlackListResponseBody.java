// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link AddClientToBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>AddClientToBlackListResponseBody</p>
 */
public class AddClientToBlackListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddClientToBlackListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClientToBlackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddClientToBlackListResponseBody build() {
            return new AddClientToBlackListResponseBody(this);
        } 

    } 

}
