// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link AddLogPathRequest} extends {@link RequestModel}
 *
 * <p>AddLogPathRequest</p>
 */
public class AddLogPathRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-4413**********</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The absolute path of the log directory that you want to add. The value must start and end with a forward slash (<code>/</code>) and must contain <code>/log</code> or <code>/logs</code>. The following directories are the default log directories in Enterprise Distributed Application Service (EDAS):</p>
         * <ul>
         * <li>/home/admin/edas-container/logs/</li>
         * <li>/home/admin/taobao-tomcat-7.0.59/logs/</li>
         * <li>/home/admin/taobao-tomcat-production-7.0.59.3/logs/</li>
         * <li>/home/admin/taobao-tomcat-production-7.0.70/logs/</li>
         * <li>/home/admin/edas-agent/logs/</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/temp/log/</p>
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
