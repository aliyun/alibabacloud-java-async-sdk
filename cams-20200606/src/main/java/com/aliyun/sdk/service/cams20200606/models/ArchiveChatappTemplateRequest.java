// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ArchiveChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ArchiveChatappTemplateRequest</p>
 */
public class ArchiveChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String archiveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TemplateList> templateList;

    private ArchiveChatappTemplateRequest(Builder builder) {
        super(builder);
        this.archiveType = builder.archiveType;
        this.channelType = builder.channelType;
        this.custSpaceId = builder.custSpaceId;
        this.templateList = builder.templateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArchiveChatappTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archiveType
     */
    public String getArchiveType() {
        return this.archiveType;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return templateList
     */
    public java.util.List<TemplateList> getTemplateList() {
        return this.templateList;
    }

    public static final class Builder extends Request.Builder<ArchiveChatappTemplateRequest, Builder> {
        private String archiveType; 
        private String channelType; 
        private String custSpaceId; 
        private java.util.List<TemplateList> templateList; 

        private Builder() {
            super();
        } 

        private Builder(ArchiveChatappTemplateRequest request) {
            super(request);
            this.archiveType = request.archiveType;
            this.channelType = request.channelType;
            this.custSpaceId = request.custSpaceId;
            this.templateList = request.templateList;
        } 

        /**
         * <p>The archive type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ARCHIVED</p>
         */
        public Builder archiveType(String archiveType) {
            this.putQueryParameter("ArchiveType", archiveType);
            this.archiveType = archiveType;
            return this;
        }

        /**
         * <p>The channel type. Valid values:</p>
         * <ul>
         * <li><strong>WHATSAPP</strong></li>
         * </ul>
         * <blockquote>
         * <p>Currently, only the WhatsApp channel type is supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the space ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The template list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder templateList(java.util.List<TemplateList> templateList) {
            String templateListShrink = shrink(templateList, "TemplateList", "json");
            this.putQueryParameter("TemplateList", templateListShrink);
            this.templateList = templateList;
            return this;
        }

        @Override
        public ArchiveChatappTemplateRequest build() {
            return new ArchiveChatappTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ArchiveChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ArchiveChatappTemplateRequest</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Language")
        @com.aliyun.core.annotation.Validation(required = true)
        private String language;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateCode;

        private TemplateList(Builder builder) {
            this.language = builder.language;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String language; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(TemplateList model) {
                this.language = model.language;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>The template language. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>zh_CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The template code. To view the template code, go to the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page and choose <strong>Manage</strong> &gt; <strong>Template Design</strong>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>939938****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
