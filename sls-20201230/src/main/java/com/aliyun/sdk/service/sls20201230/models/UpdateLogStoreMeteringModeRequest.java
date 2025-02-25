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
 * {@link UpdateLogStoreMeteringModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreMeteringModeRequest</p>
 */
public class UpdateLogStoreMeteringModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meteringMode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logstoreName</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The billing mode. Valid values: ChargeByFunction and ChargeByDataIngest. Default value: ChargeByFunction. The value ChargeByFunction specifies the pay-by-feature billing mode. The value ChargeByDataIngest specifies the pay-by-ingested-data billing mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ChargeByFunction</p>
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
