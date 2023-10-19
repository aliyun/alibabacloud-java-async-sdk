// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappPhoneNumberMetricRequest} extends {@link RequestModel}
 *
 * <p>GetChatappPhoneNumberMetricRequest</p>
 */
public class GetChatappPhoneNumberMetricRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("End")
    @Validation(required = true)
    private Long end;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("Start")
    @Validation(required = true)
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
         * The space ID of the user under the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * Metric granularity. Valid values:
         * <p>
         * 
         * - DAILY
         * - HALF_HOUR
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * The ISV verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The business phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
