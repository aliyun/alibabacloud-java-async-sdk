// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ModifyAudioFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyAudioFileRequest</p>
 */
public class ModifyAudioFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssFileKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossFileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    private String usage;

    private ModifyAudioFileRequest(Builder builder) {
        super(builder);
        this.audioFileName = builder.audioFileName;
        this.audioResourceId = builder.audioResourceId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.ossFileKey = builder.ossFileKey;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAudioFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFileName
     */
    public String getAudioFileName() {
        return this.audioFileName;
    }

    /**
     * @return audioResourceId
     */
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossFileKey
     */
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<ModifyAudioFileRequest, Builder> {
        private String audioFileName; 
        private String audioResourceId; 
        private String instanceId; 
        private String name; 
        private String ossFileKey; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAudioFileRequest request) {
            super(request);
            this.audioFileName = request.audioFileName;
            this.audioResourceId = request.audioResourceId;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.ossFileKey = request.ossFileKey;
            this.usage = request.usage;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new-test-file.wav</p>
         */
        public Builder audioFileName(String audioFileName) {
            this.putQueryParameter("AudioFileName", audioFileName);
            this.audioFileName = audioFileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acc300c4-75c9-41ba-ba5e-2a365c96c248</p>
         */
        public Builder audioResourceId(String audioResourceId) {
            this.putQueryParameter("AudioResourceId", audioResourceId);
            this.audioResourceId = audioResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test/new-test-file.wav</p>
         */
        public Builder ossFileKey(String ossFileKey) {
            this.putQueryParameter("OssFileKey", ossFileKey);
            this.ossFileKey = ossFileKey;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public ModifyAudioFileRequest build() {
            return new ModifyAudioFileRequest(this);
        } 

    } 

}
