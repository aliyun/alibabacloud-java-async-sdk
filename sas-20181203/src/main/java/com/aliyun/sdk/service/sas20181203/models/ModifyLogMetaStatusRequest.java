// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogMetaStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyLogMetaStatusRequest</p>
 */
public class ModifyLogMetaStatusRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("LogStore")
    @Validation(required = true)
    private String logStore;

    @Query
    @NameInMap("Project")
    private String project;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private ModifyLogMetaStatusRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.logStore = builder.logStore;
        this.project = builder.project;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogMetaStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyLogMetaStatusRequest, Builder> {
        private String from; 
        private String logStore; 
        private String project; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLogMetaStatusRequest request) {
            super(request);
            this.from = request.from;
            this.logStore = request.logStore;
            this.project = request.project;
            this.status = request.status;
        } 

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The name of the dedicated Logstore in which logs are stored.
         * <p>
         * 
         * >  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the names of Logstores.
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * The name of the project.
         * <p>
         * 
         * >  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the names of projects.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * The status of the log analysis feature. Valid values:
         * <p>
         * 
         * *   **enabled**
         * *   **disabled**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyLogMetaStatusRequest build() {
            return new ModifyLogMetaStatusRequest(this);
        } 

    } 

}
