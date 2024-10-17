// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderRequest</p>
 */
public class CreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentKey")
    private String attachmentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PluginParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > pluginParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private String relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private CreateOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.pluginParam = builder.pluginParam;
        this.pluginType = builder.pluginType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private java.util.Map < String, ? > pluginParam; 
        private String pluginType; 
        private String relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachmentKey = request.attachmentKey;
            this.comment = request.comment;
            this.pluginParam = request.pluginParam;
            this.pluginType = request.pluginType;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
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
         * <p>The key of an attachment that is returned after the attachment is uploaded. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>test_AttachmentKey</p>
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * <p>The description of the ticket to be created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ticket creation parameter. The value is a JSON string. The value of this parameter differs based on the type of the ticket. For more information, see the <strong>PluginParam parameter</strong> section in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{PluginParam_test}</p>
         */
        public Builder pluginParam(java.util.Map < String, ? > pluginParam) {
            String pluginParamShrink = shrink(pluginParam, "PluginParam", "json");
            this.putBodyParameter("PluginParam", pluginParamShrink);
            this.pluginParam = pluginParam;
            return this;
        }

        /**
         * <p>The type of the ticket. For more information, see <a href="https://help.aliyun.com/document_detail/429109.html">PluginType parameter</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_EXPORT</p>
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * <p>The IDs of the stakeholders that are involved in the ticket. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>user1,user2</p>
         */
        public Builder relatedUserList(String relatedUserList) {
            this.putQueryParameter("RelatedUserList", relatedUserList);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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
