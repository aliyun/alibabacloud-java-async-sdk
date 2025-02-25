// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorAnalyzerResultsRequest} extends {@link RequestModel}
 *
 * <p>ListQueryProcessorAnalyzerResultsRequest</p>
 */
public class ListQueryProcessorAnalyzerResultsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private ListQueryProcessorAnalyzerResultsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.name = builder.name;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryProcessorAnalyzerResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<ListQueryProcessorAnalyzerResultsRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private String name; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryProcessorAnalyzerResultsRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.name = request.name;
            this.text = request.text;
        } 

        /**
         * The name of the application
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The version number.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the test.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The text to be tested.
         */
        public Builder text(String text) {
            this.putQueryParameter("text", text);
            this.text = text;
            return this;
        }

        @Override
        public ListQueryProcessorAnalyzerResultsRequest build() {
            return new ListQueryProcessorAnalyzerResultsRequest(this);
        } 

    } 

}
