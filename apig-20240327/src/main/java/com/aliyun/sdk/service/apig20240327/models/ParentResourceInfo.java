// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ParentResourceInfo} extends {@link TeaModel}
 *
 * <p>ParentResourceInfo</p>
 */
public class ParentResourceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiInfo")
    private HttpApiApiInfo apiInfo;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private ParentResourceInfo(Builder builder) {
        this.apiInfo = builder.apiInfo;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParentResourceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiInfo
     */
    public HttpApiApiInfo getApiInfo() {
        return this.apiInfo;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private HttpApiApiInfo apiInfo; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(ParentResourceInfo model) {
            this.apiInfo = model.apiInfo;
            this.resourceType = model.resourceType;
        } 

        /**
         * apiInfo.
         */
        public Builder apiInfo(HttpApiApiInfo apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public ParentResourceInfo build() {
            return new ParentResourceInfo(this);
        } 

    } 

}
