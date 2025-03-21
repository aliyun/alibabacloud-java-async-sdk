// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAssetInfoPublishRequest} extends {@link RequestModel}
 *
 * <p>ListAssetInfoPublishRequest</p>
 */
public class ListAssetInfoPublishRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuidList;

    private ListAssetInfoPublishRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetInfoPublishRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ListAssetInfoPublishRequest, Builder> {
        private String name; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetInfoPublishRequest request) {
            super(request);
            this.name = request.name;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>An extended parameter. This parameter is temporarily unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The UUIDs of the servers that you want to query.</p>
         * <p>This parameter is required.</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ListAssetInfoPublishRequest build() {
            return new ListAssetInfoPublishRequest(this);
        } 

    } 

}
