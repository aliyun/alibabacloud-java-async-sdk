// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TagDbfsRequest} extends {@link RequestModel}
 *
 * <p>TagDbfsRequest</p>
 */
public class TagDbfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbfsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbfsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tags;

    private TagDbfsRequest(Builder builder) {
        super(builder);
        this.dbfsId = builder.dbfsId;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbfsId
     */
    public String getDbfsId() {
        return this.dbfsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagDbfsRequest, Builder> {
        private String dbfsId; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(TagDbfsRequest request) {
            super(request);
            this.dbfsId = request.dbfsId;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfs-nUy1tb********BQ4X8Gpw</p>
         */
        public Builder dbfsId(String dbfsId) {
            this.putQueryParameter("DbfsId", dbfsId);
            this.dbfsId = dbfsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;TagKey&quot;:&quot;k1&quot;,&quot;TagValue&quot;:&quot;v1&quot;},{&quot;TagKey&quot;:&quot;k2&quot;,&quot;TagValue&quot;:&quot;v2&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagDbfsRequest build() {
            return new TagDbfsRequest(this);
        } 

    } 

}
