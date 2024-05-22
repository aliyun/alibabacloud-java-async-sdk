// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainGroupRequest</p>
 */
public class DeleteDomainGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteDomainGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteDomainGroupRequest, Builder> {
        private String groupId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.lang = request.lang;
        } 

        /**
         * The ID of the domain name group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The language type.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DeleteDomainGroupRequest build() {
            return new DeleteDomainGroupRequest(this);
        } 

    } 

}
