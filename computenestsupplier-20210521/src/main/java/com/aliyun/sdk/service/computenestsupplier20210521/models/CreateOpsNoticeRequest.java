// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link CreateOpsNoticeRequest} extends {@link RequestModel}
 *
 * <p>CreateOpsNoticeRequest</p>
 */
public class CreateOpsNoticeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, ?> attributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private java.util.List<String> serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solutions")
    private String solutions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateOpsNoticeRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.severity = builder.severity;
        this.solutions = builder.solutions;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpsNoticeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public java.util.List<String> getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return solutions
     */
    public String getSolutions() {
        return this.solutions;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateOpsNoticeRequest, Builder> {
        private java.util.Map<String, ?> attributes; 
        private String category; 
        private String clientToken; 
        private String content; 
        private String regionId; 
        private String serviceId; 
        private java.util.List<String> serviceVersion; 
        private String severity; 
        private String solutions; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateOpsNoticeRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.severity = request.severity;
            this.solutions = request.solutions;
            this.type = request.type;
        } 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map<String, ?> attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putQueryParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Availability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(java.util.List<String> serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * Solutions.
         */
        public Builder solutions(String solutions) {
            this.putQueryParameter("Solutions", solutions);
            this.solutions = solutions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceUpgrade</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateOpsNoticeRequest build() {
            return new CreateOpsNoticeRequest(this);
        } 

    } 

}
