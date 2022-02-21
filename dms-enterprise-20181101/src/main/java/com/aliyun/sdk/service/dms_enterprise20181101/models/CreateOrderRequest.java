// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderRequest</p>
 */
public class CreateOrderRequest extends Request {
    @Query
    @NameInMap("AttachmentKey")
    private String attachmentKey;

    @Query
    @NameInMap("Comment")
    @Validation(required = true)
    private String comment;

    @Body
    @NameInMap("PluginParam")
    @Validation(required = true)
    private java.util.Map < String, ? > pluginParam;

    @Query
    @NameInMap("PluginType")
    @Validation(required = true)
    private String pluginType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RelatedUserList")
    private String relatedUserList;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private CreateOrderRequest(Builder builder) {
        super(builder);
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.pluginParam = builder.pluginParam;
        this.pluginType = builder.pluginType;
        this.regionId = builder.regionId;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachmentKey
     */
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return pluginParam
     */
    public java.util.Map < String, ? > getPluginParam() {
        return this.pluginParam;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relatedUserList
     */
    public String getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateOrderRequest, Builder> {
        private String attachmentKey; 
        private String comment; 
        private java.util.Map < String, ? > pluginParam; 
        private String pluginType; 
        private String regionId; 
        private String relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderRequest response) {
            super(response);
            this.attachmentKey = response.attachmentKey;
            this.comment = response.comment;
            this.pluginParam = response.pluginParam;
            this.pluginType = response.pluginType;
            this.regionId = response.regionId;
            this.relatedUserList = response.relatedUserList;
            this.tid = response.tid;
        } 

        /**
         * AttachmentKey.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * PluginParam.
         */
        public Builder pluginParam(java.util.Map < String, ? > pluginParam) {
            this.putBodyParameter("PluginParam", pluginParam);
            this.pluginParam = pluginParam;
            return this;
        }

        /**
         * PluginType.
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
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
         * RelatedUserList.
         */
        public Builder relatedUserList(String relatedUserList) {
            this.putQueryParameter("RelatedUserList", relatedUserList);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        } 

    } 

}
