// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyInstanceServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceServiceConfigRequest</p>
 */
public class ModifyInstanceServiceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigureValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configureValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private ModifyInstanceServiceConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configureName = builder.configureName;
        this.configureValue = builder.configureValue;
        this.parameters = builder.parameters;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceServiceConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configureName
     */
    public String getConfigureName() {
        return this.configureName;
    }

    /**
     * @return configureValue
     */
    public String getConfigureValue() {
        return this.configureValue;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceServiceConfigRequest, Builder> {
        private String clusterId; 
        private String configureName; 
        private String configureValue; 
        private String parameters; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceServiceConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configureName = request.configureName;
            this.configureValue = request.configureValue;
            this.parameters = request.parameters;
            this.restart = request.restart;
        } 

        /**
         * <p>The ID of target instance. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain target instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The name of the configuration item to modify. You can call the <a href="https://help.aliyun.com/document_detail/201980.html">ListInstanceServiceConfigurations</a> operation to query the configuration item name.
         * &lt;props=&quot;intl&quot;&gt;The name of the configuration item to modify.</p>
         * <blockquote>
         * <p>If you want to modify multiple configuration items, specify the Parameters parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase#hbase-site.xml#hbase.client.keyvalue.maxsize</p>
         */
        public Builder configureName(String configureName) {
            this.putQueryParameter("ConfigureName", configureName);
            this.configureName = configureName;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The value of the configuration item to modify. You can call the <a href="https://help.aliyun.com/document_detail/201980.html">ListInstanceServiceConfigurations</a> operation to query the configuration item value.
         * &lt;props=&quot;intl&quot;&gt;The value of the configuration item to modify.</p>
         * <blockquote>
         * <p>If you want to modify multiple configuration items, specify the Parameters parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10485770</p>
         */
        public Builder configureValue(String configureValue) {
            this.putQueryParameter("ConfigureValue", configureValue);
            this.configureValue = configureValue;
            return this;
        }

        /**
         * <p>The JSON-formatted parameters for modifying multiple configuration items. The key specifies the name of the configuration item, and the value specifies the value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1=value1&quot;, &quot;key2=value2&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>Specifies whether to restart the instance after the configuration is modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Restart the instance.</li>
         * <li><strong>false</strong>: Do not restart the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public ModifyInstanceServiceConfigRequest build() {
            return new ModifyInstanceServiceConfigRequest(this);
        } 

    } 

}
