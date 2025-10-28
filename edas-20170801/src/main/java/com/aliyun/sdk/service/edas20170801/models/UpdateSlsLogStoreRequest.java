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
 * {@link UpdateSlsLogStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateSlsLogStoreRequest</p>
 */
public class UpdateSlsLogStoreRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configs;

    private UpdateSlsLogStoreRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.configs = builder.configs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSlsLogStoreRequest create() {
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
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    public static final class Builder extends Request.Builder<UpdateSlsLogStoreRequest, Builder> {
        private String appId; 
        private String configs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSlsLogStoreRequest request) {
            super(request);
            this.appId = request.appId;
            this.configs = request.configs;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af58edcf-f7eb-<strong><strong>-</strong></strong>-db4e425f****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The configurations of the Logstore.</p>
         * <ul>
         * <li><p>The following parameters are included in the configurations:****</p>
         * <ul>
         * <li><p><strong>type</strong>: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
         * </li>
         * <li><p><strong>logstore</strong>: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
         * <ul>
         * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>**</p>
         * <p><strong>Note</strong>If you leave this parameter empty, the system automatically generates a name.</p>
         * </li>
         * <li><p><strong>LogDir</strong>: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (*) are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logstore&quot;:&quot;thisisanotherfilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/var/log/<em>&quot;},{&quot;logstore&quot;:&quot;&quot;,&quot;type&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;stdout.log&quot;},{&quot;logstore&quot;:&quot;thisisafilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/tmp/log/</em>&quot;}]</p>
         */
        public Builder configs(String configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        @Override
        public UpdateSlsLogStoreRequest build() {
            return new UpdateSlsLogStoreRequest(this);
        } 

    } 

}
