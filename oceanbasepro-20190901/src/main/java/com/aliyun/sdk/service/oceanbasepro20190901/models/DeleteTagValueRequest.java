// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagValueRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagValueRequest</p>
 */
public class DeleteTagValueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private DeleteTagValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DeleteTagValueRequest, Builder> {
        private String regionId; 
        private String key; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.value = request.value;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the tag group.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The name of the tag.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DeleteTagValueRequest build() {
            return new DeleteTagValueRequest(this);
        } 

    } 

}
