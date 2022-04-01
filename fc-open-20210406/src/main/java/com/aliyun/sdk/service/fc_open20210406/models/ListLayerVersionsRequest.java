// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayerVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListLayerVersionsRequest</p>
 */
public class ListLayerVersionsRequest extends Request {
    @Path
    @NameInMap("layerName")
    @Validation(required = true)
    private String layerName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("startVersion")
    private Integer startVersion;

    private ListLayerVersionsRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.limit = builder.limit;
        this.startVersion = builder.startVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayerVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return startVersion
     */
    public Integer getStartVersion() {
        return this.startVersion;
    }

    public static final class Builder extends Request.Builder<ListLayerVersionsRequest, Builder> {
        private String layerName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Integer limit; 
        private Integer startVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListLayerVersionsRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.limit = request.limit;
            this.startVersion = request.startVersion;
        } 

        /**
         * 层名称
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * 起始版本
         */
        public Builder startVersion(Integer startVersion) {
            this.putQueryParameter("startVersion", startVersion);
            this.startVersion = startVersion;
            return this;
        }

        @Override
        public ListLayerVersionsRequest build() {
            return new ListLayerVersionsRequest(this);
        } 

    } 

}
