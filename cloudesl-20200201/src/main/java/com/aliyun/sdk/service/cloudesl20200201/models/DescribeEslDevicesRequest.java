// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEslDevicesRequest</p>
 */
public class DescribeEslDevicesRequest extends Request {
    @Body
    @NameInMap("EslBarCode")
    private String eslBarCode;

    @Body
    @NameInMap("EslStatus")
    private String eslStatus;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("FromBatteryLevel")
    private Integer fromBatteryLevel;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("ToBatteryLevel")
    private Integer toBatteryLevel;

    @Body
    @NameInMap("Type")
    private String type;

    private DescribeEslDevicesRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.eslStatus = builder.eslStatus;
        this.extraParams = builder.extraParams;
        this.fromBatteryLevel = builder.fromBatteryLevel;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.toBatteryLevel = builder.toBatteryLevel;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return eslStatus
     */
    public String getEslStatus() {
        return this.eslStatus;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return fromBatteryLevel
     */
    public Integer getFromBatteryLevel() {
        return this.fromBatteryLevel;
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

    /**
     * @return toBatteryLevel
     */
    public Integer getToBatteryLevel() {
        return this.toBatteryLevel;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeEslDevicesRequest, Builder> {
        private String eslBarCode; 
        private String eslStatus; 
        private String extraParams; 
        private Integer fromBatteryLevel; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 
        private Integer toBatteryLevel; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEslDevicesRequest response) {
            super(response);
            this.eslBarCode = response.eslBarCode;
            this.eslStatus = response.eslStatus;
            this.extraParams = response.extraParams;
            this.fromBatteryLevel = response.fromBatteryLevel;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.storeId = response.storeId;
            this.toBatteryLevel = response.toBatteryLevel;
            this.type = response.type;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
        }

        /**
         * EslStatus.
         */
        public Builder eslStatus(String eslStatus) {
            this.putBodyParameter("EslStatus", eslStatus);
            this.eslStatus = eslStatus;
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
         * FromBatteryLevel.
         */
        public Builder fromBatteryLevel(Integer fromBatteryLevel) {
            this.putBodyParameter("FromBatteryLevel", fromBatteryLevel);
            this.fromBatteryLevel = fromBatteryLevel;
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

        /**
         * ToBatteryLevel.
         */
        public Builder toBatteryLevel(Integer toBatteryLevel) {
            this.putBodyParameter("ToBatteryLevel", toBatteryLevel);
            this.toBatteryLevel = toBatteryLevel;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEslDevicesRequest build() {
            return new DescribeEslDevicesRequest(this);
        } 

    } 

}
