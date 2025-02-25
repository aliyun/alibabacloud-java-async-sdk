// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link CreateServiceLinkedRoleForSelectDBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleForSelectDBResponseBody</p>
 */
public class CreateServiceLinkedRoleForSelectDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateServiceLinkedRoleForSelectDBResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleForSelectDBResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServiceLinkedRoleForSelectDBResponseBody build() {
            return new CreateServiceLinkedRoleForSelectDBResponseBody(this);
        } 

    } 

}
