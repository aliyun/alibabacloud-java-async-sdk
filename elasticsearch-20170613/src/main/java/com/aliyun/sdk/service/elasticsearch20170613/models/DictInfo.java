// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DictInfo} extends {@link TeaModel}
 *
 * <p>DictInfo</p>
 */
public class DictInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DictInfo(Builder builder) {
        this.fileSize = builder.fileSize;
        this.name = builder.name;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DictInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long fileSize; 
        private String name; 
        private String sourceType; 
        private String type; 

        private Builder() {
        } 

        private Builder(DictInfo model) {
            this.fileSize = model.fileSize;
            this.name = model.name;
            this.sourceType = model.sourceType;
            this.type = model.type;
        } 

        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2782602</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The name of the dictionary file. Requirements:</p>
         * <ul>
         * <li>Main dictionary or stopword list: one word per line, saved as a UTF-8 encoded DIC file. The file name can contain uppercase and lowercase letters, digits, and underscores, and cannot exceed 30 characters in length. Files with duplicate names are not allowed. The main dictionary file and the stopword file cannot share the same name.</li>
         * <li>Synonym dictionary: one synonym expression per line, saved as a UTF-8 encoded TXT file.</li>
         * <li>Alibaba dictionary: the file name must be aliws_ext_dict.txt. The file must be in UTF-8 format. Each line contains one word with no leading or trailing whitespace. Use UNIX or Linux line endings, where each line ends with 
         * . If the file is generated on a Windows system, use the dos2unix tool on a Linux machine to process the dictionary file before uploading it.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliws_ext_dict.txt</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The source type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service (OSS). Ensure that the OSS bucket has public-read permission.</li>
         * <li>ORIGIN: open-source Elasticsearch</li>
         * <li>UPLOAD: uploaded file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The type of the dictionary file. Valid values:</p>
         * <ul>
         * <li>STOP: stopword list</li>
         * <li>MAIN: main dictionary</li>
         * <li>SYNONYMS: synonym dictionary</li>
         * <li>ALI_WS: Alibaba dictionary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALI_WS</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DictInfo build() {
            return new DictInfo(this);
        } 

    } 

}
