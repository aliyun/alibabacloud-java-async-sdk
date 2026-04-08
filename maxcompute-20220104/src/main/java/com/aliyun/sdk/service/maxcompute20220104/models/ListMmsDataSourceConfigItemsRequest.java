// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListMmsDataSourceConfigItemsRequest} extends {@link RequestModel}
 *
 * <p>ListMmsDataSourceConfigItemsRequest</p>
 */
public class ListMmsDataSourceConfigItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private ListMmsDataSourceConfigItemsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsDataSourceConfigItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListMmsDataSourceConfigItemsRequest, Builder> {
        private String lang; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsDataSourceConfigItemsRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceType = request.sourceType;
        } 

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListMmsDataSourceConfigItemsRequest build() {
            return new ListMmsDataSourceConfigItemsRequest(this);
        } 

    } 

}
