// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorAnalyzerResultsRequest} extends {@link RequestModel}
 *
 * <p>ListQueryProcessorAnalyzerResultsRequest</p>
 */
public class ListQueryProcessorAnalyzerResultsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private String appId;

    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("text")
    @Validation(required = true)
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

        private Builder(ListQueryProcessorAnalyzerResultsRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.appId = response.appId;
            this.name = response.name;
            this.text = response.text;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * text.
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
