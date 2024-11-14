// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RoadTrafficStatusRequest} extends {@link RequestModel}
 *
 * <p>RoadTrafficStatusRequest</p>
 */
public class RoadTrafficStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roadLevel")
    private String roadLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roadName")
    private String roadName;

    private RoadTrafficStatusRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.roadLevel = builder.roadLevel;
        this.roadName = builder.roadName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoadTrafficStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return roadLevel
     */
    public String getRoadLevel() {
        return this.roadLevel;
    }

    /**
     * @return roadName
     */
    public String getRoadName() {
        return this.roadName;
    }

    public static final class Builder extends Request.Builder<RoadTrafficStatusRequest, Builder> {
        private String city; 
        private String roadLevel; 
        private String roadName; 

        private Builder() {
            super();
        } 

        private Builder(RoadTrafficStatusRequest request) {
            super(request);
            this.city = request.city;
            this.roadLevel = request.roadLevel;
            this.roadName = request.roadName;
        } 

        /**
         * city.
         */
        public Builder city(String city) {
            this.putQueryParameter("city", city);
            this.city = city;
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
         * roadName.
         */
        public Builder roadName(String roadName) {
            this.putQueryParameter("roadName", roadName);
            this.roadName = roadName;
            return this;
        }

        @Override
        public RoadTrafficStatusRequest build() {
            return new RoadTrafficStatusRequest(this);
        } 

    } 

}
