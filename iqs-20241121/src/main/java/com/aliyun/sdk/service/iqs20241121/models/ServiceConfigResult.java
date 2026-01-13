// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ServiceConfigResult} extends {@link TeaModel}
 *
 * <p>ServiceConfigResult</p>
 */
public class ServiceConfigResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("poiSearchTotalQuota")
    private String poiSearchTotalQuota;

    @com.aliyun.core.annotation.NameInMap("poiSearchUsedQuota")
    private String poiSearchUsedQuota;

    @com.aliyun.core.annotation.NameInMap("searchTotalQuota")
    private String searchTotalQuota;

    @com.aliyun.core.annotation.NameInMap("searchUsedQuota")
    private String searchUsedQuota;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ServiceConfigResult(Builder builder) {
        this.poiSearchTotalQuota = builder.poiSearchTotalQuota;
        this.poiSearchUsedQuota = builder.poiSearchUsedQuota;
        this.searchTotalQuota = builder.searchTotalQuota;
        this.searchUsedQuota = builder.searchUsedQuota;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceConfigResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return poiSearchTotalQuota
     */
    public String getPoiSearchTotalQuota() {
        return this.poiSearchTotalQuota;
    }

    /**
     * @return poiSearchUsedQuota
     */
    public String getPoiSearchUsedQuota() {
        return this.poiSearchUsedQuota;
    }

    /**
     * @return searchTotalQuota
     */
    public String getSearchTotalQuota() {
        return this.searchTotalQuota;
    }

    /**
     * @return searchUsedQuota
     */
    public String getSearchUsedQuota() {
        return this.searchUsedQuota;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String poiSearchTotalQuota; 
        private String poiSearchUsedQuota; 
        private String searchTotalQuota; 
        private String searchUsedQuota; 
        private String status; 

        private Builder() {
        } 

        private Builder(ServiceConfigResult model) {
            this.poiSearchTotalQuota = model.poiSearchTotalQuota;
            this.poiSearchUsedQuota = model.poiSearchUsedQuota;
            this.searchTotalQuota = model.searchTotalQuota;
            this.searchUsedQuota = model.searchUsedQuota;
            this.status = model.status;
        } 

        /**
         * poiSearchTotalQuota.
         */
        public Builder poiSearchTotalQuota(String poiSearchTotalQuota) {
            this.poiSearchTotalQuota = poiSearchTotalQuota;
            return this;
        }

        /**
         * poiSearchUsedQuota.
         */
        public Builder poiSearchUsedQuota(String poiSearchUsedQuota) {
            this.poiSearchUsedQuota = poiSearchUsedQuota;
            return this;
        }

        /**
         * searchTotalQuota.
         */
        public Builder searchTotalQuota(String searchTotalQuota) {
            this.searchTotalQuota = searchTotalQuota;
            return this;
        }

        /**
         * searchUsedQuota.
         */
        public Builder searchUsedQuota(String searchUsedQuota) {
            this.searchUsedQuota = searchUsedQuota;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ServiceConfigResult build() {
            return new ServiceConfigResult(this);
        } 

    } 

}
