// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListListenersByConfigRequest} extends {@link RequestModel}
 *
 * <p>ListListenersByConfigRequest</p>
 */
public class ListListenersByConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    private ListListenersByConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dataId = builder.dataId;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersByConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListListenersByConfigRequest, Builder> {
        private String acceptLanguage; 
        private String dataId; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListListenersByConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.dataId = request.dataId;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.requestPars = request.requestPars;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zeekr-clueboss.yml</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>The name of the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-m7r1yurp00e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>aaeb4d28-c9eb-4fa2-85f5-d03ce7ee8df1</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appGroup\&quot;:\&quot;emas-zfive_prehost\&quot;,\&quot;appName\&quot;:\&quot;emas-zfive\&quot;,\&quot;appStage\&quot;:\&quot;PRE_PUBLISH\&quot;,\&quot;appUnit\&quot;:\&quot;\&quot;,\&quot;bucId\&quot;:\&quot;225902\&quot;,\&quot;bucName\&quot;:\&quot;Wireless\&quot;,\&quot;provider\&quot;:\&quot;aliyun\&quot;}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListListenersByConfigRequest build() {
            return new ListListenersByConfigRequest(this);
        } 

    } 

}
