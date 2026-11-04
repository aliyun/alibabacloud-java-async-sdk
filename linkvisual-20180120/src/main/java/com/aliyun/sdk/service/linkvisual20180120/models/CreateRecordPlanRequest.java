// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link CreateRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateRecordPlanRequest</p>
 */
public class CreateRecordPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private CreateRecordPlanRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecordPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateRecordPlanRequest, Builder> {
        private String name; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecordPlanRequest request) {
            super(request);
            this.name = request.name;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The name of the recording plan.</p>
         * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the time template for the recording plan. You can call the <a href="https://help.aliyun.com/document_detail/107888.html">CreateTimeTemplate</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36f06322442e4e3f85a5ae8862c9****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateRecordPlanRequest build() {
            return new CreateRecordPlanRequest(this);
        } 

    } 

}
