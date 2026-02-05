// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetScheduledInstancesRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledInstancesRequest</p>
 */
public class GetScheduledInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledId;

    private GetScheduledInstancesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scheduledId = builder.scheduledId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduledId
     */
    public String getScheduledId() {
        return this.scheduledId;
    }

    public static final class Builder extends Request.Builder<GetScheduledInstancesRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String scheduledId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledInstancesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scheduledId = request.scheduledId;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
         */
        public Builder scheduledId(String scheduledId) {
            this.putQueryParameter("ScheduledId", scheduledId);
            this.scheduledId = scheduledId;
            return this;
        }

        @Override
        public GetScheduledInstancesRequest build() {
            return new GetScheduledInstancesRequest(this);
        } 

    } 

}
