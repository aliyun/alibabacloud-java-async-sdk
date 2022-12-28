// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataStreamMapping} extends {@link TeaModel}
 *
 * <p>DataStreamMapping</p>
 */
public class DataStreamMapping extends TeaModel {
    @NameInMap("caseSensitive")
    private Boolean caseSensitive;

    @NameInMap("docValues")
    private Boolean docValues;

    @NameInMap("index")
    private Boolean index;

    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @NameInMap("properties")
    private java.util.List < DataStreamMapping > properties;

    @NameInMap("tokenizeOnChars")
    private java.util.List < String > tokenizeOnChars;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private DataStreamMapping(Builder builder) {
        this.caseSensitive = builder.caseSensitive;
        this.docValues = builder.docValues;
        this.index = builder.index;
        this.key = builder.key;
        this.properties = builder.properties;
        this.tokenizeOnChars = builder.tokenizeOnChars;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataStreamMapping create() {
        return builder().build();
    }

    /**
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * @return docValues
     */
    public Boolean getDocValues() {
        return this.docValues;
    }

    /**
     * @return index
     */
    public Boolean getIndex() {
        return this.index;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return properties
     */
    public java.util.List < DataStreamMapping > getProperties() {
        return this.properties;
    }

    /**
     * @return tokenizeOnChars
     */
    public java.util.List < String > getTokenizeOnChars() {
        return this.tokenizeOnChars;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean caseSensitive; 
        private Boolean docValues; 
        private Boolean index; 
        private String key; 
        private java.util.List < DataStreamMapping > properties; 
        private java.util.List < String > tokenizeOnChars; 
        private String type; 

        /**
         * 大小写敏感
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * 是否聚合
         */
        public Builder docValues(Boolean docValues) {
            this.docValues = docValues;
            return this;
        }

        /**
         * 是否索引
         */
        public Builder index(Boolean index) {
            this.index = index;
            return this;
        }

        /**
         * 字段名
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * 嵌套索引字段
         */
        public Builder properties(java.util.List < DataStreamMapping > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * 识别分隔符列表
         */
        public Builder tokenizeOnChars(java.util.List < String > tokenizeOnChars) {
            this.tokenizeOnChars = tokenizeOnChars;
            return this;
        }

        /**
         * 字段类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DataStreamMapping build() {
            return new DataStreamMapping(this);
        } 

    } 

}
