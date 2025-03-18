// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link QueryTreeDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTreeDataResponseBody</p>
 */
public class QueryTreeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Playbooks")
    private String playbooks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryTreeDataResponseBody(Builder builder) {
        this.playbooks = builder.playbooks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTreeDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playbooks
     */
    public String getPlaybooks() {
        return this.playbooks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String playbooks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryTreeDataResponseBody model) {
            this.playbooks = model.playbooks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned information about the playbook. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;playbook&quot;: {
         *             &quot;active&quot;: false,
         *             &quot;displayName&quot;: &quot;test_playbook&quot;,
         *             &quot;playbookUuid&quot;: &quot;09a20455-3d3a-424c-a1df-xxxxxx&quot;
         *         }
         *     }
         * ]</p>
         */
        public Builder playbooks(String playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF2ECA2D-D8E6-5021-BF5C-19DD6D52C5B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTreeDataResponseBody build() {
            return new QueryTreeDataResponseBody(this);
        } 

    } 

}
