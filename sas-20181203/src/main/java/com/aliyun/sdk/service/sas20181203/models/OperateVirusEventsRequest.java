// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateVirusEventsRequest} extends {@link RequestModel}
 *
 * <p>OperateVirusEventsRequest</p>
 */
public class OperateVirusEventsRequest extends Request {
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

    private OperateVirusEventsRequest(Builder builder) {
        super(builder);
        this.operationAll = builder.operationAll;
        this.operationCode = builder.operationCode;
        this.operationRange = builder.operationRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVirusEventsRequest create() {
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

    public static final class Builder extends Request.Builder<OperateVirusEventsRequest, Builder> {
        private Integer operationAll; 
        private String operationCode; 
        private String operationRange; 

        private Builder() {
            super();
        } 

        private Builder(OperateVirusEventsRequest request) {
            super(request);
            this.operationAll = request.operationAll;
            this.operationCode = request.operationCode;
            this.operationRange = request.operationRange;
        } 

        /**
         * <p>Specifies whether to handle all alert events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
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
         * <p>The operation that you want to perform on the alert events. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: performs in-depth detection and removal</li>
         * <li><strong>ignore</strong>: ignores the alert event</li>
         * <li><strong>advance_mark_mis_info</strong>: adds the alert events to the whitelist</li>
         * <li><strong>manual_handled</strong>: marks the alert events as manually handled</li>
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
         * <p>The handling scope.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;machine&quot;,&quot;list&quot;:[&quot;xxxxxxxxx-4cbf-4ca6-a1b7-8a09d1f86ab0&quot;]}]</p>
         */
        public Builder operationRange(String operationRange) {
            this.putQueryParameter("OperationRange", operationRange);
            this.operationRange = operationRange;
            return this;
        }

        @Override
        public OperateVirusEventsRequest build() {
            return new OperateVirusEventsRequest(this);
        } 

    } 

}
