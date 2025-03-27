// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateEdgeContainerAppLogRiverRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeContainerAppLogRiverRequest</p>
 */
public class UpdateEdgeContainerAppLogRiverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stdout")
    private Boolean stdout;

    private UpdateEdgeContainerAppLogRiverRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.path = builder.path;
        this.stdout = builder.stdout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeContainerAppLogRiverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return stdout
     */
    public Boolean getStdout() {
        return this.stdout;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeContainerAppLogRiverRequest, Builder> {
        private String appId; 
        private String path; 
        private Boolean stdout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeContainerAppLogRiverRequest request) {
            super(request);
            this.appId = request.appId;
            this.path = request.path;
            this.stdout = request.stdout;
        } 

        /**
         * <p>The application ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2852396.html">ListEdgeContainerApps</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The log path of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/hello.log</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>Specifies whether to collect the standard output of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stdout(Boolean stdout) {
            this.putQueryParameter("Stdout", stdout);
            this.stdout = stdout;
            return this;
        }

        @Override
        public UpdateEdgeContainerAppLogRiverRequest build() {
            return new UpdateEdgeContainerAppLogRiverRequest(this);
        } 

    } 

}
