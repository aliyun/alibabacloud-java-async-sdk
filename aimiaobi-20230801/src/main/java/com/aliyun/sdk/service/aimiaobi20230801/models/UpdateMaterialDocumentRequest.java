// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMaterialDocumentRequest} extends {@link RequestModel}
 *
 * <p>UpdateMaterialDocumentRequest</p>
 */
public class UpdateMaterialDocumentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Author")
    private String author;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocKeywords")
    private java.util.List < String > docKeywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUrl")
    private String externalUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HtmlContent")
    private String htmlContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PubTime")
    private String pubTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareAttr")
    private Integer shareAttr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcFrom")
    private String srcFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TextContent")
    private String textContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private UpdateMaterialDocumentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.author = builder.author;
        this.docKeywords = builder.docKeywords;
        this.docType = builder.docType;
        this.externalUrl = builder.externalUrl;
        this.htmlContent = builder.htmlContent;
        this.id = builder.id;
        this.pubTime = builder.pubTime;
        this.regionId = builder.regionId;
        this.shareAttr = builder.shareAttr;
        this.srcFrom = builder.srcFrom;
        this.summary = builder.summary;
        this.textContent = builder.textContent;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMaterialDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return docKeywords
     */
    public java.util.List < String > getDocKeywords() {
        return this.docKeywords;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return externalUrl
     */
    public String getExternalUrl() {
        return this.externalUrl;
    }

    /**
     * @return htmlContent
     */
    public String getHtmlContent() {
        return this.htmlContent;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pubTime
     */
    public String getPubTime() {
        return this.pubTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shareAttr
     */
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    /**
     * @return srcFrom
     */
    public String getSrcFrom() {
        return this.srcFrom;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return textContent
     */
    public String getTextContent() {
        return this.textContent;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<UpdateMaterialDocumentRequest, Builder> {
        private String agentKey; 
        private String author; 
        private java.util.List < String > docKeywords; 
        private String docType; 
        private String externalUrl; 
        private String htmlContent; 
        private Long id; 
        private String pubTime; 
        private String regionId; 
        private Integer shareAttr; 
        private String srcFrom; 
        private String summary; 
        private String textContent; 
        private String title; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMaterialDocumentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.author = request.author;
            this.docKeywords = request.docKeywords;
            this.docType = request.docType;
            this.externalUrl = request.externalUrl;
            this.htmlContent = request.htmlContent;
            this.id = request.id;
            this.pubTime = request.pubTime;
            this.regionId = request.regionId;
            this.shareAttr = request.shareAttr;
            this.srcFrom = request.srcFrom;
            this.summary = request.summary;
            this.textContent = request.textContent;
            this.title = request.title;
            this.url = request.url;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Author.
         */
        public Builder author(String author) {
            this.putBodyParameter("Author", author);
            this.author = author;
            return this;
        }

        /**
         * DocKeywords.
         */
        public Builder docKeywords(java.util.List < String > docKeywords) {
            String docKeywordsShrink = shrink(docKeywords, "DocKeywords", "json");
            this.putBodyParameter("DocKeywords", docKeywordsShrink);
            this.docKeywords = docKeywords;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * ExternalUrl.
         */
        public Builder externalUrl(String externalUrl) {
            this.putBodyParameter("ExternalUrl", externalUrl);
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * HtmlContent.
         */
        public Builder htmlContent(String htmlContent) {
            this.putBodyParameter("HtmlContent", htmlContent);
            this.htmlContent = htmlContent;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PubTime.
         */
        public Builder pubTime(String pubTime) {
            this.putBodyParameter("PubTime", pubTime);
            this.pubTime = pubTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShareAttr.
         */
        public Builder shareAttr(Integer shareAttr) {
            this.putBodyParameter("ShareAttr", shareAttr);
            this.shareAttr = shareAttr;
            return this;
        }

        /**
         * SrcFrom.
         */
        public Builder srcFrom(String srcFrom) {
            this.putBodyParameter("SrcFrom", srcFrom);
            this.srcFrom = srcFrom;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.putBodyParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * TextContent.
         */
        public Builder textContent(String textContent) {
            this.putBodyParameter("TextContent", textContent);
            this.textContent = textContent;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public UpdateMaterialDocumentRequest build() {
            return new UpdateMaterialDocumentRequest(this);
        } 

    } 

}
