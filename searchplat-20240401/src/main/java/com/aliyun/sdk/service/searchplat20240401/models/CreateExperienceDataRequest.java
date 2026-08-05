// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link CreateExperienceDataRequest} extends {@link RequestModel}
 *
 * <p>CreateExperienceDataRequest</p>
 */
public class CreateExperienceDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataValue")
    private String dataValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateExperienceDataRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.dataType = builder.dataType;
        this.dataValue = builder.dataValue;
        this.name = builder.name;
        this.serviceType = builder.serviceType;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperienceDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return dataValue
     */
    public String getDataValue() {
        return this.dataValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateExperienceDataRequest, Builder> {
        private String workspaceName; 
        private String contentType; 
        private Long dataSize; 
        private String dataType; 
        private String dataValue; 
        private String name; 
        private String serviceType; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperienceDataRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.contentType = request.contentType;
            this.dataSize = request.dataSize;
            this.dataType = request.dataType;
            this.dataValue = request.dataValue;
            this.name = request.name;
            this.serviceType = request.serviceType;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * dataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.putBodyParameter("dataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * dataValue.
         */
        public Builder dataValue(String dataValue) {
            this.putBodyParameter("dataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateExperienceDataRequest build() {
            return new CreateExperienceDataRequest(this);
        } 

    } 

}
