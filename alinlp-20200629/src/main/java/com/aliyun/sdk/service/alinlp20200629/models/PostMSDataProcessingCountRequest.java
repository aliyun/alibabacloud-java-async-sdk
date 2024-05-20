// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSDataProcessingCountRequest} extends {@link RequestModel}
 *
 * <p>PostMSDataProcessingCountRequest</p>
 */
public class PostMSDataProcessingCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIds")
    private java.util.List < String > dataIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataImportId")
    private Long dataImportId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("X-DashScope-OpenAPISource")
    private String xDashScopeOpenAPISource;

    private PostMSDataProcessingCountRequest(Builder builder) {
        super(builder);
        this.dataIds = builder.dataIds;
        this.dataImportId = builder.dataImportId;
        this.serviceId = builder.serviceId;
        this.xDashScopeOpenAPISource = builder.xDashScopeOpenAPISource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostMSDataProcessingCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIds
     */
    public java.util.List < String > getDataIds() {
        return this.dataIds;
    }

    /**
     * @return dataImportId
     */
    public Long getDataImportId() {
        return this.dataImportId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return xDashScopeOpenAPISource
     */
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

    public static final class Builder extends Request.Builder<PostMSDataProcessingCountRequest, Builder> {
        private java.util.List < String > dataIds; 
        private Long dataImportId; 
        private Long serviceId; 
        private String xDashScopeOpenAPISource; 

        private Builder() {
            super();
        } 

        private Builder(PostMSDataProcessingCountRequest request) {
            super(request);
            this.dataIds = request.dataIds;
            this.dataImportId = request.dataImportId;
            this.serviceId = request.serviceId;
            this.xDashScopeOpenAPISource = request.xDashScopeOpenAPISource;
        } 

        /**
         * DataIds.
         */
        public Builder dataIds(java.util.List < String > dataIds) {
            String dataIdsShrink = shrink(dataIds, "DataIds", "json");
            this.putBodyParameter("DataIds", dataIdsShrink);
            this.dataIds = dataIds;
            return this;
        }

        /**
         * DataImportId.
         */
        public Builder dataImportId(Long dataImportId) {
            this.putBodyParameter("DataImportId", dataImportId);
            this.dataImportId = dataImportId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * X-DashScope-OpenAPISource.
         */
        public Builder xDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
            this.putBodyParameter("X-DashScope-OpenAPISource", xDashScopeOpenAPISource);
            this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
            return this;
        }

        @Override
        public PostMSDataProcessingCountRequest build() {
            return new PostMSDataProcessingCountRequest(this);
        } 

    } 

}
