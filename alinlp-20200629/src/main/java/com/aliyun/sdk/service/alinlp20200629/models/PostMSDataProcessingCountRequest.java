// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSDataProcessingCountRequest} extends {@link RequestModel}
 *
 * <p>PostMSDataProcessingCountRequest</p>
 */
public class PostMSDataProcessingCountRequest extends Request {
    @Body
    @NameInMap("DataIds")
    private java.util.List < String > dataIds;

    @Body
    @NameInMap("DataImportId")
    private Long dataImportId;

    @Body
    @NameInMap("ServiceId")
    private Long serviceId;

    private PostMSDataProcessingCountRequest(Builder builder) {
        super(builder);
        this.dataIds = builder.dataIds;
        this.dataImportId = builder.dataImportId;
        this.serviceId = builder.serviceId;
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

    public static final class Builder extends Request.Builder<PostMSDataProcessingCountRequest, Builder> {
        private java.util.List < String > dataIds; 
        private Long dataImportId; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(PostMSDataProcessingCountRequest request) {
            super(request);
            this.dataIds = request.dataIds;
            this.dataImportId = request.dataImportId;
            this.serviceId = request.serviceId;
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

        @Override
        public PostMSDataProcessingCountRequest build() {
            return new PostMSDataProcessingCountRequest(this);
        } 

    } 

}
