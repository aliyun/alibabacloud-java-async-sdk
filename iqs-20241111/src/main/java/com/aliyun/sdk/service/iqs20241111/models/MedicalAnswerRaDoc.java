// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link MedicalAnswerRaDoc} extends {@link TeaModel}
 *
 * <p>MedicalAnswerRaDoc</p>
 */
public class MedicalAnswerRaDoc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("rawUrl")
    private String rawUrl;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private MedicalAnswerRaDoc(Builder builder) {
        this.content = builder.content;
        this.rawUrl = builder.rawUrl;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalAnswerRaDoc create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return rawUrl
     */
    public String getRawUrl() {
        return this.rawUrl;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String content; 
        private String rawUrl; 
        private String title; 
        private String type; 

        private Builder() {
        } 

        private Builder(MedicalAnswerRaDoc model) {
            this.content = model.content;
            this.rawUrl = model.rawUrl;
            this.title = model.title;
            this.type = model.type;
        } 

        /**
         * <p>The content summary of the reference source. Summaries can be returned for medical web pages and drug instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Stomach pain can be caused by various factors, including gastrointestinal spasms, inflammation, urinary tract stones, and menstrual pain. It can be relieved by applying a warm compress to the abdomen or treated by taking pain-relieving medication</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The URL of the reference source. This can be an empty string for sources such as papers, clinical guidelines, and books.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/article/4CD364Mm8hh.html">https://www.example.com/article/4CD364Mm8hh.html</a></p>
         */
        public Builder rawUrl(String rawUrl) {
            this.rawUrl = rawUrl;
            return this;
        }

        /**
         * <p>The title of the reference source.</p>
         * 
         * <strong>example:</strong>
         * <p>How to quickly and easily relieve stomach pain</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The type of the reference source, such as medical web pages, medical books, papers, or clinical guidelines.</p>
         * 
         * <strong>example:</strong>
         * <p>med_web_source</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MedicalAnswerRaDoc build() {
            return new MedicalAnswerRaDoc(this);
        } 

    } 

}
