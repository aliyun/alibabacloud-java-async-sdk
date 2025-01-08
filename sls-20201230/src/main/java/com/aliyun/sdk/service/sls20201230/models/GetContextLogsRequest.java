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
 * {@link GetContextLogsRequest} extends {@link RequestModel}
 *
 * <p>GetContextLogsRequest</p>
 */
public class GetContextLogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("back_lines")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long backLines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("forward_lines")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long forwardLines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pack_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pack_meta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packMeta;

    private GetContextLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.backLines = builder.backLines;
        this.forwardLines = builder.forwardLines;
        this.packId = builder.packId;
        this.packMeta = builder.packMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextLogsRequest create() {
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
     * @return backLines
     */
    public Long getBackLines() {
        return this.backLines;
    }

    /**
     * @return forwardLines
     */
    public Long getForwardLines() {
        return this.forwardLines;
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return packMeta
     */
    public String getPackMeta() {
        return this.packMeta;
    }

    public static final class Builder extends Request.Builder<GetContextLogsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Long backLines; 
        private Long forwardLines; 
        private String packId; 
        private String packMeta; 

        private Builder() {
            super();
        } 

        private Builder(GetContextLogsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.backLines = request.backLines;
            this.forwardLines = request.forwardLines;
            this.packId = request.packId;
            this.packMeta = request.packMeta;
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
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The number of logs that you want to obtain and are generated before the generation time of the start log. Valid values: <code>(0,100]</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder backLines(Long backLines) {
            this.putQueryParameter("back_lines", backLines);
            this.backLines = backLines;
            return this;
        }

        /**
         * <p>The number of logs that you want to obtain and are generated after the generation time of the start log. Valid values: <code>(0,100]</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder forwardLines(Long forwardLines) {
            this.putQueryParameter("forward_lines", forwardLines);
            this.forwardLines = forwardLines;
            return this;
        }

        /**
         * <p>The unique identifier of the log group to which the start log belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>85C897C740352DC6-808</p>
         */
        public Builder packId(String packId) {
            this.putQueryParameter("pack_id", packId);
            this.packId = packId;
            return this;
        }

        /**
         * <p>The unique context identifier of the start log in the log group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2|MTY1NTcwNTUzODY5MTY0MDk1Mg==|3|0</p>
         */
        public Builder packMeta(String packMeta) {
            this.putQueryParameter("pack_meta", packMeta);
            this.packMeta = packMeta;
            return this;
        }

        @Override
        public GetContextLogsRequest build() {
            return new GetContextLogsRequest(this);
        } 

    } 

}
