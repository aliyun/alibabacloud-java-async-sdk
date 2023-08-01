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
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstoreName.
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
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
         * telemetryType.
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
