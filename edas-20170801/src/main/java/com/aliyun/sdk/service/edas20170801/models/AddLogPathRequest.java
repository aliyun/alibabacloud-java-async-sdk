// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLogPathRequest} extends {@link RequestModel}
 *
 * <p>AddLogPathRequest</p>
 */
public class AddLogPathRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    private AddLogPathRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLogPathRequest create() {
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

    public static final class Builder extends Request.Builder<AddLogPathRequest, Builder> {
        private String appId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(AddLogPathRequest request) {
            super(request);
            this.appId = request.appId;
            this.path = request.path;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The absolute path of the log directory that you want to add. The value must start and end with a forward slash (`/`) and must contain `/log` or `/logs`. The following directories are the default log directories in Enterprise Distributed Application Service (EDAS):
         * <p>
         * 
         * *   /home/admin/edas-container/logs/
         * *   /home/admin/taobao-tomcat-7.0.59/logs/
         * *   /home/admin/taobao-tomcat-production-7.0.59.3/logs/
         * *   /home/admin/taobao-tomcat-production-7.0.70/logs/
         * *   /home/admin/edas-agent/logs/
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public AddLogPathRequest build() {
            return new AddLogPathRequest(this);
        } 

    } 

}
