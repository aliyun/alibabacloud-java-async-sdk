// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiearth_meteorology20210928.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GridQueryRequest} extends {@link RequestModel}
 *
 * <p>GridQueryRequest</p>
 */
public class GridQueryRequest extends Request {
    @Path
    @NameInMap("dataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("element")
    @Validation(required = true)
    private String element;

    @Query
    @NameInMap("forecastTimestamp")
    private String forecastTimestamp;

    @Query
    @NameInMap("latitude")
    @Validation(required = true)
    private Double latitude;

    @Query
    @NameInMap("longitude")
    @Validation(required = true)
    private Double longitude;

    @Query
    @NameInMap("pageNo")
    private Integer pageNo;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("product")
    @Validation(required = true)
    private String product;

    @Query
    @NameInMap("reportTimestamp")
    private String reportTimestamp;

    private GridQueryRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.element = builder.element;
        this.forecastTimestamp = builder.forecastTimestamp;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.reportTimestamp = builder.reportTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GridQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return element
     */
    public String getElement() {
        return this.element;
    }

    /**
     * @return forecastTimestamp
     */
    public String getForecastTimestamp() {
        return this.forecastTimestamp;
    }

    /**
     * @return latitude
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return reportTimestamp
     */
    public String getReportTimestamp() {
        return this.reportTimestamp;
    }

    public static final class Builder extends Request.Builder<GridQueryRequest, Builder> {
        private String dataType; 
        private String element; 
        private String forecastTimestamp; 
        private Double latitude; 
        private Double longitude; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String product; 
        private String reportTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(GridQueryRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.element = request.element;
            this.forecastTimestamp = request.forecastTimestamp;
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.reportTimestamp = request.reportTimestamp;
        } 

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putPathParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * element.
         */
        public Builder element(String element) {
            this.putQueryParameter("element", element);
            this.element = element;
            return this;
        }

        /**
         * forecastTimestamp.
         */
        public Builder forecastTimestamp(String forecastTimestamp) {
            this.putQueryParameter("forecastTimestamp", forecastTimestamp);
            this.forecastTimestamp = forecastTimestamp;
            return this;
        }

        /**
         * latitude.
         */
        public Builder latitude(Double latitude) {
            this.putQueryParameter("latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * longitude.
         */
        public Builder longitude(Double longitude) {
            this.putQueryParameter("longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * pageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("pageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * product.
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        /**
         * reportTimestamp.
         */
        public Builder reportTimestamp(String reportTimestamp) {
            this.putQueryParameter("reportTimestamp", reportTimestamp);
            this.reportTimestamp = reportTimestamp;
            return this;
        }

        @Override
        public GridQueryRequest build() {
            return new GridQueryRequest(this);
        } 

    } 

}
