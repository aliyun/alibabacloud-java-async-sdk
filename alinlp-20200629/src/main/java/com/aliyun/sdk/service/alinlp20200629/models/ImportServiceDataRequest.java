// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportServiceDataRequest} extends {@link RequestModel}
 *
 * <p>ImportServiceDataRequest</p>
 */
public class ImportServiceDataRequest extends Request {
    @Body
    @NameInMap("Partition")
    private java.util.List < java.util.Map<String, String>> partition;

    @Body
    @NameInMap("ServiceId")
    @Validation(required = true)
    private Long serviceId;

    @Body
    @NameInMap("SubPath")
    private String subPath;

    @Body
    @NameInMap("Url")
    private String url;

    private ImportServiceDataRequest(Builder builder) {
        super(builder);
        this.partition = builder.partition;
        this.serviceId = builder.serviceId;
        this.subPath = builder.subPath;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportServiceDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return partition
     */
    public java.util.List < java.util.Map<String, String>> getPartition() {
        return this.partition;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return subPath
     */
    public String getSubPath() {
        return this.subPath;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<ImportServiceDataRequest, Builder> {
        private java.util.List < java.util.Map<String, String>> partition; 
        private Long serviceId; 
        private String subPath; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(ImportServiceDataRequest request) {
            super(request);
            this.partition = request.partition;
            this.serviceId = request.serviceId;
            this.subPath = request.subPath;
            this.url = request.url;
        } 

        /**
         * Partition.
         */
        public Builder partition(java.util.List < java.util.Map<String, String>> partition) {
            String partitionShrink = shrink(partition, "Partition", "json");
            this.putBodyParameter("Partition", partitionShrink);
            this.partition = partition;
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
         * SubPath.
         */
        public Builder subPath(String subPath) {
            this.putBodyParameter("SubPath", subPath);
            this.subPath = subPath;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public ImportServiceDataRequest build() {
            return new ImportServiceDataRequest(this);
        } 

    } 

}
