// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFlowRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowRulesRequest</p>
 */
public class DeleteFlowRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List < Long > ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private DeleteFlowRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.ids = builder.ids;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return ids
     */
    public java.util.List < Long > getIds() {
        return this.ids;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<DeleteFlowRulesRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 
        private String appName; 
        private java.util.List < Long > ids; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.ids = request.ids;
            this.namespace = request.namespace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The IDs of the rules to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2]</p>
         */
        public Builder ids(java.util.List < Long > ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The microservice namespace to which the application belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteFlowRulesRequest build() {
            return new DeleteFlowRulesRequest(this);
        } 

    } 

}
