// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListSentinelBlockFallbackDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>ListSentinelBlockFallbackDefinitionsRequest</p>
 */
public class ListSentinelBlockFallbackDefinitionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClassificationSet")
    private java.util.List<Integer> classificationSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private ListSentinelBlockFallbackDefinitionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.classificationSet = builder.classificationSet;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSentinelBlockFallbackDefinitionsRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return classificationSet
     */
    public java.util.List<Integer> getClassificationSet() {
        return this.classificationSet;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<ListSentinelBlockFallbackDefinitionsRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private java.util.List<Integer> classificationSet; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListSentinelBlockFallbackDefinitionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.classificationSet = request.classificationSet;
            this.namespace = request.namespace;
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
         * <p>The name of the application.</p>
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
         * <p>Behavior Classification Set.</p>
         */
        public Builder classificationSet(java.util.List<Integer> classificationSet) {
            String classificationSetShrink = shrink(classificationSet, "ClassificationSet", "json");
            this.putQueryParameter("ClassificationSet", classificationSetShrink);
            this.classificationSet = classificationSet;
            return this;
        }

        /**
         * <p>The name of the Microservices namespace.</p>
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
        public ListSentinelBlockFallbackDefinitionsRequest build() {
            return new ListSentinelBlockFallbackDefinitionsRequest(this);
        } 

    } 

}
