// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TrainStopoverSearchRequest} extends {@link RequestModel}
 *
 * <p>TrainStopoverSearchRequest</p>
 */
public class TrainStopoverSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arr_station")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrStation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dep_station")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depStation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("train_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("train_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainNo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainStopoverSearchRequest(Builder builder) {
        super(builder);
        this.arrStation = builder.arrStation;
        this.depStation = builder.depStation;
        this.trainDate = builder.trainDate;
        this.trainNo = builder.trainNo;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainStopoverSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrStation
     */
    public String getArrStation() {
        return this.arrStation;
    }

    /**
     * @return depStation
     */
    public String getDepStation() {
        return this.depStation;
    }

    /**
     * @return trainDate
     */
    public String getTrainDate() {
        return this.trainDate;
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

    public static final class Builder extends Request.Builder<TrainStopoverSearchRequest, Builder> {
        private String arrStation; 
        private String depStation; 
        private String trainDate; 
        private String trainNo; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainStopoverSearchRequest request) {
            super(request);
            this.arrStation = request.arrStation;
            this.depStation = request.depStation;
            this.trainDate = request.trainDate;
            this.trainNo = request.trainNo;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder arrStation(String arrStation) {
            this.putBodyParameter("arr_station", arrStation);
            this.arrStation = arrStation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder depStation(String depStation) {
            this.putBodyParameter("dep_station", depStation);
            this.depStation = depStation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-08</p>
         */
        public Builder trainDate(String trainDate) {
            this.putBodyParameter("train_date", trainDate);
            this.trainDate = trainDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k2345</p>
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
        public TrainStopoverSearchRequest build() {
            return new TrainStopoverSearchRequest(this);
        } 

    } 

}
