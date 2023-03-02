// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceGroupRequest</p>
 */
public class ListDeviceGroupRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("Num")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListDeviceGroupRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.num = builder.num;
        this.productKey = builder.productKey;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDeviceGroupRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private Integer num; 
        private String productKey; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceGroupRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.num = request.num;
            this.productKey = request.productKey;
            this.size = request.size;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * Num.
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDeviceGroupRequest build() {
            return new ListDeviceGroupRequest(this);
        } 

    } 

}
