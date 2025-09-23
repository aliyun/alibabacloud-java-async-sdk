// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link QueryAppMetadataRequest} extends {@link RequestModel}
 *
 * <p>QueryAppMetadataRequest</p>
 */
public class QueryAppMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeMs")
    private Long endTimeMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeMs")
    private Long startTimeMs;

    private QueryAppMetadataRequest(Builder builder) {
        super(builder);
        this.endTimeMs = builder.endTimeMs;
        this.metaIds = builder.metaIds;
        this.metaType = builder.metaType;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.startTimeMs = builder.startTimeMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppMetadataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimeMs
     */
    public Long getEndTimeMs() {
        return this.endTimeMs;
    }

    /**
     * @return metaIds
     */
    public String getMetaIds() {
        return this.metaIds;
    }

    /**
     * @return metaType
     */
    public String getMetaType() {
        return this.metaType;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTimeMs
     */
    public Long getStartTimeMs() {
        return this.startTimeMs;
    }

    public static final class Builder extends Request.Builder<QueryAppMetadataRequest, Builder> {
        private Long endTimeMs; 
        private String metaIds; 
        private String metaType; 
        private String pid; 
        private String regionId; 
        private Long startTimeMs; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppMetadataRequest request) {
            super(request);
            this.endTimeMs = request.endTimeMs;
            this.metaIds = request.metaIds;
            this.metaType = request.metaType;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.startTimeMs = request.startTimeMs;
        } 

        /**
         * EndTimeMs.
         */
        public Builder endTimeMs(Long endTimeMs) {
            this.putQueryParameter("EndTimeMs", endTimeMs);
            this.endTimeMs = endTimeMs;
            return this;
        }

        /**
         * <p>The metadata IDs. Separate multiple IDs with commas (,).</p>
         * <p>You can obtain the exception ID on the <strong>Exception Analysis</strong> page of your application in the ARMS console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c9dd447,3c76c565</p>
         */
        public Builder metaIds(String metaIds) {
            this.putQueryParameter("MetaIds", metaIds);
            this.metaIds = metaIds;
            return this;
        }

        /**
         * <p>The metadata type. Valid values:</p>
         * <ul>
         * <li>sql: obtains an SQL statement based on sqlId.</li>
         * <li>exception: obtains the exception stack based on exceptionId.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sql</p>
         */
        public Builder metaType(String metaType) {
            this.putQueryParameter("MetaType", metaType);
            this.metaType = metaType;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application. You can obtain the PID of an application by calling the <strong>ListTraceApps</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ggxw4lnjuz@54364d85b97dc56</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTimeMs.
         */
        public Builder startTimeMs(Long startTimeMs) {
            this.putQueryParameter("StartTimeMs", startTimeMs);
            this.startTimeMs = startTimeMs;
            return this;
        }

        @Override
        public QueryAppMetadataRequest build() {
            return new QueryAppMetadataRequest(this);
        } 

    } 

}
