// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateServiceRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRecordRequest</p>
 */
public class CreateServiceRecordRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordType;

    private CreateServiceRecordRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.serviceId = builder.serviceId;
        this.regionId = builder.regionId;
        this.recordContent = builder.recordContent;
        this.recordType = builder.recordType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return recordContent
     */
    public String getRecordContent() {
        return this.recordContent;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    public static final class Builder extends Request.Builder<CreateServiceRecordRequest, Builder> {
        private String workspace; 
        private String serviceId; 
        private String regionId; 
        private String recordContent; 
        private String recordType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRecordRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.serviceId = request.serviceId;
            this.regionId = request.regionId;
            this.recordContent = request.recordContent;
            this.recordType = request.recordType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>em87vd@c2e25bcfe0e21ce0***</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;project&quot;: &quot;proj-xtrace-16c988dcfe21fcb73c5e6f234927d998-cn-hangzhou&quot;,
         *   &quot;storeName&quot;: &quot;app-biz-log&quot;,
         *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;bindType&quot;: &quot;logstore&quot;,
         *   &quot;traceIdRelateField&quot;: &quot;&quot;
         * }</p>
         */
        public Builder recordContent(String recordContent) {
            this.putBodyParameter("recordContent", recordContent);
            this.recordContent = recordContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logCorrelation</p>
         */
        public Builder recordType(String recordType) {
            this.putBodyParameter("recordType", recordType);
            this.recordType = recordType;
            return this;
        }

        @Override
        public CreateServiceRecordRequest build() {
            return new CreateServiceRecordRequest(this);
        } 

    } 

}
