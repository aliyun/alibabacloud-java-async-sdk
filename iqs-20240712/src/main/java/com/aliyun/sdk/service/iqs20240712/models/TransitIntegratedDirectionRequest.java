// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link TransitIntegratedDirectionRequest} extends {@link RequestModel}
 *
 * <p>TransitIntegratedDirectionRequest</p>
 */
public class TransitIntegratedDirectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("destinationCity")
    private String destinationCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("destinationLatitude")
    private String destinationLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("destinationLongitude")
    private String destinationLongitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("originCity")
    private String originCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("originLatitude")
    private String originLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("originLongitude")
    private String originLongitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showPolyline")
    private Boolean showPolyline;

    private TransitIntegratedDirectionRequest(Builder builder) {
        super(builder);
        this.destinationCity = builder.destinationCity;
        this.destinationLatitude = builder.destinationLatitude;
        this.destinationLongitude = builder.destinationLongitude;
        this.originCity = builder.originCity;
        this.originLatitude = builder.originLatitude;
        this.originLongitude = builder.originLongitude;
        this.showPolyline = builder.showPolyline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransitIntegratedDirectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCity
     */
    public String getDestinationCity() {
        return this.destinationCity;
    }

    /**
     * @return destinationLatitude
     */
    public String getDestinationLatitude() {
        return this.destinationLatitude;
    }

    /**
     * @return destinationLongitude
     */
    public String getDestinationLongitude() {
        return this.destinationLongitude;
    }

    /**
     * @return originCity
     */
    public String getOriginCity() {
        return this.originCity;
    }

    /**
     * @return originLatitude
     */
    public String getOriginLatitude() {
        return this.originLatitude;
    }

    /**
     * @return originLongitude
     */
    public String getOriginLongitude() {
        return this.originLongitude;
    }

    /**
     * @return showPolyline
     */
    public Boolean getShowPolyline() {
        return this.showPolyline;
    }

    public static final class Builder extends Request.Builder<TransitIntegratedDirectionRequest, Builder> {
        private String destinationCity; 
        private String destinationLatitude; 
        private String destinationLongitude; 
        private String originCity; 
        private String originLatitude; 
        private String originLongitude; 
        private Boolean showPolyline; 

        private Builder() {
            super();
        } 

        private Builder(TransitIntegratedDirectionRequest request) {
            super(request);
            this.destinationCity = request.destinationCity;
            this.destinationLatitude = request.destinationLatitude;
            this.destinationLongitude = request.destinationLongitude;
            this.originCity = request.originCity;
            this.originLatitude = request.originLatitude;
            this.originLongitude = request.originLongitude;
            this.showPolyline = request.showPolyline;
        } 

        /**
         * destinationCity.
         */
        public Builder destinationCity(String destinationCity) {
            this.putQueryParameter("destinationCity", destinationCity);
            this.destinationCity = destinationCity;
            return this;
        }

        /**
         * destinationLatitude.
         */
        public Builder destinationLatitude(String destinationLatitude) {
            this.putQueryParameter("destinationLatitude", destinationLatitude);
            this.destinationLatitude = destinationLatitude;
            return this;
        }

        /**
         * destinationLongitude.
         */
        public Builder destinationLongitude(String destinationLongitude) {
            this.putQueryParameter("destinationLongitude", destinationLongitude);
            this.destinationLongitude = destinationLongitude;
            return this;
        }

        /**
         * originCity.
         */
        public Builder originCity(String originCity) {
            this.putQueryParameter("originCity", originCity);
            this.originCity = originCity;
            return this;
        }

        /**
         * originLatitude.
         */
        public Builder originLatitude(String originLatitude) {
            this.putQueryParameter("originLatitude", originLatitude);
            this.originLatitude = originLatitude;
            return this;
        }

        /**
         * originLongitude.
         */
        public Builder originLongitude(String originLongitude) {
            this.putQueryParameter("originLongitude", originLongitude);
            this.originLongitude = originLongitude;
            return this;
        }

        /**
         * showPolyline.
         */
        public Builder showPolyline(Boolean showPolyline) {
            this.putQueryParameter("showPolyline", showPolyline);
            this.showPolyline = showPolyline;
            return this;
        }

        @Override
        public TransitIntegratedDirectionRequest build() {
            return new TransitIntegratedDirectionRequest(this);
        } 

    } 

}
