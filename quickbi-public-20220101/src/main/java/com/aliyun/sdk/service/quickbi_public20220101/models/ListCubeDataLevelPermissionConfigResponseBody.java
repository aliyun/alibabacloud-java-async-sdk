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
 * {@link ListCubeDataLevelPermissionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListCubeDataLevelPermissionConfigResponseBody</p>
 */
public class ListCubeDataLevelPermissionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCubeDataLevelPermissionConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCubeDataLevelPermissionConfigResponseBody create() {
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

        private Builder(ListCubeDataLevelPermissionConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>{ &quot;isOpen&quot;: 1, &quot;extraConfigModel&quot;: { // Additional configuration information &quot;ruleType&quot;: &quot;ROW_LEVEL&quot;, // The row-level permission type. &quot;missHitPolicy&quot;: &quot;NONE&quot;, // The hit rule policy: NONE has no permissions, and ALL has permissions. &quot;cubeId&quot;: &quot;7c7223 ae-31d1-4d2f-b11f-3c744528014b&quot; // The ID of the dataset. }, &quot;ruleType&quot;: &quot;ROW_LEVEL&quot;, // Row-column permission type<br>&quot;ruleModels&quot;: [ { &quot;ruleUsersModel&quot;: { // The target population. &quot;userGroups&quot;: [ &quot;0d5fb19b- <strong><strong>-1248 fc27ca51&quot;, // The ID of the user group. &quot;4aa3f089-</strong></strong>-85f0-0e8ac7c2dee9&quot; ], &quot;users&quot;: [ &quot;HuangJia <em><strong>2e3fa822&quot;, // The ID of the user. &quot;4334</strong></em>84358&quot; ] }, &quot;ruleContentModel&quot;: { &quot;ruleContentType&quot;: &quot;ROW_FIELD&quot;, // The row-column permission type. &quot;ruleContentJson&quot;: &quot;{&quot;conditionNode&quot;:{&quot;caption&quot;: &quot; Period &quot;,&quot;isMeasure&quot;:false,&quot;pathId&quot;:&quot;7d3b073bc6&quot;,&quot;relationOperator&quot;:&quot;not-null&quot;,&quot;name&quot;:&quot;7d3b073bc6&quot;,&quot;value&quot;:{&quot;value&quot;:[&quot;&quot;}UM],&quot; ENueType &quot;} // The JSON string of the row-column permission rule. &quot;ruleOriginConfigJson&quot;: &quot;{&quot;operator&quot;:&quot;and&quot;,&quot;operands&quot;:[{&quot;labelName&quot;: &quot; Period &quot;,&quot;isValid&quot;:true,&quot;uniqueId&quot;:&quot;5&quot;,&quot;fieldId&quot;:&quot;7d3b073bc6&quot;,&quot;error&quot;:false,&quot;fieldType&quot;:&quot;string&quot;,&quot;: default &quot;&quot; value&quot;:{&quot;conditionOp&quot;:&quot;not-null&quot;,&quot;conditionValue&quot;:&quot;&quot;},&quot;valueType&quot;:&quot;ENUM&quot;}}],&quot;isRelation&quot;:true}&quot; }, // The fixed-format JSON string required by the frontend &quot;isOpen&quot;: 1, // The status of the row-column permission configuration. 1. On. 0. Off. &quot;hitTakeEffect&quot;: 1, // Specifies whether the rule takes effect after a column-level permission is hit. 1 takes effect and 0 takes effect. &quot;ruleName&quot;: &quot;Test row-level permission_Do not delete&quot;, // The name of the row-column permission rule. &quot;ruleLevelType&quot;: &quot;ROW_LEVEL&quot;, // The row-column permission type. &quot;ruleId&quot;: &quot;a5bb24 da-772f-45e8-a43c-a891683e14da&quot;, // The ID of the row-column permission rule. &quot;cubeId&quot;: &quot;7c7223 ae-31d1-4d2f-b11f-3c744528014b&quot;, // The ID of the dataset. &quot;ruleTargetScope&quot;: &quot;OTHERS&quot; rule takes effect: ALL owner and OTHERS designated owner. } ], &quot;cubeId&quot;: &quot;7c7223 ae-31d1-4d2f-b11f-3c744528014b&quot; // The ID of the dataset. }</p>
         * 
         * <strong>example:</strong>
         * <p>The JSON string of the row-column permission list. For more information, see the description.</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCubeDataLevelPermissionConfigResponseBody build() {
            return new ListCubeDataLevelPermissionConfigResponseBody(this);
        } 

    } 

}
