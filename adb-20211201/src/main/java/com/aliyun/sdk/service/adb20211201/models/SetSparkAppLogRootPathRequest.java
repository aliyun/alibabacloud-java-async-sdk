// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSparkAppLogRootPathRequest} extends {@link RequestModel}
 *
 * <p>SetSparkAppLogRootPathRequest</p>
 */
public class SetSparkAppLogRootPathRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @Body
    @NameInMap("OssLogPath")
    private String ossLogPath;

    @Body
    @NameInMap("UseDefaultOss")
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
         * The database ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The Object Storage Service (OSS) log path.
         */
        public Builder ossLogPath(String ossLogPath) {
            this.putBodyParameter("OssLogPath", ossLogPath);
            this.ossLogPath = ossLogPath;
            return this;
        }

        /**
         * Specifies whether to use the default OSS log path.
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
