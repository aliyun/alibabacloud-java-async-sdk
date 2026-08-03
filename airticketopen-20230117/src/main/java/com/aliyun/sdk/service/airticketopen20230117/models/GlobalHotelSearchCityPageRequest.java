// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelSearchCityPageRequest} extends {@link RequestModel}
 *
 * <p>GlobalHotelSearchCityPageRequest</p>
 */
public class GlobalHotelSearchCityPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    private Integer start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelSearchCityPageRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.count = builder.count;
        this.countryCode = builder.countryCode;
        this.start = builder.start;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelSearchCityPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<GlobalHotelSearchCityPageRequest, Builder> {
        private Long accountNo; 
        private Integer count; 
        private String countryCode; 
        private Integer start; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(GlobalHotelSearchCityPageRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.count = request.count;
            this.countryCode = request.countryCode;
            this.start = request.start;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.putBodyParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * CountryCode.
         */
        public Builder countryCode(String countryCode) {
            this.putBodyParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Integer start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public GlobalHotelSearchCityPageRequest build() {
            return new GlobalHotelSearchCityPageRequest(this);
        } 

    } 

}
