// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartDataForServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListChartDataForServiceGroupRequest</p>
 */
public class ListChartDataForServiceGroupRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("startTime")
    private String startTime;

    private ListChartDataForServiceGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartDataForServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListChartDataForServiceGroupRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListChartDataForServiceGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.endTime = response.endTime;
            this.startTime = response.startTime;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListChartDataForServiceGroupRequest build() {
            return new ListChartDataForServiceGroupRequest(this);
        } 

    } 

}
