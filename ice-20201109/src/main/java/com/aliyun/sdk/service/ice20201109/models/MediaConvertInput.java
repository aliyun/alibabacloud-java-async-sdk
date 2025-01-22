// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertInput} extends {@link TeaModel}
 *
 * <p>MediaConvertInput</p>
 */
public class MediaConvertInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InputFile")
    private MediaObject inputFile;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private MediaConvertInput(Builder builder) {
        this.inputFile = builder.inputFile;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertInput create() {
        return builder().build();
    }

    /**
     * @return inputFile
     */
    public MediaObject getInputFile() {
        return this.inputFile;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private MediaObject inputFile; 
        private String name; 

        /**
         * InputFile.
         */
        public Builder inputFile(MediaObject inputFile) {
            this.inputFile = inputFile;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MediaConvertInput build() {
            return new MediaConvertInput(this);
        } 

    } 

}
