// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link HandleSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSecurityEventsRequest</p>
 */
public class HandleSecurityEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkBatch")
    private Boolean markBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkMissParam")
    private String markMissParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationParams")
    private String operationParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> securityEventIds;

    private HandleSecurityEventsRequest(Builder builder) {
        super(builder);
        this.markBatch = builder.markBatch;
        this.markMissParam = builder.markMissParam;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.remark = builder.remark;
        this.securityEventIds = builder.securityEventIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSecurityEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markBatch
     */
    public Boolean getMarkBatch() {
        return this.markBatch;
    }

    /**
     * @return markMissParam
     */
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationParams
     */
    public String getOperationParams() {
        return this.operationParams;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return securityEventIds
     */
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public static final class Builder extends Request.Builder<HandleSecurityEventsRequest, Builder> {
        private Boolean markBatch; 
        private String markMissParam; 
        private String operationCode; 
        private String operationParams; 
        private String remark; 
        private java.util.List<Long> securityEventIds; 

        private Builder() {
            super();
        } 

        private Builder(HandleSecurityEventsRequest request) {
            super(request);
            this.markBatch = request.markBatch;
            this.markMissParam = request.markMissParam;
            this.operationCode = request.operationCode;
            this.operationParams = request.operationParams;
            this.remark = request.remark;
            this.securityEventIds = request.securityEventIds;
        } 

        /**
         * <p>Specifies whether to add to the whitelist in batches. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         */
        public Builder markBatch(Boolean markBatch) {
            this.putQueryParameter("MarkBatch", markBatch);
            this.markBatch = markBatch;
            return this;
        }

        /**
         * <p>The JSON array string used when adding an advanced whitelist or precise defense whitelist rule. This parameter applies only when OperationCode is set to <code>advance_mark_mis_info</code> or <code>defense_mark_mis_info</code>. Do not pass this parameter for other operations.</p>
         * <p>Each rule contains the following fields:</p>
         * <ul>
         * <li><code>field</code>: The matching field, which is obtained from the FiledName in MarkFieldsSource returned by DescribeSecurityEventOperations.</li>
         * <li><code>fieldValue</code>: The user-defined matching value, which does not need to be equal to the original field value of the current alert.</li>
         * <li><code>operate</code>: The matching operator, which must belong to the SupportedMisType list returned for the field. Do not use a general fixed enumeration instead of the supported range for the current field.</li>
         * <li><code>assetScope</code>: The effective scope object of the whitelist rule, which includes matchMode (scope mode) and the corresponding matchTargetIds (scope target list).</li>
         * </ul>
         * <p>The assetScope parameter specifies the effective scope of the rule. If you only handle the alert and do not add a whitelist rule, you can omit this parameter or pass an empty array string <code>[]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;processPath&quot;,&quot;fieldValue&quot;:&quot;/tmp/evil&quot;,&quot;operate&quot;:&quot;strEqual&quot;,&quot;assetScope&quot;:{&quot;matchMode&quot;:&quot;DeviceGroupNormal&quot;,&quot;matchTargetIds&quot;:[&quot;device-group-1&quot;]}}]</p>
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * <p>The operation code for handling the endpoint alert. Valid values:</p>
         * <ul>
         * <li>advance_mark_mis_info: Adds to the advanced whitelist.</li>
         * <li>defense_mark_mis_info: Adds to the precise defense whitelist.</li>
         * <li>mark_mis_info: Marks as a false positive (standard whitelisting).</li>
         * <li>rm_mark_mis_info: Removes from the standard or advanced whitelist.</li>
         * <li>rm_defense_mark_mis_info: Removes from the precise defense whitelist.</li>
         * <li>ignore: Ignores the alert.</li>
         * <li>manual_handled: Marks as manually handled.</li>
         * <li>cancle_manual: Cancels the manually handled status.
         * The preceding list is not a fixed set of operations that can be performed on every alert. The actual available operations are also restricted by feature switches, dynamic whitelists, alert operation configurations, and the current status. Before you call this operation, call DescribeSecurityEventOperations to query the currently available operations for the alert and check UserCanOperate. Use only the OperationCode values that are allowed in the query result.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The operation parameters, represented as a JSON object string. If this parameter is not passed or an empty string is passed, the backend processes it as <code>{}</code>. The specific parameters must correspond to the OperationCode and are subject to the OperationParams returned by DescribeSecurityEventOperations.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * <p>The remark for the handling operation.</p>
         * 
         * <strong>example:</strong>
         * <p>remark test.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The IDs of the security alert events to handle.</p>
         * <p>This parameter is required.</p>
         */
        public Builder securityEventIds(java.util.List<Long> securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        @Override
        public HandleSecurityEventsRequest build() {
            return new HandleSecurityEventsRequest(this);
        } 

    } 

}
