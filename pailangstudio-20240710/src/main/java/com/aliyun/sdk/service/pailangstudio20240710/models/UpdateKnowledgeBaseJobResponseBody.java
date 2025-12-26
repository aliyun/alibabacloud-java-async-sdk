// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link UpdateKnowledgeBaseJobResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeBaseJobResponseBody</p>
 */
public class UpdateKnowledgeBaseJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateKnowledgeBaseJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseJobResponseBody create() {
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

        private Builder(UpdateKnowledgeBaseJobResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateKnowledgeBaseJobResponseBody build() {
            return new UpdateKnowledgeBaseJobResponseBody(this);
        } 

    } 

}
