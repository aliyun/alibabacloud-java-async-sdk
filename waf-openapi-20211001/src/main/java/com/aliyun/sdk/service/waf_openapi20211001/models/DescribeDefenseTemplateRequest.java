// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseTemplateRequest</p>
 */
public class DescribeDefenseTemplateRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private DescribeDefenseTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseTemplateRequest, Builder> {
        private String instanceId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeDefenseTemplateRequest build() {
            return new DescribeDefenseTemplateRequest(this);
        } 

    } 

}
