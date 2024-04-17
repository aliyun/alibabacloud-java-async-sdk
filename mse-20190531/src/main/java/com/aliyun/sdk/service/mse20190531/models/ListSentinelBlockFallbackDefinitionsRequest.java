// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSentinelBlockFallbackDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>ListSentinelBlockFallbackDefinitionsRequest</p>
 */
public class ListSentinelBlockFallbackDefinitionsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("ClassificationSet")
    private java.util.List < Integer > classificationSet;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
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
    public java.util.List < Integer > getClassificationSet() {
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
        private java.util.List < Integer > classificationSet; 
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ClassificationSet.
         */
        public Builder classificationSet(java.util.List < Integer > classificationSet) {
            String classificationSetShrink = shrink(classificationSet, "ClassificationSet", "json");
            this.putQueryParameter("ClassificationSet", classificationSetShrink);
            this.classificationSet = classificationSet;
            return this;
        }

        /**
         * Namespace.
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
