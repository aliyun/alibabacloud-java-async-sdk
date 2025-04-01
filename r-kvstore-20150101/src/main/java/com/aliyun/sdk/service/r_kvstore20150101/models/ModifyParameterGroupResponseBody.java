// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyParameterGroupResponseBody</p>
 */
public class ModifyParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamGroupId")
    private String paramGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyParameterGroupResponseBody(Builder builder) {
        this.paramGroupId = builder.paramGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParameterGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramGroupId
     */
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String paramGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyParameterGroupResponseBody model) {
            this.paramGroupId = model.paramGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The parameter template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroupName</p>
         */
        public Builder paramGroupId(String paramGroupId) {
            this.paramGroupId = paramGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AD425AD3-CC7B-4EE2-A5CB-2F61BA73****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyParameterGroupResponseBody build() {
            return new ModifyParameterGroupResponseBody(this);
        } 

    } 

}
