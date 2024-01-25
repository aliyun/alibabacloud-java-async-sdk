// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApDevicesRequest</p>
 */
public class DescribeApDevicesRequest extends Request {
    @Body
    @NameInMap("ApMac")
    private String apMac;

    @Body
    @NameInMap("BeActivate")
    private Boolean beActivate;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("Model")
    private String model;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Status")
    private Boolean status;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private DescribeApDevicesRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.beActivate = builder.beActivate;
        this.extraParams = builder.extraParams;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
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
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
    }

    /**
     * @return beActivate
     */
    public Boolean getBeActivate() {
        return this.beActivate;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
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
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DescribeApDevicesRequest, Builder> {
        private String apMac; 
        private Boolean beActivate; 
        private String extraParams; 
        private String model; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean status; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApDevicesRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.beActivate = request.beActivate;
            this.extraParams = request.extraParams;
            this.model = request.model;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.storeId = request.storeId;
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
         * BeActivate.
         */
        public Builder beActivate(Boolean beActivate) {
            this.putBodyParameter("BeActivate", beActivate);
            this.beActivate = beActivate;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
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
         * Status.
         */
        public Builder status(Boolean status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
