// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ReserveMovieSeatRequest} extends {@link RequestModel}
 *
 * <p>ReserveMovieSeatRequest</p>
 */
public class ReserveMovieSeatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scheduleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatNames;

    private ReserveMovieSeatRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.extJson = builder.extJson;
        this.mobile = builder.mobile;
        this.scheduleId = builder.scheduleId;
        this.seatIds = builder.seatIds;
        this.seatNames = builder.seatNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveMovieSeatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return scheduleId
     */
    public Long getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return seatIds
     */
    public String getSeatIds() {
        return this.seatIds;
    }

    /**
     * @return seatNames
     */
    public String getSeatNames() {
        return this.seatNames;
    }

    public static final class Builder extends Request.Builder<ReserveMovieSeatRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String extJson; 
        private String mobile; 
        private Long scheduleId; 
        private String seatIds; 
        private String seatNames; 

        private Builder() {
            super();
        } 

        private Builder(ReserveMovieSeatRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.extJson = request.extJson;
            this.mobile = request.mobile;
            this.scheduleId = request.scheduleId;
            this.seatIds = request.seatIds;
            this.seatNames = request.seatNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******003</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22******85759</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>186******71</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9******15</p>
         */
        public Builder scheduleId(Long scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder seatIds(String seatIds) {
            this.putQueryParameter("SeatIds", seatIds);
            this.seatIds = seatIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder seatNames(String seatNames) {
            this.putQueryParameter("SeatNames", seatNames);
            this.seatNames = seatNames;
            return this;
        }

        @Override
        public ReserveMovieSeatRequest build() {
            return new ReserveMovieSeatRequest(this);
        } 

    } 

}
