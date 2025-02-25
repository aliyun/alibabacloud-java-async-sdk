// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLogsRequest} extends {@link RequestModel}
 *
 * <p>ListLogsRequest</p>
 */
public class ListLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1565193600)
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryParams")
    private String queryParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1565193600)
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

        private Builder(ListLogsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.page = request.page;
            this.queryParams = request.queryParams;
            this.size = request.size;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * queryParams.
         */
        public Builder queryParams(String queryParams) {
            this.putQueryParameter("queryParams", queryParams);
            this.queryParams = queryParams;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListLogsRequest build() {
            return new ListLogsRequest(this);
        } 

    } 

}
