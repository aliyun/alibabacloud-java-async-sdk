// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppBySwimmingLaneGroupTagRequest} extends {@link RequestModel}
 *
 * <p>ListAppBySwimmingLaneGroupTagRequest</p>
 */
public class ListAppBySwimmingLaneGroupTagRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("Namespace")
    @Validation(maxLength = 64)
    private String namespace;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
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
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 需要查询的MSE命名空间名字
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Tag.
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
