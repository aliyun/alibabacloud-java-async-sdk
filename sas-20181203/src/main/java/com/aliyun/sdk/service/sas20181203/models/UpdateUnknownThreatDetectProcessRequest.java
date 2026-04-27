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
 * {@link UpdateUnknownThreatDetectProcessRequest} extends {@link RequestModel}
 *
 * <p>UpdateUnknownThreatDetectProcessRequest</p>
 */
public class UpdateUnknownThreatDetectProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private UpdateUnknownThreatDetectProcessRequest(Builder builder) {
        super(builder);
        this.processId = builder.processId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUnknownThreatDetectProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateUnknownThreatDetectProcessRequest, Builder> {
        private String processId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUnknownThreatDetectProcessRequest request) {
            super(request);
            this.processId = request.processId;
            this.remark = request.remark;
        } 

        /**
         * ProcessId.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateUnknownThreatDetectProcessRequest build() {
            return new UpdateUnknownThreatDetectProcessRequest(this);
        } 

    } 

}
