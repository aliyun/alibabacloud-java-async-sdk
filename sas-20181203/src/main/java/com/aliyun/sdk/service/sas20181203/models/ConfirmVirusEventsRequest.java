// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ConfirmVirusEventsRequest} extends {@link RequestModel}
 *
 * <p>ConfirmVirusEventsRequest</p>
 */
public class ConfirmVirusEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationAll")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationRange")
    private String operationRange;

    private ConfirmVirusEventsRequest(Builder builder) {
        super(builder);
        this.operationAll = builder.operationAll;
        this.operationCode = builder.operationCode;
        this.operationRange = builder.operationRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmVirusEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationAll
     */
    public Integer getOperationAll() {
        return this.operationAll;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationRange
     */
    public String getOperationRange() {
        return this.operationRange;
    }

    public static final class Builder extends Request.Builder<ConfirmVirusEventsRequest, Builder> {
        private Integer operationAll; 
        private String operationCode; 
        private String operationRange; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmVirusEventsRequest request) {
            super(request);
            this.operationAll = request.operationAll;
            this.operationCode = request.operationCode;
            this.operationRange = request.operationRange;
        } 

        /**
         * <p>Specifies whether to handle all alerts. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationAll(Integer operationAll) {
            this.putQueryParameter("OperationAll", operationAll);
            this.operationAll = operationAll;
            return this;
        }

        /**
         * <p>The method to handle the alert event. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: deep scan and removal</li>
         * <li><strong>ignore</strong>: ignore</li>
         * <li><strong>advance_mark_mis_info</strong>: add to whitelist</li>
         * <li><strong>manual_handled</strong>: manually handled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The scope of the trojan scan alert handling. This parameter is required when OperationAll is set to 0. This parameter is ignored when OperationAll is set to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;type\&quot;:\&quot;machine\&quot;,\&quot;list\&quot;:[\&quot;3aedba3d-bd4d-4dfb-bb0d-xxxxxxxxxxxx\&quot;]}]</p>
         */
        public Builder operationRange(String operationRange) {
            this.putQueryParameter("OperationRange", operationRange);
            this.operationRange = operationRange;
            return this;
        }

        @Override
        public ConfirmVirusEventsRequest build() {
            return new ConfirmVirusEventsRequest(this);
        } 

    } 

}
