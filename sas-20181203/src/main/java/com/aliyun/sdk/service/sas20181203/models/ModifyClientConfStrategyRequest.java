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
 * {@link ModifyClientConfStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyClientConfStrategyRequest</p>
 */
public class ModifyClientConfStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagExt")
    private String tagExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    private ModifyClientConfStrategyRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.tagExt = builder.tagExt;
        this.tagValue = builder.tagValue;
        this.uuid = builder.uuid;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClientConfStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return tagExt
     */
    public String getTagExt() {
        return this.tagExt;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyClientConfStrategyRequest, Builder> {
        private String tag; 
        private String tagExt; 
        private String tagValue; 
        private String uuid; 
        private java.util.List<String> uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClientConfStrategyRequest request) {
            super(request);
            this.tag = request.tag;
            this.tagExt = request.tagExt;
            this.tagValue = request.tagValue;
            this.uuid = request.uuid;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The client configuration tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>machineResource</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The extended tag.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder tagExt(String tagExt) {
            this.putQueryParameter("TagExt", tagExt);
            this.tagExt = tagExt;
            return this;
        }

        /**
         * <p>The client tag value. Valid values:</p>
         * <ul>
         * <li>major</li>
         * <li>advanced</li>
         * <li>basic</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        /**
         * <p>The UUID of the asset to query. You must specify at least one of the Uuid and Uuids parameters. Otherwise, the API returns a 400 error. The Uuid parameter specifies a single asset.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The UUIDs of asset instances. A maximum of 500 UUIDs can be specified at a time. You must specify at least one of the Uuids and Uuid parameters. Otherwise, the API returns a 400 error. The Uuids parameter specifies multiple assets in a batch.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyClientConfStrategyRequest build() {
            return new ModifyClientConfStrategyRequest(this);
        } 

    } 

}
