// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetChatappPhoneNumberMetricRequest} extends {@link RequestModel}
 *
 * <p>GetChatappPhoneNumberMetricRequest</p>
 */
public class GetChatappPhoneNumberMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    private GetChatappPhoneNumberMetricRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.end = builder.end;
        this.granularity = builder.granularity;
        this.isvCode = builder.isvCode;
        this.phoneNumber = builder.phoneNumber;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappPhoneNumberMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetChatappPhoneNumberMetricRequest, Builder> {
        private String custSpaceId; 
        private Long end; 
        private String granularity; 
        private String isvCode; 
        private String phoneNumber; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappPhoneNumberMetricRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.end = request.end;
            this.granularity = request.granularity;
            this.isvCode = request.isvCode;
            this.phoneNumber = request.phoneNumber;
            this.start = request.start;
        } 

        /**
         * <p>The space ID of the RAM user within the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1693407714687</p>
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The granularity of the metric.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DAILY</li>
         * <li>HALF_HOUR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The independent software vendor (ISV) verification code, which is used to verify whether the RAM user is authorized by the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikdkkdk</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The business phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>861380000</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1693107714687</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetChatappPhoneNumberMetricRequest build() {
            return new GetChatappPhoneNumberMetricRequest(this);
        } 

    } 

}
