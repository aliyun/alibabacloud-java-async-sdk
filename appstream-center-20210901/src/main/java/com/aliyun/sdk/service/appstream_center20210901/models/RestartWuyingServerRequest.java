// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link RestartWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>RestartWuyingServerRequest</p>
 */
public class RestartWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
    private java.util.List<String> wuyingServerIdList;

    private RestartWuyingServerRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.wuyingServerIdList = builder.wuyingServerIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartWuyingServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return wuyingServerIdList
     */
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

    public static final class Builder extends Request.Builder<RestartWuyingServerRequest, Builder> {
        private String productType; 
        private java.util.List<String> wuyingServerIdList; 

        private Builder() {
            super();
        } 

        private Builder(RestartWuyingServerRequest request) {
            super(request);
            this.productType = request.productType;
            this.wuyingServerIdList = request.wuyingServerIdList;
        } 

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The list of workstation IDs.</p>
         */
        public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.putBodyParameter("WuyingServerIdList", wuyingServerIdList);
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }

        @Override
        public RestartWuyingServerRequest build() {
            return new RestartWuyingServerRequest(this);
        } 

    } 

}
