// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDocParsingResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocParsingResultRequest</p>
 */
public class GetDocParsingResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("returnFormat")
    private String returnFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetDocParsingResultRequest(Builder builder) {
        super(builder);
        this.returnFormat = builder.returnFormat;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocParsingResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return returnFormat
     */
    public String getReturnFormat() {
        return this.returnFormat;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetDocParsingResultRequest, Builder> {
        private String returnFormat; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDocParsingResultRequest request) {
            super(request);
            this.returnFormat = request.returnFormat;
            this.taskId = request.taskId;
        } 

        /**
         * <ul>
         * <li>The document parsing result supports two formats: markdown and json.</li>
         * <li>By default, the result is returned in markdown format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>md</p>
         */
        public Builder returnFormat(String returnFormat) {
            this.putBodyParameter("returnFormat", returnFormat);
            this.returnFormat = returnFormat;
            return this;
        }

        /**
         * <ul>
         * <li>Task ID.</li>
         * <li>The taskId is obtained from the SubmitDocParsingTaskAdvance or SubmitDocParsingTask interfaces.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2c22388d-e2ed-44fe-99e6-99922f15e7bb</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDocParsingResultRequest build() {
            return new GetDocParsingResultRequest(this);
        } 

    } 

}
