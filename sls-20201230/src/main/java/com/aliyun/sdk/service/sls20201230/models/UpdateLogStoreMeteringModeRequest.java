// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateLogStoreMeteringModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreMeteringModeRequest</p>
 */
public class UpdateLogStoreMeteringModeRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("meteringMode")
    @Validation(required = true)
    private String meteringMode;

    private UpdateLogStoreMeteringModeRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.meteringMode = builder.meteringMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogStoreMeteringModeRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return meteringMode
     */
    public String getMeteringMode() {
        return this.meteringMode;
    }

    public static final class Builder extends Request.Builder<UpdateLogStoreMeteringModeRequest, Builder> {
        private String project; 
        private String logstore; 
        private String meteringMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogStoreMeteringModeRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.meteringMode = request.meteringMode;
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
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * meteringMode.
         */
        public Builder meteringMode(String meteringMode) {
            this.putBodyParameter("meteringMode", meteringMode);
            this.meteringMode = meteringMode;
            return this;
        }

        @Override
        public UpdateLogStoreMeteringModeRequest build() {
            return new UpdateLogStoreMeteringModeRequest(this);
        } 

    } 

}
