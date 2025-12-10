// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListImageLabelsRequest} extends {@link RequestModel}
 *
 * <p>ListImageLabelsRequest</p>
 */
public class ListImageLabelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelFilter")
    private String labelFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private String labelKeys;

    private ListImageLabelsRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.labelFilter = builder.labelFilter;
        this.labelKeys = builder.labelKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageLabelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return labelFilter
     */
    public String getLabelFilter() {
        return this.labelFilter;
    }

    /**
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<ListImageLabelsRequest, Builder> {
        private String imageId; 
        private String labelFilter; 
        private String labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(ListImageLabelsRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.labelFilter = request.labelFilter;
            this.labelKeys = request.labelKeys;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * LabelFilter.
         */
        public Builder labelFilter(String labelFilter) {
            this.putQueryParameter("LabelFilter", labelFilter);
            this.labelFilter = labelFilter;
            return this;
        }

        /**
         * LabelKeys.
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public ListImageLabelsRequest build() {
            return new ListImageLabelsRequest(this);
        } 

    } 

}
