// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link SubmitQueryResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitQueryResponseBody</p>
 */
public class SubmitQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryId")
    private String queryId;

    private SubmitQueryResponseBody(Builder builder) {
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder {
        private String queryId; 

        private Builder() {
        } 

        private Builder(SubmitQueryResponseBody model) {
            this.queryId = model.queryId;
        } 

        /**
         * queryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        public SubmitQueryResponseBody build() {
            return new SubmitQueryResponseBody(this);
        } 

    } 

}
