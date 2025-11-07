// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetGitRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetGitRepositoryResponseBody</p>
 */
public class GetGitRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HtmlUrl")
    private String htmlUrl;

    @com.aliyun.core.annotation.NameInMap("IsPrivate")
    private Boolean isPrivate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGitRepositoryResponseBody(Builder builder) {
        this.description = builder.description;
        this.htmlUrl = builder.htmlUrl;
        this.isPrivate = builder.isPrivate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGitRepositoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return htmlUrl
     */
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    /**
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private String htmlUrl; 
        private Boolean isPrivate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGitRepositoryResponseBody model) {
            this.description = model.description;
            this.htmlUrl = model.htmlUrl;
            this.isPrivate = model.isPrivate;
            this.requestId = model.requestId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * HtmlUrl.
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * IsPrivate.
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGitRepositoryResponseBody build() {
            return new GetGitRepositoryResponseBody(this);
        } 

    } 

}
