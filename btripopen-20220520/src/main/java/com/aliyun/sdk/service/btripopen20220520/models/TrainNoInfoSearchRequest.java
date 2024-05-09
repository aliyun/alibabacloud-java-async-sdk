// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainNoInfoSearchRequest} extends {@link RequestModel}
 *
 * <p>TrainNoInfoSearchRequest</p>
 */
public class TrainNoInfoSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arr_location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("line_key")
    private String lineKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("middle_date")
    private String middleDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("middle_station")
    private String middleStation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("train_no")
    private String trainNo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainNoInfoSearchRequest(Builder builder) {
        super(builder);
        this.arrLocation = builder.arrLocation;
        this.depDate = builder.depDate;
        this.depLocation = builder.depLocation;
        this.lineKey = builder.lineKey;
        this.middleDate = builder.middleDate;
        this.middleStation = builder.middleStation;
        this.orderId = builder.orderId;
        this.trainNo = builder.trainNo;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainNoInfoSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrLocation
     */
    public String getArrLocation() {
        return this.arrLocation;
    }

    /**
     * @return depDate
     */
    public String getDepDate() {
        return this.depDate;
    }

    /**
     * @return depLocation
     */
    public String getDepLocation() {
        return this.depLocation;
    }

    /**
     * @return lineKey
     */
    public String getLineKey() {
        return this.lineKey;
    }

    /**
     * @return middleDate
     */
    public String getMiddleDate() {
        return this.middleDate;
    }

    /**
     * @return middleStation
     */
    public String getMiddleStation() {
        return this.middleStation;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return trainNo
     */
    public String getTrainNo() {
        return this.trainNo;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainNoInfoSearchRequest, Builder> {
        private String arrLocation; 
        private String depDate; 
        private String depLocation; 
        private String lineKey; 
        private String middleDate; 
        private String middleStation; 
        private String orderId; 
        private String trainNo; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainNoInfoSearchRequest request) {
            super(request);
            this.arrLocation = request.arrLocation;
            this.depDate = request.depDate;
            this.depLocation = request.depLocation;
            this.lineKey = request.lineKey;
            this.middleDate = request.middleDate;
            this.middleStation = request.middleStation;
            this.orderId = request.orderId;
            this.trainNo = request.trainNo;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * arr_location.
         */
        public Builder arrLocation(String arrLocation) {
            this.putBodyParameter("arr_location", arrLocation);
            this.arrLocation = arrLocation;
            return this;
        }

        /**
         * dep_date.
         */
        public Builder depDate(String depDate) {
            this.putBodyParameter("dep_date", depDate);
            this.depDate = depDate;
            return this;
        }

        /**
         * dep_location.
         */
        public Builder depLocation(String depLocation) {
            this.putBodyParameter("dep_location", depLocation);
            this.depLocation = depLocation;
            return this;
        }

        /**
         * line_key.
         */
        public Builder lineKey(String lineKey) {
            this.putBodyParameter("line_key", lineKey);
            this.lineKey = lineKey;
            return this;
        }

        /**
         * middle_date.
         */
        public Builder middleDate(String middleDate) {
            this.putBodyParameter("middle_date", middleDate);
            this.middleDate = middleDate;
            return this;
        }

        /**
         * middle_station.
         */
        public Builder middleStation(String middleStation) {
            this.putBodyParameter("middle_station", middleStation);
            this.middleStation = middleStation;
            return this;
        }

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * train_no.
         */
        public Builder trainNo(String trainNo) {
            this.putBodyParameter("train_no", trainNo);
            this.trainNo = trainNo;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TrainNoInfoSearchRequest build() {
            return new TrainNoInfoSearchRequest(this);
        } 

    } 

}
