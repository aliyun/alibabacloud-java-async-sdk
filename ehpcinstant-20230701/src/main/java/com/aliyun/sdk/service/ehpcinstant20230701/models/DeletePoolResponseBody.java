// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DeletePoolResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePoolResponseBody</p>
 */
public class DeletePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePoolResponseBody create() {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePoolResponseBody build() {
            return new DeletePoolResponseBody(this);
        } 

    } 

}
