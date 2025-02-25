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
 * {@link ListAppBySwimmingLaneGroupTagRequest} extends {@link RequestModel}
 *
 * <p>ListAppBySwimmingLaneGroupTagRequest</p>
 */
public class ListAppBySwimmingLaneGroupTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    private ListAppBySwimmingLaneGroupTagRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppBySwimmingLaneGroupTagRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListAppBySwimmingLaneGroupTagRequest, Builder> {
        private String acceptLanguage; 
        private Long groupId; 
        private String namespace; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListAppBySwimmingLaneGroupTagRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.tag = request.tag;
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
         * <p>The ID of the lane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>119</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the Microservices Engine (MSE) namespace that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListAppBySwimmingLaneGroupTagRequest build() {
            return new ListAppBySwimmingLaneGroupTagRequest(this);
        } 

    } 

}
