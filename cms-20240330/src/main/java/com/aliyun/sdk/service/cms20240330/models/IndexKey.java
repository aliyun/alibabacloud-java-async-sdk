// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IndexKey} extends {@link TeaModel}
 *
 * <p>IndexKey</p>
 */
public class IndexKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chn")
    private Boolean chn;

    @com.aliyun.core.annotation.NameInMap("embedding")
    private String embedding;

    @com.aliyun.core.annotation.NameInMap("jsonKeys")
    private java.util.Map<String, IndexJsonKey> jsonKeys;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IndexKey(Builder builder) {
        this.chn = builder.chn;
        this.embedding = builder.embedding;
        this.jsonKeys = builder.jsonKeys;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chn
     */
    public Boolean getChn() {
        return this.chn;
    }

    /**
     * @return embedding
     */
    public String getEmbedding() {
        return this.embedding;
    }

    /**
     * @return jsonKeys
     */
    public java.util.Map<String, IndexJsonKey> getJsonKeys() {
        return this.jsonKeys;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean chn; 
        private String embedding; 
        private java.util.Map<String, IndexJsonKey> jsonKeys; 
        private String type; 

        private Builder() {
        } 

        private Builder(IndexKey model) {
            this.chn = model.chn;
            this.embedding = model.embedding;
            this.jsonKeys = model.jsonKeys;
            this.type = model.type;
        } 

        /**
         * <p>Specifies whether Chinese characters are included.</p>
         * <ul>
         * <li>true: Chinese characters are included.</li>
         * <li>false: Chinese characters are not included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder chn(Boolean chn) {
            this.chn = chn;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embedding(String embedding) {
            this.embedding = embedding;
            return this;
        }

        /**
         * <p>json key</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;chn&quot;:true}}</p>
         */
        public Builder jsonKeys(java.util.Map<String, IndexJsonKey> jsonKeys) {
            this.jsonKeys = jsonKeys;
            return this;
        }

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IndexKey build() {
            return new IndexKey(this);
        } 

    } 

}
