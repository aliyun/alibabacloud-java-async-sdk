// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301.models;

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
 * {@link CreateTextLabelRequest} extends {@link RequestModel}
 *
 * <p>CreateTextLabelRequest</p>
 */
public class CreateTextLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelTemplateId")
    private String labelTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    private CreateTextLabelRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.labelTemplateId = builder.labelTemplateId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTextLabelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return labelTemplateId
     */
    public String getLabelTemplateId() {
        return this.labelTemplateId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateTextLabelRequest, Builder> {
        private String data; 
        private String labelTemplateId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTextLabelRequest request) {
            super(request);
            this.data = request.data;
            this.labelTemplateId = request.labelTemplateId;
            this.projectId = request.projectId;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * LabelTemplateId.
         */
        public Builder labelTemplateId(String labelTemplateId) {
            this.putBodyParameter("LabelTemplateId", labelTemplateId);
            this.labelTemplateId = labelTemplateId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateTextLabelRequest build() {
            return new CreateTextLabelRequest(this);
        } 

    } 

}
