// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAudioFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyAudioFileRequest</p>
 */
public class ModifyAudioFileRequest extends Request {
    @Query
    @NameInMap("AudioFileName")
    @Validation(required = true)
    private String audioFileName;

    @Query
    @NameInMap("AudioResourceId")
    @Validation(required = true)
    private String audioResourceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssFileKey")
    @Validation(required = true)
    private String ossFileKey;

    @Query
    @NameInMap("Usage")
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
         * AudioFileName.
         */
        public Builder audioFileName(String audioFileName) {
            this.putQueryParameter("AudioFileName", audioFileName);
            this.audioFileName = audioFileName;
            return this;
        }

        /**
         * AudioResourceId.
         */
        public Builder audioResourceId(String audioResourceId) {
            this.putQueryParameter("AudioResourceId", audioResourceId);
            this.audioResourceId = audioResourceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssFileKey.
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
