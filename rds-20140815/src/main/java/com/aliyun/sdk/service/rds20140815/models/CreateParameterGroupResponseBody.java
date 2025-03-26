// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParameterGroupResponseBody</p>
 */
public class CreateParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateParameterGroupResponseBody(Builder builder) {
        this.parameterGroupId = builder.parameterGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String parameterGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateParameterGroupResponseBody model) {
            this.parameterGroupId = model.parameterGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the parameter template. You can call the <a href="https://help.aliyun.com/document_detail/144491.html">DescribeParameterGroups</a> operation to query the IDs of parameter templates.</p>
         * 
         * <strong>example:</strong>
         * <p>rpg-q488w14xvsk****</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateParameterGroupResponseBody build() {
            return new CreateParameterGroupResponseBody(this);
        } 

    } 

}
