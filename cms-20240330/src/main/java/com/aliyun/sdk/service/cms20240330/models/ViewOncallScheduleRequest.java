// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ViewOncallScheduleRequest} extends {@link RequestModel}
 *
 * <p>ViewOncallScheduleRequest</p>
 */
public class ViewOncallScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    private String oncallScheduleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    private ViewOncallScheduleRequest(Builder builder) {
        super(builder);
        this.oncallScheduleId = builder.oncallScheduleId;
        this.regionId = builder.regionId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewOncallScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oncallScheduleId
     */
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ViewOncallScheduleRequest, Builder> {
        private String oncallScheduleId; 
        private String regionId; 
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ViewOncallScheduleRequest request) {
            super(request);
            this.oncallScheduleId = request.oncallScheduleId;
            this.regionId = request.regionId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * oncallScheduleId.
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.putPathParameter("oncallScheduleId", oncallScheduleId);
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ViewOncallScheduleRequest build() {
            return new ViewOncallScheduleRequest(this);
        } 

    } 

}
