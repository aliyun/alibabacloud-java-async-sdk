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
 * {@link PutLogsRequest} extends {@link RequestModel}
 *
 * <p>PutLogsRequest</p>
 */
public class PutLogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LogGroup body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-log-compresstype")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xLogCompresstype;

    private PutLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.body = builder.body;
        this.xLogCompresstype = builder.xLogCompresstype;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLogsRequest create() {
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
     * @return body
     */
    public LogGroup getBody() {
        return this.body;
    }

    /**
     * @return xLogCompresstype
     */
    public String getXLogCompresstype() {
        return this.xLogCompresstype;
    }

    public static final class Builder extends Request.Builder<PutLogsRequest, Builder> {
        private String project; 
        private String logstore; 
        private LogGroup body; 
        private String xLogCompresstype; 

        private Builder() {
            super();
        } 

        private Builder(PutLogsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.body = request.body;
            this.xLogCompresstype = request.xLogCompresstype;
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
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The compressed Protobuf data.</p>
         */
        public Builder body(LogGroup body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The compression format. lz4 and gzip are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lz4</p>
         */
        public Builder xLogCompresstype(String xLogCompresstype) {
            this.putHeaderParameter("x-log-compresstype", xLogCompresstype);
            this.xLogCompresstype = xLogCompresstype;
            return this;
        }

        @Override
        public PutLogsRequest build() {
            return new PutLogsRequest(this);
        } 

    } 

}
