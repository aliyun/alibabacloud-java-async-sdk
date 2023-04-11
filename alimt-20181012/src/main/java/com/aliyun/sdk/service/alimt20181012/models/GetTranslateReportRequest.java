// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranslateReportRequest} extends {@link RequestModel}
 *
 * <p>GetTranslateReportRequest</p>
 */
public class GetTranslateReportRequest extends Request {
    @Query
    @NameInMap("ApiName")
    @Validation(required = true)
    private String apiName;

    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private String beginTime;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Group")
    @Validation(required = true)
    private String group;

    private GetTranslateReportRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.group = builder.group;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranslateReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    public static final class Builder extends Request.Builder<GetTranslateReportRequest, Builder> {
        private String apiName; 
        private String beginTime; 
        private String endTime; 
        private String group; 

        private Builder() {
            super();
        } 

        private Builder(GetTranslateReportRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.group = request.group;
        } 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        @Override
        public GetTranslateReportRequest build() {
            return new GetTranslateReportRequest(this);
        } 

    } 

}
