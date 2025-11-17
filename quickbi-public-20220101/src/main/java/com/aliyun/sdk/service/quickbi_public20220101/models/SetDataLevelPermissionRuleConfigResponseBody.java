// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link SetDataLevelPermissionRuleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetDataLevelPermissionRuleConfigResponseBody</p>
 */
public class SetDataLevelPermissionRuleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SetDataLevelPermissionRuleConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataLevelPermissionRuleConfigResponseBody create() {
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

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SetDataLevelPermissionRuleConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Successfully saved row and column permission information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;cubeId&quot;: &quot;aa574353-41cf-<strong><strong>-8d0d-455176c101fa&quot;,
         *     &quot;hitTakeEffect&quot;: 1,
         *     &quot;isOpen&quot;: 1,
         *     &quot;permissionMode&quot;: &quot;COMPLEX&quot;,
         *     &quot;ruleContentModel&quot;: {
         *         &quot;ruleContent&quot;: {
         *             &quot;pathId&quot;: [
         *                 &quot;264b7a970b&quot;
         *             ]
         *         },
         *         &quot;ruleContentJson&quot;: &quot;{&quot;pathId&quot;:[&quot;264b7a970b&quot;]}&quot;,
         *         &quot;ruleContentType&quot;: &quot;COLUMN_FORBID&quot;
         *     },
         *     &quot;ruleId&quot;: &quot;3971fa8e-f7e0-</strong></strong>-b6e3-5b3167dd7247&quot;,
         *     &quot;ruleLevelType&quot;: &quot;COLUMN_LEVEL&quot;,
         *     &quot;ruleName&quot;: &quot;test&quot;,
         *     &quot;ruleTargetScope&quot;: &quot;ALL&quot;
         * }</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The value range is as follows:</p>
         * <ul>
         * <li>true: The request succeeded</li>
         * <li>false: The request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SetDataLevelPermissionRuleConfigResponseBody build() {
            return new SetDataLevelPermissionRuleConfigResponseBody(this);
        } 

    } 

}
