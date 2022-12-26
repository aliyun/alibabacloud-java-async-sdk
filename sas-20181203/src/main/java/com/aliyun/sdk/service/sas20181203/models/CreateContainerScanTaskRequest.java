// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateContainerScanTaskRequest</p>
 */
public class CreateContainerScanTaskRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ContainerIds")
    private String containerIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    private CreateContainerScanTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerIds = builder.containerIds;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerIds
     */
    public String getContainerIds() {
        return this.containerIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreateContainerScanTaskRequest, Builder> {
        private String clusterId; 
        private String containerIds; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreateContainerScanTaskRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerIds = request.containerIds;
            this.lang = request.lang;
        } 

        /**
         * 集群id
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ContainerIds.
         */
        public Builder containerIds(String containerIds) {
            this.putQueryParameter("ContainerIds", containerIds);
            this.containerIds = containerIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public CreateContainerScanTaskRequest build() {
            return new CreateContainerScanTaskRequest(this);
        } 

    } 

}
