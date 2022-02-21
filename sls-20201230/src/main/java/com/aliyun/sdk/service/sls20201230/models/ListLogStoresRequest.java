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
    @Query
    @NameInMap("logstoreName")
    private String logstoreName;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("telemetryType")
    private String telemetryType;

    private ListLogStoresRequest(Builder builder) {
        super(builder);
        this.logstoreName = builder.logstoreName;
        this.offset = builder.offset;
        this.project = builder.project;
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
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
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
        private String logstoreName; 
        private Integer offset; 
        private String project; 
        private Integer size; 
        private String telemetryType; 

        private Builder() {
            super();
        } 

        private Builder(ListLogStoresRequest response) {
            super(response);
            this.logstoreName = response.logstoreName;
            this.offset = response.offset;
            this.project = response.project;
            this.size = response.size;
            this.telemetryType = response.telemetryType;
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
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
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
