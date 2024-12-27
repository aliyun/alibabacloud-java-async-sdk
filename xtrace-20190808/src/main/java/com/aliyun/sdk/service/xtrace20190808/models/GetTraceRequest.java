// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link GetTraceRequest} extends {@link RequestModel}
 *
 * <p>GetTraceRequest</p>
 */
public class GetTraceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceID;

    private GetTraceRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.traceID = builder.traceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return traceID
     */
    public String getTraceID() {
        return this.traceID;
    }

    public static final class Builder extends Request.Builder<GetTraceRequest, Builder> {
        private String appType; 
        private Long pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String traceID; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceRequest request) {
            super(request);
            this.appType = request.appType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.traceID = request.traceID;
        } 

        /**
         * <p>The type of the application. You can leave this parameter empty or set this parameter to <code>XTRACE</code>. We recommend that you leave this parameter empty.</p>
         * <ul>
         * <li>If you leave this parameter empty, traces reported to Managed Service for OpenTelemetry and Application Real-Time Monitoring Service (ARMS) can be queried.</li>
         * <li>If you set this parameter to <code>XTRACE</code>, only traces reported to Managed Service for OpenTelemetry can be queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XTRACE</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
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
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The trace ID, which is the unique identifier of the trace.</p>
         * <p>You can obtain the trace ID on the <strong>Trace Explorer</strong> page in the Managed Service for OpenTelemetry console or by calling the <a href="https://help.aliyun.com/document_detail/2399674.html~">SearchTraces</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1c6881aab84191a4</p>
         */
        public Builder traceID(String traceID) {
            this.putQueryParameter("TraceID", traceID);
            this.traceID = traceID;
            return this;
        }

        @Override
        public GetTraceRequest build() {
            return new GetTraceRequest(this);
        } 

    } 

}
