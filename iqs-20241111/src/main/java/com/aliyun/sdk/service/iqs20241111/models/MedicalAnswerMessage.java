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
 * {@link MedicalAnswerMessage} extends {@link TeaModel}
 *
 * <p>MedicalAnswerMessage</p>
 */
public class MedicalAnswerMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("metaData")
    private MedicalAnswerMetaData metaData;

    private MedicalAnswerMessage(Builder builder) {
        this.content = builder.content;
        this.metaData = builder.metaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalAnswerMessage create() {
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
     * @return metaData
     */
    public MedicalAnswerMetaData getMetaData() {
        return this.metaData;
    }

    public static final class Builder {
        private String content; 
        private MedicalAnswerMetaData metaData; 

        private Builder() {
        } 

        private Builder(MedicalAnswerMessage model) {
            this.content = model.content;
            this.metaData = model.metaData;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * metaData.
         */
        public Builder metaData(MedicalAnswerMetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        public MedicalAnswerMessage build() {
            return new MedicalAnswerMessage(this);
        } 

    } 

}
