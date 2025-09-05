// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link DeleteFaceEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFaceEntityResponseBody</p>
 */
public class DeleteFaceEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteFaceEntityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteFaceEntityResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteFaceEntityResponseBody build() {
            return new DeleteFaceEntityResponseBody(this);
        } 

    } 

}
