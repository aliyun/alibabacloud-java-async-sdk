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
 * {@link MedicalKnowledgeInfo} extends {@link TeaModel}
 *
 * <p>MedicalKnowledgeInfo</p>
 */
public class MedicalKnowledgeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private MedicalKnowledgeInfo(Builder builder) {
        this.content = builder.content;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalKnowledgeInfo create() {
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
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String content; 
        private String url; 

        private Builder() {
        } 

        private Builder(MedicalKnowledgeInfo model) {
            this.content = model.content;
            this.url = model.url;
        } 

        /**
         * <p>The structured text composed of the entity name and its properties.</p>
         * 
         * <strong>example:</strong>
         * <p>Entity: Amoxicillin capsules</p>
         * <ul>
         * <li>Property[Exact active ingredient]: Amoxicillin</li>
         * <li>Property[Manufactured dosage form]: Oral capsule</li>
         * </ul>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The source link of the entity property content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://p.example.cn/0387f345/index?struct_id=VdB%2BLV7w7lHHEp">https://p.example.cn/0387f345/index?struct_id=VdB%2BLV7w7lHHEp</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public MedicalKnowledgeInfo build() {
            return new MedicalKnowledgeInfo(this);
        } 

    } 

}
