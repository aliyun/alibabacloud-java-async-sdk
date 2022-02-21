// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request</p>
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("QRCodeType")
    @Validation(required = true)
    private String QRCodeType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.QRCodeType = builder.QRCodeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
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
     * @return QRCodeType
     */
    public String getQRCodeType() {
        return this.QRCodeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request, Builder> {
        private String antChainId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String QRCodeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request response) {
            super(response);
            this.antChainId = response.antChainId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.QRCodeType = response.QRCodeType;
            this.regionId = response.regionId;
        } 

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
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
         * QRCodeType.
         */
        public Builder QRCodeType(String QRCodeType) {
            this.putBodyParameter("QRCodeType", QRCodeType);
            this.QRCodeType = QRCodeType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request build() {
            return new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request(this);
        } 

    } 

}
