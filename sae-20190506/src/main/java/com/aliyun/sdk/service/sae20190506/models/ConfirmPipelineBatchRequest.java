// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ConfirmPipelineBatchRequest} extends {@link RequestModel}
 *
 * <p>ConfirmPipelineBatchRequest</p>
 */
public class ConfirmPipelineBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Confirm")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean confirm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    private ConfirmPipelineBatchRequest(Builder builder) {
        super(builder);
        this.confirm = builder.confirm;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmPipelineBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirm
     */
    public Boolean getConfirm() {
        return this.confirm;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<ConfirmPipelineBatchRequest, Builder> {
        private Boolean confirm; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmPipelineBatchRequest request) {
            super(request);
            this.confirm = request.confirm;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * <p>true</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder confirm(Boolean confirm) {
            this.putQueryParameter("Confirm", confirm);
            this.confirm = confirm;
            return this;
        }

        /**
         * <p>The ID of the batch. You can call the <a href="https://www.alibabacloud.com/help/zh/sae/serverless-app-engine-classic/developer-reference/api-sae-2019-05-06-describechangeorder-old?spm=a2c63.p38356.help-menu-search-118957.d_0">DescribeChangeOrder</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2e-vds-feh-***</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public ConfirmPipelineBatchRequest build() {
            return new ConfirmPipelineBatchRequest(this);
        } 

    } 

}
