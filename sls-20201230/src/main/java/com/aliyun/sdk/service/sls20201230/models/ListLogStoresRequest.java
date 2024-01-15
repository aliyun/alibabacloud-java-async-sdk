// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListLogStoresRequest} extends {@link RequestModel}
 *
 * <p>ListLogStoresRequest</p>
 */
public class ListLogStoresRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("logstoreName")
    private String logstoreName;

    @Query
    @NameInMap("mode")
    private String mode;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("telemetryType")
    private String telemetryType;

    private ListLogStoresRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstoreName = builder.logstoreName;
        this.mode = builder.mode;
        this.offset = builder.offset;
        this.size = builder.size;
        this.telemetryType = builder.telemetryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogStoresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return telemetryType
     */
    public String getTelemetryType() {
        return this.telemetryType;
    }

    public static final class Builder extends Request.Builder<ListLogStoresRequest, Builder> {
        private String project; 
        private String logstoreName; 
        private String mode; 
        private Integer offset; 
        private Integer size; 
        private String telemetryType; 

        private Builder() {
            super();
        } 

        private Builder(ListLogStoresRequest request) {
            super(request);
            this.project = request.project;
            this.logstoreName = request.logstoreName;
            this.mode = request.mode;
            this.offset = request.offset;
            this.size = request.size;
            this.telemetryType = request.telemetryType;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logstore. Fuzzy match is supported. For example, if you enter test, Logstores whose name contains test are returned.
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * The type of the Logstore. Valid values: standard and query.
         * <p>
         * 
         * *   **standard**: Standard Logstore. This type of Logstore supports the log analysis feature and is suitable for scenarios such as real-time monitoring and interactive analysis. You can also use this type of Logstore to build a comprehensive observability system.
         * *   **query**: Query Logstore. This type of Logstore supports high-performance queries. The index traffic fee of a Query Logstore is approximately half that of a Standard Logstore. Query Logstores do not support SQL analysis. Query Logstores are suitable for scenarios in which the volume of data is large, the log retention period is long, or log analysis is not required. Log retention periods of weeks or months are considered long.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The line from which the query starts. Default value: 0.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 500. Default value: 500.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * The type of the data that you want to query. Valid values:
         * <p>
         * 
         * *   None: logs
         * *   Metrics: metrics
         */
        public Builder telemetryType(String telemetryType) {
            this.putQueryParameter("telemetryType", telemetryType);
            this.telemetryType = telemetryType;
            return this;
        }

        @Override
        public ListLogStoresRequest build() {
            return new ListLogStoresRequest(this);
        } 

    } 

}
