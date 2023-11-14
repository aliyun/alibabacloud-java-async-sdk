// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerScanTaskByAppNameRequest} extends {@link RequestModel}
 *
 * <p>CreateContainerScanTaskByAppNameRequest</p>
 */
public class CreateContainerScanTaskByAppNameRequest extends Request {
    @Query
    @NameInMap("AppNames")
    private String appNames;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private CreateContainerScanTaskByAppNameRequest(Builder builder) {
        super(builder);
        this.appNames = builder.appNames;
        this.clusterId = builder.clusterId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerScanTaskByAppNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appNames
     */
    public String getAppNames() {
        return this.appNames;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreateContainerScanTaskByAppNameRequest, Builder> {
        private String appNames; 
        private String clusterId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreateContainerScanTaskByAppNameRequest request) {
            super(request);
            this.appNames = request.appNames;
            this.clusterId = request.clusterId;
            this.lang = request.lang;
        } 

        /**
         * The name of the container application.
         */
        public Builder appNames(String appNames) {
            this.putQueryParameter("AppNames", appNames);
            this.appNames = appNames;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The language of the content within the request and response.
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public CreateContainerScanTaskByAppNameRequest build() {
            return new CreateContainerScanTaskByAppNameRequest(this);
        } 

    } 

}
