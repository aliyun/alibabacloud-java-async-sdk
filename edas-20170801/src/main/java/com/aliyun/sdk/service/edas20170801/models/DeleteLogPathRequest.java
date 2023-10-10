// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogPathRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogPathRequest</p>
 */
public class DeleteLogPathRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Path")
    private String path;

    private DeleteLogPathRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogPathRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLogPathRequest, Builder> {
        private String appId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogPathRequest request) {
            super(request);
            this.appId = request.appId;
            this.path = request.path;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The absolute path of the log directory that you want to remove. The value must start and end with a forward slash (`/`) and must contain `/log` or `/logs`. The following directories are the default log directories in Enterprise Distributed Application Service (EDAS):
         * <p>
         * 
         * *   /home/admin/edas-container/logs/
         * *   /home/admin/taobao-tomcat-7.0.59/logs/
         * *   /home/admin/taobao-tomcat-production-7.0.59.3/logs/
         * *   /home/admin/taobao-tomcat-production-7.0.70/logs/
         * *   /home/admin/edas-agent/logs/
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public DeleteLogPathRequest build() {
            return new DeleteLogPathRequest(this);
        } 

    } 

}
