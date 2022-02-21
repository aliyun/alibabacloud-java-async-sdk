// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteClusterTemplateResponseBody</p>
 */
public class DeleteClusterTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteClusterTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterTemplateResponseBody create() {
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

        public DeleteClusterTemplateResponseBody build() {
            return new DeleteClusterTemplateResponseBody(this);
        } 

    } 

}
