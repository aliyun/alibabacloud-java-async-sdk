// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActiveAppsRequest} extends {@link RequestModel}
 *
 * <p>ListActiveAppsRequest</p>
 */
public class ListActiveAppsRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppType")
    @Validation(maximum = 2147483647)
    private Integer appType;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private ListActiveAppsRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appType = builder.appType;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActiveAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<ListActiveAppsRequest, Builder> {
        private String ahasRegionId; 
        private Integer appType; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListActiveAppsRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appType = response.appType;
            this.namespace = response.namespace;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public ListActiveAppsRequest build() {
            return new ListActiveAppsRequest(this);
        } 

    } 

}
