// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecMetaProfilingTaskRunRequest} extends {@link RequestModel}
 *
 * <p>ExecMetaProfilingTaskRunRequest</p>
 */
public class ExecMetaProfilingTaskRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchNo")
    private String batchNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentId")
    private Long componentId;

    private ExecMetaProfilingTaskRunRequest(Builder builder) {
        super(builder);
        this.batchNo = builder.batchNo;
        this.componentId = builder.componentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecMetaProfilingTaskRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchNo
     */
    public String getBatchNo() {
        return this.batchNo;
    }

    /**
     * @return componentId
     */
    public Long getComponentId() {
        return this.componentId;
    }

    public static final class Builder extends Request.Builder<ExecMetaProfilingTaskRunRequest, Builder> {
        private String batchNo; 
        private Long componentId; 

        private Builder() {
            super();
        } 

        private Builder(ExecMetaProfilingTaskRunRequest request) {
            super(request);
            this.batchNo = request.batchNo;
            this.componentId = request.componentId;
        } 

        /**
         * batchNo.
         */
        public Builder batchNo(String batchNo) {
            this.putBodyParameter("batchNo", batchNo);
            this.batchNo = batchNo;
            return this;
        }

        /**
         * componentId.
         */
        public Builder componentId(Long componentId) {
            this.putBodyParameter("componentId", componentId);
            this.componentId = componentId;
            return this;
        }

        @Override
        public ExecMetaProfilingTaskRunRequest build() {
            return new ExecMetaProfilingTaskRunRequest(this);
        } 

    } 

}
