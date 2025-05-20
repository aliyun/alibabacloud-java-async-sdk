// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatRefDocItem} extends {@link TeaModel}
 *
 * <p>ChatRefDocItem</p>
 */
public class ChatRefDocItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("docInfo")
    private ChatRefDocInfo docInfo;

    @com.aliyun.core.annotation.NameInMap("docName")
    private String docName;

    @com.aliyun.core.annotation.NameInMap("docUrl")
    private String docUrl;

    @com.aliyun.core.annotation.NameInMap("originDocName")
    private String originDocName;

    @com.aliyun.core.annotation.NameInMap("originDocUrl")
    private String originDocUrl;

    @com.aliyun.core.annotation.NameInMap("pageNum")
    private java.util.List<ChatDocumentPageNum> pageNum;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private ChatRefDocItem(Builder builder) {
        this.docInfo = builder.docInfo;
        this.docName = builder.docName;
        this.docUrl = builder.docUrl;
        this.originDocName = builder.originDocName;
        this.originDocUrl = builder.originDocUrl;
        this.pageNum = builder.pageNum;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRefDocItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docInfo
     */
    public ChatRefDocInfo getDocInfo() {
        return this.docInfo;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docUrl
     */
    public String getDocUrl() {
        return this.docUrl;
    }

    /**
     * @return originDocName
     */
    public String getOriginDocName() {
        return this.originDocName;
    }

    /**
     * @return originDocUrl
     */
    public String getOriginDocUrl() {
        return this.originDocUrl;
    }

    /**
     * @return pageNum
     */
    public java.util.List<ChatDocumentPageNum> getPageNum() {
        return this.pageNum;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private ChatRefDocInfo docInfo; 
        private String docName; 
        private String docUrl; 
        private String originDocName; 
        private String originDocUrl; 
        private java.util.List<ChatDocumentPageNum> pageNum; 
        private String sourceType; 

        private Builder() {
        } 

        private Builder(ChatRefDocItem model) {
            this.docInfo = model.docInfo;
            this.docName = model.docName;
            this.docUrl = model.docUrl;
            this.originDocName = model.originDocName;
            this.originDocUrl = model.originDocUrl;
            this.pageNum = model.pageNum;
            this.sourceType = model.sourceType;
        } 

        /**
         * docInfo.
         */
        public Builder docInfo(ChatRefDocInfo docInfo) {
            this.docInfo = docInfo;
            return this;
        }

        /**
         * docName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * docUrl.
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }

        /**
         * originDocName.
         */
        public Builder originDocName(String originDocName) {
            this.originDocName = originDocName;
            return this;
        }

        /**
         * originDocUrl.
         */
        public Builder originDocUrl(String originDocUrl) {
            this.originDocUrl = originDocUrl;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(java.util.List<ChatDocumentPageNum> pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public ChatRefDocItem build() {
            return new ChatRefDocItem(this);
        } 

    } 

}
