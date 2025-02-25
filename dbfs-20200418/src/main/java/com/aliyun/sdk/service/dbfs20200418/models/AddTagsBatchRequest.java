// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTagsBatchRequest} extends {@link RequestModel}
 *
 * <p>AddTagsBatchRequest</p>
 */
public class AddTagsBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbfsList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbfsList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tags;

    private AddTagsBatchRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbfsList = builder.dbfsList;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbfsList
     */
    public String getDbfsList() {
        return this.dbfsList;
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

    public static final class Builder extends Request.Builder<AddTagsBatchRequest, Builder> {
        private String clientToken; 
        private String dbfsList; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsBatchRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbfsList = request.dbfsList;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;dbfs-nUy1tb<strong><strong><strong><strong>BQ4X8Gpw&quot;,&quot;dbfs-v0WvA</strong></strong></strong></strong>tVEVcgJLg&quot;]</p>
         */
        public Builder dbfsList(String dbfsList) {
            this.putQueryParameter("DbfsList", dbfsList);
            this.dbfsList = dbfsList;
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
        public AddTagsBatchRequest build() {
            return new AddTagsBatchRequest(this);
        } 

    } 

}
