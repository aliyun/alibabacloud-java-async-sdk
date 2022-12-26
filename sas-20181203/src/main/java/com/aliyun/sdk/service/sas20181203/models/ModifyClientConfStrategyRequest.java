// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClientConfStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyClientConfStrategyRequest</p>
 */
public class ModifyClientConfStrategyRequest extends Request {
    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Query
    @NameInMap("TagExt")
    private String tagExt;

    @Query
    @NameInMap("TagValue")
    @Validation(required = true)
    private String tagValue;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("Uuids")
    private java.util.List < String > uuids;

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
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyClientConfStrategyRequest, Builder> {
        private String tag; 
        private String tagExt; 
        private String tagValue; 
        private String uuid; 
        private java.util.List < String > uuids; 

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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TagExt.
         */
        public Builder tagExt(String tagExt) {
            this.putQueryParameter("TagExt", tagExt);
            this.tagExt = tagExt;
            return this;
        }

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
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
