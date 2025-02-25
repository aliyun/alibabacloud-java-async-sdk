// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetComputeQuotaScheduleRequest} extends {@link RequestModel}
 *
 * <p>GetComputeQuotaScheduleRequest</p>
 */
public class GetComputeQuotaScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("displayTimezone")
    private String displayTimezone;

    private GetComputeQuotaScheduleRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.displayTimezone = builder.displayTimezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeQuotaScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return displayTimezone
     */
    public String getDisplayTimezone() {
        return this.displayTimezone;
    }

    public static final class Builder extends Request.Builder<GetComputeQuotaScheduleRequest, Builder> {
        private String nickname; 
        private String displayTimezone; 

        private Builder() {
            super();
        } 

        private Builder(GetComputeQuotaScheduleRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.displayTimezone = request.displayTimezone;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>Display time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        public Builder displayTimezone(String displayTimezone) {
            this.putQueryParameter("displayTimezone", displayTimezone);
            this.displayTimezone = displayTimezone;
            return this;
        }

        @Override
        public GetComputeQuotaScheduleRequest build() {
            return new GetComputeQuotaScheduleRequest(this);
        } 

    } 

}
