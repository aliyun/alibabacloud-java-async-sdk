// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClientInstallationStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetClientInstallationStatisticRequest</p>
 */
public class GetClientInstallationStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeStart;

    private GetClientInstallationStatisticRequest(Builder builder) {
        super(builder);
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientInstallationStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timeEnd
     */
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public Long getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<GetClientInstallationStatisticRequest, Builder> {
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(GetClientInstallationStatisticRequest request) {
            super(request);
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * <p>The timestamp that specifies the end of the time range to collect statistics. Unit: millisecond.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687708800000</p>
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The timestamp that specifies the beginning of the time range to collect statistics. Unit: millisecond.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687104000000</p>
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public GetClientInstallationStatisticRequest build() {
            return new GetClientInstallationStatisticRequest(this);
        } 

    } 

}
