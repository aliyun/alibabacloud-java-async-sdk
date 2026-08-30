// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UnbindSaseUserTagRequest} extends {@link RequestModel}
 *
 * <p>UnbindSaseUserTagRequest</p>
 */
public class UnbindSaseUserTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SaseUserIds")
    private java.util.List<String> saseUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    private UnbindSaseUserTagRequest(Builder builder) {
        super(builder);
        this.saseUserIds = builder.saseUserIds;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindSaseUserTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return saseUserIds
     */
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<UnbindSaseUserTagRequest, Builder> {
        private java.util.List<String> saseUserIds; 
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(UnbindSaseUserTagRequest request) {
            super(request);
            this.saseUserIds = request.saseUserIds;
            this.tagIds = request.tagIds;
        } 

        /**
         * SaseUserIds.
         */
        public Builder saseUserIds(java.util.List<String> saseUserIds) {
            this.putBodyParameter("SaseUserIds", saseUserIds);
            this.saseUserIds = saseUserIds;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public UnbindSaseUserTagRequest build() {
            return new UnbindSaseUserTagRequest(this);
        } 

    } 

}
