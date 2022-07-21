// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySchedulePeriodListRequest} extends {@link RequestModel}
 *
 * <p>QuerySchedulePeriodListRequest</p>
 */
public class QuerySchedulePeriodListRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("PageId")
    @Validation(maximum = 10000, minimum = 1)
    private Integer pageId;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ScheduleCode")
    @Validation(required = true)
    private String scheduleCode;

    private QuerySchedulePeriodListRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.scheduleCode = builder.scheduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySchedulePeriodListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public static final class Builder extends Request.Builder<QuerySchedulePeriodListRequest, Builder> {
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String scheduleCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySchedulePeriodListRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.scheduleCode = request.scheduleCode;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putBodyParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScheduleCode.
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        @Override
        public QuerySchedulePeriodListRequest build() {
            return new QuerySchedulePeriodListRequest(this);
        } 

    } 

}
