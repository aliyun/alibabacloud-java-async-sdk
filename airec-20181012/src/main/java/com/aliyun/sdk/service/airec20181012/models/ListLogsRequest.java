// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogsRequest} extends {@link RequestModel}
 *
 * <p>ListLogsRequest</p>
 */
public class ListLogsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 2147483647, minimum = 1565193600)
    private Integer endTime;

    @Query
    @NameInMap("Page")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("QueryParams")
    private String queryParams;

    @Query
    @NameInMap("Size")
    @Validation(maximum = 1000, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 2147483647, minimum = 1565193600)
    private Integer startTime;

    private ListLogsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.queryParams = builder.queryParams;
        this.size = builder.size;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return queryParams
     */
    public String getQueryParams() {
        return this.queryParams;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListLogsRequest, Builder> {
        private String instanceId; 
        private Integer endTime; 
        private Integer page; 
        private String queryParams; 
        private Integer size; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListLogsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.endTime = response.endTime;
            this.page = response.page;
            this.queryParams = response.queryParams;
            this.size = response.size;
            this.startTime = response.startTime;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * QueryParams.
         */
        public Builder queryParams(String queryParams) {
            this.putQueryParameter("QueryParams", queryParams);
            this.queryParams = queryParams;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListLogsRequest build() {
            return new ListLogsRequest(this);
        } 

    } 

}
