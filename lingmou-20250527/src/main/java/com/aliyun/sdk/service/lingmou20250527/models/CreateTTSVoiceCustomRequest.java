// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateTTSVoiceCustomRequest} extends {@link RequestModel}
 *
 * <p>CreateTTSVoiceCustomRequest</p>
 */
public class CreateTTSVoiceCustomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossKey;

    private CreateTTSVoiceCustomRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.gender = builder.gender;
        this.name = builder.name;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTTSVoiceCustomRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<CreateTTSVoiceCustomRequest, Builder> {
        private String fileName; 
        private String gender; 
        private String name; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateTTSVoiceCustomRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.gender = request.gender;
            this.name = request.name;
            this.ossKey = request.ossKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTTSVoiceName.mp3</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * gender.
         */
        public Builder gender(String gender) {
            this.putQueryParameter("gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTTSVoiceName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>material/INPUT_TRAIN_AUDIO/Mt.CN2VNOPRC5QU2</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("ossKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public CreateTTSVoiceCustomRequest build() {
            return new CreateTTSVoiceCustomRequest(this);
        } 

    } 

}
