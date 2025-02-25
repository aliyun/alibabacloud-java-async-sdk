// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListLogStoresRequest} extends {@link RequestModel}
 *
 * <p>ListLogStoresRequest</p>
 */
public class ListLogStoresRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("telemetryType")
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore. Fuzzy match is supported. For example, if you enter test, Logstores whose name contains test are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The type of the Logstore. Valid values: standard and query.</p>
         * <ul>
         * <li><strong>standard</strong>: Standard Logstore. This type of Logstore supports the log analysis feature and is suitable for scenarios such as real-time monitoring and interactive analysis. You can also use this type of Logstore to build a comprehensive observability system.</li>
         * <li><strong>query</strong>: Query Logstore. This type of Logstore supports high-performance queries. The index traffic fee of a Query Logstore is approximately half that of a Standard Logstore. Query Logstores do not support SQL analysis. Query Logstores are suitable for scenarios in which the volume of data is large, the log retention period is long, or log analysis is not required. Log retention periods of weeks or months are considered long.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The line from which the query starts. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 500. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The type of the data that you want to query. Valid values:</p>
         * <ul>
         * <li>None: logs</li>
         * <li>Metrics: metrics</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
