// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link GenerateRamPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateRamPolicyResponseBody</p>
 */
public class GenerateRamPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GenerateRamPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.policyDocument = builder.policyDocument;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateRamPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String policyDocument; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GenerateRamPolicyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.policyDocument = model.policyDocument;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;Version&quot;: &quot;1&quot;,     &quot;Statement&quot;: [         {             &quot;Effect&quot;: &quot;Deny&quot;,             &quot;Action&quot;: [                 &quot;hbr:CreateRestore&quot;,                 &quot;hbr:CreateRestoreJob&quot;,                 &quot;hbr:CreateHanaRestore&quot;,                 &quot;hbr:CreateUniRestorePlan&quot;,                 &quot;hbr:CreateSqlServerRestore&quot;             ],             &quot;Resource&quot;: [                 &quot;acs:hbr:<em>:1178</em><em><strong><strong>531:vault/v-000</strong></strong></em><em>blx06&quot;,                 &quot;acs:hbr:</em>:1178<strong><strong><strong>531:vault/v-000</strong></strong></strong>blx06/client/*&quot;             ]         }     ] }</p>
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateRamPolicyResponseBody build() {
            return new GenerateRamPolicyResponseBody(this);
        } 

    } 

}
