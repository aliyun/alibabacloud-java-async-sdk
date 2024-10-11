// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSparkAppLogRootPathRequest} extends {@link RequestModel}
 *
 * <p>SetSparkAppLogRootPathRequest</p>
 */
public class SetSparkAppLogRootPathRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssLogPath")
    private String ossLogPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseDefaultOss")
    private Boolean useDefaultOss;

    private SetSparkAppLogRootPathRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ossLogPath = builder.ossLogPath;
        this.useDefaultOss = builder.useDefaultOss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSparkAppLogRootPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ossLogPath
     */
    public String getOssLogPath() {
        return this.ossLogPath;
    }

    /**
     * @return useDefaultOss
     */
    public Boolean getUseDefaultOss() {
        return this.useDefaultOss;
    }

    public static final class Builder extends Request.Builder<SetSparkAppLogRootPathRequest, Builder> {
        private String DBClusterId; 
        private String ossLogPath; 
        private Boolean useDefaultOss; 

        private Builder() {
            super();
        } 

        private Builder(SetSparkAppLogRootPathRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ossLogPath = request.ossLogPath;
            this.useDefaultOss = request.useDefaultOss;
        } 

        /**
         * <p>The database ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-dbclusterid</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) log path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://path/to/log</p>
         */
        public Builder ossLogPath(String ossLogPath) {
            this.putBodyParameter("OssLogPath", ossLogPath);
            this.ossLogPath = ossLogPath;
            return this;
        }

        /**
         * <p>Specifies whether to use the default OSS log path.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useDefaultOss(Boolean useDefaultOss) {
            this.putBodyParameter("UseDefaultOss", useDefaultOss);
            this.useDefaultOss = useDefaultOss;
            return this;
        }

        @Override
        public SetSparkAppLogRootPathRequest build() {
            return new SetSparkAppLogRootPathRequest(this);
        } 

    } 

}
