// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetRolePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetRolePolicyResponseBody</p>
 */
public class GetRolePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRolePolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRolePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRolePolicyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Statement&quot;: [
         *             {
         *                   &quot;Action&quot;: [
         *                         &quot;odps:<em>&quot;
         *                   ],
         *                   &quot;Effect&quot;: &quot;Allow&quot;,
         *                   &quot;Resource&quot;: [
         *                         &quot;acs:odps:</em>:projects/{projectname}/authorization/packages&quot;
         *                   ]
         *             }
         *       ],
         *       &quot;Version&quot;: &quot;1&quot;
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1eeed16675342848904412e08dd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRolePolicyResponseBody build() {
            return new GetRolePolicyResponseBody(this);
        } 

    } 

}
