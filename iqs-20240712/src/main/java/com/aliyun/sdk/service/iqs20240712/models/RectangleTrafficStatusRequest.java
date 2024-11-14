// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RectangleTrafficStatusRequest} extends {@link RequestModel}
 *
 * <p>RectangleTrafficStatusRequest</p>
 */
public class RectangleTrafficStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lowerLeftLatitude")
    private String lowerLeftLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lowerLeftLongitude")
    private String lowerLeftLongitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roadLevel")
    private String roadLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("upperRightLatitude")
    private String upperRightLatitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("upperRightLongitude")
    private String upperRightLongitude;

    private RectangleTrafficStatusRequest(Builder builder) {
        super(builder);
        this.lowerLeftLatitude = builder.lowerLeftLatitude;
        this.lowerLeftLongitude = builder.lowerLeftLongitude;
        this.roadLevel = builder.roadLevel;
        this.upperRightLatitude = builder.upperRightLatitude;
        this.upperRightLongitude = builder.upperRightLongitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RectangleTrafficStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lowerLeftLatitude
     */
    public String getLowerLeftLatitude() {
        return this.lowerLeftLatitude;
    }

    /**
     * @return lowerLeftLongitude
     */
    public String getLowerLeftLongitude() {
        return this.lowerLeftLongitude;
    }

    /**
     * @return roadLevel
     */
    public String getRoadLevel() {
        return this.roadLevel;
    }

    /**
     * @return upperRightLatitude
     */
    public String getUpperRightLatitude() {
        return this.upperRightLatitude;
    }

    /**
     * @return upperRightLongitude
     */
    public String getUpperRightLongitude() {
        return this.upperRightLongitude;
    }

    public static final class Builder extends Request.Builder<RectangleTrafficStatusRequest, Builder> {
        private String lowerLeftLatitude; 
        private String lowerLeftLongitude; 
        private String roadLevel; 
        private String upperRightLatitude; 
        private String upperRightLongitude; 

        private Builder() {
            super();
        } 

        private Builder(RectangleTrafficStatusRequest request) {
            super(request);
            this.lowerLeftLatitude = request.lowerLeftLatitude;
            this.lowerLeftLongitude = request.lowerLeftLongitude;
            this.roadLevel = request.roadLevel;
            this.upperRightLatitude = request.upperRightLatitude;
            this.upperRightLongitude = request.upperRightLongitude;
        } 

        /**
         * lowerLeftLatitude.
         */
        public Builder lowerLeftLatitude(String lowerLeftLatitude) {
            this.putQueryParameter("lowerLeftLatitude", lowerLeftLatitude);
            this.lowerLeftLatitude = lowerLeftLatitude;
            return this;
        }

        /**
         * lowerLeftLongitude.
         */
        public Builder lowerLeftLongitude(String lowerLeftLongitude) {
            this.putQueryParameter("lowerLeftLongitude", lowerLeftLongitude);
            this.lowerLeftLongitude = lowerLeftLongitude;
            return this;
        }

        /**
         * roadLevel.
         */
        public Builder roadLevel(String roadLevel) {
            this.putQueryParameter("roadLevel", roadLevel);
            this.roadLevel = roadLevel;
            return this;
        }

        /**
         * upperRightLatitude.
         */
        public Builder upperRightLatitude(String upperRightLatitude) {
            this.putQueryParameter("upperRightLatitude", upperRightLatitude);
            this.upperRightLatitude = upperRightLatitude;
            return this;
        }

        /**
         * upperRightLongitude.
         */
        public Builder upperRightLongitude(String upperRightLongitude) {
            this.putQueryParameter("upperRightLongitude", upperRightLongitude);
            this.upperRightLongitude = upperRightLongitude;
            return this;
        }

        @Override
        public RectangleTrafficStatusRequest build() {
            return new RectangleTrafficStatusRequest(this);
        } 

    } 

}
