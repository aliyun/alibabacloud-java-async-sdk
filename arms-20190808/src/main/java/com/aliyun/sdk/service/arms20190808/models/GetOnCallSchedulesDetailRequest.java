// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOnCallSchedulesDetailRequest} extends {@link RequestModel}
 *
 * <p>GetOnCallSchedulesDetailRequest</p>
 */
public class GetOnCallSchedulesDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetOnCallSchedulesDetailRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnCallSchedulesDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetOnCallSchedulesDetailRequest, Builder> {
        private String endTime; 
        private Long id; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetOnCallSchedulesDetailRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.id = request.id;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The date on which the shift ends. Format: <code>yyyy-MM-dd</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-30</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the scheduling policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The date from which the shift starts. Format: <code>yyyy-MM-dd</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetOnCallSchedulesDetailRequest build() {
            return new GetOnCallSchedulesDetailRequest(this);
        } 

    } 

}
