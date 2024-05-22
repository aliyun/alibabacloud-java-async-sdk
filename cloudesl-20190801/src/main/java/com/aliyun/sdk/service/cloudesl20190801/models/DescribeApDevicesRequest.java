// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApDevicesRequest</p>
 */
public class DescribeApDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Activated")
    private Boolean activated;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApMac")
    private String apMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DescribeApDevicesRequest(Builder builder) {
        super(builder);
        this.activated = builder.activated;
        this.apMac = builder.apMac;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activated
     */
    public Boolean getActivated() {
        return this.activated;
    }

    /**
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DescribeApDevicesRequest, Builder> {
        private Boolean activated; 
        private String apMac; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApDevicesRequest request) {
            super(request);
            this.activated = request.activated;
            this.apMac = request.apMac;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
        } 

        /**
         * Activated.
         */
        public Builder activated(Boolean activated) {
            this.putBodyParameter("Activated", activated);
            this.activated = activated;
            return this;
        }

        /**
         * ApMac.
         */
        public Builder apMac(String apMac) {
            this.putBodyParameter("ApMac", apMac);
            this.apMac = apMac;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public DescribeApDevicesRequest build() {
            return new DescribeApDevicesRequest(this);
        } 

    } 

}
