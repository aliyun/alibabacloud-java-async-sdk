// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassificationConditionsRequest} extends {@link RequestModel}
 *
 * <p>ListClassificationConditionsRequest</p>
 */
public class ListClassificationConditionsRequest extends Request {
    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("Type")
    private Long type;

    private ListClassificationConditionsRequest(Builder builder) {
        super(builder);
        this.tagName = builder.tagName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassificationConditionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListClassificationConditionsRequest, Builder> {
        private String tagName; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(ListClassificationConditionsRequest request) {
            super(request);
            this.tagName = request.tagName;
            this.type = request.type;
        } 

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListClassificationConditionsRequest build() {
            return new ListClassificationConditionsRequest(this);
        } 

    } 

}
